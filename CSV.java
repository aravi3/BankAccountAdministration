import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    // This method will read data from a CSV file and return as a list
    public List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }      
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        return data;
    }
}