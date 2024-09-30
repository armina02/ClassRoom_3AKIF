
public class ClassRoom
{
    private String roomNr;
    private boolean computer;
    private int size;
    private boolean beamer;
    private boolean windows;
    //gehört nur mir, deswegen ist das Anlegen der Eigenschaften privat

    public ClassRoom(String neuRoomNr, boolean neuComputer, int neuSize)
    {
        setRoomNr(neuRoomNr);
        setComputer(neuComputer);
        setSize(neuSize);
    }

    public void setRoomNr(String neuRoomNr)
    {
        roomNr = neuRoomNr;
    }

    public void setComputer(boolean neuComputer)
    {
        computer = neuComputer;
    }

    public void setSize(int neuSize)
    {
        size = neuSize;
    }

    public String getRoomNr()
    {
        return roomNr;
    }

    public boolean getComputer()
    {
        return computer;
    }

    public int getSize()
    {
        return size;
    }

    public void printClassRoom()

    { 
        System.out.println("Classroom " + roomNr + " Computer: " + computer + " - " + size + " Students");
    }


    
}
