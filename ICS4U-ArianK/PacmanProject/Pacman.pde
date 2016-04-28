public class Pacman extends Character {

  // INSTANCE VARIABLES; 'properties'

  private int lives = 3;
  private boolean isOpen = true;
 

  private int pacSize = 50;
  private int eyeSize = 5;
  private int eyeXLoc = 6;
   private int eyeYLoc = 15;
   private  int radianX = 30;
   private  int radianY = 330;



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

  
  public void direction(String dir) {

    
    if (dir.equals("L")){
      this.eyeXLoc = -6;
      this.eyeYLoc = 15;
      this.radianX = 210;
      this.radianY = 515;
    }
    
    if (dir.equals("R")){
      this.eyeXLoc = 6;
      this.eyeYLoc = 15;
      this.radianX = 30;
      this.radianY = 330;
    }
    if (dir.equals("U")){
      this.eyeXLoc = 13;
      this.eyeYLoc = 10;
      this.radianX = 300;
      this.radianY = 610;
    }
    if (dir.equals("D")){
      this.eyeXLoc = 13;
      this.eyeYLoc = -10;
      this.radianX = 475;
      this.radianY = 780;
    }

    
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
        ellipse(xLoc + eyeXLoc, yLoc - eyeYLoc, eyeSize,eyeSize);

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


 
}