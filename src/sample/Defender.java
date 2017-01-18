package sample;

/**
 * Created by lushi on 21.11.2016.
 */
public class Defender implements Warrior {
    private String name, squad;
    private int health = 200;
    private int damage = 50;

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public String takeDamage(int damage) {
        health -= damage;
        return Integer.toString(health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void setSquadName(String n) {
        squad = n;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + squad;
    }

    @Override
    public Defender clone() {
        Defender w = new Defender();
        w.name = this.name;
        return w;
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getInfo() {
        return "HP: " + health + " DMG: " + damage;
    }
}
