package com.zhongcw.shop.shared.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
@Entity
@Table(name = "t_commodity")
public class Commodity extends BaseEntity
{
	@Id
	private String commodity_code; //
	private String commodity_name; //
	private String commodity_price; //
	private String shop_code; //
}
