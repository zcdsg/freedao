package test.java.success.core;

import com.github.afezeria.freedao.annotation.Dao;
import test.Person;

@Dao(crudEntity = Person.class)
public interface SubDao extends BaseDao<Person> {

}