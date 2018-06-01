package model;

import java.sql.SQLException;
import java.util.List;

import javax.lang.model.element.Element;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {
	 /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleById(int id) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
List<Example> getAllExamples() throws SQLException;
   
public int getHeight() ;
public void setHeight(int height);
public int getWidht();
public void setWidht(int widht);
public Element getOnTheMap(int x,int y);
public void setOnTheMap(Element element, int x, int y);
public Element getElement();
}
