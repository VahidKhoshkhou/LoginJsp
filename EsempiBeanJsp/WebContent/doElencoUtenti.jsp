	<%@page import="it.alfasoft.vahid.dao.UtenteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%
    
    UtenteDao uDao=new UtenteDao();
    
   
    request.setAttribute("utenti", uDao.getTuttiUtenti());
    
    
    
    %>
    
    <jsp:forward page="elencoUtenti.jsp">
      <jsp:param value="" name=""/>
    </jsp:forward>