package product.api.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "alias", nullable = false, length = 100, unique = true)
    private String alias;

    @OneToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    public Category(long id) {
        this.id = id;
    }
}