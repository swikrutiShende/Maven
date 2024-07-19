package nit.MavenProj1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	
    
    @Test
    public void shouldAnswerWithTrue()
    {
       int val1=10;
       int val2=20;
       int expected=30;
       App app=new App();
       int actual=app.sum(10, 20);
       assertEquals(expected, actual);
    }
}
