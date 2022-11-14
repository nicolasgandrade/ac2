package controller;

import java.sql.SQLException;
import model.Servico;
import utils.MySQL;

public class ServicoController {
    MySQL conn = new MySQL();
    
    public ServicoController() {
        this.conn.conectaBanco();
    }
    
    public void addServico(Servico servico) {
        String sql = "INSERT INTO Prestador_de_Servico VALUES("
                + "null,"
                + "'" + servico.getNome()+ "',"
                + "'" + servico.getValor()+ "',"
                + "'" + servico.getEmpresa()+ "',"
                + "'" + servico.getInicio()+ "',"
                + "'" + servico.getFim() + "',"
                + "'" + servico.getDescricao()+ "');";
        this.conn.updateSQL(sql);
    }
    
    public Servico buscaServico(String nome) throws SQLException {
        String sql = "SELECT * FROM Prestador_de_Servico WHERE "
                + "nome LIKE '%" + nome + "%';";
        this.conn.executarSQL(sql);
        
        Servico servico = new Servico();        
        while(this.conn.getResultSet().next()) {
            servico.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            servico.setNome(this.conn.getResultSet().getString("nome"));
            servico.setValor(Float.parseFloat(this.conn.getResultSet().getString("valor_hora")));
            servico.setEmpresa(this.conn.getResultSet().getString("nome_empresa"));
            servico.setInicio(this.conn.getResultSet().getString("data_inicio"));
            servico.setFim(this.conn.getResultSet().getString("data_fim"));
            servico.setDescricao(this.conn.getResultSet().getString("descricao_servico"));
        }
        return servico;
    }
    
    public void updateServico(Servico servico, String nome) {
        String sql = "UPDATE Prestador_de_Servico SET "
                + "nome = '" + servico.getNome()+ "',"
                + "valor_hora = '" + servico.getValor()+ "',"
                + "nome_empresa = '" + servico.getEmpresa()+ "',"
                + "data_inicio = '" + servico.getInicio()+ "',"
                + "data_fim = '" + servico.getFim()+ "',"
                + "descricao_servico = '" + servico.getDescricao()+ "'"
                + " WHERE " + "nome LIKE '%" + nome + "%';";
        this.conn.updateSQL(sql);
    }
    
    public void deleteServico(String nome) {
        this.conn.insertSQL("DELETE FROM Prestador_de_Servico WHERE " + "nome LIKE '%" + nome + "%';");                
    }

}