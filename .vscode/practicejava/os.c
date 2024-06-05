#include <stdio.h>
#include <stdbool.h>

#define MAX_BLOCKS 100

typedef struct {
    char* file_name;
    int start_block;
    int end_block;
} FileAllocation;

FileAllocation memory[MAX_BLOCKS];
bool is_allocated[MAX_BLOCKS];

void initialize_memory() {
    for (int i = 0; i < MAX_BLOCKS; i++) {
        is_allocated[i] = false;
    }
}

bool allocate(char* file_name, int size) {
    int start_block = -1;
    int allocated_blocks = 0;

    for (int i = 0; i < MAX_BLOCKS; i++) {
        if (!is_allocated[i]) {
            if (start_block == -1) {
                start_block = i;
            }
            allocated_blocks++;
            if (allocated_blocks == size) {
                int end_block = i;
                for (int j = start_block; j <= end_block; j++) {
                    is_allocated[j] = true;
                    memory[j].file_name = file_name;
                    memory[j].start_block = start_block;
                    memory[j].end_block = end_block;
                }
                return true;
            }
        }
        else {
            start_block = -1;
            allocated_blocks = 0;
        }
    }
    return false;
}

void deallocate(char* file_name) {
    for (int i = 0; i < MAX_BLOCKS; i++) {
        if (is_allocated[i] && memory[i].file_name == file_name) {
            int start_block = memory[i].start_block;
            int end_block = memory[i].end_block;
            for (int j = start_block; j <= end_block; j++) {
                is_allocated[j] = false;
            }
        }
    }
}

void display_memory() {
    for (int i = 0; i < MAX_BLOCKS; i++) {
        if (is_allocated[i]) {
            printf("Block %d: %s\n", i, memory[i].file_name);
        }
        else {
            printf("Block %d: Empty\n", i);
        }
    }
}

int main() {
    initialize_memory();
    allocate("FileA", 4);
    allocate("FileB", 3);
    display_memory();
    deallocate("FileA");
    display_memory();

    return 0;
}
