package test.java.style.named.prefix;

import com.github.afezeria.freedao.annotation.Column;
import com.github.afezeria.freedao.annotation.Table;
import com.github.afezeria.freedao.runtime.classic.AutoFill;
import lombok.Data;

import java.time.LocalDateTime;

/**
 *
 */
@Table(
        name = "person",
        primaryKeys = "id"
)
@Data
public class PrefixTestEntity {
    @Column(insert = false)
    @AutoFill
    private Long id;
    private String name;

    private LocalDateTime createDate;

}