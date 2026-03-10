package entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "pharmacy")
@NoArgsConstructor
@Getter
@Setter

public class PharmacyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "sequence", allocationSize = 1)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "inn", nullable = false)
    private Integer inn;

    @Column(name = "category", nullable = false, length = 5)
    private String category;

    @Column(name = "juridicial_form", nullable = false, length = 8)
    private String juridicialForm;

    @Column(name = "staff_count")
    private Integer staffCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacy_chain_id")
    private PharmacyChainEntity pharmacyChainEntity;

}
