package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Example(String subject) {
	super();
	this.subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

@PostConstruct
public void start() {
	System.out.println("starting");
}

@PreDestroy
public void end() {
	System.out.println("ending");
	
}


}
