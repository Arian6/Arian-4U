   int pacSize = 50;
   int eyeSize = 5;
   int eyeXLoc = 6;
   int eyeYLoc = 15;
   int radianX = 30;
   int radianY = 330;
Pacman p2 = new Pacman(300,300);
Ghost c = new Ghost(#FFA91F);
Ghost b = new Ghost(#FF0015);
Ghost p = new Ghost(#FF81F3);
Ghost i = new Ghost(#34FFDB);

void setup() {
  size(600,600);
  frameRate(60);
}

void draw() {
  background( 0,0,255);
      noStroke();
      
        p2.display();
  if (key == CODED) {
     if (keyCode == UP) {
         this.radianX =300;
       this.radianY = 600;
       this.eyeXLoc = 15;
       this.eyeYLoc = 10;
        p2.move(0, -5);
     }
     if (keyCode == DOWN) {
        this.radianX = 475;
       this.radianY = 780;
       this.eyeXLoc = 15;
       this.eyeYLoc = -10;
        p2.move(0, 5);
     }
      if (keyCode == LEFT) {
         this.radianX =210;
        this.radianY = 515;
        this.eyeXLoc = -6;
       this.eyeYLoc = 15;
        p2.move(-5, 0);
     }
     if (keyCode == RIGHT) {
        this.radianX = 30;
        this.radianY = 330;
        this.eyeXLoc = 6;
        this.eyeYLoc = 15;
        
        p2.move(5, 0);
     }
  }

 
  
  c.display();
  c.move(0 , 5);
  b.display();
  b.move(0 , -5);
  p.display();
  p.move(5 , 0);
  i.display();
  i.move(-5 ,0);
  
}