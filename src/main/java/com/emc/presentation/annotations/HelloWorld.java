package com.emc.presentation.annotations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="helloWorldConst")
@Scope("singleton")


public class HelloWorld {

	private String hello;
	private UUID uuid;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}

	public HelloWorld() {

	}

	@Autowired
	public HelloWorld(@Value("Hello World from Constructor")String hello) {
		uuid = UUID.randomUUID();
		this.hello = hello;
	}

}
