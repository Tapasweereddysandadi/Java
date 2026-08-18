class encapsulation{
    private String name;
    private int marks;
    public String getName(){
       return name;
    }
    public int getMarks(){
       return marks;
    }
    public void setName(String name){
          this.name=name;
     }
    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
              this.marks=marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}
public class encap{
   public static void main(String args[]){
         encapsulation obj=new encapsulation();
         obj.setName("Tapaswee");
         obj.setMarks(80);
         obj.getName();
         obj.getMarks();
         System.out.println(obj.getName());
         System.out.println(obj.getMarks());
     }
}