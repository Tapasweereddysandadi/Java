class StaticClass{
	String name;
	String color;
	static int price;
	
	public void show(String name, String color, int price){
		System.out.println(name + " " +color+" "+price);
  }
	
	void main(String[] args){
		StaticClass sc= new StaticClass();
		sc.name="Cello";
		sc.color="blue";
		sc.price=10;
		sc.show(sc.name, sc.color, sc.price);
		
		StaticClass sc1= new StaticClass();
		sc1.name="Parker";
		sc1.color="black";
		sc1.price=150;
		sc1.show(sc1.name, sc1.color, sc1.price);
		System.out.println(sc.price);
    }
}