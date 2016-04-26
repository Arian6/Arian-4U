public class Ghost extends Character {
  
  int colour ;


  public Ghost() {
    this.xLoc = (int) (Math.random() * 600);
    this.yLoc = (int) (Math.random() * 600);
  }

  public Ghost(color c) {
    this();
    this.colour = c;
  }


  public void display() { 

      //body
      fill(colour);

   
    ellipse(xLoc + 25, yLoc, 50, 50);
    rect(xLoc, yLoc, 50, 40);

    //pupils
    fill(255, 255, 255);
    ellipse(xLoc + 15, yLoc, 15, 15);
    ellipse(xLoc + 35, yLoc, 15, 15);

    fill(0, 0, 255);
    ellipse(xLoc + 15, yLoc, 5, 5);
    ellipse(xLoc + 35, yLoc, 5, 5);
  }



}