
public class AccountingArrayApp {
	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]); // 공급가
		double vatRate = 0.1; // 부가가치세
		double expenseRate = 0.3; // 비용률
		double vat = valueOfSupply*vatRate; // 부가세 = 공급가 * 부가가치세
		double total = valueOfSupply + vat; // 합계 = 공급가 + 부가세
		double expense = valueOfSupply*expenseRate; // 비용 = 공급가 * 비용률
		double income = valueOfSupply - expense; // 이익 = 공급가 - 비용
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = (income) * dividendRates[0]; // 배당 = 이익 * 배당률
		double dividend2 = (income) * dividendRates[1];
		double dividend3 = (income) * dividendRates[2];
		
		System.out.println("Value of supply : "+ valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat); // 부가가치세
		System.out.println("Total : "+ total); // 합계
		System.out.println("Expense : "+ expense); // 비용
		System.out.println("Income : "+ income); // 이익
		System.out.println("Dividend 1 : "+ dividend1); // 배당
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);
	}

}
