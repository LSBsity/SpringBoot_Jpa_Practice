package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private Address address;

    @Enumerated(EnumType.STRING) // NO ORDINAL
    private DeliveryStatus status; // READY, COMP
}
