public class Pacman {

  // INSTANCE VARIABLES; 'properties'
  private int xLoc;
  private int yLoc;
  private int lives;
  private int colourR;
  private boolean isOpen = true;
  private int pacSize = 50;
  private int eyeSize = 5;
  private int eyeXLoc = 6;
  private int eyeYLoc = 15;
  private int radianX = 30;
  private int radianY = 330;


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
        //variable adjust
        this.radianX =300;
        this.radianY = 600;
        this.eyeXLoc = 15;
        this.eyeYLoc = 10;
        this.yLoc = yLoc - 5;

        if (this.yLoc < 0 + pacSize / 2) {
          this.yLoc = height;
        }
      }
      if (keyCode == DOWN) {

        this.radianX = 475;
        this.radianY = 780;
        this.eyeXLoc = 15;
        this.eyeYLoc = -10;
        this.yLoc = yLoc + 5;

        if (this.yLoc > height - pacSize / 2) {
          this.yLoc = 0;
        }
      }
      if (keyCode == LEFT) { 

        this.radianX =210;
        this.radianY = 515;
        this.eyeXLoc = -6;
        this.eyeYLoc = 15;
        this.xLoc = xLoc - 5;


        if (this.xLoc < 0 + pacSize / 2) {
          this.xLoc = width;
        }
      }
      if (keyCode == RIGHT) {
        this.radianX = 30;
        this.radianY = 330;
        this.eyeXLoc = 6;
        this.eyeYLoc = 15;
        this.xLoc = xLoc + 5;
        if (this.xLoc > width - pacSize / 2) {
          this.xLoc = 0;
        }
      }
    }
  }


  public void display() {
    fill(#FFF703);

    if (this.isOpen == true) {


      //YELLOW ARC
      noStroke();
      fill(254, 255, 36);
      arc(xLoc, yLoc, pacSize, pacSize, radians(radianX), radians(radianY));
      //EYE
      fill(0, 0, 0);
      ellipse(xLoc + eyeXLoc, yLoc - eyeYLoc, eyeSize, eyeSize);

      this.isOpen = false;
    } else  if (this.isOpen == false) {

      //YELLOW CIRCLE
      noStroke();
      fill(254, 255, 36);
      ellipse(xLoc, yLoc, pacSize, pacSize);

      //EYE
      fill(0, 0, 0);
      ellipse(xLoc + eyeXLoc, yLoc - eyeYLoc, eyeSize, eyeSize);
      this.isOpen = true;
    }
  }
}