package com.ravi.user.service.response;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

	String id;
	
	String userId;
	
	String hotelId;
	
	Integer rate;
	
	String remark;
}
