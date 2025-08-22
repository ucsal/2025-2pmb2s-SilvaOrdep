package br.com.mariojp.solid.srp;

public class TaxCalculator implements ITaxCalculator {

	@Override
	public double calcTax(double subtotal) {
		double tax = System.getProperty("tax.rate") != null ? Double.parseDouble(System.getProperty("tax.rate")) : 0.10;
		
		return tax*subtotal;
	}
	
}
