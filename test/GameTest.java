import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private final Game game = new Game();

    @Test
    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        assertEquals(24, game.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

    public void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }
}