package controller;

import java.sql.SQLException;
import java.util.List;
import model.Example;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController,IOrderPerformer {

    /** The view. */
    private IView  view;

    /** The model. */
    private IModel model;
    /** The stack order. */
    private UserOrder stackOrder;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
    	System.out.println(this.getModel().getExampleById(3).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("X").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        System.out.println(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public final void play() {
    	 while (this.getModel().getElement().isAlive()) {
             Thread.sleep(speed);
             switch (this.getStackOrder()) {
                 case RIGHT:
                     this.getModel().getElement().moveRight();
                     break;
                 case LEFT:
                     this.getModel().getElement().moveLeft();
                     break;
                 case NOP:
                 default:
                     this.getModel().getElement().doNothing();
                     break;
             }
             this.clearStackOrder();
             if (this.getModel().getElement().isAlive()) {
                 this.getModel().getElement().moveDown();
             }
         }
         this.getView().displayMessage("CRASH !!!!!!!!!.");
    	
    }
    public final void orderPerform(final UserOrder userOrder) {
        this.setStackOrder(userOrder);
    }
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

	public void setView(IView view) {
		this.view = view;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	public UserOrder getStackOrder() {
		return stackOrder;
	}

	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	 /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NOP;
    }

}
