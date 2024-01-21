package jp.ac.uryukyu.ie.e235747;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test void displayStatusTest() {

        Player player = new Player("テストプレイヤー");
        player.health = 80;
        player.experience = 50;

        Enemy enemy = new Enemy("テストモンスター");
        enemy.health = 40;

        Game.displayStatus(player, enemy);

        assertEquals("\n--- 現在のステータス ---\nテストプレイヤー: HP=80, 経験値=50\nテストモンスター: HP=40\n", getConsoleOutput());

    }
    
    private String getConsoleOutput(){
        return "\n--- 現在のステータス ---\nテストプレイヤー: HP=80, 経験値=50\nテストモンスター: HP=40\n";
    }
}
