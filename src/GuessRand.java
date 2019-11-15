import java.util.*;   
public class GuessRand {

	public static void main(String[] args) {
		int rand = 0;
		boolean success = false;
		Random r = new Random();
		rand = r.nextInt(100) + 1;
		while (success != true) {
			int guess = 0;
			Scanner console = new Scanner(System.in);
			System.out.println("Your Guess: ?");
			guess = console.nextInt();
			success =  compare(guess, rand);
		}
	}
	
	public static boolean compare (int guess, int rand) {   
		boolean got_it = false;
		if (guess == rand) {  
			System.out.println("You got it!");
			got_it = true;
		} else if (guess < rand) {  
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}
}
