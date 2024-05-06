import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FruitManagerBean implements FruitManager {
    @Override
    public List<Fruit> getAllFruits() {
        // Implement logic to retrieve all fruits from the database
        // Return a list of Fruit objects
    }

    @Override
    public void addFruit(Fruit fruit) {
        // Implement logic to add a new fruit to the database
    }

    @Override
    public void updateFruit(Fruit fruit) {
        // Implement logic to update an existing fruit in the database
    }

    @Override
    public void removeFruit(int fruitId) {
        // Implement logic to remove a fruit from the database
    }
}

@Stateless
public class OrderManagerBean implements OrderManager {
    @Override
    public void placeOrder(Order order) {
        // Implement logic to process and place an order
    }
}

@Stateless
public class AuthenticationManagerBean implements AuthenticationManager {
    @Override
    public boolean authenticateUser(String username, String password) {
        // Implement logic to authenticate user credentials
        // Return true if authentication is successful, false otherwise
    }
}
