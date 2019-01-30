import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateEx {
public static void main(String args[]) {
	/*LocalDate l=LocalDate.of(2019,01,29);
	LocalDate l1=LocalDate.of(2020,01,29);
	LocalDateTime time=l.atTime(9,50,45);
	LocalDateTime time1=time.minusHours(2);*/
	/*LocalDate l1=l.minusDays(9,50,45);
	LocalDate l2=l.plusDays(1);*/
	//LocalDate l3=l.plusMonths(1);
	LocalDateTime l=LocalDateTime.now();
	DateTimeFormatter l1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  String date1 = now.format(l1);  
	
/*System.out.println("leap year:"+l.isLeapYear());
System.out.println("leap year:"+l1.isLeapYear());*/
/*System.out.println("yesterday's date:"+l1);
System.out.println("tommorrow's  date:"+l2);*/
//System.out.println("next month:"+l3);
	System.out.println("time and date before formatting:"+l);
	//System.out.println(time1);
	
}
}
