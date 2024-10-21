package DCS_FuzzyLab1_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class ComparatorInput {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		File file = new File("D:\\PetriInputData\\comparator.txt");
		Files.deleteIfExists(file.toPath());
		FileWriter fw = new FileWriter(file.getPath());
		Float f1, f2;
		for (float i = 0; i < 100; i++) {
			if (i % 10 < 5) {
				f1 = i/100;
				f2 = i/-100;
			} else {
				f1 = i/-100;
				f2 = i/100;
			}
			fw.write("P0:"+f1+"F"+","+"P1:"+f2+"F\n");
		}
		fw.close();
		System.out.println("Done!");
	}
}
