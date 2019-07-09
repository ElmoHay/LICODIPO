package com.journaldev.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.springhibernate.model.Repuesto;

@Repository
public class RepuestoDAOImpl implements RepuestoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(RepuestoDAOImpl.class);
	 
    private SessionFactory sessionFactory;
     
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
 
    @Override
    public void addRepuesto(Repuesto p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("R Person saved successfully, Person Details="+p);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Repuesto> listRepuestos() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Repuesto> personsList = session.createQuery("from Repuesto").list();
        for(Repuesto p : personsList){
            logger.info("R Person List::"+p);
        }
        return personsList;
    }
 
}
