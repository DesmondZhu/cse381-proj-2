
public class Worker extends Thread {
	private String name;
	private int id;
	private MutualExclusion shared;
	
	public Worker(String n, int i, MutualExclusion s){
		name = n;
		id = i;
		shared = s;
	}
	public void run() {
		while (true) {
			shared.enteringCriticalSection(id);
			System.out.println(name + " is in critical section");
			long now = System.currentTimeMillis();
			MutualExclusion.criticalSection();
			
			shared.leavingCriticalSection(id);
			System.out.println(name + " is out of critical section");
			System.out.println("Time ellapsed: " + (System.currentTimeMillis() - now)/1000 + "s");
			MutualExclusion.nonCriticalSection();
		}
	}

}
