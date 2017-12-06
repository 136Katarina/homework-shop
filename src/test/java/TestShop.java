import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {
    Shop myshop;
    Item item;
    Item item2;
    Item item3;
    Item item4;


    @Before
    public void before() {
        myshop = new Shop("Trendy",4);
        item = new Item("jacket",150);
        item2 = new Item("shirt", 69.90);
        item3 = new Item("dress",110.50);
        item4 = new Item("dress",110.50);
    }

    @Test
    public void stockIsEmpty() {
        assertEquals(0, myshop.itemCount());
    }



    @Test
    public void canAddItem(){
        myshop.add(item);
        assertEquals(1,myshop.itemCount());
    }

    @Test
    public void canRemoveItem(){
        myshop.add(item);
        myshop.add(item2);
        myshop.add(item3);
        assertEquals(3,myshop.itemCount());
        myshop.sell(item);
        assertEquals(2,myshop.itemCount());
    }

    @Test
    public void stockIsFull(){
        myshop.add(item);
        myshop.add(item);
        myshop.add(item);
        myshop.add(item);
        assertEquals(true, myshop.isFull());

    }




}