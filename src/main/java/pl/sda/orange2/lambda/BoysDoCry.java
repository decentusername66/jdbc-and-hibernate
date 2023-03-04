package pl.sda.orange2.lambda;

@FunctionalInterface
public interface BoysDoCry {
    //funkcyjny iterface - jedna abstrakcyjna metoda
    void silnoreki();

    default void cry(){};
}
