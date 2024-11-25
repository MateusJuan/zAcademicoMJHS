package cadastrousuario;

public class Aluno extends Usuario{
    private String matricula;
    private String escola_anterior;

    public Aluno(String  nome, String  cpf, int  idade, String emailPessoal, String emailInstitucional, String senha, String matricula){
        super(nome , cpf , idade , emailPessoal , emailInstitucional , senha , matricula);
        this.matricula = matricula;
    }

    public String getEscola_anterior() {
        return this.escola_anterior;
    }

    public void setEscola_anterior(Escola escola_anterior) {
        this.escola_anterior = escola_anterior;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
