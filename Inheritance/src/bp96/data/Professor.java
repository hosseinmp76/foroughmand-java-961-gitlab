package bp96.data;

public class Professor extends Person {

    private String roomNo;

    public Professor(String name, String nationalId, String roomNo) {
        super(name, nationalId);
        this.roomNo = roomNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String toString() {
        return "Prof: " + getName() + " " + " nationalId=" + getNationalId() + " room# " + roomNo;
    }





}
