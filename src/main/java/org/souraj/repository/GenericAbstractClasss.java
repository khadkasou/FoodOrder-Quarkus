//package org.souraj.repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.Query;
//import jakarta.persistence.criteria.CriteriaQuery;
//import org.souraj.model.IAbstractClass;
//
//import java.util.List;
//
//public abstract class GenericAbstractClasss<T extends IAbstractClass> implements GenericRepo<T>{
//    protected abstract EntityManager getEntityManager();
//    private Class<T> entityClass;
//
//    public GenericAbstractClasss(Class<T> entityClass) {
//        this.entityClass = entityClass;
//    }
//
//    public Class<T> getEntityClass() {
//        return entityClass;
//    }
//
//    public void setEntityClass(Class<T> entityClass) {
//        this.entityClass = entityClass;
//    }
//
//    @Override
//    public void save(T object) {
//        getEntityManager().persist(object);
//        getEntityManager().flush();
//    }
//
//    /**
//     *
//     * @param object
//     */
//    @Override
//    public void update(T object) {
//        getEntityManager().merge(object);
//        getEntityManager().flush();
//
//    }
//
//    @Override
//    public List<T> findAll() {
//        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
//        cq.select(cq.from(entityClass));
//        Query q = getEntityManager().createQuery(cq);
//        List<T> results = q.getResultList();
//        return results;
//    }
//
//    @Override
//    public T findById(Long id) {
//        return getEntityManager().find(entityClass, id);
//    }
//
//    @Override
//    public void delete(Long id) {
//        getEntityManager().remove(findById(id));
//        getEntityManager().flush();
//    }
//
//}
