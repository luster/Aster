package com.Aster.Database;

import com.Aster.Model.Cart;
import com.Aster.Model.Customer;
import com.Aster.Model.Order;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDBMySql implements CustomerDB {

  public CustomerDBMySql() {
  }

  @Override
  public boolean addCustomer(final Customer customer) throws Exception {
    return false;
  }

  @Override
  public Customer getCustomer(final String email) throws Exception {
    return null;
  }

  @Override
  public boolean deleteCustomer(final String email) throws Exception {
    return false;
  }

  @Override
  public boolean isValid(final String email) {
    return false;
  }

  @Override
  public boolean addCart(final String email, final Order order) {
    return false;
  }

  @Override
  public boolean removeCart(final String email, final String orderID) throws Exception {
    return false;
  }

  @Override
  public boolean emptyCart(final String email) throws Exception {
    return false;
  }

  @Override
  public Cart viewCart(final String email) {
    return null;
  }

  @Override
  public boolean isInCart(final String email, final Order order) throws Exception {
    return false;
  }

  @Override
  public boolean updateCart(final String email, final Order order) throws Exception {
    return false;
  }

  @Override
  public int getQuantity(final String email, final Order order) throws Exception {
    return 0;
  }

  @Override
  public List<Order> viewHistory(final String email) {
    return null;
  }

  @Override
  public List<Order> updateHistory(final String email) {
    return null;
  }

  @Override
  public int addOrder(final Order order) {
    return 0;
  }

  @Override
  public int cancelOrder(final Order order) {
    return 0;
  }
}
