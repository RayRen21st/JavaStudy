/*
 * $HeadURL:  $
 *
 * Copyright (c) 2007 Drutt Corporation, all rights reserved.
 *
 */
package com.rr.study.j2se.xml.jaxb.shool.marshall;

import java.io.File;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.rr.study.j2se.xml.jaxb.shool.bean.GradeType;
import com.rr.study.j2se.xml.jaxb.shool.bean.ObjectFactory;
import com.rr.study.j2se.xml.jaxb.shool.bean.SchoolType;
import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import com.sun.xml.internal.bind.marshaller.NioEscapeHandler;

/**
 * @author elihuwu
 * @version $Revision: $
 */
public class MarshallerQuickTest {

    /** Class revision */
    public static final String _REV_ID_ = "$Revision: $";

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        
        ObjectFactory factory = new ObjectFactory();
        SchoolType school = factory.createSchoolType();
        school.setName("aaaa\n\rbbbb");
        GradeType grade = factory.createGradeType();
        grade.setGradeNumber(1);
        school.setGrade(grade);
        
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(SchoolType.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(CharacterEscapeHandler.class.getName(), new NioEscapeHandler("utf8"));
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("src/main/resources/com/rr/study/j2se/xml/jaxb/school.xsd"));
        marshaller.setSchema(schema);
        marshaller.marshal(school, writer);
        System.out.println(writer.toString());
    }

}
