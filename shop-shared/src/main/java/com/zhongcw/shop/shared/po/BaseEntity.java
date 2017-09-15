package com.zhongcw.shop.shared.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public  class BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String id; //
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_time; //
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_update_time; //

	public BaseEntity()
	{
		this.id = UUID.randomUUID().toString();
		this.last_update_time =  new Date();
	}
	
}