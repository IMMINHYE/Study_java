package practice1;

/**
 * 
 */
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public String isValid() {
		String result = "유효한 날짜입니다.";
		
		if (month < 1 || month > 12 ) {
			result = "유효하지 않은 날짜입니다.";
		}
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day < 0 || day > 31) {
					result = "유효하지 않은 날짜입니다.";
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day < 0 || day > 30) {
					result = "유효하지 않은 날짜입니다.";
				}
			case 2:
				if(day < 0 || day > 28) {
					result = "유효하지 않은 날짜입니다.";			
			}			
		}
		return result;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
