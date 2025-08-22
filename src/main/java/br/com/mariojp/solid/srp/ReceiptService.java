package br.com.mariojp.solid.srp;

import java.util.List;

public class ReceiptService {
	public String generate(Order order) {
		ITaxCalculator taxCalculator = new TaxCalculator();
		ReceiptFormatter receiptFormatter = new ReceiptFormatter();
		
		double subtotal = getSubtotal(order);
		double tax = taxCalculator.calcTax(subtotal);
		double total = subtotal + tax;

		return receiptFormatter.formatter(order, tax, subtotal, total);
	}
	
	private double getSubtotal(Order order) {
		List<Item> orderItems = order.getItems();
		return orderItems.stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
	}
}
