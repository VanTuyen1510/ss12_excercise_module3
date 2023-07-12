package Phone.data.file_data;

import Phone.models.Genuine;
import Phone.models.Handed;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HandedData {
    private static final String HANDED_PATH = "D:\\hoc_lap_trinh_code_gym\\src\\Phone\\data\\file_csv\\Handed.csv";



    public static List<Handed> readFile() throws IOException {
        FileReader fileReader = new FileReader(HANDED_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        List<Handed> handedDataList= new ArrayList<>();
        String line = buff.readLine();
        String[] temp;
        Handed handed;

        while (line != null){
            temp = line.split(",");
//    public Handed(String id, String name, String price, String amount, String producer, String country, String status) {
//        super(id, name, price, amount, producer);

            String id = temp[0];
            String name = temp[1];
            String price = temp[2];
            String amount = temp[3];
            String producer = temp[4];
            String country = temp[5];
            String status = temp[6];


            handed = new Handed(id,name,price,amount,producer,country,status);
            handedDataList.add(handed);
            line = buff.readLine();
        }
        buff.close();
        return handedDataList;
    }

    public static void writeFile(Handed handed) throws IOException {
        FileWriter fileWriter = new FileWriter(HANDED_PATH,true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);


        buffer.write(
                  handed.getId()+ ","
                        + handed.getName() + ","
                        + handed.getPrice() + ","
                        + handed.getAmount() + ","
                        + handed.getProducer() + ","
                        + handed.getCountry()+ ","
                        + handed.getStatus() + "\n"

        );
        buffer.close();

    }

    public static void writeFileList(List<Handed> handedList) throws IOException {
        FileWriter fileWriter = new FileWriter(HANDED_PATH);
        BufferedWriter buffer = new BufferedWriter(fileWriter);


        for (int i = 0; i < handedList.size(); i++) {
            Handed handed = handedList.get(i);

            buffer.write(
                    handed.getId()+ ","
                            + handed.getName() + ","
                            + handed.getPrice() + ","
                            + handed.getAmount() + ","
                            + handed.getProducer() + ","
                            + handed.getCountry()+ ","
                            + handed.getStatus() + "\n"
            );
        }

        buffer.close();

    }
}
