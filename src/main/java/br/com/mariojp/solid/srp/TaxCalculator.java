package br.com.mariojp.solid.srp;

public class TaxCalculator implements ITaxCalculator {

	@Override
	public double calcTax(double subtotal) {
		double tax = Double.parseDouble(System.getProperty("tax.rate"));
		
		return tax*subtotal;
	}
	
}
