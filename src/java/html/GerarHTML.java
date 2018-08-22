
package html;

import java.util.Iterator;
import java.util.List;
import model.Aluno;

public class GerarHTML {
    public String getList(List lista){
        StringBuffer sb=new StringBuffer();
        sb.append("<table width='60%' border='1'>\r\n"
                + "<tr>\r\n"
                    + "<td>Código Aluno</td>"
                    + "<td>Nome</td>"
                    + "<td>Idade</td>"
                    + "<td>CPF</td>"
                    + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Aluno al = (Aluno) it.next();
            sb.append("<tr>\r\n"
                        + "<td>"+al.getId()+"</td>"
                        + "<td>"+al.getNome()+"</td>"
                        + "<td>"+al.getIdade()+"</td>"
                        + "<td>"+al.getCpf()+"</td>"
                    + "</tr>\r\n");
        }
        sb.append("</table>");
        return sb.toString();
    }
    
}
