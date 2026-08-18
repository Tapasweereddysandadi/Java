class student{
     final String rollno;
     int marks;
     student(String rollno, int marks){
          this.rollno=rollno;
          this.marks=marks;
}

String grading(){
       if(marks>=90) 
             return "O";
        else if(marks>=80)
             return "A+";
        else if(marks>=70)
             return "A";
        else if(marks>=60)
             return "B+";
        else if(marks>=50)
             return "B";
        else if(marks >=40)
             return "C";
        else 
             return "F";
     }
void displayResult(){
       System.out.println("Rollno : " +rollno);
       System.out.println("Marks : " +marks);
       System.out.println("Grade : " +grading());
   }
}
class Grade{
      public static void main(String args[]){
           student s1=new student("H9", 95);
            s1.displayResult();
     }
}

