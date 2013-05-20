package data;

import com.fajfar.hangen.java.ClassTransformer;
import com.fajfar.hangen.java.TransformationIdentifier;
import com.fajfar.hangen.java.configuration.ManulTransformationConfiguration;

import java.util.Map;

public class TestTransformationConfiguration extends ManulTransformationConfiguration<SimpleClassA, SimpleClassB> {

    @Override
    protected void doTransformation(SimpleClassA simpleClassA, SimpleClassB simpleClassB, Map<TransformationIdentifier, ClassTransformer> transformations) {
        simpleClassA.setAnInt(simpleClassB.getIntMember());
        simpleClassA.setAnString(simpleClassB.getStringMember());
    }
}
