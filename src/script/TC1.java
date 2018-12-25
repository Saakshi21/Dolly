package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC1 extends BaseTest

{
@Test
public void testA()
{
	Reporter.log("Run TestA:",true);
	Assert.fail();
	}
}
