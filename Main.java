//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("001", "AAA", "Item x");
        Order order2 = new Order("002", "BBB", "Item y");
        Order order3 = new Order("003", "CCC", "Item z");

        SinglyLinkedList orderList = new SinglyLinkedList();
        // Add orders to the list
        orderList.append(order1);
        orderList.append(order2);
        orderList.append(order3);

        // Display the list of orders
        System.out.println("Orders in original order:");
        orderList.display();
        System.out.println();

        // Reverse the list of orders
        orderList.reverse();

        // Display the list of orders after reversal
        System.out.println("Orders in reversed order:");
        orderList.display();
    }
}