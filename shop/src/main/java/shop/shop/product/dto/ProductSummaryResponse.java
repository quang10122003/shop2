package shop.shop.product.dto;

import shop.shop.product.entity.ProductStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductSummaryResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stock,
        ProductStatus status,
        Long categoryId,
        String thumbnail,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
