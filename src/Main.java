import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		
		int countA=0;
		int countB=0;
		
		for (int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			if (c == 'A') {
				countA++; // countA += 1   countA=countA+1
			} else if (c=='B') {
				countB++;
			}
		}
		
		if (countA>countB) {
			System.out.println("A");
		} else if (countA < countB) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}

}
