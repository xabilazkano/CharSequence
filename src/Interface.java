import com.zubiri.*;
import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		Sequence seq = new Sequence();
		System.out.println("Tell me a word");
		Scanner sc = new Scanner(System.in);
		seq.setWord(sc.next());
		boolean flag = true;
		while (flag) {
			System.out.println("Which method do yoy want to use?");
			System.out.println("1.- CharAt");
			System.out.println("2.- Length");
			System.out.println("3.- SubSequence");
			System.out.println("0.- Quit");
			switch (sc.next()) {
			default:
				System.out.println("Enter a valid option");
				break;
			case "1":
				System.out.println("Enter the number of the position");
				System.out.println("The char in this position is: " + seq.charAt(sc.nextInt()));

				break;

			case "2":
				System.out.println("The length of your word is: " + seq.length());
				break;

			case "3":
				System.out.println("Starting position");
				int start = sc.nextInt();
				System.out.println("Ending position");
				int end = sc.nextInt();
				System.out.println("This is your sequence: " + seq.subSequence(start, end));
				break;
				
			case "0":
				System.out.println("Bye!");
				flag=false;
			}
		}
	}

}
