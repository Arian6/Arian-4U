public class Ghost {
  int look = 0;
  int xLoc = 50;
  int yLoc = 50;
  int eyeX = xLoc;
  int eyeY = yLoc;
  int Blinky = color(255, 0, 0);


  public Ghost() {
  }

  public void display() {   
    noStroke();
    fill(255, 0, 0);
 

  //body
    ellipse(xLoc + 25, yLoc , 50, 50);
    rect(xLoc, yLoc, 50, 40);
 

  
    //pupils
    fill(255, 255,255);
    ellipse(xLoc + 15, eyeY, 15, 15);
    ellipse(xLoc + 35, eyeY,15,15);
    
     fill(0, 0,255);
     ellipse(xLoc + 15, eyeY,5,5);
     ellipse(xLoc + 35, eyeY,5,5);
  }


  public void move() {
    
    xLoc = xLoc + 5;
    if (this.xLoc > width - 50 / 2) {
          this.xLoc = 0;
        }

}
}