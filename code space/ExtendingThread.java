class students extends Thread{
	private String name;
	public students(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name+"writing page"+i);
		}
       System.out.println(name+"Completed writing");
	}
}
class ExtendingThread {
	public static void main(String args[]){
		students s1 = new students("s1");
		s1.start();
		students s2 = new students("s2");
		s2.start();
	}
}	