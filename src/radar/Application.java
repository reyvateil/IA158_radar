package radar;

public class Application {

	public synchronized static void main(String[] args) throws InterruptedException {
		
		DataExchange de = new DataExchange();
		MeasureProximity mp = new MeasureProximity(de);
		Scanner sc = new Scanner(de);
		
		mp.start();
		sc.start();
		
		System.out.println("START");
		
		while(true) {

		}
	}

}
