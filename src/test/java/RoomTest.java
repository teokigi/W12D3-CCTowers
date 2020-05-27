import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Room bedRoom;
    Room confRoom;
    Guest guest;
    @Before
    public void before(){
        // room has arguments =
        // Name,
        // type,
        // capacity,
        // collection - array, 0 on initialize
        // beds
        // occupiedStatus - boolean, false on initialize.
        guest = new Guest("Jimmy");
        bedRoom = new Room("666","bedroom",2,"double", 50);
        confRoom = new Room("Hell","conference",5,"n/a", 50);
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
    }

    // room name
    @Test
    public void hasRoomName(){
        assertEquals("666",bedRoom.getName());
    }
    // room type
    @Test
    public void hasType(){
        assertEquals("conference",confRoom.getType());
    }
    // room capacity
    @Test
    public void hasCapacity(){
        assertEquals(2,bedRoom.getCap());
    }
    // collection of guests
    @Test
    public void roomInitialEmptyCollection(){
        assertEquals(0,bedRoom.occCount());
    }
    // add guest to collection
    @Test
    public void collectionAddingGuest(){
        bedRoom.addGuest(guest);
        assertEquals(1,bedRoom.occCount());
    }
    // remove guest from collection
    @Test
    public void collectionRemoveGuest() {
        confRoom.remGuest(guest);
        assertEquals(1, confRoom.occCount());
    }
    // clear guest from collection.
    @Test
    public void collectionClearGuestList(){
        confRoom.emptyRoom();
        assertEquals(0,confRoom.occCount());
    }
    // count number of guests in collection
    @Test
    public void CollectionCounter(){
        assertEquals(2,confRoom.occCount());
    }
    // single/double/na - control statement depending
    @Test
    public void hasBedsValue(){
        assertEquals("double",bedRoom.getBedType());
    }
    // test the room that has 2 guests
    @Test
    public void roomIsOccupied(){
        assertTrue(confRoom.getOccupiedStatus());
    }
    // test the room that has no guests
    @Test
    public void roomIsNotOccupied(){
        assertFalse(bedRoom.getOccupiedStatus());
    }
}
