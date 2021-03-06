import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HotelTest {


    Room bedRoom;
    Room bedRoom2;
    Room confRoom;
    Room dinningRoom;
    Guest guest;
    Hotel hotel;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Jimmy Chu");
        bedRoom = new Room("666","bedroom",2,"double", 50);
        bedRoom2 = new Room("999","bedroom",1,"single", 50);
        confRoom = new Room("Hell","conference",5,"n/a", 50);
        dinningRoom = new Room("PizzaRoom","dining",5,"n/a", 50);
        guests = new ArrayList<Guest>();
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        dinningRoom.addGuest(guest);
        dinningRoom.addGuest(guest);
        bedRoom2.addGuest(guest);
        //hotel properties setup.
        // collection of room types
        guests.add(guest);
        guests.add(guest);
        //methods
        // checkin.
        // checkout.
        // clearout
        hotel = new Hotel();
        hotel.addDinningRoom(dinningRoom);
        hotel.addRoom(bedRoom);
        hotel.addRoom(confRoom);
    }

    //collection of room, room count
    @Test
    public void hasRooms(){
        assertEquals(2,hotel.roomCount());
    }
    //add room test
    @Test
    public void addingARoom(){
        hotel.addRoom(bedRoom2);
        assertEquals(3,hotel.roomCount());
    }
    // checkin
    @Test
    public void checkInTest(){
        hotel.checkIn(guests,bedRoom);
        assertTrue(bedRoom.getOccupiedStatus());
        assertEquals(2,bedRoom.occCount());
    }
    // checkout
    @Test
    public void checkOutTest(){
        hotel.checkOut(guest,confRoom);
        assertEquals(1,confRoom.occCount());
    }
    // clearout room
    @Test
    public void clearOutTest(){
        hotel.clearOut(confRoom);
        assertFalse(confRoom.getOccupiedStatus());
    }

    @Test
    public void hasDiningRoom(){
        assertEquals(1, hotel.dinningRoomCount());
    }

    @Test
    public void dinningRoomHasKey(){
        boolean result = hotel.getDinningRooms().containsKey("PizzaRoom");
        assertEquals(true, result);
    }

    @Test
    public void amountOfEmptyBedrooms(){
        assertEquals(1, hotel.checkEmptyBedrooms());
    }


}
