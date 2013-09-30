/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.bean;

import java.util.List;
import javax.ejb.Local;
import sp.model.LoginRecord;

/**
 *
 * @author rajgaurav
 */
@Local
public interface LoginRecordFacadeLocal {

  void create(LoginRecord loginRecord);

  void edit(LoginRecord loginRecord);

  void remove(LoginRecord loginRecord);

  LoginRecord find(Object id);

  List<LoginRecord> findAll();

  List<LoginRecord> findRange(int[] range);

  int count();
  
}
