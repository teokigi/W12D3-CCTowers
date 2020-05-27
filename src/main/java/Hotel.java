import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Guest> rooms;

    public Hotel(){
        rooms = new ArrayList<>();
    }
    

    public void checkIn(Guest guest, Room room){
        // when checking in,
        // control statement, if full can't add more.
        if (room.occCount() < room.getCap()) {
            room.addGuest(guest);
        }
    }

    public void checkOut(Guest guest, Room room){
        room.remGuest(guest);
    }

    public void clearOut(Room room){
        room.emptyRoom();
    }
}
