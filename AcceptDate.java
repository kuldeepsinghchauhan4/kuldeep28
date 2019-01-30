import java.time.LocalDate;

public class AcceptDate {
	static int m1;
	static int y1;
	static int d1;
public static void warranty(int m,int y) {
	m1=m;
 y1=y;
	
	//return m;
	//return y;
}


public void purchaseDate(int d,int m,int y) {
	
	LocalDate l=LocalDate.of(y, m, d);
l=	l.plusMonths(m1).plusYears(y1);
	System.out.println(l);
}

public static void main(String args[]) {
	AcceptDate a= new AcceptDate();
	a.warranty(1,2);
	a.purchaseDate(1,05,2020);

}
}
