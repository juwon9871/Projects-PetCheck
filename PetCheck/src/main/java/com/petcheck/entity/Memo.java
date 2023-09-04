package com.petcheck.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
	private String diary_key;
	private String title;
	private String content;
	private String img_file;
	private String username;
	private Date insertDate;

}
