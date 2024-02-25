package com.putta.springit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@Data
public class Comment {
	@Id
	@GeneratedValue
	
	private Long id;
	private String body;
	
	

	
}
