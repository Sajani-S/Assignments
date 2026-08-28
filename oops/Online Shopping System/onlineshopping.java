public class onlineshopping {

    public static void main(String[] args){

        Product p1 = new Product( "tv", 50000, 2);
        Product p2 = new Product( "school bag", 800, 3);


         Cart u = new Cart();
         u.addingproducts(p1);
         u.addingproducts(p2);


        double total = u.calculatetotal();
        System.out.println("total amount" + "  "  +  "= " + total);


           Payment d = new CreditCardPayment();

           d.pay(total);

        Payment f = new UpIPayment();
          f.pay(total);











    }












}
