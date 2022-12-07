import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
    Sheep s;
    public Main(){
        s = new Sheep(40,40);
        addKeyListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        s.drawSheep(g);
        requestFocusInWindow();
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window .setContentPane(new Main());
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {    //按下按鍵移動
        int k = e.getKeyCode();
        switch (k){
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                s.walk(0,-10);
                break;        //如果沒有加break,會fall trough
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                s.walk(0,10);
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                s.walk(-10,0);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                s.walk(10,0);
                break;
            default:     //如果不是上下左右，會出現視窗
                JOptionPane.showInternalMessageDialog(this,"Please input an arrow key.");
        }
        //System.out.println(k);
//        if (k==KeyEvent.VK_UP){
//            s.walk(0,-5);  //上
//        }
//        else if (k==KeyEvent.VK_DOWN){
//            s.walk(0,5); //下
//        }
//        else if (k==KeyEvent.VK_LEFT){
//            s.walk(-5,0); //左
//        }
//        else if (k==KeyEvent.VK_RIGHT){
//            s.walk(5,0);  //右
//        }
        repaint();  //重新做圖
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
