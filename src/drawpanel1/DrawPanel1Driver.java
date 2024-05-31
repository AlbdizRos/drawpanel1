package drawpanel1;
import javax.swing.JFrame;


public class DrawPanel1Driver {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exemplo de Gráfico 2D Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.add(new DrawPanel1());
		frame.setVisible(true);
		
	}

}
