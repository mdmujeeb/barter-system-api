package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.ProductResponseBean;
import com.mujeeb.barter.entity.Product;

public class ProductBeanMapper {

	public static ProductResponseBean toResponseBean(Product bean) {
		return new ProductResponseBean(bean.getId(), bean.getName(), bean.getDescription(), bean.getCategoryId()
				, bean.getSubcategoryId(), bean.getImageUrl(), bean.getUnitId());
	}
}
