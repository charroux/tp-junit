package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.Test;  
import com.maBanque.CompteImpl; 
 
public class CompteTest { 
 	 
	@Test 
 	public void setSolde(){ 
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(0);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde == 0);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 


} 
