#include <stdio.h>

int main(){
    int t;
    scanf("%d",&t);
    int count=0;
    for(int q=0;q<t;q++){
        int a[3];
        for(int i=0;i<3;i++){
            scanf("%d",&a[i]);
        }
        if((a[0]+a[1]+a[2])>=2){
            count++;
        }
        
    }
    printf("%d",count);
    return 0;
}