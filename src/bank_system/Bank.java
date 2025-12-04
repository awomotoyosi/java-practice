package bank_system;

import java.util.ArrayList;

public class Bank{
    private String name;
    ArrayList<Customer> customer = new ArrayList<>(5000);






    public static void main(String[] args) {
        Customer customer1 = new Customer("Omotoyosi",1000);
        System.out.println(customer1);
        Bank bank1 = new Bank("GTB");


        bank1.addCustomer("Kemi",500);
        System.out.println(bank1);
        bank1.addTransaction("Kemi",-700);
        bank1.printStatement("Kemi");
    }

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bank_system.Bank{" +
                "name='" + name + '\'' +
                ", customer=" + customer +
                '}';
    }

    public   Customer findCustomer (String customerName){

for(Customer customer : customer){
    if(customer.getName().equalsIgnoreCase(customerName)){


        return customer;
    }

}
        System.out.printf("bank_system.Customer (%s) wasn't found %n" ,customerName);
        return  null;
    }

    public   void addCustomer (String customerName, double initialDeposit){

        if (findCustomer(customerName)==null){
            Customer customers = new Customer(customerName,initialDeposit);
            this.customer.add(customers);

            System.out.println("New customer added"+ customer);
        }


        }

        public void addTransaction (String name , double transactionAmount){

        Customer customer = findCustomer(name);
        if(customer!=null){

        customer.transaction.add(transactionAmount);
        }

        }

public void printStatement(String name){

        Customer customer = findCustomer(name);

        if(customer==null){

          return;
        }

    System.out.println("-".repeat(30));
    System.out.println("CustomerName :"+ customer.getName());
    System.out.println("Transactions");
    for (double d : customer.transaction){

        System.out.printf("$%10.2f, (%s), %n",d,d<0 ? "debit": "credit" );
    }

    }


    }







  class Customer {

   private String name;


   private double initialDeposit;
      ArrayList<Double>transaction  = new ArrayList<Double>(300);

      public Customer(String name, double initialDeposit) {

   this.name=name.toUpperCase();
   this.initialDeposit=initialDeposit;
   this.transaction.add(initialDeposit);

      }



      @Override
      public String toString() {
          return "bank_system.Customer{" +
                  "name='" + name + '\'' +
                  ", initialDeposit=" + initialDeposit +
                  '}';
      }

      public String getName() {
          return name;
      }

      public double getinitialDeposit() {
          return initialDeposit;
      }
  }
