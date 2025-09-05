package day2Lab1;

public class Remote {
	Curtain ctain;

	public Remote(Curtain ctain) {
		this.ctain = ctain;
	}

	public void operate() {

		if (ctain.isOpen()) {
			ctain.close();
		} else
			ctain.open();
	}
}
