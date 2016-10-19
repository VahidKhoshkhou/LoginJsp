<%@page import="it.alfasoft.vahid.servizi.ServizioRegistrazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <jsp:useBean id="utente" class="it.alfasoft.vahid.bean.UtenteBean"  scope="request"/>
    
     <jsp:setProperty property="*" name="utente"/>
     
    
    <%
     
    ServizioRegistrazione su=new ServizioRegistrazione();
    
    if(utente.isValid() == true){
    	
    	// allora registrazione era con successo 
    	
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