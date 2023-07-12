package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet", urlPatterns = "/sum_servlet")
public class SumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       String flag = request.getParameter("flag");

       double a = Double.parseDouble(request.getParameter("numberOne"));
       double b = Double.parseDouble(request.getParameter("numberTwo"));
       double result = a + b;


       // C1:
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("<html>");
//        printWriter.write("<body>");
//        printWriter.write("<h2 style = 'color:red'>"+ result + "</h2>");
//        printWriter.write("</body>");
//        printWriter.write("</html>");


        //C3:
        request.setAttribute("resultFromServlet",result);
//        request.getRequestDispatcher("result_final.jsp").forward(request,response);
        // forward chuyển hướng trang đẩy request sang 1 trang jsp mới
        response.sendRedirect("result_final.jsp");
        // sendRedirect chuyển hướng trang thì xóa request cũ đi và sẽ tạo 1 request mới,khi tạo mới thì dữ liệu đâu còn nữa đâu
        // sendRedirect sẽ chạy chậm hơn foward vì cần 1 quá trình xóa request cũ tạo 1 request mới
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
