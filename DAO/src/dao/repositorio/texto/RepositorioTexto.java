/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.repositorio.texto;
import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
import comuns.enums.TipoRepositorio;
import dao.DAO;
import dao.FabricaDAOs;
import dao.repositorio.basis.Repositorio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitorlupinetti
 */
public class RepositorioTexto extends Repositorio {

    @Override
    public Entidade insere(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        
        Entidade retorno = null;
        retorno = dao.insere(entidade, tipoEntidade);
        
        return retorno;
    }

    @Override
    public Entidade atualiza(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entidade deleta(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entidade seleciona(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        
        Entidade retorno = null;
        try {
            retorno = dao.seleciona(entidade, tipoEntidade);
           
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    
    
}
