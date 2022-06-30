package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.Weapon;

public class BasedCharacter {
    protected String name,imgpath;
    protected DamageType type;
    protected Integer fullHp, basedPow,basedDef,basedRes;
    protected Integer hp,power,defense,resistance;
    protected Weapon weapon;
    protected Armor armor;

    public String getName() {
        return name;
    }

    public String getImgpath() {
        return imgpath;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }
    @Override
    public String toString() {
        return name;
    }
    public DamageType getType(){
        return type;
    }
}
