package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String productName;

	private String description;
	
	private int price;
	
	private String createdUser;
	
	private LocalDateTime createdTime;
	
	private String modifiedUser;
	
	private LocalDateTime modifiedTime;
	
	private int isDeleted;
	

}
