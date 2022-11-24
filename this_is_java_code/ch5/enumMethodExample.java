package ch5;

public class enumMethodExample {

	public static void main(String[] args) {

		// name(): 열거 객체의 문자열을 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

		// ordinal(): 열거 객체의 순번을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo(): 열거 객체를 비교해서 순번 차이를 리턴
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		// valueOf(): 주어진 문자열의 열거 객체를 리턴
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("It's a weekend");
			} else {
				System.out.println("It's a weekday");
			}
		}

		// values(): 모든 열거 객체들을 배열로 리턴
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}

	}

}
