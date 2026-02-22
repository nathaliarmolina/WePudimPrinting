package br.com.wepudim.model;

public class Pudding {
	
	private String name;
	private double price;
	private String size;
	
	public Pudding (String name, double price, String size) {
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getSize () {
		return size;
	}
	
	@Override
	public String toString() {
		return name + " R$ " + price;
	}

}
