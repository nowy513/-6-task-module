//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//
//    @Autowired
//    private ProductDao productDao;
//
//    @Autowired
//    private ItemDao itemDao;
//
//    @Test
//    void testInvoiceDaoSave() {
////        Given
//        Item item = new Item(new BigDecimal(10), 5, new BigDecimal(10));
//        Invoice invoice = new Invoice("2354");
//        Product product = new Product("Car");
//
//        item.setProduct(product);
//        item.setInvoice(invoice);
//
//        product.getItems().add(item);
//        invoice.getItems().add(item);
//
////        When
//        invoiceDao.save(invoice);
//        int invoiceId = invoice.getId();
//        productDao.save(product);
//        int productId = product.getId();
//        itemDao.save(item);
//        int itemId = item.getId();
//
////        Then
//
//        assertNotEquals(0, invoiceId);
//        assertNotEquals(0, productId);
//        assertNotEquals(0, itemId);
//
////        CleanUp
//        try {
//            invoiceDao.deleteById(invoiceId);
//            productDao.deleteById(productId);
//            itemDao.deleteById(itemId);
//        } catch (Exception e) {
////            do nothing
//        }
//
//
//    }
//}