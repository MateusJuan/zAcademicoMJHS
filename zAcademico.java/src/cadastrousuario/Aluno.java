package cadastrousuario;

public class Aluno extends Usuario{
    private String matricula;

    public Aluno(String  nome, String  cpf, int  idade, String emailPessoal, String emailInstitucional, String senha, String matricula){
        super(nome , cpf , idade , emailPessoal , emailInstitucional , senha , matricula);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
