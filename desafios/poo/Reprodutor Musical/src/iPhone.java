
public class iPhone {

    private Reprodutor_Musical reprodutor_musical;
    private Aparelho_Telefonico aparelho_telefonico;
    private Navegador_Internet navegador_internet;

    public Reprodutor_Musical getReprodutor_musical() {
        return reprodutor_musical;
    }

    public void setReprodutor_musical(Reprodutor_Musical reprodutor_musical) {
        this.reprodutor_musical = reprodutor_musical;
    }

    public Aparelho_Telefonico getAparelho_telefonico() {
        return aparelho_telefonico;
    }

    public void setAparelho_telefonico(Aparelho_Telefonico aparelho_telefonico) {
        this.aparelho_telefonico = aparelho_telefonico;
    }

    public Navegador_Internet getNavegador_internet() {
        return navegador_internet;
    }

    public void setNavegador_internet(Navegador_Internet navegador_internet) {
        this.navegador_internet = navegador_internet;
    }

    public iPhone() {
        this.reprodutor_musical = new Reprodutor_Musical();
        this.aparelho_telefonico = new Aparelho_Telefonico();
        this.navegador_internet = new Navegador_Internet();
    }
}
