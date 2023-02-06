package com.ravi.hotel.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "hotel")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Hotel implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	String id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "location")
	String location;
	
	@Column(name = "about")
	String about;
}
