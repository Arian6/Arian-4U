public class Pacman extends Character {

  // INSTANCE VARIABLES; 'properties'

  private int lives = 3;
  private boolean isOpen = true;
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
  
    public int getEyeXLoc() {
    return this.eyeXLoc;
  }
  
 public void setEyeXLoc(int eyeX) {
    
     if (eyeX < 0 || eyeX > 600) {
      System.out.println("Invalid eyeXLoc");
      
    } else {
      this.eyeXLoc = eyeX;
    }
    
  }
  
      public int getEyeYLoc() {
    return this.eyeYLoc;
  }
  
 public void setEyeYLoc(int eyeY) {
    
     if (eyeY < 0 || eyeY > 600) {
      System.out.println("Invalid yLoc");
      this.yLoc = (int) (Math.random() * 600);
    } else {
      this.eyeYLoc = eyeY;
    }
    
  }
  
       public int getLives() {
    return this.lives;
  }
  
 public void setLives(int l) {
    
     if (l < 0 || l > 3) {
      System.out.println("Invalid lives amount");
      
    } else {
      this.lives = l;
    }
    
  }
  
    public boolean getIsOpen() {
    return this.isOpen;
  }
  
 private void setIsOpen(boolean o) {
    
     if (this.isOpen != o) {
      System.out.println("Cannot preform this task");
      
    } else {
      this.isOpen = o;
    }
    
  }
  
    public int getRadianX() {
    return this.radianX;
  }
  
 private void setRadianX(int radX) {
    
     if (radX < 0 || radX > 1080) {
      System.out.println("Cannot preform this task");
      
    } else {
      this.radianX = radX;
    }
    
  }
  
      public int getRadianY() {
    return this.radianY;
  }
  
 private void setRadianY(int radY) {
    
     if (radY < 0 || radY > 1080) {
      System.out.println("Cannot preform this task");
      
    } else {
      this.radianX = radY;
    }
    
  }
  

  public void direction(String dir) {


    if (dir.equals("L")) {
      this.eyeXLoc = -6;
      this.eyeYLoc = 15;
      this.radianX = 210;
      this.radianY = 515;
    }

    if (dir.equals("R")) {
      this.eyeXLoc = 6;
      this.eyeYLoc = 15;
      this.radianX = 30;
      this.radianY = 330;
    }
    if (dir.equals("U")) {
      this.eyeXLoc = 13;
      this.eyeYLoc = 10;
      this.radianX = 300;
      this.radianY = 610;
    }
    if (dir.equals("D")) {
      this.eyeXLoc = 13;
      this.eyeYLoc = -10;
      this.radianX = 475;
      this.radianY = 780;
    }
  }

  public void display() {

    if (isAlive == false) {
      reset();
    }


    if (lives > 0) {
      fill(#FFF703);

      if (this.isOpen == true) {


        //YELLOW ARC
        noStroke();
        fill(254, 255, 36);
        arc(xLoc, yLoc, 50, 50, radians(radianX), radians(radianY));
        //EYE
        fill(0, 0, 0);
        ellipse(xLoc + eyeXLoc, yLoc - eyeYLoc, eyeSize, eyeSize);

        this.isOpen = false;
      } else  if (this.isOpen == false) {

        //YELLOW CIRCLE
        noStroke();
        fill(254, 255, 36);
        ellipse(xLoc, yLoc, 50, 50);

        //EYE
        fill(0, 0, 0);
        ellipse(xLoc + eyeXLoc, yLoc - eyeYLoc, eyeSize, eyeSize);
        this.isOpen = true;
      }
    } else {
      background(0, 0, 0);
      fill(255, 0, 0);
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
  
   public String toString() {
         
         
         return "Pacman is located at (" + this.getXLoc() + ", " + this.getYLoc() + ")" + " Is his Mouth open? = " + this.isOpen + ".   Pacman currently has " + this.getLives() + " lives";
    }
    

  public void livesDisplay() {

    fill(0, 0, 0);
    textSize(32);
    text("LIVES: " + lives, 25, 580);
  }

  public void reset() {

    if (lives > 0) {
      lives--;
    }

    this.xLoc =  (int) (Math.random() * width);
    this.yLoc =  (int) (Math.random() * height);

    isAlive = true;
  }
}