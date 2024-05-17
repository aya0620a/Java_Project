
	
import java.awt.Color;
import java.util.Vector;
public class DisplayTriangleObject extends MyFrame2{
 public void run() {
  int n=3702431%5;
  
  Vector<Triangle> triangles=new Vector<Triangle>();
  bgColor=Color.black;
  for(int i=0; i<150; i++){
   clear();
   for(int j=0; j<triangles.size(); j++) {
    triangles.get(j).draw(this);
    triangles.get(j).move();
   }
   if(i%5==0) {
    int v1 = (int)(Math.random()*10);
    int v2 = (int)(Math.random()*10);
    setColor(255,255,0);
    triangles.add(new Triangle(30+10*n,50,v1,v2,10));
   }
   sleep(0.1);
  }
 }
 public static void main(String[] args) {
  new DisplayTriangleObject();
 }
}

