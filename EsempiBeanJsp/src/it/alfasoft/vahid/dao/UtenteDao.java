package it.alfasoft.vahid.dao;

import java.util.List;

import it.alfasoft.vahid.bean.UtenteBean;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateUtil;

public class UtenteDao {
	
	// 1- c : create 
	
	   public boolean inserisciUtente(UtenteBean u){
		   
		   boolean res=false;
		   
		   
		   Session session= HibernateUtil.openSession();
		   
		   Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();
   
				
				session.persist(u);
				
				tx.commit();
			    res=true;
				
			} catch (Exception ex) {
				if (tx != null) {
					tx.rollback();
				}
			} finally {
				session.close();
			}
		   
		   
		   
		   
		   
		   
		   return res;
		   
	   }
	
	// 2-a  R : Read uno con username
	   
   public boolean getUtenteConUsername(UtenteBean u){
		   
		   boolean res=false;
		   
		   
		   Session session= HibernateUtil.openSession();
		   
		   Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();
   
				
				session.persist(u);
				
				tx.commit();
			    res=true;
				
			} catch (Exception ex) {
				if (tx != null) {
					tx.rollback();
				}
			} finally {
				session.close();
			}
		   
		
		   return res;
		   
	   }
	
	// 2-b R : Read tutti 
   
   @SuppressWarnings("unchecked")
public List<UtenteBean> getTuttiUtenti(){
	   
	
	   List<UtenteBean> utenti=null;
	   
	   Session session= HibernateUtil.openSession();
	   
	   Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			
		 Query query= session.createQuery("from UtenteBean");
			
		 utenti=query.list();
			tx.commit();
		 
			
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	   
	
	   return utenti;
	   
   }

	
	//3-   U : update 
	
	// 4- D : Delete 

}
