import java.util.Scanner;
class Array2 {
     public static void main(String args[]){
        int num[][]=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
           for(int j=0;j<num[i].length;j++){
              num[i][j]=sc.nextInt();
           }
        }
System.out.println(num.length);
System.out.println(num[1].length);
        System.out.println("Printing array:");
        for(int[] val:num){
           for(int value:val){
               System.out.println(value+" ");
           }
        System.out.println();
      }
  }
}