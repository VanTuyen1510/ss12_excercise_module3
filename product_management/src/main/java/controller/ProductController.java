package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/products")
public class ProductController extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    @Override
    //doGet hiển thị trang người ta muốn xóa (cái người ta nhập vào) ,còn doPost là hiển thị xóa thật sự (xóa dữ liệu chính thức)
    // dispatcher là chuyển trang lấy dữ liệu ,response chuyển trang ko cần dữ liệu
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "list";
        }
        switch (action){
            case "list":
                viewList(request,response);
                break;
                case ""
        }

    }

    private void viewList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.findAll();
        request.setAttribute("products",products);
        request.getRequestDispatcher("WEB-INF/product/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
