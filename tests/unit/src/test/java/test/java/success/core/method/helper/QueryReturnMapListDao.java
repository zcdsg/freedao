package test.java.success.core.method.helper;

import com.github.afezeria.freedao.annotation.Dao;
import com.github.afezeria.freedao.annotation.XmlTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author afezeria
 */
@Dao
public interface QueryReturnMapListDao {
    @XmlTemplate("""
            <select>
            select * from person
            </select>
            """)
    List<Map<String, Object>> query();

}
