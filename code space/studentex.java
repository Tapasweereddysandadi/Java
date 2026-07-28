class studentex {
     String name;
     String rollno;
    public studentex(){
       System.out.println("Iam a default constructor");
     }
    public studentex(String name, String rollno){
          this.name=name;
          this.rollno=rollno;
      }
   public static void main(String args[]){
          studentex s1=new studentex("Tapaswee","H9");
          studentex s2=new studentex("Sirimalli","H2");
          System.out.println(s1.name);
          System.out.println(s1.rollno);
          System.out.println(s2.name);
          System.out.println(s2.rollno);
     }
}