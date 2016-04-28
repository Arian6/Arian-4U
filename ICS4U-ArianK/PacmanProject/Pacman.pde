public class Pacman extends Character {

  // INSTANCE VARIABLES; 'properties'

  private int lives = 3;
  private boolean isOpen = true;
  private int score;

  int pacSize = 50;
  int eyeSize = 5;
  int eyeXLoc = 6;
  int eyeYLoc = 15;
  int radianX = 30;
  int radianY = 330;



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

  public int getXLoc() {

    return this.xLoc;
  }

  public void setXLoc() {
  }
  public int getYLoc() {

    return this.yLoc;
  }

  

  public void display() {

    if (lives > 0) {
      fill(#FFF703);

      if (this.isOpen == true) {


        //YELLOW ARC
        noStroke();
        fill(254, 255, 36);
        arc(xLoc, yLoc, pacSize, pacSize, radians(radianX), radians(radianY));
        //EYE
        fill(0, 0, 0);
        ellipse(xLoc + 6, yLoc - 15, 5, 5);

        this.isOpen = false;
      } else  if (this.isOpen == false) {

        //YELLOW CIRCLE
        noStroke();
        fill(254, 255, 36);
        ellipse(xLoc, yLoc, pacSize, pacSize);

        //EYE
        fill(0, 0, 0);
        ellipse(xLoc + 6, yLoc - 15, 5, 5);
        this.isOpen = true;
      }
    } else {
      fill(0, 0, 0);
      textSize(72);
      text("GAME OVER", 100, 300);
      textSize(32);
      text("Press E to Exit", 180, 340);

      if (keyPressed) {
        if (key == 'e' || key == 'E') {
          exit();
        }
      }
    }
  }

  public void livesDisplay() {
    fill(0, 0, 0);
    textSize(32);
    text("LIVES: " + lives, 25, 580);
  }


  //public boolean isAlive() {
  //  if( 

  //  return true;
  //}
}