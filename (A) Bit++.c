#include<stdio.h>
#include<string.h>

int main(){
    int n,x=0;
    scanf("%d\n",&n);
    char p[150];
    for(int i=0;i<n;i++){
        gets(p);
        if((p[0]=='-'&&p[1]=='-')||(p[1]=='-'&&p[2]=='-'))
            x--;
        if((p[0]=='+'&&p[1]=='+')||(p[1]=='+'&&p[2]=='+'))
            x++;
    }
    printf("%d\n",x);
    return 0;
 }