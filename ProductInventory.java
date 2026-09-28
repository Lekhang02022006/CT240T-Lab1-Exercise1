import java.util.ArrayList;
import java.util.List;

public class ProductInventory {

    private List<Product> products;

    public ProductInventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }

        return result;
    }

    public double calculateTotalValue() {
        double total = 0;

        for (Product product : products) {
            total += product.calculateFinalPrice();
        }

        return total;
    }
}