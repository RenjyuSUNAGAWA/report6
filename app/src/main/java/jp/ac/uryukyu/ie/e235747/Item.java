package jp.ac.uryukyu.ie.e235747;

/**
 * アイテムを表すクラス。
 */
class Item {
    /**
     * アイテムの名前
     */
    String name;
    /**
     * アイテムが回復するHP量
     */
    int healingPower;

    /**
     * アイテムのコンストラクタ。
     * 
     * @param name アイテムの名前
     * @param healingPower アイテムが回復するHP量
     */
    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }
}