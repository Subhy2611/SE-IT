#include <xc.h>
#include <stdio.h>
#include <stdlib.h>
#include <pic18f4550.h>

void main(void){
    int sum,sub,mult,div;
    sum = 0x0A + 0x03;
    TRISA = 0;
    PORTA = sum;
    
    sub = 0x0B - 0x04;
    TRISB = 0;
    PORTB = sub;
    
    mult = 0x03*0x02;
    TRISC = 0;
    PORTC = mult;
    
    div = 0x0F / 0x03;
    TRISD = 0;
    PORTD = div;
}