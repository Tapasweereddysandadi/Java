class A{
    int i=10;
    A(){ }
    A(int i){
        this.i=i;
       System.out.println("parent class i = " +i);
     }
 void show(){
     System.out.println("Show() is parent");
  }
}
class B extends A{
       int i=20;
       B(int i){
            super(i);
            System.out.println("Child class : " +this.i);
       }
 void show(){
     System.out.println("Show() is child  " +super.i);
     super.show();
  }
}
class ex02{
    public static void main(String args[]){
           B obj=new B(40);
           obj.show();
      }
}