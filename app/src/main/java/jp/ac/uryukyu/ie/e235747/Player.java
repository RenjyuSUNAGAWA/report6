package jp.ac.uryukyu.ie.e235747;

/**
 * プレイヤーキャラクターを表すクラス。
 */
class Player extends Character {
    int experience;
    Item[] inventory;

    /**
     * プレイヤーキャラクターのコンストラクタ。
     * @param name プレイヤーの名前
     * experienceの初期値を設定。
     * inventoryにhealingPower20のポーションを追加。
     */
    public Player(String name) {
        super(name, 100, 15);
        this.experience = 0;
        this.inventory = new Item[]{new Item("ポーション", 20)};
    }

    /**
     * 経験値を加算するメソッド。
     * 
     * @param points 加算する経験値ポイント
     */
    public void gainExperience(int points) {
        experience += points;
        System.out.println(name + "が" + points + "の経験値を獲得しました。 現在の経験値: " + experience);
    }
}