package jp.ac.uryukyu.ie.e235747;

/**
 * 敵キャラクターを表すクラス。
 */
class Enemy extends Character {

    /**
     * 敵キャラクターのコンストラクタ。
     * 
     * @param name 敵の名前
     * @param maxHealth 敵の最大HP
     * @param attack 敵の攻撃力
     */
    public Enemy(String name) {
        super(name, 50, 10);
    }
}