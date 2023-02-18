package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.pets.Dog;
import org.academiadecodigo.bootcamp.pets.Pet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PetService {

    private EntityManagerFactory emf;

    public void add(Pet pet){

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(pet);
            em.getTransaction().commit();

        } catch(RollbackException ex){
            em.getTransaction().rollback();
        } finally{
            em.close();
        }

    }


    public List<Dog> findAllByBreed(String breed){

        EntityManager em = emf.createEntityManager();
        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<Dog> criteriaQuery = builder.createQuery(Dog.class);
            Root<Dog> root = criteriaQuery.from(Dog.class);

            criteriaQuery.select(root).where(builder.equal(root.get("breed"), breed));

            return em.createQuery(criteriaQuery).getResultList();
        } finally {
            em.close();
        }

    }

    public List<Pet> findByAgeGreaterThan(int age){

        EntityManager em = emf.createEntityManager();

        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<Pet> criteriaQuery = builder.createQuery(Pet.class);
            Root<Pet> root = criteriaQuery.from(Pet.class);

            criteriaQuery.select(root).where(builder.greaterThan(root.get("age"), age)).orderBy(builder.asc(root.get("age")));

            return em.createQuery(criteriaQuery).getResultList();

        } finally {
            em.close();
        }
    }

    public List<Pet> findAllBeginsWith(String pattern){

        EntityManager em = emf.createEntityManager();

        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Pet> cq = builder.createQuery(Pet.class);
            Root<Pet> root = cq.from(Pet.class);

            cq.select(root).where(builder.like(root.get("name"), pattern + "%"));

            return em.createQuery(cq).getResultList();
        } finally {
            em.close();
        }
    }


    public List<Pet> findByName(String name){

        EntityManager em = emf.createEntityManager();

        try {

            TypedQuery<Pet> query = em.createQuery("SELECT pet FROM Pet pet WHERE pet.name = :name", Pet.class);
            query.setParameter("name", name);

            return query.getResultList();

        } finally {
            em.close();
        }

    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void close(){
        emf.close();
    }
}
