package jp.ac.uryukyu.ie.e235747;

import java.util.Scanner;

public class Game {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ゲームを開始します！");
        System.out.print("プレイヤーの名前を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Enemy enemy = new Enemy("モンスター");

        System.out.println("戦闘開始！");

        while (player.health > 0 && enemy.health > 0) {
            displayStatus(player, enemy);

            System.out.println("1. 攻撃   2. アイテムを使用   3. 逃げる");
            System.out.print("行動を選択してください: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    useItem(player);
                    break;
                case 3:
                    System.out.println(player.name + "は逃げ出しました。ゲームオーバー！");
                    System.exit(0);
                default:
                    System.out.println("無効な選択です。もう一度選んでください。");
            }

            if (enemy.health > 0) {
                enemy.attack(player);
            }
        }

        displayResult(player, enemy);
    }

    public static void displayStatus(Player player, Enemy enemy) {
        System.out.println("\n--- 現在のステータス ---");
        System.out.println(player.name + ": HP=" + player.health + ", 経験値=" + player.experience);
        System.out.println(enemy.name + ": HP=" + enemy.health);
    }

    private static void displayResult(Player player, Enemy enemy) {
        System.out.println("\n--- 戦闘結果 ---");
        if (player.health > 0) {
            System.out.println("勝利！" + player.name + "のHP: " + player.health + ", 経験値: " + player.experience);
        } else {
            System.out.println("敗北！" + enemy.name + "のHP: " + enemy.health);
        }
    }

    private static void useItem(Player player) {
        System.out.println("\n--- アイテム一覧 ---");
        for (int i = 0; i < player.inventory.length; i++) {
            System.out.println((i + 1) + ". " + player.inventory[i].name);
        }

        System.out.print("使用するアイテムを選択してください: ");
        Scanner scanner = new Scanner(System.in);
        int itemChoice = scanner.nextInt();

        if (itemChoice >= 1 && itemChoice <= player.inventory.length) {
            player.useItem(player.inventory[itemChoice - 1]);
        } else {
            System.out.println("無効な選択です。");
        }
    }
}