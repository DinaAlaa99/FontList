import java.awt.*;
import java.applet.*;



/** Create an applet that displays the list of available fonts in the 
underlying platform*/

public class font2 extends Applet {
		
	 public void paint(Graphics g)
	 {
	 	String [] font=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (int i=0; i<font.length;i++)
		{
			Font f = new Font(font[i],Font.BOLD,14);
			g.setFont(f);
			g.drawString(font[i],0,(10*i));
		}
	 }
		
}