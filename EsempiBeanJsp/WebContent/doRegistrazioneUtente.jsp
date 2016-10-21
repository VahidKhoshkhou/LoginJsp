<%@page import="it.alfasoft.vahid.servizi.ServizioRegistrazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <jsp:useBean id="utente" class="it.alfasoft.vahid.bean.UtenteBean"  scope="request"/>
    
     <jsp:setProperty property="*" name="utente"/>
     
    
    <%
     
    ServizioRegistrazione su=new ServizioRegistrazione();
    
   
    
    if(utente.isValid() == true){
    	
    	// allora registrazione era con successo 
    	
    	// prendo password che stata inserito da utente 
    	String pass= utente.getPassword();
    	
    	// lo modifica con algoritmo di codifica
    	pass=su.convertiPass(pass); 
    	
    	// lo setto di nuovo dentro bean 
    	
    	utente.setPassword(pass);
    	
    	// e dopo salvo utente dentro db 
    
    	su.registraUtente(utente);
    	
    	%>
    	
    	<jsp:forward page="RegistrazioneConSuccesso.jsp" />
    	
    	
    	
    	<%
    	
    	
    }else{
    	
    	// torna alla pagina login 
    	
      %>
    	
    	<jsp:forward page="formRegistrazione.jsp" />
    	
    	
    	
    	<%
    	
    	
    }
 
    
    %>