hangen.java
===========

When writing a bigger application the need to transform/map/copy one class into another arises. This is usually followed by the same tedious boilerplate code that copies values from a **source** class to a **destination** type.

I hate to write the same code over and over again and to test and maintain it is no easy chore either. And before I have thousands of methods like:

    public Destination from(Source source){
        if(source == null){
            throw new NullPointerException("source can not be null");
        }
        Destination result = new Destination();

        result.setMember1(source.getMember1());
        result.setMember2(source.getMember2());
        result.setMember3(source.getMember3());
        //...
       
        return result;
    }

An on top of that writing this code is tedious and mind numbing.

To provide a *simple* alternative I give you **hangen.java**. 

After configuring the transformation rules a simple API call with copy all your data.

    TransformationProvider transformer = new HangenReflectiveTransformationProvider();
    // code where you get the source
    Destination destination = transformer.from(source);
    // destination is fully initialized and ready to use

This is the simplest sample. More complex scenarios are possible.