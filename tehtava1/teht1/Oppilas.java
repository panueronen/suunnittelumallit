package factorymethod.teht1;

public class Oppilas extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {return new Limu();}
}
