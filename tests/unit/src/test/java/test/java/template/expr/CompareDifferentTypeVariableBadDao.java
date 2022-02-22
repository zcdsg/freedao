package test.java.template.expr;

import com.github.afezeria.freedao.annotation.Dao;
import com.github.afezeria.freedao.annotation.XmlTemplate;
import test.Person;

import java.util.List;

/**
 * @author afezeria
 */
@Dao
public interface CompareDifferentTypeVariableBadDao {
    @XmlTemplate("""
            <select>
            select * from person where
            id = <if test='a > b'>1</if>
            </select>
            """)
    List<Person> query(int a,String b);

}
