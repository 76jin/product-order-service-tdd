package kr.ranian.productorderservice.product;

import org.springframework.util.Assert;

class Product {
    private final String productName;
    private final int price;
    private final DiscountPolicy discountPolicy;
    private Long id;

    public Product(String productName, int price, DiscountPolicy discountPolicy) {
        Assert.hasText(productName, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.");
        Assert.notNull(discountPolicy, "할인 정책인 필수입니다.");
        this.productName = productName;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }

    public void assignId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
