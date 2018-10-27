import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HighResolutionImage implements Image {
    private BufferedImage img;
	
	public HighResolutionImage(String pathImage)  {
		try {
			loadImage(pathImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void ShowImage() {
		    ImageIcon icon= new ImageIcon(img);
	        JFrame frame=new JFrame();
	        frame.setLayout(new FlowLayout());
	        frame.setSize(1500,500);
	        JLabel lbl=new JLabel();
	        lbl.setIcon(icon);
	        frame.add(lbl);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void loadImage(String pathImage) throws IOException {
		try {
			img=ImageIO.read(new File(pathImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
}
