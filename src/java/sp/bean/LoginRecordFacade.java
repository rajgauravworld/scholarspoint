/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.model.LoginRecord;

/**
 *
 * @author rajgaurav
 */
@Stateless
public class LoginRecordFacade extends AbstractFacade<LoginRecord> implements LoginRecordFacadeLocal {
  @PersistenceContext(unitName = "ScholarsPointPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public LoginRecordFacade() {
    super(LoginRecord.class);
  }
  
}
