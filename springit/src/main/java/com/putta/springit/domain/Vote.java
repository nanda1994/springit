package com.putta.springit.domain;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@Data

public class Vote {
	@Id
	@GeneratedValue
	
	private Long id;
	private int vote;
	
    public Vote() {}




    
    
}
