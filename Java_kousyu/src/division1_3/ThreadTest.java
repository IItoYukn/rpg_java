package division1_3;

/////////////////スレッド1クラス
class PrintThread extends Thread {//tread継承
	private boolean flag = false;
	Add addC;
	public PrintThread(int c,Add ad){
		addC=ad;

	}
	public void run() {
		try{
		sleep(1000);

		System.out.println("スレッド1終了しました");

		}catch(InterruptedException e){
			System.out.println("例外が発生しました");
			e.printStackTrace();
			System.exit(0);
		}


	}

}
  class Add  {//
	private int count;
	Add(){
		this.count=0;
	}
	public synchronized  void ad(){
		try{

			count++;

			wait();
		}catch(Exception e){
			  e.printStackTrace();
		}
		System.out.println(count);
		System.out.println("");
		notifyAll();




	}
}

///////////////////// スレッドメインクラス
public class ThreadTest {

	public static void main(String[] args) throws Exception {
		Add ad = new Add();
//new PrintThread1().start();
		Thread thread = new PrintThread(0,ad );
		Thread th = new PrintThread(0,ad);
		int count = 0;

		thread.start();
		th.start();

		try {
            thread.join();
            th.join();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

		//}doMethod();

		//new PrintThread2().start();


	}

	public static synchronized void doMethod() {



	}
}

