package com.company.restapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Item {
	private Integer id;
	private String name;
	private String full_name;
	private Owner owner;
}
