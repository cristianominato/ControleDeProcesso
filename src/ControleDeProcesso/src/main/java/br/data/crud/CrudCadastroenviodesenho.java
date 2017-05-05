package br.data.crud;

import br.data.entity.Cadastroenviodesenho;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CrudCadastroenviodesenho extends AbstractCrud<br.data.entity.Cadastroenviodesenho>{   
    private EntityManager em;
    private static final String PU = EMNames.EMN1;

    public CrudCadastroenviodesenho() {
        super(br.data.entity.Cadastroenviodesenho.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
}
