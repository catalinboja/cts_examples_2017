package ro.ase.cts.unit.testing;

import java.util.ArrayList;

public class Apartment {
	Integer number;
	String address;
	public Apartment(Integer number, String address) {
		super();
		this.number = number;
		this.address = address;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) throws BadArgumentException{
		if(number >= 1 && number <= 200)
			this.number = number;
		else
			throw new BadArgumentException();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) throws BadArgumentException{
		if(address == null)
			throw new BadArgumentException();
		this.address = address;
	}
	
	
}
