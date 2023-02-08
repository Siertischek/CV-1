
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel
{
 
int startX, flag, startY, endX, endY;
int colors[];

    BufferedImage grid;
    Graphics2D gc;

	public MyPanel(int color[])
	{
        colors = color;
	   startX = startY = 0;
           endX = endY = 100;
 	}

     public void clear()
    {
       grid = null;
       repaint();
    }
    public void paintComponent(Graphics g)
    {  
         super.paintComponent(g);
         Graphics2D g2 = (Graphics2D)g;
         if(grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid = (BufferedImage)(this.createImage(w,h));
            gc = grid.createGraphics();

         }
         g2.drawImage(grid, null, 0, 0);
     }
    public void drawing()
    {
        gc.drawLine(startX, startY, endX, endY);
        for(int i = 0; i<255; i++)
        {
            gc.drawLine(i, 0, i+1, colors[i]);
        }
        repaint();
    }
   
}
