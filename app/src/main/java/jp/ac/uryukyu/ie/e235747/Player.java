package jp.ac.uryukyu.ie.e235747;

class Player extends Character {
    int experience;
    Item[] inventory;

    public Player(String name) {
        super(name, 100, 15);
        this.experience = 0;
        this.inventory = new Item[]{new Item("ポーション", 20)};
    }

    public void gainExperience(int points) {
        experience += points;
        System.out.println(name + "が" + points + "の経験値を獲得しました。 現在の経験値: " + experience);
    }
}