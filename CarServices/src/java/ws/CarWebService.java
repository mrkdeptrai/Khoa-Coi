/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import da.bookingDA;
import da.brandDA;
import da.customerDA;
import da.mechanicDA;
import da.partDA;
import da.requirementServiceDA;
import da.supplierDA;
import dbo.bookingServiceDBO;
import dbo.brandDBO;
import dbo.customerDBO;
import dbo.mechanicDBO;
import dbo.partDBO;
import dbo.requirementServiceDBO;
import dbo.supplierDBO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mrkho
 */
@WebService(serviceName = "CarWebService")
public class CarWebService {
    
    private bookingDA booking;
    private brandDA brand;
    private customerDA customer;
    private mechanicDA mechanic;
    private partDA part;
    private requirementServiceDA requirement;
    private supplierDA supplier;

    @WebMethod(operationName = "getAllBooking")
    public ArrayList<bookingServiceDBO> getAllBooking() {
        try {
            booking = new bookingDA();
            ArrayList<bookingServiceDBO> list = booking.getAllBooking();
            booking.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getBookingByID")
    public ArrayList<bookingServiceDBO> getBookingByID(@WebParam(name = "bookingID") String bookingID) {
        try {
            booking = new bookingDA();
            ArrayList<bookingServiceDBO> bookingSearchID = booking.getBookingByID(bookingID);
            booking.closeConnection();
            return bookingSearchID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "insertBooking")
    public String insertBooking(@WebParam(name = "bookingID") String bookingID,
                                 @WebParam(name = "customerID")String customerID,
                                 @WebParam(name = "mechanicID")String mechanicID,
                                 @WebParam(name = "carStatus")String carStatus,
                                 @WebParam(name = "datetimeOfService")String datetimeOfService,
                                 @WebParam(name = "paymentReceived")String paymentReceived,
                                 @WebParam(name = "descriptionAboutBooking")String descriptionAboutBooking,
                                 @WebParam(name = "status")String status){
        try {
            booking = new bookingDA();
            String result = booking.insertBooking(bookingID, customerID, mechanicID, carStatus, datetimeOfService, paymentReceived, descriptionAboutBooking, status);
            booking.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateBooking")
    public String updateBooking(@WebParam(name = "bookingID") String bookingID,
                                 @WebParam(name = "carStatus") String carStatus,
                                 @WebParam(name = "datetimeOfService") String datetimeOfService,
                                 @WebParam(name = "paymentReceived") String paymentReceived,
                                 @WebParam(name = "descriptionAboutBooking") String descriptionAboutBooking,
                                 @WebParam(name = "status")String status){
        try {
            booking = new bookingDA();
            String result = booking.updateBooking(bookingID, carStatus, datetimeOfService, paymentReceived, descriptionAboutBooking, status);
            booking.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    @WebMethod(operationName = "deleteBooking")
    public String deleteCategory(@WebParam(name = "bookingID") String bookingID){
        try {
            booking = new bookingDA();
            String result = booking.deleteBooking(bookingID);
            booking.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllBrand")
    public ArrayList<brandDBO> getAllBrand() {
        try {
            brand = new brandDA();
            ArrayList<brandDBO> list = brand.getAllBrand();
            brand.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getBrandByID")
    public ArrayList<brandDBO> getBrandByID(@WebParam(name = "brandID") String brandID) {
        try {
            brand = new brandDA();
            ArrayList<brandDBO> searchBrandID = brand.getBrandByID(brandID);
            brand.closeConnection();
            return searchBrandID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getBrandByName")
    public ArrayList<brandDBO> getBrandByName(@WebParam(name = "brandName") String brandName) {
        try {
            brand = new brandDA();
            ArrayList<brandDBO> searchBrandName = brand.getBrandByName(brandName);
            brand.closeConnection();
            return searchBrandName;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "insertBrand")
    public String insertBrand(@WebParam(name = "brandID") String brandID,
                               @WebParam(name = "brandName") String brandName,
                               @WebParam(name = "brandDescription") String brandDescription){
        try {
            brand = new brandDA();
            String result = brand.insertBrand(brandID, brandName, brandDescription);
            brand.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateBrand")
    public String updateBrand(@WebParam(name = "brandID") String brandID,
                               @WebParam(name = "brandName") String brandName,
                               @WebParam(name = "brandDescription") String brandDescription){
        try {
            brand = new brandDA();
            String result = brand.updateBrand(brandID, brandName, brandDescription);
            brand.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    @WebMethod(operationName = "deleteBrand")
    public String deleteSource(@WebParam(name = "brandID") String brandID){
        try {
            brand = new brandDA();
            String result = brand.deleteBrand(brandID);
            brand.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllCustomer")
    public ArrayList<customerDBO> getAllCustomer() {
        try {
            customer = new customerDA();
            ArrayList<customerDBO> list = customer.getAllCustomer();
            customer.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getCustomerByID")
    public ArrayList<customerDBO> getCustomerByID(@WebParam(name = "customerID") String customerID) {
        try {
            customer = new customerDA();
            ArrayList<customerDBO> searchCustomerID = customer.getCustomerByID(customerID);
            customer.closeConnection();
            return searchCustomerID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getCustomerByName")
    public ArrayList<customerDBO> getCustomerByName(@WebParam(name = "customerName") String customerName) {
        try {
            customer = new customerDA();
            ArrayList<customerDBO> searchCustomerName = customer.getCustomerByName(customerName);
            customer.closeConnection();
            return searchCustomerName;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "insertCustomer")
    public String insertCustomer(@WebParam(name = "customerID") String customerID,
                               @WebParam(name = "customerName") String customerName,
                               @WebParam(name = "customerGender") String customerGender,
                               @WebParam(name = "customerPhone") String customerPhone,
                               @WebParam(name = "customerAddress") String customerAddress,
                               @WebParam(name = "customerCarModel") String customerCarModel,
                               @WebParam(name = "carLicenseNumber") String carLicenseNumber){
        try {
            customer = new customerDA();
            String result = customer.insertCustomer(customerID, customerName, customerGender, customerPhone, customerAddress, customerCarModel, carLicenseNumber);
            customer.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateCustomer")
    public String updateCustomer(@WebParam(name = "customerID") String customerID,
                               @WebParam(name = "customerName") String customerName,
                               @WebParam(name = "customerGender") String customerGender,
                               @WebParam(name = "customerPhone") String customerPhone,
                               @WebParam(name = "customerAddress") String customerAddress,
                               @WebParam(name = "customerCarModel") String customerCarModel,
                               @WebParam(name = "carLicenseNumber") String carLicenseNumber){
        try {
            customer = new customerDA();
            String result = customer.updateCustomer(customerID, customerName, customerGender, customerPhone, customerAddress, customerCarModel, carLicenseNumber);
            customer.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "deleteCustomer")
    public String deleteCustomer(@WebParam(name = "customerID") String customerID){
        try {
            customer = new customerDA();
            String result = customer.deleteCustomer(customerID);
            customer.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllMechanic")
    public ArrayList<mechanicDBO> getAllMechanic() {
        try {
            mechanic = new mechanicDA();
            ArrayList<mechanicDBO> list = mechanic.getAllMechanic();
            mechanic.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getMechanicByID")
    public ArrayList<mechanicDBO> getMechanicByID(@WebParam(name = "mechanicID") String mechanicID) {
        try {
            mechanic = new mechanicDA();
            ArrayList<mechanicDBO> searchMechanicID = mechanic.getMechanicByID(mechanicID);
            mechanic.closeConnection();
            return searchMechanicID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getMechanicByName")
    public ArrayList<mechanicDBO> getMechanicByName(@WebParam(name = "mechanicName") String mechanicName) {
        try {
            mechanic = new mechanicDA();
            ArrayList<mechanicDBO> searchMechanicName = mechanic.getMechanicByName(mechanicName);
            mechanic.closeConnection();
            return searchMechanicName;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "insertMechanic")
    public String insertMechanic(@WebParam(name = "mechanicID") String mechanicID,
                               @WebParam(name = "mechanicName") String mechanicName,
                               @WebParam(name = "mechanicPhone") String mechanicPhone,
                               @WebParam(name = "mechanicAddress") String mechanicAddress){
        try {
            mechanic = new mechanicDA();
            String result = mechanic.insertMechanic(mechanicID, mechanicName, mechanicPhone, mechanicAddress);
            mechanic.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateMechanic")
    public String updateMechanic(@WebParam(name = "mechanicID") String mechanicID,
                               @WebParam(name = "mechanicName") String mechanicName,
                               @WebParam(name = "mechanicPhone") String mechanicPhone,
                               @WebParam(name = "mechanicAddress") String mechanicAddress){
        try {
            mechanic = new mechanicDA();
            String result = mechanic.updateMechanic(mechanicID, mechanicName, mechanicPhone, mechanicAddress);
            mechanic.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "deleteMechanic")
    public String deleteMechanic(@WebParam(name = "mechanicID") String mechanicID){
        try {
            mechanic = new mechanicDA();
            String result = mechanic.deleteMechanic(mechanicID);
            mechanic.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllPart")
    public ArrayList<partDBO> getAllPart() {
        try {
            part = new partDA();
            ArrayList<partDBO> list = part.getAllPart();
            part.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getPartByID")
    public ArrayList<partDBO> getPartByID(@WebParam(name = "partID") String partID) {
        try {
            part = new partDA();
            ArrayList<partDBO> searchPartID = part.getPartByID(partID);
            part.closeConnection();
            return searchPartID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "insertPart")
    public String insertPart(@WebParam(name = "partID") String partID,
                               @WebParam(name = "partName") String partName,
                               @WebParam(name = "partModel") String partModel,
                               @WebParam(name = "price") String price,
                               @WebParam(name = "supplierID") String supplierID,
                               @WebParam(name = "brandID") String brandID){
        try {
            part = new partDA();
            String result = part.insertPart(partID, partName, partModel, price, supplierID, brandID);
            part.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updatePart")
    public String updatePart(@WebParam(name = "partID") String partID,
                               @WebParam(name = "partName") String partName,
                               @WebParam(name = "partModel") String partModel,
                               @WebParam(name = "price") String price){
        try {
            part = new partDA();
            String result = part.updatePart(partID, partName, partModel, price);
            part.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "deletePart")
    public String deletePart(@WebParam(name = "partID") String partID){
        try {
            part = new partDA();
            String result = part.deletePart(partID);
            part.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllRequirement")
    public ArrayList<requirementServiceDBO> getAllRequirement() {
        try {
            requirement = new requirementServiceDA();
            ArrayList<requirementServiceDBO> list = requirement.getAllRequirement();
            requirement.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getRequirementByID")
    public ArrayList<requirementServiceDBO> getRequirementByID(@WebParam(name = "requirementID") String requirementID) {
        try {
            requirement = new requirementServiceDA();
            ArrayList<requirementServiceDBO> searchRequirementID = requirement.getRequirementByID(requirementID);
            requirement.closeConnection();
            return searchRequirementID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "insertRequirement")
    public String insertRequirement(@WebParam(name = "requirementID") String requirementID,
                               @WebParam(name = "partID") String partID,
                               @WebParam(name = "customerID") String customerID,
                               @WebParam(name = "requirementDescription") String requirementDescription,
                               @WebParam(name = "dateRequirement") String dateRequirement){
        try {
            requirement = new requirementServiceDA();
            String result = requirement.insertRequirement(requirementID, partID, customerID, requirementDescription, dateRequirement);
            requirement.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateRequirement")
    public String updateRequirement(@WebParam(name = "requirementID") String requirementID,
                               @WebParam(name = "requirementDescription") String requirementDescription,
                               @WebParam(name = "dateRequirement") String dateRequirement){
        try {
            requirement = new requirementServiceDA();
            String result = requirement.updateRequirement(requirementID, requirementDescription, dateRequirement);
            requirement.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "deleteRequirement")
    public String deleteRequirement(@WebParam(name = "requirementID") String requirementID){
        try {
            requirement = new requirementServiceDA();
            String result = requirement.deleteRequirement(requirementID);
            requirement.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getAllSupplier")
    public ArrayList<supplierDBO> getAllSupplier() {
        try {
            supplier = new supplierDA();
            ArrayList<supplierDBO> list = supplier.getAllSupplier();
            supplier.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @WebMethod(operationName = "getSupplierByID")
    public ArrayList<supplierDBO> getSupplierByID(@WebParam(name = "supplierID") String supplierID) {
        try {
            supplier = new supplierDA();
            ArrayList<supplierDBO> searchSupplierID = supplier.getSupplierByID(supplierID);
            supplier.closeConnection();
            return searchSupplierID;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getSupplierByName")
    public ArrayList<supplierDBO> getSupplierByName(@WebParam(name = "supplierName") String supplierName) {
        try {
            supplier = new supplierDA();
            ArrayList<supplierDBO> searchSupplierName = supplier.getSupplierByName(supplierName);
            supplier.closeConnection();
            return searchSupplierName;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "insertSupplier")
    public String insertSupplier(@WebParam(name = "supplierID") String supplierID,
                               @WebParam(name = "supplierName") String supplierName,
                               @WebParam(name = "supplierAddress") String supplierAddress,
                               @WebParam(name = "supplierPhone") String supplierPhone){
        try {
            supplier = new supplierDA();
            String result = supplier.insertSupplier(supplierID, supplierName, supplierAddress, supplierPhone);
            supplier.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "updateSupplier")
    public String updateSupplier(@WebParam(name = "supplierID") String supplierID,
                               @WebParam(name = "supplierName") String supplierName,
                               @WebParam(name = "supplierAddress") String supplierAddress,
                               @WebParam(name = "supplierPhone") String supplierPhone){
        try {
            supplier = new supplierDA();
            String result = supplier.updateSupplier(supplierID, supplierName, supplierAddress, supplierPhone);
            supplier.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "deleteSupplier")
    public String deleteSupplier(@WebParam(name = "supplierID") String supplierID){
        try {
            supplier = new supplierDA();
            String result = supplier.deleteSupplier(supplierID);
            supplier.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @WebMethod(operationName = "getTotalBooking")
    public int getTotalBooking(@WebParam(name = "fromDate") String datetime1,
                                  @WebParam(name = "toDate") String datetime2){
        try {
            booking = new bookingDA();
            int result = booking.getTotalBooking(datetime1, datetime2);
            booking.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    @WebMethod(operationName = "getTotalBenefit")
    public int getTotalBenefit(@WebParam(name = "fromDate") String datetime1,
                                  @WebParam(name = "toDate") String datetime2){
        try {
            booking = new bookingDA();
            int result = booking.getTotalBenefit(datetime1, datetime2);
            booking.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    @WebMethod(operationName = "getTotalRequirement")
    public int getTotalRequirement(@WebParam(name = "fromDate") String datetime1,
                                  @WebParam(name = "toDate") String datetime2){
        try {
            requirement = new requirementServiceDA();
            int result = requirement.getTotalRequirement(datetime1, datetime2);
            requirement.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    @WebMethod(operationName = "getTotalPartSale")
    public int getTotalPartSale(@WebParam(name = "fromDate") String datetime1,
                                  @WebParam(name = "toDate") String datetime2){
        try {
            requirement = new requirementServiceDA();
            int result = requirement.getTotalPartSale(datetime1, datetime2);
            requirement.closeConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CarWebService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
