package fp.alpro;

public class Phone extends Telephone {
	
	protected String name;
	
	public Phone(String name, String number) {
		
		super(name);
		this.number = number;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void call() {
		System.out.printf("Incoming Call %s from %s's phone%n", number, name);

	}

	@Override
	public void end() {
		System.out.printf("End call %s from %s's phone%n", number, name);

	}

}