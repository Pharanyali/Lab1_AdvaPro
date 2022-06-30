package se233.chapter1.model.item;

public class BasedEquipment {
    protected String name;
    protected String imgpath;

    public String getName() {
        return name;
    }

    public String getImgpath() {
        return imgpath;
    }
    public void setImgpath(String imgpath){
        this.imgpath = imgpath;
    }
}
