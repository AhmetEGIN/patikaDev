package patikaDev.projeFixture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		

		List<String> teams = new ArrayList<>();
		Map<String, List<String>> fix = new HashMap<>();

		for (int i = 0; i < n; i++) {

			teams.add(scan.nextLine());

		}

		for (int j = 0; j < n/2; j++) {

			String t1 = teams.get(j);
			teams.remove(t1);
			List<String> tempArray = new ArrayList<>(teams);


			List<String> away = new ArrayList<>();

			for (int i = j; i < n-1; i++) {

				String team1 = tempArray.get((int) (Math.random() * tempArray.size()));
				away.add(team1);
				tempArray.remove(team1);
				System.out.println("---");
				fix.put(t1, away);

			}
		}

		for (String key : fix.keySet()) {
			for (String string : fix.get(key)) {
				System.out.println(key + " vs " + string);
			}

		}

	}

}
