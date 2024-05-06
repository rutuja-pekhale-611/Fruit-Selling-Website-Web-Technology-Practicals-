 
 
 import javax.ejb.Remote;

@Remote
public interface FruitManager {
    List<Fruit> getAllFruits();
    void addFruit(Fruit fruit);
    void updateFruit(Fruit fruit);
    void removeFruit(int fruitId);
}

@Remote
public interface OrderManager {
    void placeOrder(Order order);
}

@Remote
public interface AuthenticationManager {
    boolean authenticateUser(String username, String password);
}
