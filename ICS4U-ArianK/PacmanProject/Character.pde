abstract class Character implements Interface {
  protected int xLoc;
  protected int yLoc;
  protected boolean isAlive = true;
  protected int eyeSize = 5;

  public Character() {
    this.xLoc = (int) (Math.random() * 600);
    this.yLoc = (int) (Math.random() * 600);
  }

  public Character(int xLoc, int yLoc) {
    this.isAlive = true;
    this.xLoc =  xLoc;
    this.yLoc =  yLoc;
  }

  abstract void display();

  abstract void direction(String dir);

  public boolean touching( Character other ) {

    if (hasMoved == true) {
      if (other.getXLoc() - 50 < this.getXLoc() && this.getXLoc() < other.getXLoc() + 50 && other.getYLoc() - 50 < this.getYLoc() && this.getYLoc() < other.getYLoc() + 50 ) {

        isAlive = false;
        hasMoved = false;
        return true;
      }
    }

    return false;
  }


  public int getXLoc() {

    return this.xLoc;
  }

  public void setXLoc(int x) {
    if (x < 0 || x > 600) {
      System.out.println("Invalid xLoc");
      this.xLoc = (int) (Math.random() * 600);
    } else {
      this.xLoc = x;
    }
  }



  public int getYLoc() {

    return this.yLoc;
  }

  public void setYLoc(int y) {
    if (y < 0 || y > 600) {
      System.out.println("Invalid yLoc");
      this.yLoc = (int) (Math.random() * 600);
    } else {
      this.yLoc = y;
    }
  }

  public boolean getIsAlive() {

    return this.isAlive;
  }

  public void setIsAlive(boolean isAlive) {
    if (isAlive != touching( this )) {
      System.out.println("Wrong State");
    } else {
      this.isAlive = isAlive;
    }
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
}