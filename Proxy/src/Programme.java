
public class Programme {

	public static void main(String[] args) {
		/* good example */
		Image Image1 = new ProxyImage("src//Proxy.jpg");
		Image Image2 = new ProxyImage("src//Biblio.png");
		
		Image1.ShowImage() ;// ici l'objet Image1 réel est crée et l'image est chargé dans la memoire
		
		/* bad example */ 
		//Image ImageNoProxy1 = new HighResolutionImage("src//Proxy.jpg");
		//Image ImageNoProxy2 = new HighResolutionImage("src//Biblio.png");
		
		//ImageNoProxy2.ShowImage();// les deux images sont chargé en memoire alors qu'on est besoin que d'une "ImageNoProxy2"
		
	}

}
