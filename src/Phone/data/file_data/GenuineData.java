package Phone.data.file_data;

import Phone.models.Genuine;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenuineData {
    private static final String GENUINE_PATH = "D:\\hoc_lap_trinh_code_gym\\src\\Phone\\data\\file_csv\\Genuine.csv";



    public static List<Genuine> readFile() throws IOException {
        FileReader fileReader = new FileReader(GENUINE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        List<Genuine> genuineDataList = new ArrayList<>();
        String line = buff.readLine();
        String[] temp;
        Genuine genuine;

        while (line != null){
            temp = line.split(",");

            //    public Genuine(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
            //        super(id, name, price, amount, producer);
            String id = temp[0];
            String name = temp[1];
            String price = temp[2];
            String amount = temp[3];
            String producer = temp[4];
            String warrantyPeriod = temp[5];
            String warrantyCoverage = temp[6];


            genuine = new Genuine(id,name,price,amount,producer,warrantyPeriod,warrantyCoverage);
            genuineDataList.add(genuine);
            line = buff.readLine();
        }
        buff.close();
        return genuineDataList;
    }

    public static void writeFile(Genuine genuine) throws IOException {
        FileWriter fileWriter = new FileWriter(GENUINE_PATH,true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);


        buffer.write(
                genuine.getId() + ","
                        + genuine.getName() + ","
                        + genuine.getPrice() + ","
                        + genuine.getAmount() + ","
                        + genuine.getProducer() + ","
                        + genuine.getWarrantyPeriod()+ ","
                        + genuine.getWarrantyPeriod() + "\n"

        );
        buffer.close();

    }

    public static void writeFileList(List<Genuine> genuineList) throws IOException {
        FileWriter fileWriter = new FileWriter(GENUINE_PATH);
        BufferedWriter buffer = new BufferedWriter(fileWriter);


        for (int i = 0; i < genuineList.size(); i++) {
            Genuine genuine = genuineList.get(i);

            buffer.write(
                    genuine.getId() + ","
                            + genuine.getName() + ","
                            + genuine.getPrice() + ","
                            + genuine.getAmount() + ","
                            + genuine.getProducer() + ","
                            + genuine.getWarrantyPeriod()+ ","
                            + genuine.getWarrantyPeriod() + "\n"
            );
        }

        buffer.close();

    }
}
