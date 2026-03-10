package entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pharmacy_chain")
@NoArgsConstructor
@Getter
@Setter
public class PharmacyChainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "sequence", allocationSize = 1)
    private Long id;

    @Column(name = "juridical_address")
    private String juridicialAddress;

    @Column(name = "locale", nullable = false, columnDefinition = "boolean default false")
    private Boolean name;

    @Column(name = "short_name", nullable = false, length = 32)
    private String shortName;

    @Column(name = "juridical_name", nullable = false, length = 64)
    private String juridicialName;

    @Column(name = "juridical_form", nullable = false, length = 8)
    private String juridicialForm;

    @OneToMany(mappedBy = "pharmacyChain", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PharmacyEntity> pharmacies = new ArrayList<>();

}
