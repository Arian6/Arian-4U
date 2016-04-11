public class Pacman {

  // INSTANCE VARIABLES; 'properties'
  private int xLoc;
  private int yLoc;
  private int lives;
  private int colourR;
  private boolean isOpen = true;
  private int pacSize = 90;
  private int eyeSize = 10;
  private int radianX ;
  private int radianY ;


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
           this.radianX =300;
        this.radianY = 600;
        this.yLoc = yLoc - 5;
        if (this.yLoc < 0) {
          this.yLoc = height;
        }
      }
      if (keyCode == DOWN) {
        this.radianX = 475;
        this.radianY = 780;
        this.yLoc = yLoc + 5;
        if (this.yLoc > height) {
          this.yLoc = 0;
        }
      }
      if (keyCode == LEFT) { 
        this.radianX =210;
        this.radianY = 515;
        
        this.xLoc = xLoc - 5;
        if (this.xLoc < 0) {
          this.xLoc = width;
        }
      }
      if (keyCode == RIGHT) {
        this.radianX = 30;
        this.radianY = 330;
        this.xLoc = xLoc + 5;
        if (this.xLoc > width) {
          this.xLoc = 0;
        }
      }
    }
  }

  //left 30, 330
  //right 210,515
  //up  300,610
  // 475 780


  public void display() {    
    fill(#FFF703);

    if (this.isOpen == true) {


      //YELLOW CIRCLES
      noStroke();
      fill(254, 255, 36);
      arc(xLoc, yLoc, pacSize, pacSize, radians(radianX), radians(radianY));

      //EYE
      fill(0, 0, 0);
      ellipse(xLoc + 17, yLoc - 22, eyeSize, eyeSize);

      this.isOpen = false;
    } else  if (this.isOpen == false) {

      //YELLOW CIRCLE
      noStroke();
      fill(254, 255, 36);
      ellipse(xLoc, yLoc, pacSize, pacSize);

      //EYE
      fill(0, 0, 0);
      ellipse(xLoc + 17, yLoc - 22, eyeSize, eyeSize);
      this.isOpen = true;
    }
  }
}