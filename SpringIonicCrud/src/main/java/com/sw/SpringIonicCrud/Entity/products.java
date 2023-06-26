package com.sw.SpringIonicCrud.Entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class products {
	@Id
	private Integer productid;
	private String productname;
	private BigDecimal productprice;
	private String quantity;
	private String images;
}
