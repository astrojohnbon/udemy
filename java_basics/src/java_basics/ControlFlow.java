package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean hungry = true;
		
		if(hungry){
			System.out.println("Im starving...");
		} else{
			System.out.println("Im not hungry");
		}
		
		int hungerRating = 5;
		
		if(hungerRating < 6) {
			System.out.println("not hungry");
			
		}else {
			System.out.println("Im starving");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion;
		
		if(favoriteTemp == currentTemp) {
		if(currentTemp < favoriteTemp - 30) {
			opinion = "It's pretty darn cold...";
		} else if(currentTemp < favoriteTemp - 20) {
			opinion = "It's kinda cold out...";
		} else if(currentTemp > favoriteTemp + 10) {
			opinion = "It's hot out";
		} else {
			opinion = "It's a beautiful day...";
		}
		}
		else {
			opinion = "unkown temp";
		}
		System.out.println(opinion);
		
		
		int month = 2;
		String monthString;
		
		switch(month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "unknown month";
			break;
		}
		System.out.println(monthString);
		
		
		
	}

}
