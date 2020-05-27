import java.util.ArrayList;

public class Room {

    private final String name;
    private final String type;
    private final int capacity;
    private final ArrayList<Guest> occupants;
    private final String bedType;
    private boolean occupiedStatus;

    public Room(String name,String type,int capacity,String bedType){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
        this.bedType = bedType;
        this.occupiedStatus = false;
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
        occupiedStatus = true;
        this.occupants.add(guest);
    }

    public void remGuest(Guest guest){
        this.occupants.remove(guest);
    }

    public void emptyRoom(){
        occupiedStatus = false;
        this.occupants.clear();
    }

    public String getBedType() {
        return bedType;
    }

    public boolean getOccupiedStatus(){
        return occupiedStatus;
    }

}
