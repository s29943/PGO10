import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item(1,"candle"));
        items.add(new Item(2,"lamp"));
        items.add(new Item(3,"book"));
        items.add(new Item(4,"glass"));
        items.add(new Item(5,"mirror"));
        items.add(new Item(6,"brush"));
        items.add(new Item(7,"rug"));
        items.add(new Item(8,"shirt"));
        items.add(new Item(9,"laptop"));
        items.add(new Item(10,"blanket"));

        List<Item> firstFiveItems= items.subList(0,5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        for(Item item:itemSet){
            System.out.println("ID: "+ item.getId()+ "name: "+item.getName());
        }
    }
}