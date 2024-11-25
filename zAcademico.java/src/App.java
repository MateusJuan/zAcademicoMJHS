import cadastrousuario.Aluno;
import cadastrousuario.Escola;

public class App {
    public static void main(String[] args) throws Exception {
        Escola escolaantiga = new Escola("12345560","Escolinha do Pinóqui","Rua do Gepeto",2022,"Maria das Graças ,Diretora,Tel 81 955447755");

        aluno1.setEscolaAnterior(escolaAntiga);

        aluno1.getEscolaAnterior().imprimeDados();

        ArrayList<NotaSelecao> netaSel = new ArrayList<NotaSelecao>();

        NotaSelecao notaPort = new NotaSelecao("Portguês", 8.5,false);
        NotaSelecao notaMat = new NotaSelecao("Matemática",7,true);
        NotaSelecao notaGeo = new NotaSelecao("geografia",8,false);

        notaSel.add(notaPort);
        notaSel.add(notaMat);
        notaSel.add(notaGeo);


        String validacao = aluno1.validacaoEmailInstitucional(aluno1.getEmailInstitucional());
        if(validacao==""){
            System.out.println("E-mail Inválido!!");
        }
    }
}
