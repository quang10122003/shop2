package shop.shop.product.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import shop.shop.product.dto.ProductSummaryResponse;
import shop.shop.product.entity.ProductStatus;
import shop.shop.product.mapper.ProductMapper;
import shop.shop.product.repository.ProductRepository;
import shop.shop.product.service.ProductService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Page<ProductSummaryResponse> getActiveProducts(Pageable pageable) {
        return productRepository.findByStatus(ProductStatus.ACTIVE, pageable)
                .map(productMapper::toSummary);
    }
}
