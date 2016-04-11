
Pacman p2 = new Pacman(50, 100);

void setup() {
  size(500,500);
  frameRate(60);
}

void draw() {
  
  background( 255);
  delay(100);

  
  p2.display();
  p2.move();
  
}