#include <xc.h>
#include <stdio.h>
#include <stdlib.h>
#include <pic18f4550.h>

void main(void){
    int arr[10] = {0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x0A,0x0B};
    int sum;
    sum = 0;
    for(int i=0;i<10;i++){
        sum += arr[i];
    }
    TRISA = 0;
    PORTA = sum;
}