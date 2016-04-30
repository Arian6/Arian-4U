public class Ghost extends Character {

  private int colour ;
  private int eyeDirectionX;
  private int eyeDirectionY;

  public Ghost() {

    this.colour = 0;
    this.xLoc= (int) (Math.random() * 500 );
    this.yLoc = (int) (Math.random() * 500 );
  }

  public Ghost(int c) {

    this.colour = c;
    this.xLoc= (int) (Math.random() * 500 );
    this.yLoc = (int) (Math.random() * 500 );
  }

  public Ghost(color c, int x, int y) {

    this.colour = c;
    this.xLoc= x;
    this.yLoc = y;
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

  public int getEyeDirectionX() {

    return this.eyeDirectionX;
  }

  public void getEyeDirectionX(int eyeDirX) {

    if (eyeDirX < 0 || eyeDirX > 5) {

      System.out.println("Invalid eyeDirectionX");
    } else {
      this.eyeDirectionX = eyeDirX;
    }
  }

  public int getEyeDirectionY() {

    return this.eyeDirectionY;
  }

  public void getEyeDirectionY(int eyeDirY) {

    if (eyeDirY < 0 || eyeDirY > 5) {

      System.out.println("Invalid eyeDirectionY");
    } else {
      this.eyeDirectionY = eyeDirY;
    }
  }

  public int getColour() {

    return this.colour;
  }

  public void setColour(int c) {

    if (c < 0 || c > 255) {

      System.out.println("Invalid colour");
    } else {
      this.colour = c;
    }
  }

  public void direction(String dir) {


    if (dir.equals("L")) {
      eyeDirectionX = 4;
      eyeDirectionY = 0;
    }

    if (dir.equals("R")) {
      eyeDirectionX = -4;
      eyeDirectionY = 0;
    }
    if (dir.equals("U")) {
      eyeDirectionY = -4;
      eyeDirectionX = 0;
    }
    if (dir.equals("D")) {
      eyeDirectionY = 4;
      eyeDirectionX = 0;
    }
  }
  
  public void display() { 

    //body
    fill(colour);


    ellipse(xLoc + 25, yLoc, 50, 50);
    rect(xLoc, yLoc, 50, 40);

    //pupils
    fill(255, 255, 255);
    ellipse(xLoc + 15, yLoc, eyeSize + 10, eyeSize + 10);
    ellipse(xLoc + 35, yLoc, eyeSize + 10, eyeSize + 10);

    fill(0, 0, 255);
    ellipse(xLoc + 15 + eyeDirectionX, yLoc + eyeDirectionY, eyeSize, eyeSize);
    ellipse(xLoc + 35+ eyeDirectionX, yLoc + eyeDirectionY, eyeSize, eyeSize);
  }
  
  
  public String toString() {
         return "This Ghost is located at (" + this.getXLoc() + ", " + this.getYLoc() + ")" + " The colour of this ghost is = " + this.colour;
    }

  
}