package SimpleTransformationIdentifierFixture;

import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;
import com.fajfar.hangen.java.SimpleTransformationIdentifier;
import com.fajfar.hangen.java.TransformationIdentifier;
import data.SimpleClassA;
import data.SimpleClassB;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
            assertThat(nullPointerException.getMessage(), is(ErrorMessages.destinationTypeNull()));
        }
    }

    @Test
    public void when_NullSetForSourceType_Then_ExceptionThrown(){
        try{
            TransformationIdentifier test = new SimpleTransformationIdentifier(null, SimpleClassB.class);
        }catch (NullPointerException nullPointerException){
            assertThat(nullPointerException.getMessage(), is(ErrorMessages.sourceTypeNull()));
        }
    }

    @Test
    public void when_getSourceType_Then_SimpleClassATypeReturned(){
        assertEquals(identifier.getSourceType(), SimpleClassA.class);
    }

    @Test
    public void when_getDestinationType_Then_SimpleClassBTypeReturned(){
        assertEquals(identifier.getDestinationType(), SimpleClassB.class);
    }

    @Test
    public void when_givenTheCorrectClassParameters_Then_equalityIdentified(){
        assertTrue(identifier.isSameAs(SimpleClassA.class, SimpleClassB.class));
    }
}
