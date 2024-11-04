import cadastrousuario.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno Aluno1 = new Aluno("Maria da Silva","01234567890",15,"maria.silva@gmail.com","ms23@jaboatao.ifpe.edu.br","123456","20231TDS-JG0001")

        System.out.println(Aluno1.getNome());
        System.out.println(Aluno1.getIdade());
    }
}
