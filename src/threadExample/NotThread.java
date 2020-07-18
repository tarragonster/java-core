package threadExample;

public class NotThread {
	public void run(){  
		for(int i=1;i<=5;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println(i +" time "+ System.currentTimeMillis());
		}  
	}
	
	public static void main(String args[]){  
		NotThread t1=new NotThread();  
		NotThread t2=new NotThread();  
		NotThread t3=new NotThread();
		NotThread t4=new NotThread();
		
		t1.run();
		t2.run();
		t3.run();
		t4.run();
	} 
}
