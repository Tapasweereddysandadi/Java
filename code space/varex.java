public class varex {
     String name;
     String rollno;
     static int roomno=2318;
     static String clas="CSMC";
     public static void main(String args[]) {
         Student S1=new Student();
         S1.name="Tapaswee";
         S1.rollno="H9";
         Student S2=new Student();
         S2.name="Sirimalli";
         S2.rollno="H2";
         S1.display();
         S2.display();
       }
         void display() {
             System.out.println(name);
             System.out.println(rollno);
             System.out.println(roomno);
             System.out.println(clas);
             System.out.println("------");
         }
}