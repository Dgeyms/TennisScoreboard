
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewMatch", urlPatterns = ("/new-match"))
public class NewMatch extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}
