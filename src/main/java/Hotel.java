import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Room> rooms;

    public Hotel(){
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
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

    public void checkOut(Guest guest, Room room){
        room.remGuest(guest);
    }

    public void clearOut(Room room){
        room.emptyRoom();
    }
}
