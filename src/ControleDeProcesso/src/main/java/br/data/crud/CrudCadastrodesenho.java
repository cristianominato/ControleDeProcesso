package br.data.crud;

import br.data.entity.Cadastrodesenho;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CrudCadastrodesenho extends AbstractCrud<br.data.entity.Cadastrodesenho>{   
    private EntityManager em;
    private static final String PU = EMNames.EMN1;

    public CrudCadastrodesenho() {
        super(br.data.entity.Cadastrodesenho.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
}
