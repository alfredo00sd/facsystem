package com.integra.opensource.practica6.repositories;

import com.integra.opensource.practica6.models.Bill;
import com.integra.opensource.practica6.models.BillDetails;
import com.integra.opensource.practica6.models.Employee;
import com.integra.opensource.practica6.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class BillRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    static class BillRowMapper implements RowMapper<Bill> {
        @Override
        public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setIdEmployee(rs.getInt("idEmployee"));
            bill.setCreationDate(rs.getString("fecha_creacion"));
            bill.setTotal(rs.getInt("total"));
            return bill;
        }
    }

    static class BillDetailsRowMapper implements RowMapper<BillDetails> {
        @Override
        public BillDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
            BillDetails details = new BillDetails();
            details.setId(rs.getInt("id"));
            details.setIdBill(rs.getInt("idFactura"));
            details.setIdProduct(rs.getInt("idProducto"));
            details.setQuantity(rs.getInt("cantidad"));
            details.setPrice(rs.getInt("precio"));
            return details;
        }
    }

    static class ProductsRowMapper implements RowMapper<Products> {
        @Override
        public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
            Products products = new Products();
            products.setId(rs.getInt("id"));
            products.setTitle(rs.getString("titulo"));
            products.setDescription(rs.getString("descripcion"));
            products.setQuantity(rs.getInt("cantidad"));
            products.setCost(rs.getInt("costo"));
            products.setCreationDate(rs.getString("fecha_creacion"));
            return products;
        }
    }

    public List<BillDetails> findAll() {
        return jdbcTemplate.query("select * from detallefac", new BillDetailsRowMapper());
    }

    public List<BillDetails> findByFacId(int id) {
        return jdbcTemplate.query("select * from detallefac where idFactura = " + id,
                new BillDetailsRowMapper());
    }

    public List<Products> getInventory(){
        return jdbcTemplate.query("select * from inventario", new ProductsRowMapper());
    }

//    public int deleteById(long id) {
//        return jdbcTemplate.update("delete from detallefac where id=?", new Object[] {
//                id
//        });
//    }

    public int insert(BillDetails billDetails) {
        return jdbcTemplate.update("insert into detallefac (id, idFactura, idProducto, cantidad, precio) "+
                                       "values(NULL, ?, ?, ?, ?)",
                new Object[] { billDetails.getIdBill(), billDetails.getIdProduct(), billDetails.getQuantity(),
                        billDetails.getPrice() });
    }
//
//    public int update(BillDetails billDetails) {
//        return jdbcTemplate.update("update employees " + " set first_name = ?, last_name = ?, email_address = ? " + " where id = ?",
//                new Object[] {
//                        employee.getFirstName(), employee.getLastName(), employee.getEmailId(), employee.getId()
//                });
    //}

}
