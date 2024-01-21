package jp.ac.uryukyu.ie.e235747;

/**
 * ゲーム内のキャラクターを表す基本クラス
 */
class Character {

    /**
     * キャラクターの名前
     */
    String name;
    /**
     * キャラクターの現在のHP
     */
    int health;
    /**
     * キャラクターの攻撃力
     */
    int damage;

    /**
     * キャラクターのコンストラクタ。
     * 
     * @param name キャラクターの名前
     * @param health キャラクターの初期HP
     * @param damage キャラクターの攻撃力
     */
    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    /**
     * 敵キャラクターを攻撃するメソッド。
     * 
     * @param enemy 攻撃対象の敵キャラクター
     */
    public void attack(Character enemy) {
        System.out.println(name + "が" + enemy.name + "を攻撃しました！");
        int damageDealt = (int) (Math.random() * damage) + 1;
        enemy.takeDamage(damageDealt);
    }

    /**
     * ダメージを受けるメソッド。
     * 
     * @param damage 受けるダメージ量
     */
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "は" + damage + "のダメージを受けました。 残りHP: " + health);
    }

    /**
     * アイテムを使用するメソッド。
     * 
     * @param item 使用するアイテム
     */
    public void useItem(Item item) {
        System.out.println(name + "が" + item.name + "を使用しました。");
        health += item.healingPower;
        System.out.println(name + "のHPが" + item.healingPower + "回復しました。 残りHP: " + health);
    }
}