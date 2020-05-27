import java.util.ArrayList;

public class Room {

    private final String name;
    private final String type;
    private final int capacity;
    private final ArrayList<Guest> occupants;
    private final String bedType;

    public Room(String name,String type,int capacity,String bedType){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
        this.bedType = bedType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCap() {
        return capacity;
    }

    public int  occCount(){
        return occupants.size();
    }

    public void addGuest(Guest guest){
        this.occupants.add(guest);
    }

    public void remGuest(Guest guest){
        this.occupants.remove(guest);
    }

    public void emptyRoom(){
        this.occupants.clear();
    }

    public String getBedType() {
        return bedType;
    }
}
