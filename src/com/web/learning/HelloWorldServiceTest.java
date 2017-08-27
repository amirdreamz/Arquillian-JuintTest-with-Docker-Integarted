package com.web.learning;

import java.net.URL;

import javax.inject.Named;
import javax.naming.Context;
import javax.ws.rs.core.Response;


import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.web.learning.HelloWorldService;
import junit.framework.Assert;



	@RunWith(Arquillian.class)
	public class HelloWorldServiceTest {
		
		 
		

		@Deployment(testable=false)
	    public static Archive<?> createDeployment() {
			System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.naming.java.javaURLContextFactory");

	        return ShrinkWrap.create(JavaArchive.class)
	            .addPackage(HelloWorldService.class.getPackage())
	            .addClass(HelloWorldService.class)
	            .addAsManifestResource(EmptyAsset.INSTANCE, "bean.xml");
	    }

    	 

	    public void nothing(){
	    	System.out.println("dUMMY");
	    }
			    

		


	    
	   @Test
	   @RunAsClient
	    public void should_create_greeting(@ArquillianResource HelloWorldService restContext) {
		   
	        System.out.println("Hello arquillian world");
	       // HelloWorldService webTarget=new HelloWorldService();
	        Response response=restContext.getMsg("Ameer");
	        Assert.assertEquals(200, response.getStatus());
	    }


	    
	  
	

}
