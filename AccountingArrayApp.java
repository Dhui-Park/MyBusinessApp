
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		
		double expenseRate = 0.3;
		
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
	    double[] dividendRate = new double[3];
	    dividendRate[0] = 0.5;
	    dividendRate[1] = 0.3;
	    dividendRate[2] = 0.2;
		
		double dividend1 = income * dividendRate[0];
		double dividend2 = income * dividendRate[1];
		double dividend3 = income * dividendRate[2];
		
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
