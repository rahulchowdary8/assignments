package com.order.common;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "washer")
public class Washer {

	private int washerId;
	private String name;
	private String address;

	public int getWasherId() {
		return washerId;
	}

	public void setWasherId(int washerId) {
		this.washerId = washerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
