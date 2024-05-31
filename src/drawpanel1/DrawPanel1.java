package drawpanel1;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel {

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//Desenha um retângulo
		Rectangle2D retangulo = new Rectangle2D.Double(100, 100, 200, 100);
		g2d.draw(retangulo);
		
		//Desenha um círculo
		Ellipse2D circulo = new Ellipse2D.Double(400, 100, 200, 100);
		g2d.draw(circulo);
		
		//Desenha um polígono
		Path2D polygon = new Path2D.Double();
		polygon.moveTo(200, 300);
		polygon.lineTo(300, 400);
		polygon.lineTo(100, 400);
		polygon.closePath();
		g2d.draw(polygon);
		
	}
}
