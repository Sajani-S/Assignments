public class Food {

    int id  ;
    String name;
    String restaurant ;

    Food ( int id,String name,String restaurment){
        this.id= id;
        this.name= name;
        this.restaurant= restaurment;
    }


    public void show(){

        System.out.println("order id :"+"" +id);
        System.out.println("customer name  :"+ " " +name);
        System.out.println("restaurant name : "+ " " +restaurant);
    }



}
