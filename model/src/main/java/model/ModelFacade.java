package model;

import java.sql.SQLException;
import java.util.List;

import javax.lang.model.element.Element;

import model.dao.ExampleDAO;

/**8
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

public final class ModelFacade implements IModel{
	
private int height ;
private int widht ;
public Element[][] onTheMap;

public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWidht() {
	return widht;
}
public void setWidht(int widht) {
	this.widht = widht;
}
public Element getOnTheMap(int x,int y) {
	return onTheMap[x][y];
}
public void setOnTheMap(Element element, int x, int y) {
	this.onTheMap[x][y] = element;
}
public ModelFacade() {
    super();
}

/*
 * (non-Javadoc)
 * @see model.IModel#getExampleById(int)
 */
@Override
public Example getExampleById(final int id) throws SQLException {
    return ExampleDAO.getExampleById(id);
}

/*
 * (non-Javadoc)
 * @see model.IModel#getExampleByName(java.lang.String)
 */
@Override
public Example getExampleByName(final String name) throws SQLException {
    return ExampleDAO.getExampleByName(name);
}

/*
 * (non-Javadoc)
 * @see model.IModel#getAllExamples()
 */
@Override
public List<Example> getAllExamples() throws SQLException {
    return ExampleDAO.getAllExamples();
}
}
