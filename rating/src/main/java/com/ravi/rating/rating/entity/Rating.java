package com.ravi.rating.rating.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table(name = "rating")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	String id;

	String userId;

	String hotelId;

	Integer rate;

	String remark;
}
