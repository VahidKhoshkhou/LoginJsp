package it.alfasoft.vahid.servizi;

import it.alfasoft.vahid.bean.UtenteBean;
import it.alfasoft.vahid.dao.UtenteDao;

public class ServizioRegistrazione {
	
	public boolean registraUtente(UtenteBean u){
		
		UtenteDao uDao=new UtenteDao();
		
		
		return uDao.inserisciUtente(u);
		
	}

}
