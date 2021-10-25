package factorymethod.teht1;

public class Joku extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Viina();}
}
