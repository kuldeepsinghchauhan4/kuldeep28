import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class KuldeepDate {
	public static void main(String args[]) {
//		Scanner s=new Scanner(System.in);
//		Scanner s1=new Scanner(System.in);
		LocalDate start=LocalDate.of(1998,Month.AUGUST,28);
		LocalDate end=LocalDate.of(2019,Month.AUGUST,28);
		//LocalDate end=LocalDate.now();
		Period p=start.until(end);
		System.out.println("DAYS:"+p.getDays());
		System.out.println("months:"+p.getMonths());
		System.out.println("year:"+p.getYears());
		
	}

}
