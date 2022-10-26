package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] vect = line.split(",");
				String name = vect[0];
				int count = Integer.parseInt(vect[1]);

				if (map.containsKey(name)) {
					int votosAteAgora = map.get(name);
					map.put(name, count + votosAteAgora);
				} else {
					map.put(name, count);
				}

				line = br.readLine();
			}

			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
