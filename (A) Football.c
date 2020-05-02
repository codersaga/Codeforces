#include <stdio.h>
#include <string.h>

int main(){
    char str[100];
    scanf("%s",&str);
    int count=1;
    for(int i=1;i<strlen(str);i++){
        if(str[i]==str[i-1]){
            count=count+1;
            if(count==7){
                printf("YES\n");
                return 0;
            }
        }
        else{
            count=1;
        }
        
    }
    printf("NO\n");
    return 0;
}