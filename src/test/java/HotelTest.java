import org.junit.Before;

public class HotelTest {


    Room bedRoom;
    Room confRoom;
    Guest guest;
    Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Jimmy Chu");
        bedRoom = new Room("666","bedroom",2,"double");
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

    //collection of room
    public void hasRooms(){
        assertEquals(2,hotel.roomCount());
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
        assertFalse(0,confRoom.getOccupiedStatus());
    }

}
