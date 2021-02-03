package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class JobTest {

    Job test_job;

    @Before
    public void createJobObject(){ test_job = new Job(); }



    @Test
    public void testSettingJobId(){
        assertEquals(0,test_job.getId(),.001);
    }


}
