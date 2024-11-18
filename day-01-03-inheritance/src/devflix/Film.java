package devflix;

public class Film extends Video {
    private String audio;
    private String caption;
    
    public Film(String name) {
        super(name);
        this.audio = "English";
        this.caption = "none"; 
    }

    @Override
    public void play() {
        System.out.println("Play: film " + getName());
    }

    /*
     * <method-name>(params)
     * void play(String audio) -> play(String)
     * void play(String audio, String caption) -> play(String, String)
     * void play(String caption, String quality) -> play(String, String)
     * void play(String caption, String quality, Integer resolution) -> play(String, String, Integer)
     */

    public void play(String audio) {
        this.audio = audio;
        if (audio == "English") {
            this.caption = "none";
        } else {
            this.caption = "English";
        }
        System.out.println("Play: " + toString()) ;
    }

    public void play(String audio, String caption) {
        this.audio = audio;
        this.caption = caption;
        System.out.println("Play: " + toString()) ;
    }

    public void play(String caption, String quality, Integer resolution) {

    }

    @Override
    public String toString() {
        String information = String.format("Film %s (audio %s, caption %s)", getName(), audio, caption);
        return information;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    

}
