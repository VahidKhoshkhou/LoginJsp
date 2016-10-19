package it.alfasoft.vahid.dao;

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
	
	//3-   U : update 
	
	// 4- D : Delete 

}
