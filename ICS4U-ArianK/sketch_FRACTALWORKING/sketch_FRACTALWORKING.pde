
void setup() {
  size(1000, 1000);
  background(255);
  smooth();
  drawCircle(500, 500, 500,7);
}

void drawCircle(float x, float y, float w, int n) {



  if (n > 0) {

   

    fill(0, 128/n, 128);
 
    ellipse(x, y, w, w);

    float x1 = x - w/2;
    float x2 = x + w/2;
    float y1 = y - w/2;
    float y2 = y + w/2;

    float w1 = w /2;


    //left
    drawCircle(x1, y, w1, n-1);
    //right
    drawCircle(x2, y, w1, n-1 );
    //top
    drawCircle(x, y1, w1, n-1);
    //bottom
    drawCircle(x, y2, w1, n-1);
  }
}