package com.fajfar.hangen.java.SimpleTransformationIdentifierFixture;

import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;
import com.fajfar.hangen.java.SimpleTransformationIdentifier;
import com.fajfar.hangen.java.TransformationIdentifier;
import com.fajfar.hangen.java.data.SimpleClassA;
import com.fajfar.hangen.java.data.SimpleClassB;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GivenAValidSimpleTransformationIdentifier {

    private TransformationIdentifier identifier;

    @Before
    public void setUp(){
        identifier = new SimpleTransformationIdentifier(SimpleClassA.class, SimpleClassB.class);
    }

    @Test
    public void when_NullSetForDestinationType_Then_ExceptionThrown(){
        try{
            TransformationIdentifier test = new SimpleTransformationIdentifier(SimpleClassA.class, null);
        }catch (NullPointerException nullPointerException){
            assertThat(nullPointerException.getMessage(), is(ErrorMessages.DESTINATION_TYPE_NULL.getResource()));
        }
    }

    @Test
    public void when_NullSetForSourceType_Then_ExceptionThrown(){
        try{
            TransformationIdentifier test = new SimpleTransformationIdentifier(null, SimpleClassB.class);
        }catch (NullPointerException nullPointerException){
            assertThat(nullPointerException.getMessage(), is(ErrorMessages.SOURCE_TYPE_NULL.getResource()));
        }
    }
}
