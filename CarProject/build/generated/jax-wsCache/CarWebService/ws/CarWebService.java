
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CarWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CarWebService {


    /**
     * 
     * @param brandName
     * @param brandDescription
     * @param brandID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertBrand", targetNamespace = "http://ws/", className = "ws.InsertBrand")
    @ResponseWrapper(localName = "insertBrandResponse", targetNamespace = "http://ws/", className = "ws.InsertBrandResponse")
    @Action(input = "http://ws/CarWebService/insertBrandRequest", output = "http://ws/CarWebService/insertBrandResponse")
    public String insertBrand(
        @WebParam(name = "brandID", targetNamespace = "")
        String brandID,
        @WebParam(name = "brandName", targetNamespace = "")
        String brandName,
        @WebParam(name = "brandDescription", targetNamespace = "")
        String brandDescription);

    /**
     * 
     * @param brandName
     * @return
     *     returns java.util.List<ws.BrandDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBrandByName", targetNamespace = "http://ws/", className = "ws.GetBrandByName")
    @ResponseWrapper(localName = "getBrandByNameResponse", targetNamespace = "http://ws/", className = "ws.GetBrandByNameResponse")
    @Action(input = "http://ws/CarWebService/getBrandByNameRequest", output = "http://ws/CarWebService/getBrandByNameResponse")
    public List<BrandDBO> getBrandByName(
        @WebParam(name = "brandName", targetNamespace = "")
        String brandName);

    /**
     * 
     * @param customerAddress
     * @param customerPhone
     * @param customerGender
     * @param customerID
     * @param carLicenseNumber
     * @param customerCarModel
     * @param customerName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertCustomer", targetNamespace = "http://ws/", className = "ws.InsertCustomer")
    @ResponseWrapper(localName = "insertCustomerResponse", targetNamespace = "http://ws/", className = "ws.InsertCustomerResponse")
    @Action(input = "http://ws/CarWebService/insertCustomerRequest", output = "http://ws/CarWebService/insertCustomerResponse")
    public String insertCustomer(
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID,
        @WebParam(name = "customerName", targetNamespace = "")
        String customerName,
        @WebParam(name = "customerGender", targetNamespace = "")
        String customerGender,
        @WebParam(name = "customerPhone", targetNamespace = "")
        String customerPhone,
        @WebParam(name = "customerAddress", targetNamespace = "")
        String customerAddress,
        @WebParam(name = "customerCarModel", targetNamespace = "")
        String customerCarModel,
        @WebParam(name = "carLicenseNumber", targetNamespace = "")
        String carLicenseNumber);

    /**
     * 
     * @param mechanicID
     * @return
     *     returns java.util.List<ws.MechanicDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMechanicByID", targetNamespace = "http://ws/", className = "ws.GetMechanicByID")
    @ResponseWrapper(localName = "getMechanicByIDResponse", targetNamespace = "http://ws/", className = "ws.GetMechanicByIDResponse")
    @Action(input = "http://ws/CarWebService/getMechanicByIDRequest", output = "http://ws/CarWebService/getMechanicByIDResponse")
    public List<MechanicDBO> getMechanicByID(
        @WebParam(name = "mechanicID", targetNamespace = "")
        String mechanicID);

    /**
     * 
     * @param customerAddress
     * @param customerPhone
     * @param customerGender
     * @param customerID
     * @param carLicenseNumber
     * @param customerCarModel
     * @param customerName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://ws/", className = "ws.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://ws/", className = "ws.UpdateCustomerResponse")
    @Action(input = "http://ws/CarWebService/updateCustomerRequest", output = "http://ws/CarWebService/updateCustomerResponse")
    public String updateCustomer(
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID,
        @WebParam(name = "customerName", targetNamespace = "")
        String customerName,
        @WebParam(name = "customerGender", targetNamespace = "")
        String customerGender,
        @WebParam(name = "customerPhone", targetNamespace = "")
        String customerPhone,
        @WebParam(name = "customerAddress", targetNamespace = "")
        String customerAddress,
        @WebParam(name = "customerCarModel", targetNamespace = "")
        String customerCarModel,
        @WebParam(name = "carLicenseNumber", targetNamespace = "")
        String carLicenseNumber);

    /**
     * 
     * @param customerID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://ws/", className = "ws.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://ws/", className = "ws.DeleteCustomerResponse")
    @Action(input = "http://ws/CarWebService/deleteCustomerRequest", output = "http://ws/CarWebService/deleteCustomerResponse")
    public String deleteCustomer(
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID);

    /**
     * 
     * @param brandName
     * @param brandDescription
     * @param brandID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBrand", targetNamespace = "http://ws/", className = "ws.UpdateBrand")
    @ResponseWrapper(localName = "updateBrandResponse", targetNamespace = "http://ws/", className = "ws.UpdateBrandResponse")
    @Action(input = "http://ws/CarWebService/updateBrandRequest", output = "http://ws/CarWebService/updateBrandResponse")
    public String updateBrand(
        @WebParam(name = "brandID", targetNamespace = "")
        String brandID,
        @WebParam(name = "brandName", targetNamespace = "")
        String brandName,
        @WebParam(name = "brandDescription", targetNamespace = "")
        String brandDescription);

    /**
     * 
     * @return
     *     returns java.util.List<ws.CustomerDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCustomer", targetNamespace = "http://ws/", className = "ws.GetAllCustomer")
    @ResponseWrapper(localName = "getAllCustomerResponse", targetNamespace = "http://ws/", className = "ws.GetAllCustomerResponse")
    @Action(input = "http://ws/CarWebService/getAllCustomerRequest", output = "http://ws/CarWebService/getAllCustomerResponse")
    public List<CustomerDBO> getAllCustomer();

    /**
     * 
     * @param customerID
     * @return
     *     returns java.util.List<ws.CustomerDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerByID", targetNamespace = "http://ws/", className = "ws.GetCustomerByID")
    @ResponseWrapper(localName = "getCustomerByIDResponse", targetNamespace = "http://ws/", className = "ws.GetCustomerByIDResponse")
    @Action(input = "http://ws/CarWebService/getCustomerByIDRequest", output = "http://ws/CarWebService/getCustomerByIDResponse")
    public List<CustomerDBO> getCustomerByID(
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID);

    /**
     * 
     * @return
     *     returns java.util.List<ws.MechanicDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMechanic", targetNamespace = "http://ws/", className = "ws.GetAllMechanic")
    @ResponseWrapper(localName = "getAllMechanicResponse", targetNamespace = "http://ws/", className = "ws.GetAllMechanicResponse")
    @Action(input = "http://ws/CarWebService/getAllMechanicRequest", output = "http://ws/CarWebService/getAllMechanicResponse")
    public List<MechanicDBO> getAllMechanic();

    /**
     * 
     * @param mechanicPhone
     * @param mechanicID
     * @param mechanicName
     * @param mechanicAddress
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertMechanic", targetNamespace = "http://ws/", className = "ws.InsertMechanic")
    @ResponseWrapper(localName = "insertMechanicResponse", targetNamespace = "http://ws/", className = "ws.InsertMechanicResponse")
    @Action(input = "http://ws/CarWebService/insertMechanicRequest", output = "http://ws/CarWebService/insertMechanicResponse")
    public String insertMechanic(
        @WebParam(name = "mechanicID", targetNamespace = "")
        String mechanicID,
        @WebParam(name = "mechanicName", targetNamespace = "")
        String mechanicName,
        @WebParam(name = "mechanicPhone", targetNamespace = "")
        String mechanicPhone,
        @WebParam(name = "mechanicAddress", targetNamespace = "")
        String mechanicAddress);

    /**
     * 
     * @param mechanicPhone
     * @param mechanicID
     * @param mechanicName
     * @param mechanicAddress
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMechanic", targetNamespace = "http://ws/", className = "ws.UpdateMechanic")
    @ResponseWrapper(localName = "updateMechanicResponse", targetNamespace = "http://ws/", className = "ws.UpdateMechanicResponse")
    @Action(input = "http://ws/CarWebService/updateMechanicRequest", output = "http://ws/CarWebService/updateMechanicResponse")
    public String updateMechanic(
        @WebParam(name = "mechanicID", targetNamespace = "")
        String mechanicID,
        @WebParam(name = "mechanicName", targetNamespace = "")
        String mechanicName,
        @WebParam(name = "mechanicPhone", targetNamespace = "")
        String mechanicPhone,
        @WebParam(name = "mechanicAddress", targetNamespace = "")
        String mechanicAddress);

    /**
     * 
     * @param supplierID
     * @param partID
     * @param price
     * @param brandID
     * @param partModel
     * @param partName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertPart", targetNamespace = "http://ws/", className = "ws.InsertPart")
    @ResponseWrapper(localName = "insertPartResponse", targetNamespace = "http://ws/", className = "ws.InsertPartResponse")
    @Action(input = "http://ws/CarWebService/insertPartRequest", output = "http://ws/CarWebService/insertPartResponse")
    public String insertPart(
        @WebParam(name = "partID", targetNamespace = "")
        String partID,
        @WebParam(name = "partName", targetNamespace = "")
        String partName,
        @WebParam(name = "partModel", targetNamespace = "")
        String partModel,
        @WebParam(name = "price", targetNamespace = "")
        String price,
        @WebParam(name = "supplierID", targetNamespace = "")
        String supplierID,
        @WebParam(name = "brandID", targetNamespace = "")
        String brandID);

    /**
     * 
     * @param partID
     * @return
     *     returns java.util.List<ws.PartDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartByID", targetNamespace = "http://ws/", className = "ws.GetPartByID")
    @ResponseWrapper(localName = "getPartByIDResponse", targetNamespace = "http://ws/", className = "ws.GetPartByIDResponse")
    @Action(input = "http://ws/CarWebService/getPartByIDRequest", output = "http://ws/CarWebService/getPartByIDResponse")
    public List<PartDBO> getPartByID(
        @WebParam(name = "partID", targetNamespace = "")
        String partID);

    /**
     * 
     * @param partID
     * @param price
     * @param partModel
     * @param partName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePart", targetNamespace = "http://ws/", className = "ws.UpdatePart")
    @ResponseWrapper(localName = "updatePartResponse", targetNamespace = "http://ws/", className = "ws.UpdatePartResponse")
    @Action(input = "http://ws/CarWebService/updatePartRequest", output = "http://ws/CarWebService/updatePartResponse")
    public String updatePart(
        @WebParam(name = "partID", targetNamespace = "")
        String partID,
        @WebParam(name = "partName", targetNamespace = "")
        String partName,
        @WebParam(name = "partModel", targetNamespace = "")
        String partModel,
        @WebParam(name = "price", targetNamespace = "")
        String price);

    /**
     * 
     * @param mechanicID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMechanic", targetNamespace = "http://ws/", className = "ws.DeleteMechanic")
    @ResponseWrapper(localName = "deleteMechanicResponse", targetNamespace = "http://ws/", className = "ws.DeleteMechanicResponse")
    @Action(input = "http://ws/CarWebService/deleteMechanicRequest", output = "http://ws/CarWebService/deleteMechanicResponse")
    public String deleteMechanic(
        @WebParam(name = "mechanicID", targetNamespace = "")
        String mechanicID);

    /**
     * 
     * @return
     *     returns java.util.List<ws.PartDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPart", targetNamespace = "http://ws/", className = "ws.GetAllPart")
    @ResponseWrapper(localName = "getAllPartResponse", targetNamespace = "http://ws/", className = "ws.GetAllPartResponse")
    @Action(input = "http://ws/CarWebService/getAllPartRequest", output = "http://ws/CarWebService/getAllPartResponse")
    public List<PartDBO> getAllPart();

    /**
     * 
     * @param partID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePart", targetNamespace = "http://ws/", className = "ws.DeletePart")
    @ResponseWrapper(localName = "deletePartResponse", targetNamespace = "http://ws/", className = "ws.DeletePartResponse")
    @Action(input = "http://ws/CarWebService/deletePartRequest", output = "http://ws/CarWebService/deletePartResponse")
    public String deletePart(
        @WebParam(name = "partID", targetNamespace = "")
        String partID);

    /**
     * 
     * @return
     *     returns java.util.List<ws.SupplierDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSupplier", targetNamespace = "http://ws/", className = "ws.GetAllSupplier")
    @ResponseWrapper(localName = "getAllSupplierResponse", targetNamespace = "http://ws/", className = "ws.GetAllSupplierResponse")
    @Action(input = "http://ws/CarWebService/getAllSupplierRequest", output = "http://ws/CarWebService/getAllSupplierResponse")
    public List<SupplierDBO> getAllSupplier();

    /**
     * 
     * @param supplierID
     * @return
     *     returns java.util.List<ws.SupplierDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSupplierByID", targetNamespace = "http://ws/", className = "ws.GetSupplierByID")
    @ResponseWrapper(localName = "getSupplierByIDResponse", targetNamespace = "http://ws/", className = "ws.GetSupplierByIDResponse")
    @Action(input = "http://ws/CarWebService/getSupplierByIDRequest", output = "http://ws/CarWebService/getSupplierByIDResponse")
    public List<SupplierDBO> getSupplierByID(
        @WebParam(name = "supplierID", targetNamespace = "")
        String supplierID);

    /**
     * 
     * @param carStatus
     * @param datetimeOfService
     * @param paymentReceived
     * @param descriptionAboutBooking
     * @param bookingID
     * @param status
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBooking", targetNamespace = "http://ws/", className = "ws.UpdateBooking")
    @ResponseWrapper(localName = "updateBookingResponse", targetNamespace = "http://ws/", className = "ws.UpdateBookingResponse")
    @Action(input = "http://ws/CarWebService/updateBookingRequest", output = "http://ws/CarWebService/updateBookingResponse")
    public String updateBooking(
        @WebParam(name = "bookingID", targetNamespace = "")
        String bookingID,
        @WebParam(name = "carStatus", targetNamespace = "")
        String carStatus,
        @WebParam(name = "datetimeOfService", targetNamespace = "")
        String datetimeOfService,
        @WebParam(name = "paymentReceived", targetNamespace = "")
        String paymentReceived,
        @WebParam(name = "descriptionAboutBooking", targetNamespace = "")
        String descriptionAboutBooking,
        @WebParam(name = "status", targetNamespace = "")
        String status);

    /**
     * 
     * @return
     *     returns java.util.List<ws.BrandDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBrand", targetNamespace = "http://ws/", className = "ws.GetAllBrand")
    @ResponseWrapper(localName = "getAllBrandResponse", targetNamespace = "http://ws/", className = "ws.GetAllBrandResponse")
    @Action(input = "http://ws/CarWebService/getAllBrandRequest", output = "http://ws/CarWebService/getAllBrandResponse")
    public List<BrandDBO> getAllBrand();

    /**
     * 
     * @return
     *     returns java.util.List<ws.BookingServiceDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBooking", targetNamespace = "http://ws/", className = "ws.GetAllBooking")
    @ResponseWrapper(localName = "getAllBookingResponse", targetNamespace = "http://ws/", className = "ws.GetAllBookingResponse")
    @Action(input = "http://ws/CarWebService/getAllBookingRequest", output = "http://ws/CarWebService/getAllBookingResponse")
    public List<BookingServiceDBO> getAllBooking();

    /**
     * 
     * @param brandID
     * @return
     *     returns java.util.List<ws.BrandDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBrandByID", targetNamespace = "http://ws/", className = "ws.GetBrandByID")
    @ResponseWrapper(localName = "getBrandByIDResponse", targetNamespace = "http://ws/", className = "ws.GetBrandByIDResponse")
    @Action(input = "http://ws/CarWebService/getBrandByIDRequest", output = "http://ws/CarWebService/getBrandByIDResponse")
    public List<BrandDBO> getBrandByID(
        @WebParam(name = "brandID", targetNamespace = "")
        String brandID);

    /**
     * 
     * @param bookingID
     * @return
     *     returns java.util.List<ws.BookingServiceDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookingByID", targetNamespace = "http://ws/", className = "ws.GetBookingByID")
    @ResponseWrapper(localName = "getBookingByIDResponse", targetNamespace = "http://ws/", className = "ws.GetBookingByIDResponse")
    @Action(input = "http://ws/CarWebService/getBookingByIDRequest", output = "http://ws/CarWebService/getBookingByIDResponse")
    public List<BookingServiceDBO> getBookingByID(
        @WebParam(name = "bookingID", targetNamespace = "")
        String bookingID);

    /**
     * 
     * @param carStatus
     * @param datetimeOfService
     * @param customerID
     * @param mechanicID
     * @param paymentReceived
     * @param descriptionAboutBooking
     * @param bookingID
     * @param status
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertBooking", targetNamespace = "http://ws/", className = "ws.InsertBooking")
    @ResponseWrapper(localName = "insertBookingResponse", targetNamespace = "http://ws/", className = "ws.InsertBookingResponse")
    @Action(input = "http://ws/CarWebService/insertBookingRequest", output = "http://ws/CarWebService/insertBookingResponse")
    public String insertBooking(
        @WebParam(name = "bookingID", targetNamespace = "")
        String bookingID,
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID,
        @WebParam(name = "mechanicID", targetNamespace = "")
        String mechanicID,
        @WebParam(name = "carStatus", targetNamespace = "")
        String carStatus,
        @WebParam(name = "datetimeOfService", targetNamespace = "")
        String datetimeOfService,
        @WebParam(name = "paymentReceived", targetNamespace = "")
        String paymentReceived,
        @WebParam(name = "descriptionAboutBooking", targetNamespace = "")
        String descriptionAboutBooking,
        @WebParam(name = "status", targetNamespace = "")
        String status);

    /**
     * 
     * @param fromDate
     * @param toDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalBenefit", targetNamespace = "http://ws/", className = "ws.GetTotalBenefit")
    @ResponseWrapper(localName = "getTotalBenefitResponse", targetNamespace = "http://ws/", className = "ws.GetTotalBenefitResponse")
    @Action(input = "http://ws/CarWebService/getTotalBenefitRequest", output = "http://ws/CarWebService/getTotalBenefitResponse")
    public int getTotalBenefit(
        @WebParam(name = "fromDate", targetNamespace = "")
        String fromDate,
        @WebParam(name = "toDate", targetNamespace = "")
        String toDate);

    /**
     * 
     * @param fromDate
     * @param toDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalPartSale", targetNamespace = "http://ws/", className = "ws.GetTotalPartSale")
    @ResponseWrapper(localName = "getTotalPartSaleResponse", targetNamespace = "http://ws/", className = "ws.GetTotalPartSaleResponse")
    @Action(input = "http://ws/CarWebService/getTotalPartSaleRequest", output = "http://ws/CarWebService/getTotalPartSaleResponse")
    public int getTotalPartSale(
        @WebParam(name = "fromDate", targetNamespace = "")
        String fromDate,
        @WebParam(name = "toDate", targetNamespace = "")
        String toDate);

    /**
     * 
     * @param supplierID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSupplier", targetNamespace = "http://ws/", className = "ws.DeleteSupplier")
    @ResponseWrapper(localName = "deleteSupplierResponse", targetNamespace = "http://ws/", className = "ws.DeleteSupplierResponse")
    @Action(input = "http://ws/CarWebService/deleteSupplierRequest", output = "http://ws/CarWebService/deleteSupplierResponse")
    public String deleteSupplier(
        @WebParam(name = "supplierID", targetNamespace = "")
        String supplierID);

    /**
     * 
     * @param fromDate
     * @param toDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalBooking", targetNamespace = "http://ws/", className = "ws.GetTotalBooking")
    @ResponseWrapper(localName = "getTotalBookingResponse", targetNamespace = "http://ws/", className = "ws.GetTotalBookingResponse")
    @Action(input = "http://ws/CarWebService/getTotalBookingRequest", output = "http://ws/CarWebService/getTotalBookingResponse")
    public int getTotalBooking(
        @WebParam(name = "fromDate", targetNamespace = "")
        String fromDate,
        @WebParam(name = "toDate", targetNamespace = "")
        String toDate);

    /**
     * 
     * @param supplierName
     * @param supplierAddress
     * @param supplierID
     * @param supplierPhone
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertSupplier", targetNamespace = "http://ws/", className = "ws.InsertSupplier")
    @ResponseWrapper(localName = "insertSupplierResponse", targetNamespace = "http://ws/", className = "ws.InsertSupplierResponse")
    @Action(input = "http://ws/CarWebService/insertSupplierRequest", output = "http://ws/CarWebService/insertSupplierResponse")
    public String insertSupplier(
        @WebParam(name = "supplierID", targetNamespace = "")
        String supplierID,
        @WebParam(name = "supplierName", targetNamespace = "")
        String supplierName,
        @WebParam(name = "supplierAddress", targetNamespace = "")
        String supplierAddress,
        @WebParam(name = "supplierPhone", targetNamespace = "")
        String supplierPhone);

    /**
     * 
     * @param supplierName
     * @param supplierAddress
     * @param supplierID
     * @param supplierPhone
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateSupplier", targetNamespace = "http://ws/", className = "ws.UpdateSupplier")
    @ResponseWrapper(localName = "updateSupplierResponse", targetNamespace = "http://ws/", className = "ws.UpdateSupplierResponse")
    @Action(input = "http://ws/CarWebService/updateSupplierRequest", output = "http://ws/CarWebService/updateSupplierResponse")
    public String updateSupplier(
        @WebParam(name = "supplierID", targetNamespace = "")
        String supplierID,
        @WebParam(name = "supplierName", targetNamespace = "")
        String supplierName,
        @WebParam(name = "supplierAddress", targetNamespace = "")
        String supplierAddress,
        @WebParam(name = "supplierPhone", targetNamespace = "")
        String supplierPhone);

    /**
     * 
     * @param bookingID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBooking", targetNamespace = "http://ws/", className = "ws.DeleteBooking")
    @ResponseWrapper(localName = "deleteBookingResponse", targetNamespace = "http://ws/", className = "ws.DeleteBookingResponse")
    @Action(input = "http://ws/CarWebService/deleteBookingRequest", output = "http://ws/CarWebService/deleteBookingResponse")
    public String deleteBooking(
        @WebParam(name = "bookingID", targetNamespace = "")
        String bookingID);

    /**
     * 
     * @param brandID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBrand", targetNamespace = "http://ws/", className = "ws.DeleteBrand")
    @ResponseWrapper(localName = "deleteBrandResponse", targetNamespace = "http://ws/", className = "ws.DeleteBrandResponse")
    @Action(input = "http://ws/CarWebService/deleteBrandRequest", output = "http://ws/CarWebService/deleteBrandResponse")
    public String deleteBrand(
        @WebParam(name = "brandID", targetNamespace = "")
        String brandID);

    /**
     * 
     * @param mechanicName
     * @return
     *     returns java.util.List<ws.MechanicDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMechanicByName", targetNamespace = "http://ws/", className = "ws.GetMechanicByName")
    @ResponseWrapper(localName = "getMechanicByNameResponse", targetNamespace = "http://ws/", className = "ws.GetMechanicByNameResponse")
    @Action(input = "http://ws/CarWebService/getMechanicByNameRequest", output = "http://ws/CarWebService/getMechanicByNameResponse")
    public List<MechanicDBO> getMechanicByName(
        @WebParam(name = "mechanicName", targetNamespace = "")
        String mechanicName);

    /**
     * 
     * @param customerName
     * @return
     *     returns java.util.List<ws.CustomerDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerByName", targetNamespace = "http://ws/", className = "ws.GetCustomerByName")
    @ResponseWrapper(localName = "getCustomerByNameResponse", targetNamespace = "http://ws/", className = "ws.GetCustomerByNameResponse")
    @Action(input = "http://ws/CarWebService/getCustomerByNameRequest", output = "http://ws/CarWebService/getCustomerByNameResponse")
    public List<CustomerDBO> getCustomerByName(
        @WebParam(name = "customerName", targetNamespace = "")
        String customerName);

    /**
     * 
     * @return
     *     returns java.util.List<ws.RequirementServiceDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllRequirement", targetNamespace = "http://ws/", className = "ws.GetAllRequirement")
    @ResponseWrapper(localName = "getAllRequirementResponse", targetNamespace = "http://ws/", className = "ws.GetAllRequirementResponse")
    @Action(input = "http://ws/CarWebService/getAllRequirementRequest", output = "http://ws/CarWebService/getAllRequirementResponse")
    public List<RequirementServiceDBO> getAllRequirement();

    /**
     * 
     * @param requirementID
     * @return
     *     returns java.util.List<ws.RequirementServiceDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRequirementByID", targetNamespace = "http://ws/", className = "ws.GetRequirementByID")
    @ResponseWrapper(localName = "getRequirementByIDResponse", targetNamespace = "http://ws/", className = "ws.GetRequirementByIDResponse")
    @Action(input = "http://ws/CarWebService/getRequirementByIDRequest", output = "http://ws/CarWebService/getRequirementByIDResponse")
    public List<RequirementServiceDBO> getRequirementByID(
        @WebParam(name = "requirementID", targetNamespace = "")
        String requirementID);

    /**
     * 
     * @param dateRequirement
     * @param partID
     * @param customerID
     * @param requirementDescription
     * @param requirementID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertRequirement", targetNamespace = "http://ws/", className = "ws.InsertRequirement")
    @ResponseWrapper(localName = "insertRequirementResponse", targetNamespace = "http://ws/", className = "ws.InsertRequirementResponse")
    @Action(input = "http://ws/CarWebService/insertRequirementRequest", output = "http://ws/CarWebService/insertRequirementResponse")
    public String insertRequirement(
        @WebParam(name = "requirementID", targetNamespace = "")
        String requirementID,
        @WebParam(name = "partID", targetNamespace = "")
        String partID,
        @WebParam(name = "customerID", targetNamespace = "")
        String customerID,
        @WebParam(name = "requirementDescription", targetNamespace = "")
        String requirementDescription,
        @WebParam(name = "dateRequirement", targetNamespace = "")
        String dateRequirement);

    /**
     * 
     * @param dateRequirement
     * @param requirementDescription
     * @param requirementID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateRequirement", targetNamespace = "http://ws/", className = "ws.UpdateRequirement")
    @ResponseWrapper(localName = "updateRequirementResponse", targetNamespace = "http://ws/", className = "ws.UpdateRequirementResponse")
    @Action(input = "http://ws/CarWebService/updateRequirementRequest", output = "http://ws/CarWebService/updateRequirementResponse")
    public String updateRequirement(
        @WebParam(name = "requirementID", targetNamespace = "")
        String requirementID,
        @WebParam(name = "requirementDescription", targetNamespace = "")
        String requirementDescription,
        @WebParam(name = "dateRequirement", targetNamespace = "")
        String dateRequirement);

    /**
     * 
     * @param requirementID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteRequirement", targetNamespace = "http://ws/", className = "ws.DeleteRequirement")
    @ResponseWrapper(localName = "deleteRequirementResponse", targetNamespace = "http://ws/", className = "ws.DeleteRequirementResponse")
    @Action(input = "http://ws/CarWebService/deleteRequirementRequest", output = "http://ws/CarWebService/deleteRequirementResponse")
    public String deleteRequirement(
        @WebParam(name = "requirementID", targetNamespace = "")
        String requirementID);

    /**
     * 
     * @param supplierName
     * @return
     *     returns java.util.List<ws.SupplierDBO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSupplierByName", targetNamespace = "http://ws/", className = "ws.GetSupplierByName")
    @ResponseWrapper(localName = "getSupplierByNameResponse", targetNamespace = "http://ws/", className = "ws.GetSupplierByNameResponse")
    @Action(input = "http://ws/CarWebService/getSupplierByNameRequest", output = "http://ws/CarWebService/getSupplierByNameResponse")
    public List<SupplierDBO> getSupplierByName(
        @WebParam(name = "supplierName", targetNamespace = "")
        String supplierName);

    /**
     * 
     * @param fromDate
     * @param toDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalRequirement", targetNamespace = "http://ws/", className = "ws.GetTotalRequirement")
    @ResponseWrapper(localName = "getTotalRequirementResponse", targetNamespace = "http://ws/", className = "ws.GetTotalRequirementResponse")
    @Action(input = "http://ws/CarWebService/getTotalRequirementRequest", output = "http://ws/CarWebService/getTotalRequirementResponse")
    public int getTotalRequirement(
        @WebParam(name = "fromDate", targetNamespace = "")
        String fromDate,
        @WebParam(name = "toDate", targetNamespace = "")
        String toDate);

}