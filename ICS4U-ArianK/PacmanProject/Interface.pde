public interface Interface {

    abstract void display();
  
    abstract void direction(String dir);
  
    public void move(int x, int y);
    
    public boolean touching( Character other );
    
    public String toString();
    


}