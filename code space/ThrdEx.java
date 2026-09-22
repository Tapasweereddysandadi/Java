class Mythread extends Thread{
	public void run(){
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		for (int i=1;i<=6;i++){
			System.out.println(i);
		}
	}
}
class ThrdEx{
	public static void main(String args[]){
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		Mythread t1 = new Mythread();
		t1.start();
		Mythread t2 = new Mythread();
		t2.start();
	}
}	