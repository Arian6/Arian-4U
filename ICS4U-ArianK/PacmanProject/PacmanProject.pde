Pacman p = new Pacman();
Pacman p2 = new Pacman(50, 100);

void setup() {
  size(500,500);
  
}

void draw() {
  background( 255);
  p.display();
  p.move();
  
  p2.display();
  p2.move();
  
}