import java.util.ArrayList;

public class Room {

    private final String name;
    private final String type;
    private final int capacity;
    private final ArrayList<Guest> occupants;
    private final String bedType;
    private boolean occupiedStatus;
    private final int rate;

    public Room(String name,String type,int capacity,String bedType, int rate){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
        this.bedType = bedType;
        this.occupiedStatus = false;
        this.rate = rate;
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

    public int getRate() {
        return this.rate;
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

    public ArrayList<Guest> getOccupants() {
        return this.occupants;
    }
}
