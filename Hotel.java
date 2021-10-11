import java.util.ArrayList;

public class Hotel
{
    private int capacity;

    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private String name;

    public Hotel(int capacity)
    {
        this.capacity = capacity;
        guests = new ArrayList<Guest>();
        rooms = new ArrayList<Room>();
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void checkIn(Guest guest)
    {
        guests.add(guest);
    }

    public void checkOut(Guest guest)
    {
        guests.remove(guest);
    }

    public int getNumOfRooms()
    {
        return rooms.size();
    }
    public int getVacancy()
    {
        return capacity - guests.size();
    }

    @Override
    public String toString()
    {
        return "Hotel{" +
                "capacity=" + capacity +
                ", guests=" + guests.size() + " " +guests.toString()+
                ", rooms=" + rooms.size() + " " +rooms.toString()+
                '}';
    }
}
