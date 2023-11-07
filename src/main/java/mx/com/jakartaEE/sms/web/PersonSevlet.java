package mx.com.jakartaEE.sms.web;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;
import mx.com.jakartaEE.sms.domain.Person;
import mx.com.jakartaEE.sms.service.PersonServiceLocal;

@WebServlet("/People")
public class PersonSevlet extends HttpServlet{
    
    @Inject
    PersonServiceLocal personServiceLocal;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Person> people = personServiceLocal.listPerson();
        System.out.println(people);
        System.out.println("-------------------------------");
        request.setAttribute("people", people);
        request.getRequestDispatcher("/listPeople.jsp").forward(request, response);
    }   
}
