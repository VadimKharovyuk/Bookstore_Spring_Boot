package com.bookStore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBooks")
@Getter
@Setter
@NoArgsConstructor
public class MyBookList {
	
	@Id
	private int id;
	private String name;
	private String author;
	private String price;

	public MyBookList(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

}
