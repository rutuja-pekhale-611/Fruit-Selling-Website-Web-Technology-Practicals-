import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
    @EJB
    private FruitManager fruitManager;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // Use fruitManager to get all fruits, add a new fruit, update a fruit, or remove a fruit
    }
}

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    @EJB
    private OrderManager orderManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Use orderManager to place an order
    }
}

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @EJB
    private AuthenticationManager authenticationManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Use authenticationManager to authenticate user credentials
    }
}
