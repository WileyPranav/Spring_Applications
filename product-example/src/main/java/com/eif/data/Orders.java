package com.eif.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Order_Table")
@Data
public class Orders {

	@Id
	int order_no;
	int amount;
	String Date;
	
}
