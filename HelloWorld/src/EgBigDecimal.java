import java.math.BigDecimal;

public class EgBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 1.05;
		double d2 = 2.55;
	
		BigDecimal bd1 = new BigDecimal(1.05);
		BigDecimal bd2 = new BigDecimal(2.55);
		System.out.println(bd1.add(bd2));
	}

}
