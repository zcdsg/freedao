package test.java.failure.core.method.style.named;

import com.github.afezeria.freedao.annotation.Dao;
import test.Person;

import java.util.List;

/**
 * @author afezeria
 */
@Dao(crudEntity = Person.class)
public interface ParameterTypeMismatchBadDao {
    List<Person> queryByIdAndName(Long id, Long name);
}
