package AbstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	public void exit() {
		System.out.println("Oyun bitti");
	}
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
