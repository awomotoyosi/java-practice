import java.util.ArrayList;

public abstract class ProductForSale {

    protected String type;
    protected double  price;
    protected String description;


    private ArrayList<OrderItem> order = new ArrayList<>(50);

    public ProductForSale(String type, double price, String description) {
          this.type=type;
         this.price = price;
        this.description = description;
    }



    public double  getSalesPrice (int quantity){

      double salesPrice = quantity * price;

      return  salesPrice;

    }


    public void printPricedItem (int quantity){
        System.out.printf("%2d qty at %8.2f each, %-15s %-35s %n",quantity,price,type,description);
        }



    public abstract void showDetails();

    public static class Main {
    }
}

class HairProduct extends ProductForSale{


    public HairProduct(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {

        System.out.printf("%s %n %s %n $%,.2f %n",type,description, price );
    }
}


class Perfume extends ProductForSale{

    private String type;
    private double  price;
    private String description;
    public Perfume(String type, double price, String description) {
        super(type, price, description);


    }

    @Override
    public void showDetails() {
        System.out.printf("%s %n %s %n %s %n",type,description, price );
    }
}

record OrderItem (int quantity, ProductForSale product) {}

class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args) {

        storeProducts.add(new HairProduct("BoneStraight", 700000, "Color Black(18 Inches)"));
        storeProducts.add(new HairProduct("Wavy", 650000, "Color Black(15 Inches)"));
        listStoreProducts();

    }

    public static void listStoreProducts() {
        int i = 1;
        for (var productItem : storeProducts) {
            System.out.println("-".repeat(30));
            productItem.showDetails();
            //System.out.println(i + " " + productItem.type + " "+ productItem.description + "----->" + productItem.price);

        }


    }



    public static void addOrderItem(ArrayList<OrderItem> order, int orderIndex, int qty) {


    order.add(new OrderItem(qty,storeProducts.get(orderIndex)));


    }

}
