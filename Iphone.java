package fp.alpro;

public class Iphone extends Phone {
	
	private String seriesnumber;
	
	public Iphone(String name, String number, String seriesnumber) {
		
		super(name, number);
		this.seriesnumber = seriesnumber;
	}

	public String getSeries() {
		
		return seriesnumber;
	}

	public void setSeries(String seriesnumber) {
		
		this.seriesnumber = seriesnumber;
	}
	
	@Override
	public void call() {
		
		System.out.printf("Incoming call %s from %s's phone with %s%n", number, name, seriesnumber);
	}


	@Override
	public void end() {
		
		System.out.printf("End call %s from %s's phone with %s%n", number, name, seriesnumber);
	}

}