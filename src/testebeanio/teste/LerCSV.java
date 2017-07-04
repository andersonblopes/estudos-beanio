package testebeanio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LerCSV {
	public static void main(String[] args) {
		try {
			File file = new File("exemplo.csv");
			LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(file));
			linhaLeitura.skip(file.length());
			System.out.println(linhaLeitura.read());
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String[] temp = sc.next().split(",");
				System.out.println(temp[1]);
			}
			linhaLeitura.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}