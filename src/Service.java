public interface Service {
    void updateTyre();

    default void checkEngine(){
        System.out.println("Двигатель отсутствует");
    };

    default void checkTrailer(){
        System.out.println("Прицеп отсутствует");
    };

}
