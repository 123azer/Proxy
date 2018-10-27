
public class ProxyImage implements Image {
	private Image ImageReel;
	private String PathImage;

	public ProxyImage(String PathImage) {
		this.PathImage=PathImage;
	}

	public String getPathImage() {
		return PathImage;
	}

	public void setPathImage(String pathImage) {
		PathImage = pathImage;
	}

	@Override
	public void ShowImage() {
		ImageReel=new HighResolutionImage(PathImage);
		ImageReel.ShowImage();	
	}
	
}
