int raindrop=30;
int rand = (int) random(width);
int score = 0;
void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);

}


void setup () {
  size(500, 500);  
  
  
  
}

void draw () {
  background(#FFFCFC);
fill(#030300);
textSize(16);
text("Score: " + score, 20, 20);
 fill(#26EDEB);
  stroke(#262BED);
  ellipse(rand,raindrop+=5,10,30);
  if(raindrop==500) {
   raindrop=30;
   rand = (int) random(width);

  }
  fill(#050402);
  stroke(#FC0004);
  rect(mouseX,450,50,100);
  
}