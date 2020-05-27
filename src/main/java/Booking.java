public class Booking {

    //contains a room
    //number of nights booked

    private final Room room;
    private final int numberOfNights;

    public Booking(Room room, int numberOfNights){
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public Room getRoom(){
        return this.room;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public int getBill(){
        return (this.numberOfNights * this.room.getRate());
    }

    //methods
    //bookRoom in Hotel
    //book given bedroom
    //for a number of nights
    //should return booking obj

    //add nightly rate to rooms
    //add method for total bill
    //for the booking
}
