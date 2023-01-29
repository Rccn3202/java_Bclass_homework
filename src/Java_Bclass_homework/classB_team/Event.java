package bookManagement_M;

import java.util.Calendar;

public class Event {

	Calendar cal=Calendar.getInstance();
	
	int year=cal.get(Calendar.YEAR);
	int month=cal.get(Calendar.MONTH);
	int date=cal.get(Calendar.DATE);
	
	System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일");

}