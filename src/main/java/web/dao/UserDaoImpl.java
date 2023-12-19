package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl() {
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Transactional
    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Transactional

    @Override
    public void update(long id, User user) {
        User existingUser = entityManager.find(User.class, id);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setLast_name(user.getLast_name());
            existingUser.setAge(user.getAge());
            entityManager.merge(existingUser);
        }
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
