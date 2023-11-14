package org.lan;

public class Desktop extends Computer {
private void desktopSize() {
	System.out.println("desktop size ");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopSize();
	d.computerModel();
}
}
