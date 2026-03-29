package shop.shop.product.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import shop.shop.product.dto.ProductSummaryResponse;

public interface ProductService {
    Page<ProductSummaryResponse> getActiveProducts(Pageable pageable);
}
