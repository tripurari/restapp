package com.company.restapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Owner {
	private String login;
	private Integer id;
	private String url;
}
