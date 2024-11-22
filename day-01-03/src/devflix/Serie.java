package devflix;

public class Serie extends Film {
    private Integer seasons;
    private Integer episodesPerSeason;
    private Integer currentEpisode;
    private Integer currentSeason;

    public Serie(String name, Integer seasons, Integer episodesPerSeason) {
        super(name);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.currentEpisode = 1;
        this.currentSeason = 1;
    }

    public void play(Integer season, Integer episode) {
        if (validateEpisode(season, episode)) {
            this.currentSeason = season;
            this.currentEpisode = episode;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Invalid episode");
        }
    }

    private boolean validateEpisode(Integer season, Integer episode) {
        if (season == 0 || episode == 0) 
            return false;

        if (season > seasons || episode > episodesPerSeason)
            return false;

        return true;
    }

    @Override
    public String toString() {
        String information = String.format("Serie %s %dx%02d (audio %s, caption %s)",
          getName(),
          currentSeason,
          currentEpisode,
          getAudio(),
          getCaption());
        return information;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(Integer episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public Integer getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(Integer currentEpisode) {
        this.currentEpisode = currentEpisode;
    }

    public Integer getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Integer currentSeason) {
        this.currentSeason = currentSeason;
    }

    

    
}
