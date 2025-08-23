package pkg_oopsDay3_5;



public class MainInterfaceDemo {
    public static void main(String[] args) {
        // Playable and Recordable reference for AudioPlayer// polymorphisam //assesment 2
        Playable audioPlay = new AudioPlayer();
        Recordable audioRecord = (Recordable) audioPlay;

        audioPlay.play();
        audioRecord.record();
        System.out.println();

        // Playable and Streamable reference for VideoPlayer
        Playable videoPlay = new VideoPlayer();
        Streamable videoStream = (Streamable) videoPlay;

        videoPlay.play();
        videoStream.stream();
        System.out.println();

        // Recordable and Streamable reference for Camera
        Recordable cameraRecord = new Camera();
        Streamable cameraStream = (Streamable) cameraRecord;

        cameraRecord.record();
        cameraStream.stream();
    }
}
