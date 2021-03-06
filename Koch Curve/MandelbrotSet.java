import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
/**
 * Write a description of class MandelbrotSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MandelbrotSet extends JFrame
{
    private final int MAX_ITER = 570;
    private final double ZOOM = 150;
    private BufferedImage I;
    private double zx, zy, cX, cY, tmp;
public MandelbrotSet()
{
         super("Mandelbrot Set");
        setBounds(100, 100, 800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        I = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                zx = zy = 0;
                cX = (x - 400) / ZOOM;
                cY = (y - 300) / ZOOM;
                int iter = MAX_ITER;
                while (zx * zx + zy * zy < 4 && iter > 0) {
                    tmp = zx * zx - zy * zy + cX;
                    zy = 2.0 * zx * zy + cY;
                    zx = tmp;
                    iter--;
                }
                I.setRGB(x, y, iter | (iter << 8));
    }
   }
}
public void paint(Graphics g)
    {
      g.drawImage(I, 0, 0, this);
    }
}


