package shop.shop.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.shop.common.api.ApiResponse;
import shop.shop.common.api.PagedResponse;
import shop.shop.product.dto.ProductSummaryResponse;
import shop.shop.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/active")
    public ResponseEntity<ApiResponse<PagedResponse<ProductSummaryResponse>>> getActiveProducts(
            @PageableDefault(size = 20, sort = "price", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        Page<ProductSummaryResponse> activeProducts = productService.getActiveProducts(pageable);
        PagedResponse<ProductSummaryResponse> pagedResponse = PagedResponse.from(activeProducts);
        return ResponseEntity.status(200).body(ApiResponse.success("Active products fetched", pagedResponse));
    }
}
