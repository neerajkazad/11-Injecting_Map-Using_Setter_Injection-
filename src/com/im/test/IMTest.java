package com.im.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.im.beans.College;

public class IMTest {
	public static void main(String[] args) {
		College college = new College();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/im/common/application-context.xml"));
		college = factory.getBean("college",College.class);
		System.out.println(college);
	}
}
