package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {
        BoysDoCry boy = new BoysCryToo();
        boy.silnoreki();

        BoysCryToo boy2 = new BoysCryToo();
        boy2.sing();

        //anonymous class
        BoysDoCry anonymousClassReference = new BoysDoCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoręki");
            }
        };
        anonymousClassReference.silnoreki();
    }
}
