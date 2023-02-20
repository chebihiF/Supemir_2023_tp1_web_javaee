package entities;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "produit")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code ;
    @Column(length = 20)
    private String label ;
    private double price ;
    private int quantity ;
}
