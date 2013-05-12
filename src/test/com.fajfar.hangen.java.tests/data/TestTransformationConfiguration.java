package data;

import com.fajfar.hangen.java.configuration.ManulTransformationConfiguration;

public class TestTransformationConfiguration extends ManulTransformationConfiguration<SimpleClassA, SimpleClassB> {

    protected void doTransformation(SimpleClassA simpleClassA, SimpleClassB simpleClassB) {
        simpleClassA.setAnInt(simpleClassB.getIntMember());
        simpleClassA.setAnString(simpleClassB.getStringMember());
    }
}
