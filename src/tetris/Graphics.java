package tetris;

public interface Graphics {

	void drawBoxAt(int i, int j, int value);
	void drawGameOver(String text, int row, int col);
	void drawRestart(String text, int row, int col);
	void showScore(int score);
	void showLevel(int level);
}
