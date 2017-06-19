package br.data.entity;

import br.data.entity.Cadastrodesenho;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-19T18:59:12")
@StaticMetamodel(Cadastroenviodesenho.class)
public class Cadastroenviodesenho_ { 

    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> parteativa;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> fechamento;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> marcenaria;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> bobinagem;
    public static volatile SingularAttribute<Cadastroenviodesenho, String> nome;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> laboratorio;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> nucleo;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> caldeiraria;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> pintura;
    public static volatile SingularAttribute<Cadastroenviodesenho, Cadastrodesenho> fkcadastrodesenho;
    public static volatile SingularAttribute<Cadastroenviodesenho, String> enviar;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> projeto;
    public static volatile SingularAttribute<Cadastroenviodesenho, Boolean> almoxarifado;
    public static volatile CollectionAttribute<Cadastroenviodesenho, Cadastrodesenho> cadastrodesenhoCollection;

}