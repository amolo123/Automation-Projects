package com.tests.transaction;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class UpdatePOStatusApproverAdminTest extends StartTest {

	@Test(priority=1)
	public void updatePoStatusAdmin() throws InterruptedException, IOException {
		
		homePage.transactionClick();
		
		homePage.allPoClick();
		
		allPoPage.firstRecordClick();
		
		createNewPoPage.vehicleNoSelect();
		
		createNewPoPage.availabilityDateSelect("03/19/2020");
		
		createNewPoPage.poStatusSelect("Approved");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
		
		
	
	}
	
	
}
