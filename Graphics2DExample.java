import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

/**
 * Created by dell on 2017/3/8.
 */
public class Graphics2DExample extends JFrame {
    public void paint(Graphics canvas){
        super.paint(canvas);
        try{
            BufferedImage img= ImageIO.read(new File("e:\\java.jpg"));
            //Draw the image at coordinates 50,50
            canvas.drawImage(img,50,50,null);

            int w=img.getWidth(null);
            int h=img.getHeight(null);
            BufferedImage img2=new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics g=img2.getGraphics();
            g.drawImage(img,0,0,null);

            float[] scales={1f,1f,1f,0.3f};
            float[] offsets= new float[4];
            RescaleOp rop=new RescaleOp(scales,offsets,null);

            Graphics2D g2=(Graphics2D) canvas;
            g2.drawImage(img2,rop,150,50);
        }
        catch(IOException e){
            System.out.println("Error reading the image.");
        }
    }
    public Graphics2DExample(){
        setSize(275,175);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Graphics2DExample guiWindow=new Graphics2DExample();
        guiWindow.setVisible(true);
    }
}
