package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Component;

@Component
class OnDemandA extends BaseOnDemand {

	OnDemandA(String someString) {
		super(someString);
	}

	@Override
	public SomeEnum getSomeEnum() {
		return SomeEnum.SOME_ENUM_A;
	}

	@Override
	public String getSomeString() {
		// TODO Auto-generated method stub
		return "Hello World!!!";
	}
}
