package Tugas;

public class Radio extends Elektronik {
    int volume;

    public void setVolume(int newValue) {
        volume = newValue;
    }

    public void cetakStatus() {
        System.out.println("Volume: " + volume);
    }
}
