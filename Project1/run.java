public class run{
private short pix;
private int pixRunLength;
public run(){
pix=0;
pixRunLength=0;
}
public run(int width, int height){
pix=0;
pixRunLength=width*height;
}
public short getPix() {return pix;}
public int getRunLength() {return pixRunLength;}
}
