static boolean check(int n){
    boolean x=false;
    boolean y=false;
    while(n>0){
        if(n%10==7){x=true;}
        if(n%10==9){y=true;}
        n=n/10;
    }
    if(x && y){return false;}
    return true;
}

static int MagicNumber(int n){
//Enter your code here
int i=0;
while(check(n-i)==true && check(n+i)==true){
    i++;
    }

if(check(n-i)==false){return n-i;}
else{
    return n+i;
}
}