package com.chandracrud.CRUD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="crud_chandra")
@Data
public class User {
	
    @Id
    private int id;
    private String username;
	private String email;
	private String password;
	 

    
    

}
