import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Room bedRoom;
    Hotel hotel;
    Booking booking;

    @Before
    public void setUp(){
        bedRoom = new Room("666","bedroom",2,"double", 50);
        hotel = new Hotel();
//        booking = new Booking();
    }

    @Test
    public void hasNumberOfNightsBooked(){
        booking = hotel.bookRoom(bedRoom, 2);
        int result = hotel.checkBookingDuration(booking);
        assertEquals(2, result);
    }

    @Test
    public void hasTotalBill(){
        booking = hotel.bookRoom(bedRoom, 2);
        int result = hotel.checkBookingBill(booking);
        assertEquals(100, result);
    }

}
