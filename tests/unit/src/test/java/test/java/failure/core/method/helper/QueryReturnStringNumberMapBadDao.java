package test.java.failure.core.method.helper;

import com.github.afezeria.freedao.annotation.Dao;
import test.Person;

import java.util.Map;

/**
 * @author afezeria
 */
@Dao(crudEntity = Person.class)
public interface QueryReturnStringNumberMapBadDao {
    Map<String, Number> all();
}
