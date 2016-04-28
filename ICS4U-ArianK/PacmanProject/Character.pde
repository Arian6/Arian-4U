abstract class Character {
  protected int xLoc;
  protected int yLoc;


  abstract void display();

  public Character() {
    this.xLoc = 50;
    this.yLoc = 50;
  }

  public Character(int xLoc, int yLoc) {
    this.xLoc = 50;
    this.yLoc = 50;
  }


  public boolean touching( Character other ) {



//    if (this.getXLoc() - 25 < this.getXLoc() && this.getXLoc() < other.getXLoc() + 25 && other.getYLoc() - 20 < this.getYLoc() && this.getYLoc() < g.getYLoc() + 20 ) {
//      if (p.lives > 0) {
//        p.lives = p.lives - 1;
//      }
//      p.reset();
//      hasMoved = false;
//      return true;
//    }
    return false;
  }

  public int getXLoc() {

    return this.xLoc;
  }

  private void setXLoc() {
  }
  public int getYLoc() {

    return this.yLoc;
  }

  private void setYLoc() {
  }

  public void reset() {



    this.xLoc =  (int) (Math.random() * width);;
    this.yLoc =  (int) (Math.random() * height);;
  }



  public void move(int x, int y) {

    
  
  
   
    
    
    
    
    if (p2.lives > 0) {
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
  }

  //abstract boolean isAlive();
}