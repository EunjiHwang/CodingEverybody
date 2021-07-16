
public class AccountingMethodApp {
	public static double valueOfSupply; // 공급가
	public static double vatRate; // 부가가치세
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;		
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply); // 공급가
		System.out.println("VAT : "+ getVAT()); // 부가가치세
		System.out.println("Total : "+ getTotal()); // 합계
		System.out.println("Expense : "+ getExpense()); // 비용
		System.out.println("Income : "+ getIncome()); // 이익
		System.out.println("Dividend 1 : "+ getDividend1()); // 배당
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
