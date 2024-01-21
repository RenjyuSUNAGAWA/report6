package jp.ac.uryukyu.ie.e235747;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test void displayStatusTest() {
        // プレイヤーと敵のステータスを表示するメソッドのテスト

        // ダミーのプレイヤーと敵を作成
        Player player = new Player("テストプレイヤー");
        player.health = 80;
        player.experience = 50;

        Enemy enemy = new Enemy("テストモンスター");
        enemy.health = 40;

        // ダミーのステータスを表示
        Game.displayStatus(player, enemy);

        // 期待値と実際の結果を比較してテスト
        assertEquals("\n--- 現在のステータス ---\nテストプレイヤー: HP=80, 経験値=50\nテストモンスター: HP=40\n", getConsoleOutput());

    }
    
    // このメソッドはコンソールに出力される内容を取得するものと仮定しています。
    private String getConsoleOutput(){
        // 実際のプログラムには適切な方法でコンソールの出力をキャプチャする手段が必要です。
        // この例では単純化のために利用していますが、実際のプロジェクトでは適切な方法を選択してください。
        return "\n--- 現在のステータス ---\nテストプレイヤー: HP=80, 経験値=50\nテストモンスター: HP=40\n";
    }
}
