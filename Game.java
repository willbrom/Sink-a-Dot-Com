import java.lang.Math;
import java.util.Scanner;

class Game {
	public static void main(String[] args) {
		DotCom dc = new DotCom();
		int firstCell =(int) (Math.random() * 5);
		
		boolean firstHit = false;
		boolean secondHit = false;
		boolean thirdHit = false;

		int totalHits = 0;

		int[] cells = new int[3];
		cells[0] = firstCell;
		cells[1] = ++firstCell;
		cells[2] = ++firstCell;

		Scanner sc = new Scanner(System.in);

		while(totalHits < 3) {
			int guess = sc.nextInt();	
		
			if (guess == cells[0] && !firstHit) {
				firstHit = true;
				totalHits++;
				System.out.println("Hit!");
				continue;
			} else if(guess == cells[1] && !secondHit) {
				secondHit = true;
				totalHits++;
				System.out.println("Hit!");
				continue;
			} else if(guess == cells[2] && !thirdHit) {
				thirdHit = true;
				totalHits++;
				System.out.println("Hit!");
				continue;
			}
			
			System.out.println("Miss.");
		}

		System.out.println("Kill!");
	}
}