package day2Lab1;

public class Controller {

	public static void main(String[] args) {
		Curtain ctain = new Curtain();
		Remote remote = new Remote(ctain);
		remote.operate();
		remote.operate();
		remote.operate();
		remote.operate();

	}

}
