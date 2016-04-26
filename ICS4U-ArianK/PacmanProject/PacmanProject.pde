
Pacman p2 = new Pacman(300, 300);
Ghost c = new Ghost(#FFA91F);
Ghost b = new Ghost(#FF0015);
Ghost p = new Ghost(#FF81F3);
Ghost i = new Ghost(#34FFDB);

void setup() {
  size(600, 600);
  frameRate(60);
}

void draw() {
  background( 0, 0, 255);
  noStroke();

  p2.display();
  if (key == CODED) {
    if (keyCode == UP) {

      p2.move(0, -5);
    }
    if (keyCode == DOWN) {

      p2.move(0, 5);
    }
    if (keyCode == LEFT) {

      p2.move(-5, 0);
    }
    if (keyCode == RIGHT) {


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