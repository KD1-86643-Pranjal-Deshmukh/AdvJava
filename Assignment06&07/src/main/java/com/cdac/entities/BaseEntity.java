package com.cdac.entities;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.*;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {
	long id;
	private LocalDate createOn;
	private LocalDate updateOn;

}
