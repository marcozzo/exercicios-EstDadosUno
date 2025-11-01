package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Order {
    private LocalDateTime moment;
    //private OrderStatus status;
    private LinkedList<OrderItem> items;

    public Order(LocalDateTime moment) {
        this.moment = moment;
        //this.status = status;
        this.items = new LinkedList<>();
    }

    public void addItem(OrderItem ...itemList){
        for(OrderItem item: itemList){
            this.items.add(item);
        }
    }
    public void removeItem(OrderItem item){
        this.items.remove(item);
    }
    public double total(){
        double total = 0d;

        for(OrderItem item: this.items){
            double thisTotal = item.subTotal();
            total += thisTotal;
        }

        return total;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    @Override
    public String toString() {
        DateTimeFormatter customzd = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Order {" +
                "\nmoment=" + moment.format(customzd) +
                ",\nitems=" + items +
                "\n}";
    }
}