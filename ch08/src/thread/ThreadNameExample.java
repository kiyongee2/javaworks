package thread;

public class ThreadNameExample {

	public static void main(String[] args) {
		//스레드 이름을 설정하지 않으면 Thread-1.2로 출력됨
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
		
	}

}
