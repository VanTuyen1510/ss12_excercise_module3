package ss10_excercise_map.excercsie_two.Controller;


import ss10_excercise_map.excercsie_two.model.Product;
import ss10_excercise_map.excercsie_two.repository.IProductRepository;
import ss10_excercise_map.excercsie_two.service.IProductService;
import ss10_excercise_map.excercsie_two.service.ProductServiceIpml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductServiceIpml();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-------Product Manager-------");
            System.out.println("1.Show list product");
            System.out.println("2.Add new product");
            System.out.println("3.Edit product");
            System.out.println("4.Delete product");
            System.out.println("5.Serach name product");
            System.out.println("6.Ascending product sort");
            System.out.println("-----Please input number------");
            select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1 :
                    ArrayList<Product> productList = (ArrayList<Product>) service.showProduct();
                    for (Product product: productList) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    Product product1 = new Product(); //???
                    service.addProduct(product1);
                  break;
                case 3:
                    System.out.println("Nhập mã bạn muốn sửa vào :");
                    int editProduct = Integer.parseInt(sc.nextLine()); //???
                    service.editProduct(editProduct);
                    break;
                case 4:
                    System.out.println("Nhập mã bạn muốn xóa vào :");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    service.deleteProduct(idDelete);
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm :");
                    String nameSearch = sc.nextLine();
                    service.searchProduct(nameSearch);
                    break;
                case 6:
                    for (Product product2: service.ascendingProductSort()) {
                        System.out.println(product2);
                    }
                    break;
            }
        }while (select > 0);
    }
}
