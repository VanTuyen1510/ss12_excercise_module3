package on_tap_oop_full_house.excercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    private Map<String, String> dict;

    public Dictionary(File file) {
        // try ,catch giúp cho sc sẽ tự động gọi đến phương thức closeable sẽ tự động close
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] split = str.split(":");
//                split[0] : Key
//                split[1] : Mean
                dict.put(split[0].trim(),split[1].trim());

            }
        } catch (FileNotFoundException e) {
            //file.getAbsolutePath() : đường dẫn được truyền vào
            System.err.println("File + " + file.getAbsolutePath() + " does  not exits");
        }

    }
}
