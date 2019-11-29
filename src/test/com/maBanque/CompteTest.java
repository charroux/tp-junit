package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;  
import com.maBanque.CompteImpl; 
 
public class CompteTest { 
 	 
	CompteImpl compteImpl;
	
	@Before
	public void init() {
		compteImpl = new CompteImpl();
	}
	
	@Test 
 	public void initSolde(){ 
 	 	try{  	 	  		 	 	
 	 	 	compteImpl.setSolde(10);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde == 10);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}

 	@Test(expected = Exception.class)
 	public void setSoldeNul() throws Exception{ 
 		compteImpl.setSolde(0);  	 	 	
 	}

 	@Test 
 	public void crediter(){ 
 	 	try{  	 	  		 	 	
 	 	 	compteImpl.crediter(10);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde == 10);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}
 	
 	@Test(expected = Exception.class)
 	public void crediterSoldeNul() throws Exception{ 
 		compteImpl.crediter(0);  	 	 	
 	}

 	@Test 
 	public void debiter(){ 
 	 	try{  	 	  		 	 	
 	 	 	compteImpl.crediter(100);
 	 	 	compteImpl.debiter(50);
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde == 50);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}

 	@Test(expected = Exception.class)
 	public void debitSoldeInferieurA20() throws Exception{ 
 		compteImpl.crediter(10);
 		compteImpl.debiter(5);
 	}
 	
 	@Test(expected = Exception.class)
 	public void debitSoldeSuperieurA1000() throws Exception{ 
 		compteImpl.crediter(10);
 		compteImpl.debiter(10001);
 	}

} 
