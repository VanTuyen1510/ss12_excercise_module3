package controller;

import entity.Customer;
import service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/list_jstl")
public class CustomerController extends HttpServlet  implements Filter{
    private String encoding = "utf-8";
    private CustomerService service = new CustomerService();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(encoding);
                        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding(encoding);
        filterChain.doFilter(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding(encoding);
//        response.setCharacterEncoding(encoding);

        List<Customer> customers = service.getList();
        request.setAttribute("customerList",customers);
        request.getRequestDispatcher("list_jstl.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
