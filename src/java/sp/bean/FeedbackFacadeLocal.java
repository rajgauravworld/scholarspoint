/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.bean;

import java.util.List;
import javax.ejb.Local;
import sp.model.Feedback;

/**
 *
 * @author rajgaurav
 */
@Local
public interface FeedbackFacadeLocal {

  void create(Feedback feedback);

  void edit(Feedback feedback);

  void remove(Feedback feedback);

  Feedback find(Object id);

  List<Feedback> findAll();

  List<Feedback> findRange(int[] range);

  int count();
  
}
