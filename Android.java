package fp.alpro;

public class Android extends Phone {
	
	private String brand, seriesnumber;

	public Android(String name, String number, String brand, String seriesnumber) {
		
		super(name, number);
		this.brand = brand;
		this.seriesnumber = seriesnumber;
	}
	
	public String getBrand() {
		
		return brand;
	}


	public void setBrand(String brand) {
		
		this.brand = brand;
	}


	public String getSeries() {
		
		return seriesnumber;
	}


	public void setSeries(String seriesnumber) {
		
		this.seriesnumber = seriesnumber;
	}


	@Override
	public void call() {
		
		System.out.printf("Incoming call %s from %s's phone with %s ", number, name, brand);
		if (seriesnumber != null) {
			
			System.out.print(seriesnumber);
		}
		System.out.println();
	}


	@Override
	public void end() {
		
		System.out.printf("End call %s from %s's phone with %s ", number, name, brand);
		if (seriesnumber != null) {
			
			System.out.print(seriesnumber);
		}
		System.out.println();
	}

}