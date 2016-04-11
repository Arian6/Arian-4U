
Pacman p2 = new Pacman(50, 100);

void setup() {
  size(1000,800);
  frameRate(5);
}

void draw() {
  background( 0,0,255);
  
  p2.display();
  p2.move();
  
}