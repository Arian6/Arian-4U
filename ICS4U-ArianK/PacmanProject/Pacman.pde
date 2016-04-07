public class Pacman {

  // INSTANCE VARIABLES; 'properties'
  private int xLoc;
  private int yLoc;
  private int lives;
  private int colourR;


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
    this.xLoc = this.xLoc + 1; 
    this.colourR++;

    if ( this.xLoc > width ) {

      this.xLoc = 0;
    }
  }

  public void display() {    
    fill(0,0, colourR);
    rect( this.xLoc, this.yLoc, 20, 40 );
  }
}