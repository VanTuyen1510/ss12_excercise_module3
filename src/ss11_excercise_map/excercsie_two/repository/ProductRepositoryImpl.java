package ss11_excercise_map.excercsie_two.repository;

import ss11_excercise_map.excercsie_two.model.Product;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {
    static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static int size = 0;
    static {
        Product product1 = new Product(1,"String vàng" , 9000);
        Product product2 = new Product(2,"String dâu" , 7000);
        Product product3 = new Product(3,"Number one",12000);
        Product product4 = new Product(4,"Trà 0 độ",15000);
        Product product5 = new Product(5,"Bò húc",20000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }




    @Override
    public  List<Product> addProduct(Product product) {
        System.out.println("Nhập id sản phẩm bạn muốn thêm :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm bạn muốn thêm :");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm bạn muốn thêm :");
        double price = sc.nextDouble();
        Product product1 = new Product(id,name,price);
        productList.add(product1);
        return productList;
    }

    @Override
    public List<Product> editProduct(int id) {
        int select = 0;
        do{
            boolean check = false;
            for (int i = 0; i < productList.size(); i++) {
                if(id == productList.get(i).getId()){
//                    System.out.println("1.Sửa id"); không nên sửa id vì id là định danh của đối tượng
                    System.out.println("2.Sửa tên sản phẩm :");
                    System.out.println("3.Sửa giá sản phẩm");
                    System.out.print("Please input number: ");
                    select = Integer.parseInt(sc.nextLine()); // thừa dấu enter dùng nextLine
                    switch (select){
                        case 2:
                            System.out.println("Mời bạn nhập tên sản phẩm mới mà bạn muốn sửa:");
                            String nameEdit = sc.nextLine();
                            productList.get(i).setName(nameEdit);
                            break;
                        case 3:
                            System.out.println("Mời bạn nhập giá sản phẩm mới mà bạn muốn sửa :");
                            double priceEdit = Double.parseDouble(sc.nextLine());
                            productList.get(i).setPrice(priceEdit);
                            break;
                    }
                     check = true;
                    break;
                }

            }
            if(!check){
                System.out.println("Không tìm thấy sản phẩm bạn cần tìm");
            }
            System.out.println("Bạn muốn tiếp tục sản phẩm");
            System.out.println("1.Vâng,tôi muốn tiếp tục :");
            System.out.println("2.Thoát :");
            System.out.println("Mời bạn chọn tính năng");
            select = Integer.parseInt(sc.nextLine());
        }while (select > 3);
        return productList;
    }

    @Override
    public List<Product> deleteProduct(int idDelete) {
        for (int i = 0; i < productList.size(); i++) {
            if(idDelete == productList.get(i).getId()){
                productList.remove(i);
            }
        }
        return productList;
    }

    @Override
    public ArrayList<Product> showProduct() {
        List<Product> product = new ArrayList<>();
        for (int i = 0; i < product.size(); i++) {
            product.set(i,productList.get(i));
        }
        return (ArrayList<Product>) productList;
    }

    @Override
    public List<Product> searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if(name.equalsIgnoreCase(productList.get(i).getName())){
                System.out.println("Sản phẩm bạn muốn tìm là :" + productList.get(i));
            }
        }
        return productList;
    }

    @Override
    public List<Product> ascendingProductSort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : -1;
            }
        });
        for (Product product:productList) {
            System.out.println(product.toString());
        }
        return productList;
    }

    @Override
    public List<Product> sortProductsReduced() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() <  o2.getPrice() ? 1 : -1;
            }
        });
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        return productList;
    }


}
