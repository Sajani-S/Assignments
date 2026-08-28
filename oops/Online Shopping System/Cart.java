
import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> k = new ArrayList<>();

    public void addingproducts(Product p) {
        k.add(p);
        System.out.println(p.getName() + "  " + "added to cart , " + " " + "quantity =" + " " + p.getQuantity() + ", " + "price =" + " " + p.getPrice());
    }



    public double calculatetotal() {

        double total = 0;

        for (Product o : k) {
            total+= o.getPrice()*o.getQuantity();
        }
         return total;
    }















}
