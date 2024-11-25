package cadastrousuario;

public class NotaSelecao{
    private String disciplna;
    private double nota;
    private boolean eja;


    public NotaSelecao(String disciplna, double nota, boolean eja) {
        this.disciplna = disciplna;
        this.nota = nota;
        this.eja = eja;
    }
    

    public String getDisciplna() {
        return this.disciplna;
    }

    public void setDisciplna(String disciplna) {
        this.disciplna = disciplna;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isEja() {
        return this.eja;
    }

    public void setEja(boolean eja) {
        this.eja = eja;
    }
    

}