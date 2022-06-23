import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 150, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  //Ground
	fill(1, 143, 18);
  rect(0, 300, 400, 100);

  drawHouse(100, 240, 150, 250);

  drawFlower(60, 340, 30);
  drawFlower(160, 350, 37);
  drawFlower(260, 340, 26);
  drawFlower(350, 350, 32);

  //Sun
  fill(252, 227, 3);
  ellipse(400, 0, 100, 100);

  
  } 

  public void drawHouse(float houseX, float houseY, float houseWidth, float houseHeight){
  
  //Main House Body
  fill(176, 94, 7);
  rect(houseX + 20, houseY - 80, houseHeight, houseWidth);

  //Roof
  fill(219, 171, 13);
  rect(houseX + 8, houseY + houseHeight - 340, 275, 35);

  //Door
  fill(219, 171, 50);
  rect(houseX + 50, houseY + houseHeight - 280, 50, 100);
  
  //Doorknob
  fill(0);
  ellipse(houseX + 90, houseY + houseHeight - 230, 7, 7);

  //Window
  fill(176, 233, 247);
  rect(houseX + 180, houseY + houseHeight - 270, 50, 50);

  //Window Line V
  fill(0);
  line(houseX + 205, houseY + houseHeight - 270, houseX + 205,  houseY + houseHeight - 220);  

  //Window Line H
  fill(0);
  line(houseX + 230, houseY + houseHeight - 245, houseX + 180, houseY + houseHeight - 245);
  } 

  void drawFlower(float flowerX, float flowerY, float petalSize) {
  float petalDistance = petalSize / 2;

  fill(240, 212, 53);

  // top left petal
  ellipse(flowerX - petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // top right petal
  ellipse(flowerX + petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // bottom left petal
  ellipse(flowerX - petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // bottom right petal
  ellipse(flowerX + petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // center petal
  fill(115, 59, 3);
  ellipse(flowerX, flowerY, 
    petalSize, petalSize);
  // define other methods down here.
}
}