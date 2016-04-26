
Pacman p2 = new Pacman(300,300);

Ghost g = new Ghost();
void setup() {
  size(600,600);
  frameRate(60);
}

void draw() {
  background( 0,0,255);
      noStroke();
  
  p2.display();
  p2.move();
  
  g.display();
  g.move();
  
}