package test

import com.github.afezeria.freedao.annotation.Column
import com.github.afezeria.freedao.annotation.Table
import com.github.afezeria.freedao.runtime.classic.AutoFill

/**
 *
 * @author afezeria
 */
@Table(
    name = "person",
    primaryKeys = ["id"]
)
class OnePropertyEntity(
    @Column(insert = false)
    @AutoFill
    var id: Long? = null,
) {
}