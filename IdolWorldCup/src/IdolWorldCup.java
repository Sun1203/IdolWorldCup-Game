
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
		ImageIcon icon = new ImageIcon("./images/" + filename);
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
			this.add( "North", panelNorth );
			
			panelCenter = new JPanel();
			labelVs = new JLabel("vs");
			labelVs.setFont(new Font("Arial", Font.BOLD, 20));
			buttonLeft = new JButton("LeftButton");
			buttonLeft.setIcon(changeImage("idol1.png"));
			buttonLeft.setPreferredSize(new Dimension(200, 200));
			
			buttonRight = new JButton("RightButton");
			buttonRight.setIcon(changeImage("idol2.png"));
			buttonRight.setPreferredSize(new Dimension(200, 200));
			
			//add click event
			buttonLeft.addActionListener(this);
			buttonRight.addActionListener(this);
			
			panelCenter.add(buttonLeft);
			panelCenter.add(labelVs);
			panelCenter.add(buttonRight);
			
			this.add( "Center", panelCenter );
			
			this.pack(); // clear empty space(빈 공간을 없애줌)
			
			
		}
		
		
		// Button Click Event Callback
		@Override
		public void actionPerformed(ActionEvent e) {
			if (imageIndex == 16) {
				// Last Idol
				labelMessage.setText("Found Your Idol!");
				// show Last Image
				if ( e.getActionCommand().equals("LeftButton")) {
					buttonRight.hide();
					labelVs.hide();
				}
				else {
					buttonLeft.hide();
					labelVs.hide();
				}
			}
			else {
				if ( e.getActionCommand().equals("LeftButton")) {
					// LeftButton
					buttonRight.setIcon(changeImage(images[imageIndex]));
					imageIndex++;
				}
				else {
					// Right Button
					buttonLeft.setIcon(changeImage(images[imageIndex]));
					imageIndex++;
					
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame("Idol World Cup");

	}

}
