import org.junit.Before;

import static org.junit.Assert.*;

public class HotelTest {


    Room bedRoom;
    Room bedRoom2;
    Room confRoom;
    Guest guest;
    Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Jimmy Chu");
        bedRoom = new Room("666","bedroom",2,"double");
        bedRoom2 = new Room("999","bedroom",1,"single");
        confRoom = new Room("Hell","conference",5,"n/a");
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        //hotel properties setup.
        // collection of room types

        //methods
        // checkin.
        // checkout.
        // clearout
        hotel = new Hotel();
        hotel.addRoom(bedRoom);
        hotel.addRoom(confRoom);
    }

    //collection of room, room count
    public void hasRooms(){
        assertEquals(2,hotel.roomCount());
    }
    //add room test
    public void addingARoom(){
        hotel.addRoom(bedRoom2);
        assertEquals(3,hotel.roomCount());
    }
    // checkin
    public void checkInTest(){
        hotel.checkIn(guest,bedRoom);
        assertTrue(bedRoom.getOccupiedStatus());
        hotel.checkIn(guest,bedRoom);
        hotel.checkIn(guest,bedRoom);
        assertEquals(2,bedRoom.occCount());
    }
    // checkout
    public void checkOutTest(){
        hotel.checkOut(guest,confRoom);
        assertEquals(1,confRoom.occCount());
    }
    // clearout room
    public void clearOutTest(){
        hotel.clearOut(confRoom);
        assertFalse(confRoom.getOccupiedStatus());
    }

}
