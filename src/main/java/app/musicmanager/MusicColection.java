
package app.musicmanager;
public abstract class MusicColection {
    private int totalMusics;

    public MusicColection() {
        this.totalMusics = 0;
    }

    public int getTotalMusics() {
        return totalMusics;
    }

    abstract void addMusic(Music music);
    abstract void removeMusic(Music music);
    

}
