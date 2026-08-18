import java.util.Scanner;
class sum{
    public int sum(int n){
         int sum=0,r=0;
         if(n<0){
            return -1;
         }
         while(n!=0){
            r=n%10;
            n=n/10;
            sum+=r;
         }
        return sum;
     }
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          sum m=new sum();
          m.sum(num);
          System.out.println(m.sum(num));
    }
}