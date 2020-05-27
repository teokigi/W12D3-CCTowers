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

        // checkin.
        // checkout.
        hotel = new Hotel();
        hotel.addRoom(bedRoom);
        hotel.addRoom(confRoom);
    }

    // collection of room types.
    // checkin
    // checkout
}
