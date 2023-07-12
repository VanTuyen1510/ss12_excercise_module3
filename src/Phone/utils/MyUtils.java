package Phone.utils;

import Phone.models.Genuine;
import Phone.models.Handed;

import java.util.List;
import java.util.Scanner;

public class MyUtils {
    static Scanner scanner = new Scanner(System.in);
    static int select = 0;

    public static boolean checkID(String id, List<String> ids) {
        return ids.contains(id);
    }

    public static void editPhoneGunuine(Genuine genuine) {
        //   public Genuine(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
        //        super(id, name, price, amount, producer);
        do {

            System.out.println("1.Nhập name bạn sửa");
            System.out.println("2.Nhập giá bạn sửa");
            System.out.println("3.Nhập số lượng bạn sửa");
            System.out.println("4.Nhập nhà sản xuất bạn sửa");
            System.out.println("5.Nhập thời gian bảo hành bạn sửa");
            System.out.println("6.Nhập phạm vi bạn sửa");
            System.out.println("7.Finish");
            System.out.println("Mời bạn chọn");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    System.out.println("1.Nhập name bạn sửa");
                    String name = scanner.nextLine();
                    genuine.setName(name);
                    break;
                case 2:
                    System.out.println("3.Nhập giá bạn sửa");
                    String price = scanner.nextLine();
                    genuine.setPrice(price);
                    break;
                case 3:
                    System.out.println("4.Nhập số lượng bạn sửa");
                    String amount = scanner.nextLine();
                    genuine.setAmount(amount);
                    break;
                case 4:
                    System.out.println("5.Nhập nhà sản xuất bạn sửa");
                    String producer = scanner.nextLine();
                    genuine.setProducer(producer);
                    break;
                case 5:
                    System.out.println("6.Nhập thời gian bảo hành bạn sửa");
                    String warrantyPeriod = scanner.nextLine();
                    genuine.setWarrantyPeriod(warrantyPeriod);
                    break;
                case 6:
                    System.out.println("7.Nhập phạm vi bạn sửa");
                    String warrantyCoverage = scanner.nextLine();
                    genuine.setWarrantyCoverage(warrantyCoverage);
                    break;
                case 7:
                    break;

            }
        } while (select < 7);

    }

    public static void editPhoneHanded(Handed handed) {

        //  public Handed(String id, String name, String price, String amount, String producer, String country, String status) {
        //        super(id, name, price, amount, producer);

        do {
            System.out.println("1.Nhập name bạn sửa");
            System.out.println("2.Nhập giá bạn sửa");
            System.out.println("3.Nhập số lượng bạn sửa");
            System.out.println("4.Nhập nhà sản xuất bạn sửa");
            System.out.println("5.Nhập quốc gia bạn sửa");
            System.out.println("6.Nhập trạng thái bạn sửa");
            System.out.println("7.Finish");
            System.out.println("Mời bạn chọn");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("1.Nhập name bạn sửa");
                    String name = scanner.nextLine();
                    handed.setName(name);
                    break;
                case 2:
                    System.out.println("2.Nhập giá bạn sửa");
                    String price = scanner.nextLine();
                    handed.setPrice(price);
                case 3:
                    System.out.println("3.Nhập số lượng bạn sửa");
                    String amount = scanner.nextLine();
                    handed.setAmount(amount);
                    break;
                case 4:
                    System.out.println("4.Nhập nhà sản xuất bạn sửa");
                    String producer = scanner.nextLine();
                    handed.setProducer(producer);
                    break;
                case 5:
                    System.out.println("5.Nhập quốc gia bạn sửa");
                    String country = scanner.nextLine();
                    handed.setCountry(country);
                    break;
                case 6:
                    System.out.println("6.Nhập trạng thái bạn sửa");
                    String status = scanner.nextLine();
                    handed.setStatus(status);
                    break;
                case 7:
                    break;


            }
        } while (select < 7);
    }

    public static String warrantyCoverage() {
        do {
            System.out.println("Mời bạn chọn");
            System.out.println("1.Toàn quốc");
            System.out.println("2.Quốc tế");

            try {
                select = Integer.parseInt(scanner.nextLine());
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("You must enter 1 to 2 ");
            }

            switch (select) {
                case 1:
                    return "Toàn Quốc";
                case 2:
                    return "Quốc tế";
            }
        } while (select < 2);
        return null;
    }

    public static String status(){
        do {
            System.out.println("Mời bạn chọn");
            System.out.println("1.Đã sửa chữa");
            System.out.println("2.Chưa sửa chữa");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    return "Đã sửa chữa";
                case 2:
                    return "Chưa sửa chữa";
            }
        }while (select < 2);
        return null;
    }


}
