package br.data.crud;

import br.data.entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CrudUsuario extends AbstractCrud<br.data.entity.Usuario> {

    private EntityManager em;
    private static final String PU = EMNames.EMN1;

    public CrudUsuario() {
        super(br.data.entity.Usuario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}