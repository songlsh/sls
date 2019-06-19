package spring;

import org.springframework.stereotype.Component;

@Component
public class CDPlayerImpl implements CDPlayer {

    private String brand;
    private String typeMusic;

    public CDPlayerImpl() {
    }

    public CDPlayerImpl(String brand, String typeMusic) {
        this.brand = brand;
        this.typeMusic = typeMusic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }

    public void play() {
        System.out.println(this.brand + "CDPlayerImpl"+this.typeMusic);
    }
}
