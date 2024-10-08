import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ValidateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("anu".equals(username) && "JNU".equals(password)) {
            // Redirect to login success page
            response.sendRedirect("login.html");
        } else {
            // Redirect to failure page
            response.sendRedirect("fail.html");
        }
    }
}
