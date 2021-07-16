
public class AccountingApp {
	public static void main(String[] args) {
		System.out.println("Value of supply : "+ 12345.0); // 공급가
		System.out.println("VAT : "+ (12345.0*1)); // 부가가치세
		System.out.println("Total : "+ 12345.0 + 12345.0*0.1); // 합계
		System.out.println("Expense : "+ (12345.0*0.3)); // 비용
		System.out.println("Income : "+ (12345.0 - 12345.0*0.3)); // 이익
		System.out.println("Dividend : "+ (12345.0 - 12345.0*0.3) * 0.5); // 배당
		System.out.println("Dividend : "+ (12345.0 - 12345.0*0.3) * 0.3);
		System.out.println("Dividend : "+ (12345.0 - 12345.0*0.3) * 0.2);
	}

}
