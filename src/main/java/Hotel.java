import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private final ArrayList<Room> rooms;
    private final ArrayList<Booking> bookings;
    private final HashMap<String, ArrayList<Guest>> dinningRooms;

    public Hotel(){
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        dinningRooms = new HashMap<>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void addDinningRoom(Room room){
        this.dinningRooms.put(room.getName(), room.getOccupants());
    }

    public int dinningRoomCount(){
        return this.dinningRooms.size();
    }

    public HashMap<String, ArrayList<Guest>> getDinningRooms(){
        return this.dinningRooms;
    }

    public int roomCount(){
        return this.rooms.size();
    }

    public void checkIn(Guest guest, Room room){
        // when checking in,
        // control statement, if full can't add more.
        if (room.occCount() < room.getCap()) {
            room.addGuest(guest);
        }
    }

    public Booking bookRoom(Room room, int numberOfNights){
        Booking booking = new Booking(room, numberOfNights);
        bookings.add(booking);
        return booking;
    }

    public int checkBookingDuration(Booking booking){
        return booking.getNumberOfNights();
    }

    public int checkBookingBill(Booking booking){
        return booking.getBill();
    }

    public void checkOut(Guest guest, Room room){
        room.remGuest(guest);
    }

    public void clearOut(Room room){
        room.emptyRoom();
    }
}
