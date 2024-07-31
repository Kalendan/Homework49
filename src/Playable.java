public interface Playable {

    public void play();
   public default void printInfo(){
        System.out.println("запускаемый файл");
    }
}
