package by.htp.task06.tsk02;

public class Customer {
	int id;
	int cardNumber;
	int bankNumber;
	String firstName;
	String secondName;
	String thirdName;
	String address;
	
	public Customer() {}
	
	public Customer(String secondName, String firstName, String thirdName) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		
		this.address = "";
	}
	
	public Customer(String secondName, String firstName, String thirdName, String address) {
		this(secondName, firstName, thirdName);
		this.address = address;
	}
	
	public Customer(int id, String secondName, String firstName, String thirdName, String address,
					int cardNumber, int bankNumber) {
		this(secondName, firstName, thirdName, address);
		this.id = id;
		this.cardNumber = cardNumber;
		this.bankNumber = bankNumber;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return id + " " + secondName + " " + firstName + " " + thirdName + " " + address + " " + cardNumber + " " + bankNumber;
	}
}
