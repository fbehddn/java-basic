package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대음량");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown() {
        volume -= volume;
        System.out.println("volumeDown 호출 ");
    }

    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }
}
