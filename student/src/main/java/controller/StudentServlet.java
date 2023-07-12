package controller;

import bean.Student;
import service.IStudentService;
import service.impl.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"","/student_servlet"})
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Student> studentList = new ArrayList<>();
//        //Integer id, String name, String dateOfBirth, Integer gender, Double grade
//        studentList.add(new Student(432,"Nguyễn Văn A","2000-10-27",1,4.0));
//        studentList.add(new Student(984,"Lê Thị B","2000-07-28",0,7.0));
//        studentList.add(new Student(322,"Nguyễn Thị D","2000-10-21",0,9.0));
//        studentList.add(new Student(233,"Nguyễn Văn C","2000-04-09",1,6.0));
//        request.setAttribute("studentListServlet",studentList);
//        request.getRequestDispatcher("index.jsp").forward(request,response);

        // doGet làm cái việc load,doPost làm cái việc update thông tin,đăng ký thông tin
        // thẻ a vào deoGet

        // update 2 luồng 1 là lấy DB và load DB
        // create 1 luồng là lấy DB ko cần load DB


        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
//                response.sendRedirect("create_student.jsp");
                request.getRequestDispatcher("create_student.jsp").forward(request,response);
                break;
            case "update":
                break;
            case "delete":
                break;
            default:
                request.setAttribute("studentListServlet",this.iStudentService.finalAll());
                request.getRequestDispatcher("index.jsp").forward(request,response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                Student student = new Student();
                student.setName(name);
                student.setDateOfBirth(dateOfBirth);
                this.iStudentService.save(student);
                response.sendRedirect("create_student.jsp");
//                request.getRequestDispatcher("create_student.jsp").forward(request,response);
                break;
            default:

        }
    }
}
