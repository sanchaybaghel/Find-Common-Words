#include<iostream>
using namespace std;

void removeDuplicate(int *arr,int &size){
    for(int i = 0;i<size;i++){

        for(int j =i+1;j<size;j++){
            if(arr[i] == arr[j]){

                for(int k = j;k<size;k++){

                    arr[k] = arr[k+1];
                }
                size--;

            }
        }
    }
}

int main(){
    int arr[6] = {2,3,2,4,5,3};
    int size = 6;
    removeDuplicate(arr,size);

    for(int i = 0;i<size;i++){
        cout << arr[i] << " ";
    }
    return 0;
}