package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("TV", 1000d);
        Product p2 = new Product("Mouse", 40d);

        OrderItem oi1 = new OrderItem(2, p1);
        OrderItem oi2 = new OrderItem(4, p2);

        LocalDateTime orderMoment = LocalDateTime.parse("2023-11-03T15:50:53");

        Order o1 = new Order(orderMoment);
        o1.addItem(oi1, oi2);

        Client c1 = new Client("Alex Green", 
                            "greenalex@gmail.com",
                                LocalDate.parse("1989-03-17"));

        c1.makeOrder(o1);

        System.out.println(c1);
    }
}