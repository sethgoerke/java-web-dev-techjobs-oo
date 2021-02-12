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

        test_id1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_id2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_id3 = new Job(" ",new Employer("Data not available"), new Location("Data not available"), new PositionType("Data not available"), new CoreCompetency("Data not available"));
    }
    //Test the Empty Constructor 1 - 5

    @Test
    public void testSettingJobId(){ assertEquals(1, test_id2.getId() - test_id1.getId());}

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

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(1,test_id2.getId() - test_id1.getId());
        assertEquals("Product tester", test_id1.getName());
        assertEquals("ACME", test_id1.getEmployer().getValue());
        assertEquals("Desert",test_id1.getLocation().getValue());
        assertEquals("Quality control", test_id1.getPositionType().getValue());
        assertEquals("Persistence", test_id1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
    assertFalse(test_id1.equals(test_id2));

    }
    @Test
    public void testBlankLineBeforeAndAfter(){
        assertEquals('\n', test_id1.toString().charAt(0));
    }
    @Test
    public void testLabelAndDataEachField(){
        assertEquals("\nID: " + test_id1.getId()  + "\nName: Product tester" + "\nEmployer: ACME" + "\nLocation: Desert" + "\nPosition Type: Quality control" + "\nCore Competency: Persistence", test_id1.toString());
    }
    @Test
    public void testEmptyField(){
        assertEquals("\nID: 3" + "\nName: Data not available" + "\nEmployer: Data not available" + "\nLocation: Data not available" + "\nPosition Type: Data not available" + "\nCore Competency: Data not available", test_id3.toString());
    }

}
