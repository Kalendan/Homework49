public class Main {
    public static void main(String[] args) {
        Mediaplayer mediapPlayer = new Mediaplayer();
        AudioTrack audioTrack1 = new AudioTrack();
        AudioTrack audioTrack2 = new AudioTrack();
        Video video1 = new Video();
        mediapPlayer.addTaracks(video1, audioTrack1, audioTrack2);
        mediapPlayer.playAll();
    }
}








//1. Создайте интерфейс Playable. С двумя методами:
//1.1 метод void play()
//1.2 default-метод printInfo(), реализация которого сообщает, что мы имеем дело с запускаемым файлом
//
//2. Реализуйте интерфейс Playable в двух классах:
//2.1 AudioTrack
//2.2 Video
//
//3. Создайте класс MediaPlayer. В нем добавьте возможность добавить трек или видео в список прослушивания.
//        Используя varargs, добавьте возможномть добавлять несколько треков за раз.
//Также добавьте метод для запуска "очереди треков". Перед запуском каждого трека выводите информацию о каждом треке