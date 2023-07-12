package Phone.servcies.impl;

import Phone.data.file_data.GenuineData;
import Phone.models.Genuine;
import Phone.servcies.itf.IGenuie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenuieServiceImpl implements IGenuie {
    private static List<Genuine> genuines = new ArrayList<>();
    //   public Genuine(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
    //        super(id, name, price, amount, producer);
    static {
        Genuine genuine1 = new Genuine("1","SamSung S9","1000000","10","SamSung","365","global");
        genuines.add(genuine1);
    }

    static {
        try {
            genuines = GenuineData.readFile();
        } catch (IOException e) {
            System.out.println("File is not exist");
        }
    }
    private static int size = 0;

    @Override
    public List<Genuine> displayPhone() throws IOException {
        List<Genuine> genuineList = new ArrayList<>();
        for (int i = 0; i < genuineList.size(); i++) {
            genuineList.set(i,genuines.get(i));
        }
      genuineList =  GenuineData.readFile();
        return genuineList;
    }

    @Override
    public List<Genuine> addPhone(Genuine genuine) throws IOException {
        genuines.add(genuine);
        GenuineData.writeFile(genuine);
        return genuines;
    }



    @Override
    public List<Genuine> removePhone(String id) throws IOException {
        for (int i = 0; i < genuines.size(); i++) {
            if(id.equalsIgnoreCase(genuines.get(i).getId().trim())){
                genuines.remove(i);
            }
        }
        GenuineData.writeFileList(genuines);
        return genuines;
    }

    @Override
    public void searchPhone(String id) throws IOException {
        for (int i = 0; i < genuines.size(); i++) {
            if(id.equalsIgnoreCase(genuines.get(i).getId().trim())) {
                System.out.println(genuines.get(i));
            }
        }
        GenuineData.readFile();
    }
}
