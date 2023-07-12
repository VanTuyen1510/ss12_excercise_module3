package servlet;

import bean.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/student_servlet")
// "" để chuỗi rỗng để cho servlet load đầu tiên vào doGet
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(432, "Nguyen Van A", "2000-10-27", 1, 4.0));
        studentList.add(new Student(984, "Le Thi B", "2000-07-28", 0, 7.0));
        studentList.add(new Student(322, "Nguyen Thi D", "2000-10-21", 0, 9.0));
        studentList.add(new Student(233, "Nguyen Van C", "2000-04-09", 1, 6.0));
        request.setAttribute("studentListServlet", studentList);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
