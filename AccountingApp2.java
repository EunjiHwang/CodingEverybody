
public class AccountingApp2 {
	public static void main(String[] args) {
		double valueOfSupply = 10000.0; // ���ް�
		double vatRate = 0.1; // �ΰ���ġ��
		double expenseRate = 0.3; // ����
		double vat = valueOfSupply*vatRate; // �ΰ��� = ���ް� * �ΰ���ġ��
		double total = valueOfSupply + vat; // �հ� = ���ް� + �ΰ���
		double expense = valueOfSupply*expenseRate; // ��� = ���ް� * ����
		double income = valueOfSupply - expense; // ���� = ���ް� - ���
		double dividend1 = (income) * 0.5; // ��� = ���� * ����
		double dividend2 = (income) * 0.3;
		double dividend3 = (income) * 0.2;
		
		System.out.println("Value of supply : "+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat); // �ΰ���ġ��
		System.out.println("Total : "+ total); // �հ�
		System.out.println("Expense : "+ expense); // ���
		System.out.println("Income : "+ income); // ����
		System.out.println("Dividend 1 : "+ dividend1); // ���
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);
	}

}
