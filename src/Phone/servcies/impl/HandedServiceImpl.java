package Phone.servcies.impl;

import Phone.data.file_data.HandedData;
import Phone.models.Handed;
import Phone.models.Phone;
import Phone.servcies.itf.IHanded;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HandedServiceImpl implements IHanded {
    private static List<Handed> handeds = new ArrayList<>();

    // public Handed(String id, String name, String price, String amount, String producer, String country, String status) {
    //        super(id, name, price, amount, producer);

//    static {
//        Handed handed = new Handed("1","Nokia N72","6000000","10","Nokia","USA","Đã sữa chữa");
//        handeds.add(handed);
//    }
    private static int size = 0;
    @Override
    public List<Handed> displayPhone() throws IOException {
        List<Handed> handedList = new ArrayList<>();
        for (int i = 0; i < handedList.size(); i++) {
          handedList.set(i,handeds.get(i));
        }
        handedList = HandedData.readFile();
        return handedList;
    }

    @Override
    public List<Handed> addPhone(Handed handed) throws IOException {
        handeds.add(handed);
        HandedData.writeFile(handed);
        return handeds;
    }


    @Override
    public List<Handed> removePhone(String id) throws IOException {
        for (int i = 0; i < handeds.size(); i++) {
            if(id.equalsIgnoreCase(handeds.get(i).getId().trim())){
                handeds.remove(i);
            }
        }
        HandedData.writeFileList(handeds);
        return handeds;

    }

    @Override
    public void searchPhone(String id) throws IOException {
        for (int i = 0; i < handeds.size(); i++) {
            if(id.equalsIgnoreCase(handeds.get(i).getId().trim())) {
                System.out.println(handeds.get(i));
            }
        }
        HandedData.readFile();
    }
}
