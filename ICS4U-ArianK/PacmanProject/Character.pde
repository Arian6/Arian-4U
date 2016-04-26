abstract class Character {
  protected int xLoc;
  protected int yLoc;
  protected boolean isAlive;
  
  //abstract int display();
  
  public Character() {
    
  }
  
  public void move(int x, int y) {
  
    
    if (this.xLoc > width ) {
         this.xLoc = 0;
       }
         if (this.xLoc < 0 ) {
         this.xLoc = width;
       }
       if (this.yLoc > width ) {
         this.yLoc = 0;
       }
       if (this.yLoc < 0 ) {
         this.yLoc = width;
       }

    this.xLoc = xLoc + x;
    this.yLoc = yLoc + y;
  }
  
  //abstract boolean isAlive();
}