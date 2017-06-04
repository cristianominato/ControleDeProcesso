package br.data.crud;

import br.data.entity.Cadastroestrutura;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CrudCadastroestrutura extends AbstractCrud<br.data.entity.Cadastroestrutura>{   
    private EntityManager em;
    private static final String PU = EMNames.EMN1;

    public CrudCadastroestrutura() {
        super(br.data.entity.Cadastroestrutura.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
}
