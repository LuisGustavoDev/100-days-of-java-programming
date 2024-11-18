package devflix;

public class Video {

    private String name;


    public Video(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play: any video");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
