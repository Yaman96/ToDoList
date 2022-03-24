package com.yaman.spring.mvc_hibernate_aop.dao;

import com.yaman.spring.mvc_hibernate_aop.entity.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Task> getAllTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    public void saveTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(task);
    }

    @Override
    public Task getTask(Long taskId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Task.class,taskId);
    }

    @Override
    public void deleteTask(Long taskId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Task> deleteQuery = session.createQuery("delete from Task where id =:taskId");
        deleteQuery.setParameter("taskId",taskId);
        deleteQuery.executeUpdate();
    }
}
