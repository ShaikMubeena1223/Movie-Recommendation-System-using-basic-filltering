package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public static ArrayList<String[]> readCSV(String filePath) {

        ArrayList<String[]> data = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;

            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                data.add(line.split(","));
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}