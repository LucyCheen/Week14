import java.awt.*;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void drawSheep(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x+23,y+50,225,100); //羊的身體
        g.fillOval(x,y,75,75);   //羊的頭
        g.fillRect(x+50,y+100,25,100); //羊的腳1
        g.fillRect(x+100,y+100,25,100); //羊的腳2
        g.fillRect(x+150,y+100,25,100); //羊的腳3
        g.fillRect(x+200,y+100,25,100); //羊的腳4
    }
    public void walk(int x, int y){
        this.x += x;
        this.y += y;
    }
}
