package jp.ac.uryukyu.ie.e235747;

class Character {
    String name;
    int health;
    int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Character enemy) {
        System.out.println(name + "が" + enemy.name + "を攻撃しました！");
        int damageDealt = (int) (Math.random() * damage) + 1;
        enemy.takeDamage(damageDealt);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "は" + damage + "のダメージを受けました。 残りHP: " + health);
    }

    public void useItem(Item item) {
        System.out.println(name + "が" + item.name + "を使用しました。");
        health += item.healingPower;
        System.out.println(name + "のHPが" + item.healingPower + "回復しました。 残りHP: " + health);
    }
}