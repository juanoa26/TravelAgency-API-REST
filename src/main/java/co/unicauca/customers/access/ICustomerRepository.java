package co.unicauca.customers.access;

import co.unicauca.customers.domain.entity.Customer;

/**
 * Interface 
 * @author juanoa
 */
public interface ICustomerRepository {
    /**
     * Busca un Customer por su ceduka
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
    
    Customer findById(int id);
    boolean create(Customer newProduct);

}
