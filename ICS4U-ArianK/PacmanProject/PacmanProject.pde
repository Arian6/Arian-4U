
Pacman p2 = new Pacman(300, 300);
Ghost c;
Ghost b;
Ghost p;
Ghost i;
boolean hasMoved = false;

void setup() {
  size(600, 600);
  frameRate(60);

  c = new Ghost(#FFA91F);
  b = new Ghost(#FF0015);
  p = new Ghost(#FF81F3);
  i = new Ghost(#34FFDB);
}

void draw() {
  background( 0, 0, 255);
  noStroke();

  p2.display();
  p2.livesDisplay();

  //p2.hitsGhost(c, p2); 
  //p2.hitsGhost(i, p2); 
  //p2.hitsGhost(b, p2); 
  //p2.hitsGhost(p, p2);

  if ( keyPressed) {
    hasMoved = true;
  }

  if (key == CODED && hasMoved ) {
    if (keyCode == UP) {
      p2.direction("U");
      p2.move(0, -5);
    }
    if (keyCode == DOWN) {
      p2.direction("D");

      p2.move(0, 5);
    }
    if (keyCode == LEFT) {
      p2.direction("L");
      p2.move(-5, 0);
    }
    if (keyCode == RIGHT) {
      p2.direction("R");
      p2.move(5, 0);
    }
  }



  c.display();
  c.move(0, 5);
  b.display();
  b.move(0, -5);
  p.display();
  p.move(5, 0);
  i.display();
  i.move(-5, 0);
}