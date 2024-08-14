package com.apptware.interview.jpa.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
}
