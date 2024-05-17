
public class DisplayFaceObject extends MyFrame2{
	public static void main(String[] args) {
		new DisplayFaceObject();}

	public void run() {

		Face[] faces=new Face[10];
		faces[0]=new Face(20,80+24*0,0%3+5,10,12);
		faces[1]=new Face(20,80+24*1,1%3+5,10,12);
		faces[2]=new Face(20,80+24*2,2%3+5,10,12);
		faces[3]=new Face(20,80+24*3,3%3+5,10,12);
		faces[4]=new Face(20,80+24*4,4%3+5,10,12);
		faces[5]=new Face(20,80+24*5,5%3+5,10,12);
		faces[6]=new Face(20,80+24*6,6%3+5,10,12);
		faces[7]=new Face(20,80+24*7,7%3+5,10,12);
		faces[8]=new Face(20,80+24*8,8%3+5,10,12);
		faces[9]=new Face(20,80+24*9,9&3+5,10,12);

		for (int i=0; i<150; i++) {
			clear();
			for (int j=0; j<faces.length ; j++) {
				faces[j].draw(this);
				faces[j].move();
				if(faces[j].x>=400) {
					faces[j].moveOrigin();
				}
			}
			sleep(0.01);
		}
	}

}