
Pacman p2 = new Pacman(300,300);

void setup() {
  size(600,600);
  frameRate(10);
}

void draw() {
  background( 0,0,255);
  
  p2.display();
  p2.move();
  
}