import java.util.*;

public class Find_Number {
	public static void main(String[] args) {
		int randNo, inputNo, userAttempt = 1;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		randNo = rand.nextInt(101);
		System.out.println("Adivina el número entre 1 y 100\n");
		do {
			inputNo = scan.nextInt();
			if (inputNo > randNo) {
				System.out.println("¡Número más bajo!");
			}
			if (inputNo < randNo) {
				System.out.println("¡Número más alto!");
			}
			if (inputNo == randNo) {
				System.out.println("¡Correcto!");
				System.out.println("Adivinaste en " + userAttempt + " intentos.");
			}
			userAttempt++;
		} while (inputNo != randNo);
	}
}
