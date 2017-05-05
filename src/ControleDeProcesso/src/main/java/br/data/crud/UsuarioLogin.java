/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import javax.persistence.EntityManager;
  import javax.persistence.EntityManagerFactory;
  import javax.persistence.NoResultException;
  import javax.persistence.Persistence;
   
  import br.data.entity.Usuario;
/**
 *
 * @author Cristiano
 */
public class UsuarioLogin {
    private EntityManagerFactory factory = Persistence
                    .createEntityManagerFactory("usuarios");
        private EntityManager em = factory.createEntityManager();
   
        public Usuario getUsuario(String nomeUsuario, String senha) {
   
              try {
                    Usuario usuario = (Usuario) em
                               .createQuery(
                                           "SELECT u from Usuario u where u.nomeUsuario = :name and u.senha = :senha")
                               .setParameter("name", nomeUsuario)
                               .setParameter("senha", senha).getSingleResult();
   
                    return usuario;
              } catch (NoResultException e) {
                    return null;
              }
        }
    
}
