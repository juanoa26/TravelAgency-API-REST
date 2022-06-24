package co.unicauca.customers.access;

import co.unicauca.customers.domain.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Default;

/**
 * Implementación de ICustomerRepository. Utilliza arreglos en memoria
 *
 * @author juanoa
 */
@Default
public final class CustomerRepositoryImplArrays implements ICustomerRepository {

    /**
     * Array List de clientes
     */
    private static List<Customer> customers;

    public CustomerRepositoryImplArrays() {
        if (customers == null){
            customers = new ArrayList();
        }
        
        if (customers.size() == 0){
            inicializar();
        }
    }

    public void inicializar() {
        customers.add(new Customer(98000001, "Andrea", "Sanchez", "Calle 14 No 11-12 Popayan", "3145878752", "andrea@hotmail.com", "Femenino"));
        customers.add(new Customer(98000002, "Libardo", "Pantoja", "Santa Barbar Popayan", "3141257845", "libardo@gmail.com", "Masculino"));
        customers.add(new Customer(98000003, "Carlos", "Pantoja", "Santa Barbar Popayan", "3141257846", "carlos@gmail.com", "Masculino"));
        customers.add(new Customer(98000004, "Fernanda", "Arevalo", "Calle 16 No 12-12 Popayan", "3154562133", "fercha@hotmail.com", "Femenino"));
        customers.add(new Customer(98000005, "Manuel", "Perez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000006, "Alejandro", "Mosquera", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000007, "Cesar", "Gutierres Sanchez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000008, "Julio", "Bravo Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000009, "Alberto", "Mendez Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000010, "Alexander", "Ponce Yepes", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));

    }

    public Customer findById(int id) {
        for (Customer cust : customers) {
            if (cust.getId() == id) {
                return cust;
            }
        }
        return null;
    }
    
    @Override
    public boolean create(Customer newCustomer) {
        Customer cust = this.findById(newCustomer.getId());
        if (cust != null) {
            //Ya existe
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

}
