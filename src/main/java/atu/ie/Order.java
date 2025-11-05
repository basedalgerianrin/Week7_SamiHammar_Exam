package atu.ie;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    ArrayList<String> order= new ArrayList<>();
    String orderId;
    String CustomerName;
    String productName;
    double price = 0.0;
    int quantity = 0;
    double totalPrice = 0.0;

    Scanner sc = new Scanner(System.in);


    static void addOrder(int quantity, String orderId, double totalPrice, double price, String productName){
        for (int i = 0; i<10; i++) {
            System.out.println("Enter Order Name: ");
            // productName = Scanner.NextLine();

            if (quantity > 1) {
                System.out.println("Order already exists, please input another");
            }
            totalPrice = quantity * price;
            break;
        }


    }

    static void updateOrder(int quantity, String orderId, double totalPrice, double price, String productName){
        String options;

        System.out.println("Enter Order ID: ");
        //orderId = Scanner.NextLine();

        if(orderId == ){
            System.out.println("What would you like to Change?: \nCustomer Name\nProduct\nPrice\nQuantity");
            switch (options){}
            case '1':
                System.out.println("Enter Name: ");
                //customerName = Scanner.NextLine();
                break;
            case '2':
                System.out.println("Enter Product: ");
                //productName = Scanner.NextLine();
                break;
            case '3':
                System.out.println("Enter Price: ");
                //price = Scanner.NextLine();
                break;
            case '4':
                System.out.println("Enter Price: ");
                //quantity = Scanner.NextLine();
                break;
                default;
                    System.out.println("Invalid Input");
                    break;
        }



    }
    static void listOrder(String Orderid, String productName, int quantity){

       // System.out.println("Orders:\n %i |   %s |    %s", quantity, productName, Orderid);

    }


}