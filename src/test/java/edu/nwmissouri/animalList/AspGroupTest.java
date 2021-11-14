package edu.nwmissouri.animalList;

/**
 *
 * @author S541905
 */

import edu.nwmissouri.animalList.AspGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AspGroupTest {
    
public AspGroupTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class AardvarkGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = AspGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class AardvarkGroup.
     */
    @Test
    public void testGroupRun() {
        AspGroup.create();
        AspGroup.run();
        assertTrue(true);
    }

}

