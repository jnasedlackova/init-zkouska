public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(5);
        System.out.println(hotel.toString());

        Guest guest1 = new Guest("Adam", "today", "Czech" );
        Guest guest2 = new Guest("Berta", "today", "Scott" );

        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        System.out.println(hotel.toString());

        hotel.checkOut(guest2);
        guest2.setDeparture("Monday");
        System.out.println(hotel.toString());
        System.out.println(guest2.toString());
    }
}
