package oppExercises.ex1_5;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("A101" , "Laptop" , 2 , 750.75);

        System.out.println("ID : " + invoiceItem.getId());
        System.out.println("Description : " + invoiceItem.getDescription());
        System.out.println("Quantity : " + invoiceItem.getQuantity());
        System.out.println("Unit Price: $ " + invoiceItem.getQuantity());

        invoiceItem.setQuantity(3);
        System.out.println("\nAfter changing quantity to 3:");
        System.out.println("Total Price: $" + invoiceItem.getTotal());

        invoiceItem.setUnitPrice(800.00);
        System.out.println("\nAfter changing unit price to $800.00:");
        System.out.println("Total Price: $" + invoiceItem.getTotal());
    }
}
