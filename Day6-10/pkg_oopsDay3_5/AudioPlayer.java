package pkg_oopsDay3_5;

public class AudioPlayer implements Playable, Recordable {
	
	public void play() {
        System.out.println("AudioPlayer playing audio.");
    }
	
    public void record() {
        System.out.println("AudioPlayer recording audio.");

}
}