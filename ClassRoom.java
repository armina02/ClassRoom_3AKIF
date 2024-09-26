
public class ClassRoom
{
    private String roomNr;
    private boolean computer;
    private int size;
    
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
    
    
    
    
    

    
    
  
}
