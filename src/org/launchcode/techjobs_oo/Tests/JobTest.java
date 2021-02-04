package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {

    private Job test_id1;
    private Job test_id2;
    private Job test_id3;
    @Before
    public void createJobObject() {
        test_id1 = new Job();
        test_id2 = new Job();
        test_id3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(test_id3);
    }
    //Test the Empty Constructor 1 - 5

    @Test
    public void testSettingJobId(){
        assertEquals(1,test_id1.getId());
    }
    @Test
    public void testObjectsPlusOneIsTrue(){
        assertTrue(test_id1.getId() + 1 == test_id2.getId());
    }
    @Test
    public void testObjectsAreNotEqual(){
        assertFalse(test_id1.getId() == test_id2.getId());
    }
    @Test
    public void testObjectsPlusTwoIsFalse(){
        assertFalse(test_id1.getId() + 2 == test_id2.getId());
    }

    //Test the Full Constructor 1 - 3

//    @Test
//    public void testJobConstructorSetsAllFields(){
//
//    }



}
