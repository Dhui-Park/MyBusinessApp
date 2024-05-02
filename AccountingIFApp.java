
public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		
		
		// 목표: income이 10000원 보다 작다면, 첫번째 사람이 다 가져가고, 10000원보다 크다면 5:3:2로 나눈다.
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if (income < 10000.0) {
			dividend1 = income * 1;
			dividend2 = income * 0;
			dividend3 = income * 0;
		} else {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		}
		
		System.out.println("Value of Supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);
		
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);
		
		
	}

}
