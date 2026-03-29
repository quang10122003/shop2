package shop.shop.product.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import shop.shop.product.dto.ProductSummaryResponse;
import shop.shop.product.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductSummaryResponse toSummary(Product product);
}
