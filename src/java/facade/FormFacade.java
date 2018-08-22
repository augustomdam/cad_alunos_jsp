package facade;

import dao.AlunoDAO;
import javax.servlet.http.HttpServletRequest;
import model.Aluno;

public class FormFacade extends BaseFacade {

    public String salvarAluno(HttpServletRequest req) {
        try {
            // Recuperando os valores passados como parâmetros pelo formulário

            String noAluno = req.getParameter("nome");
            String idAluno = req.getParameter("idade");
            String cpfAluno = req.getParameter("cpf");

            // Montado objeto Aluno
            Aluno a = new Aluno();
            a.setNome(noAluno);
            a.setIdade(Integer.parseInt(idAluno));
            a.setCpf(cpfAluno);

            // Persistindo dados no MySQL
            AlunoDAO dao = new AlunoDAO();
            dao.cadastrar(a);

            return "Aluno cadastrado com sucesso";

        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }

    }
    //listando os alunos
    public String getListClientes(){
        try{
            AlunoDAO dao = new AlunoDAO();
            return html.getList(dao.listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}
