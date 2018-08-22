package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import persistence.ConnectionMysql;

public class AlunoDAO extends ConnectionMysql{
    //metodo cadastrar
    public void cadastrar(Aluno a) throws Exception{
        OpenDataBase();
        String sql = "INSERT INTO alunos (id_aluno, nome_aluno, idade, cpf) VALUES(null, ?, ?, ?)";
        ps = con.prepareCall(sql);
        ps.setString(1, a.getNome());
        ps.setString(2, Integer.toString(a.getIdade()));
        ps.setString(3, a.getCpf());
        ps.execute();
        CloseDB();
    }
    //metodo listar
    public List listar() throws Exception{
        OpenDataBase();
        String sql = "SELECT * FROM alunos ORDER BY nome_aluno";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        List listaAlunos = new ArrayList();
        while (rs.next()) {
            Aluno a = new Aluno();
            a.setId(rs.getInt("id_aluno"));
            a.setNome(rs.getString("nome_aluno"));
            a.setIdade(rs.getInt("idade"));
            a.setCpf(rs.getString("cpf"));
            listaAlunos.add(a);
        }
        CloseDB();
        return listaAlunos;
        
    }
    
}
