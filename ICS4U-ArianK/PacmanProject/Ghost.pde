public class Ghost extends Character {

  int colour ;
  int randomX;
  int randomY;


  public Ghost() {
    randomX = (int) (Math.random() * width);
    randomY = (int) (Math.random() * height);

  //if (randomX < 250 && randomX > 350 && randomY < 250 || randomY > 350) {
  //  this.xLoc = randomX;
  //  this.yLoc = randomY;
  //}
  }

  public Ghost(color c) {

randomX = (int) (Math.random() * 600);
   randomY = (int) (Math.random() * 600);

   if (randomX < 250 || randomX > 350 && randomY < 250 || randomY > 350) {
     this.xLoc = randomX;
     this.yLoc = randomY;
   }
   this.colour = c;
  }

  public int getXLoc() {

    return this.xLoc;
  }

  public void setXLoc() {
  }
  public int getYLoc() {

    return this.yLoc;
  }

  private void setYLoc() {
  }
  
  public int getColour() {

    return this.colour;
  }

  private void setColour() {
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