class students implements Runnable{
	private String name;
    public students(String name){
		this.name = name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name+"writing page"+i);
		}
	    System.out.println(name+"completed writing");
	}
}	
class ImplementingThread{
	public static void main(String args[]){
		students s1 = new students("s1");
		Thread t1 = new Thread(s1);
		t1.start();
		students s2 = new students("s2");
		Thread t2 = new Thread(s2);
		t2.start();
	}
}	