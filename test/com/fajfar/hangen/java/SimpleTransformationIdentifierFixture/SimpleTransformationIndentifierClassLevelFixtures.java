package com.fajfar.hangen.java.SimpleTransformationIdentifierFixture;

import com.fajfar.hangen.java.SimpleTransformationIdentifier;
import com.fajfar.hangen.java.data.SimpleClassA;
import com.fajfar.hangen.java.data.SimpleClassB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleTransformationIndentifierClassLevelFixtures {

    @Test
    public void given_TwoInstancesWithSameTypes_Then_TheyAreEqual(){
        SimpleTransformationIdentifier instanceA = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceB = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertEquals(instanceA, instanceB);
        assertTrue(instanceA.equals(instanceB));
    }

    @Test
    public void given_TwoInstancesWithSameTypes_Then_TheyHaveSameHashCode(){
        SimpleTransformationIdentifier instanceA = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceB = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertEquals(instanceA, instanceB);
        assertEquals(instanceA.hashCode(), instanceB.hashCode());
    }

    @Test
    public void equals_ComparedWirhNull_ReturnsFalse(){
        SimpleTransformationIdentifier instance = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertFalse(instance.equals(null));
    }

    @Test
    public void equals_isSymmetric(){
        SimpleTransformationIdentifier instanceA = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceB = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertEquals(instanceA, instanceB);
        assertEquals(instanceB, instanceA);
    }

    @Test
    public void equals_isReflective(){
        SimpleTransformationIdentifier instanceA = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceB = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertEquals(instanceA, instanceB);
        assertEquals(instanceB, instanceA);
    }

    @Test
    public void equals_isTransitive(){
        SimpleTransformationIdentifier instanceA = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceB = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
        SimpleTransformationIdentifier instanceC = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);

        assertEquals(instanceA, instanceB);
        assertEquals(instanceB, instanceC);
        assertEquals(instanceA, instanceC);
    }
}
