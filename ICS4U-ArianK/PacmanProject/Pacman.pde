public class Pacman {

  // INSTANCE VARIABLES; 'properties'
  private int xLoc;
  private int yLoc;
  private int lives;
  private int colourR;
  private boolean isOpen = true;


  public Pacman() {
    this.xLoc = 200;
    this.xLoc = 300;
    this.lives = 3;
  }

  public Pacman(int xLoc, int yLoc ) {
    this.xLoc = xLoc;
    this.yLoc = yLoc;
    this.lives = 3;
  }

  public void move() {   
    if (key == CODED) {
      if (keyCode == UP) {
        this.yLoc = yLoc - 5;
      }
      if (keyCode == DOWN) {
        this.yLoc = yLoc + 5;
      }
      if (keyCode == LEFT) {
        this.xLoc = xLoc - 5;
      }
      if (keyCode == RIGHT) {
        this.xLoc = xLoc + 5;
      }
    }

 
  }

  //left 30, 330
  //right 210,515
  //up  300,610
  // 475 780


  public void display() {    
    fill(0, 0, colourR);

    if (this.isOpen == true) {
      ellipse( this.xLoc, this.yLoc, 50, 50 );
      ellipse( this.xLoc, this.yLoc, 50, 50 );

      this.isOpen = false;
    } else if (this.isOpen == false) {
      arc( this.xLoc, this.yLoc, 50, 50, radians(30), radians(330) );
      this.isOpen = true;
    }
  }
}