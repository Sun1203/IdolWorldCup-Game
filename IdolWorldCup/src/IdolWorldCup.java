
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IdolWorldCup {
	
	// 매개변수 설정
	static JPanel panelNorth;
	static JPanel panelCenter;
	static JLabel labelMessage;
	static JLabel labelVs;
	static JButton buttonLeft;
	static JButton buttonRight;
	static String[] images = {
			"idol1.png", "idol2.png", "idol3.png", "idol4.png",
			"idol5.png", "idol6.png", "idol7.png", "idol8.png",
			"idol9.png", "idol10.png", "idol11.png", "idol12.png",
			"idol13.png", "idol14.png", "idol15.png", "idol16.png",
	};
	static int imageIndex = 2; // 3th image index initialized
	
	// function : image to put on Button Control
	static ImageIcon changeImage(String filename) {
		ImageIcon icon = new ImageIcon("./images" + filename);
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changedImage);
		return icon_new;
	}
	
	
	
	static class MyFrame extends JFrame implements ActionListener {
		public MyFrame(String title) {
			super(title);
			
			// UI Init
			this.setSize(450, 250);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelNorth = new JPanel();
			labelMessage = new JLabel("Find Your Idol!!");
			labelMessage.setFont(new Font("Arial", Font.BOLD, 20));
			panelNorth.add(labelMessage);
			this.add( panelNorth );
			
		}
		
		
		// Button Click Event Callback
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame("Idol World Cup");

	}

}
