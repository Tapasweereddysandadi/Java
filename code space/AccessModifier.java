class Student{
	public String name;
	private String rollno;
	String branch;
	protected String grade;
	Student(String name,String rollno,String branch,String grade){
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.grade=grade;
	}
	void show(){
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Branch: "+branch);
		System.out.println("Grade: "+grade);
	}
}
public class AccessModifier{
	public static void main(String args[]){
		Student s1 = new Student("Tapaswee","H9","CSMC","O");
		s1.show();
	}
}	