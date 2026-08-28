

public class Product {

    private String name;
    private double price ;
    private int quantity ;

     public Product (String name, double price , int quantity) {

         setName(name);
         setPrice(price);
         setQuantity(quantity);
     }

     public void setName(String name) {

         if (name != null && !name.isEmpty()) {
             this.name = name;
         }
         else {

             System.out.println("invalid name");

         }
     }
         public void setPrice (double price) {

             if (price > 0) {
                 this.price = price;
             } else {
                 System.out.println(" price cannot be negative");

             }
         }
             public void setQuantity(int quantity) {

                 if (quantity >= 0) {

                     this.quantity = quantity;


                 } else {

                     System.out.println("negative  quantity not allowed");

                 }


             }


    public String getName() {

          return name;
    }

    public double getPrice() {
        return price;


    }
    public int getQuantity() {

        return quantity;

    }




























    }













