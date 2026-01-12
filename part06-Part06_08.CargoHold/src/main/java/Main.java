
public class Main {

    public static void main(String[] args) {
        Item book = new Item("Harry Potter", 2);
        Item phone = new Item("iPhone 17", 1);
        Item toy = new Item("Toy Plane", 3);
        
        Suitcase mycase = new Suitcase(10);
        mycase.addItem(book);
        mycase.addItem(phone);
        mycase.addItem(toy);
        
        Suitcase yourcase = new Suitcase (5);
        yourcase.addItem(book);
        yourcase.addItem(toy);
        
        Hold hold = new Hold(100);
        hold.addSuitcase(mycase);
        hold.addSuitcase(yourcase);
        System.out.println(hold);
        System.out.println("");
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
    }

}
