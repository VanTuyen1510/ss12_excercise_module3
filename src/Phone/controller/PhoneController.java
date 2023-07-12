package Phone.controller;

import Furama.utils.MyUtil;
import Phone.libs.MyRegex;
import Phone.models.Genuine;
import Phone.models.Handed;
import Phone.servcies.impl.GenuieServiceImpl;
import Phone.servcies.impl.HandedServiceImpl;
import Phone.servcies.itf.IGenuie;
import Phone.servcies.itf.IHanded;
import Phone.utils.MyUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneController {
    public static void main(String[] args) {
        try {
            displayMainMenu();
        } catch (IOException e) {
            System.out.println("File is not exits");
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static int select = 0;
    private static IGenuie genuieService = new GenuieServiceImpl();
    private static List<Genuine> genuines;

    static {
        try {
            genuines = genuieService.displayPhone();
        } catch (IOException e) {
            System.out.println("File is not exits");
        }
    }

    private static List<String> genuineIds = new ArrayList();


    private static IHanded handedService = new HandedServiceImpl();
    private static List<Handed> handeds;

    static {
        try {
            handeds = handedService.displayPhone();
        } catch (IOException e) {
            System.out.println("File is not exits");
        }
    }

    private static List<String> handedIds = new ArrayList<>();

    static {
        for (Genuine genuine : genuines) {
            genuineIds.add(genuine.getId());
        }
        for (Handed handed : handeds) {
            handedIds.add(handed.getId());
        }
    }


    public static void displayMainMenu() throws IOException {

        do {

            System.out.println("------QUẢN LÝ ĐIỆN THOẠI------");
            System.out.println("1.Hiển thị sản phẩm điện thoại");
            System.out.println("2.Thêm mới sản phẩm điện thoại");
            System.out.println("3.Xóa sản phẩm điện thoại");
            System.out.println("4.Tìm sản phẩm điện thoại");
            System.out.println("5.Exit");

            System.out.println("Mời bạn chọn chức năng :");
                select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayPhone();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    removePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }


        } while (select < 6);
    }

    public static void displayPhone() {
        if (genuines.size() == 0) {
            System.out.println("Không có điện thoại trong danh sách");
        } else {
            for (Genuine genuine : genuines) {
                System.out.println(genuine);
            }
        }

        if (handeds.size() == 0) {
            System.out.println("Không có điện thoại trong danh sách");

        } else {
            for (Handed handed : handeds) {
                System.out.println(handed);
            }
        }
    }

    public static void addPhone() throws IOException {
        do {
            try {
                System.out.println("1.Thêm điện thoại chính hãng");
                System.out.println("2.Thêm điện thoại xách tay");
                System.out.println("3.Return menu");
                System.out.println("Mời bạn chọn");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        addPhoneGuine();
                        break;
                    case 2:
                        addPhoneHanded();
                        break;
                    case 3:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter 1 to 3 !");
            }

        } while (select < 3);
    }

    public static void addPhoneGuine() throws IOException {
//   public Genuine(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
//        super(id, name, price, amount, producer);
//
//        System.out.println("Thêm id");
//        String id = scanner.nextLine();
//        boolean mathchesId = id.matches(MyRegex.REGEX_ID_DTCH);
//        while (!mathchesId){
//            System.out.println("Please enter");
//            id = scanner.nextLine();
//            mathchesId = id.matches(MyRegex.REGEX_ID_DTCH);
//        }

        System.out.println("Thêm id sản phẩm");
        String id = scanner.nextLine();

        System.out.println("Thêm name sản phẩm");
        String name = scanner.nextLine();


        String price = null;
        int price1;
        boolean check;
        do {

            try {
                check = false;
                System.out.println("Thêm giá sản phẩm");
                price = scanner.nextLine();
                price1 = Integer.parseInt(price);
                if (price1 < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Gía bán phải là số dương");
                check = true;
            }
        } while (check);

//        System.out.println("Thêm số lượng sản phẩm");
//        String amount = scanner.nextLine();

        String amount = null;
        int amount1;
        boolean check1;
        do {

            try {
                check1 = false;
                System.out.println("Thêm số lượng sản phẩm");
                amount = scanner.nextLine();
                amount1 = Integer.parseInt(price);
                if (amount1 < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Số lượng phải là số dương");
                check1 = true;
            }
        } while (check1);



        System.out.println("Thêm nhà xản xuất sản phẩm");
        String producer = scanner.nextLine();

        System.out.println("Thêm thời gian bảo hành sản phẩm");
        String warrantyPeriod = scanner.nextLine();

        System.out.println("Thêm bảo hành bảo hiểm sản phẩm");
        String warrantyCoverage = MyUtils.warrantyCoverage();

        Genuine genuine = new Genuine(id, name, price, amount, producer, warrantyPeriod, warrantyCoverage);
        genuieService.addPhone(genuine);
        genuines.add(genuine);
        genuineIds.add(genuine.getId());
    }

    public static void addPhoneHanded() throws IOException {
        //  public Handed(String id, String name, String price, String amount, String producer, String country, String status) {
        //        super(id, name, price, amount, producer);

        System.out.println("Thêm id sản phẩm");
        String id = scanner.nextLine();

        System.out.println("Thêm tên sản phẩm");
        String name = scanner.nextLine();


        String price = null;
        int price1;
        boolean check;
        do {

            try {
                check = false;
                System.out.println("Thêm giá sản phẩm");
                price = scanner.nextLine();
                price1 = Integer.parseInt(price);
                if (price1 < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số lớn hơn 0");
                check = true;
            }
        } while (check);


//        System.out.println("Thêm số lượng sản phẩm");
//        String amount = scanner.nextLine();

        String amount = null;
        int amount2;
        boolean check2;
        do {

            try {
                check2 = false;
                System.out.println("Thêm số lượng sản phẩm");
                amount = scanner.nextLine();
                amount2 = Integer.parseInt(price);
                if (amount2 < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Số lượng phải là số dương");
                check2 = true;
            }
        } while (check2);

        System.out.println("Thêm nhà xản xuất sản phẩm");
        String producer = scanner.nextLine();

        System.out.println("Thêm quốc gia sản phẩm");
        String country = scanner.nextLine();

        System.out.println("Thêm trạng thái sản phẩm");
        String status = MyUtils.status();

        Handed handed = new Handed(id, name, price, amount, producer, country, status);
        handedService.addPhone(handed);
        handeds.add(handed);
        handedIds.add(handed.getId());

    }


    public static void removePhone() throws IOException {
        do {
            try {
                System.out.println("1.Xóa điện thoại chính hãng");
                System.out.println("2.Xóa điện thoại xách tay");
                System.out.println("3.Return menu");
                System.out.println("Mời bạn chọn");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        removePhoneGenuine();
                        break;
                    case 2:
                        removePhoneHanded();
                        break;
                    case 3:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("you must enter 1 to 3 !");
            }

        } while (select < 3);
    }

    public static void removePhoneGenuine() throws IOException {
        System.out.println("Nhập mã số điện thoại chính hãng cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean test = MyUtils.checkID(String.valueOf(id), genuineIds);

        if (!test) {
            System.out.println("Điện thoại này không tồn tại trong danh mục");
        } else {
            genuieService.removePhone(String.valueOf(id));
            genuines = genuieService.displayPhone();
            genuineIds.remove(Integer.valueOf(id));
        }


    }

    public static void removePhoneHanded() throws IOException {
        System.out.println("Nhập mã số điện thoại  cần xóa");
        int id2 = Integer.parseInt(scanner.nextLine());
        boolean test2 = MyUtils.checkID(String.valueOf(id2), handedIds);

        if (!test2) {
            System.out.println("Điện thoại này không tồn tại trong danh mục");
        } else {
            handedService.removePhone(String.valueOf(id2));
            handeds = handedService.displayPhone();
            handedIds.remove(Integer.valueOf(id2));
        }
    }

    public static void searchPhone() throws IOException {
        do {
            try {
                System.out.println("1.Điện thoại chính hãng");
                System.out.println("2.Điện thoại xách tay");
                System.out.println("3.Return menu");
                System.out.println("Mời bạn chọn");
                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:
                        searchPhoneGenuine();
                        break;
                    case 2:
                        searchPhoneHanded();
                        break;
                    case 3:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("you must enter 1 to 3 !");
            }

        } while (select < 3);
    }

    public static void searchPhoneGenuine() throws IOException {
        System.out.println("Nhập mã sản phẩm bạn muốn tìm vào đây :");
        String id1 = scanner.nextLine();
        boolean test1 = MyUtil.checkId(id1, genuineIds);
        if (!test1) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            genuieService.searchPhone(id1);
        }

    }

    public static void searchPhoneHanded() throws IOException {
        System.out.println("Nhập mã sản phẩm bạn muốn tìm vào đây :");
        String id2 = scanner.nextLine();
        boolean test2 = MyUtil.checkId(id2, handedIds);
        if (!test2) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            handedService.searchPhone(id2);

        }

    }
}
