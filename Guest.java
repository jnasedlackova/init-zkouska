public class Guest
{
    private String name;
    private String arrival;
    private String departure;
    private String nationality;

    public Guest()
    {
    }

    public Guest(String name, String arrival, String nationality)
    {
        this.name = name;
        this.arrival = arrival;
        this.nationality = nationality;
    }

    public String getName()
    {
        return name;
    }

    public String getArrival()
    {
        return arrival;
    }

    public String getDeparture()
    {
        return departure;
    }

    public void setDeparture(String departure)
    {
        this.departure = departure;
    }

    public String getNationality()
    {
        return nationality;
    }

    @Override
    public String toString()
    {
        return "Guest{" +
                "name='" + name + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
