public class Ghost {
  int look = 0;
  int x = 0;
  int Blinky = color(255, 0, 0);


  public Ghost() {
  }

  public void display() {   
    noStroke();
    fill(255, 0, 0);
    background(255);

  
    ellipse(75+x, 70, 50, 50);
    rect(50+x, 70, 50, 40);
 

  
    //pupils
    fill(0, 0, 255);
    rect(60+look*20+x, 60, 20, 20);
    rect(120+look*20+x, 60, 20, 20);
  }


  public void move() {
    if (mouseX<120+x) {
      look=0;
    } else if (mouseX>120+x) {
      look = 2;
    } else {
      look = 1;
    }

    if (mouseX < 120+x) {
      x=x-1;
    }
    if (mouseX > 120+x) {
      x=x+1;
    }

    if (mousePressed == true) {
      Blinky = color(255, 255, 0);
    }
  }
}