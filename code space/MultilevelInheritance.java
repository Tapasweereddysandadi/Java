class Animal{
     String color;
      Animal(String C){
          color=C;
 }
public void eat(){
    System.out.println("Every Animal eats food");
  }
}
class Dog extends Animal{
    int height;
   Dog(String C, int ht){
       super(C);
       height=ht;
   }
public void bark(){
    System.out.println("Dog is barking");
    }
}
class Babydog extends Dog{
    int weight;
   Babydog(String C, int ht, int wt){
       super(C,ht);
       weight=wt;
   }
public void stay(){
    System.out.println("Animal stays in jungle");
    }
}

class MultilevelInheritance{
    public static void main(String args[]){
        Babydog obj=new Babydog("Brown", 19, 80);
         System.out.println(obj.color);
         System.out.println(obj.height);
         System.out.println(obj.weight);
         obj.eat();
         obj.bark();
         obj.stay();
    }
}


