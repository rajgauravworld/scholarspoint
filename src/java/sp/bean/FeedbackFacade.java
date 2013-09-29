/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.model.Feedback;

/**
 *
 * @author rajgaurav
 */
@Stateless
public class FeedbackFacade extends AbstractFacade<Feedback> implements FeedbackFacadeLocal {
  @PersistenceContext(unitName = "ScholarsPointPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public FeedbackFacade() {
    super(Feedback.class);
  }
  
}
