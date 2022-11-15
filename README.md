
## Services and Their Port :
    
    Eureka Server : 8761
    Token Sevice : 8080
    Admin Service : 8081
    Consumer Service : 8082
    ShopMgmt Service : 8083
    Shop Service : 8084

### Postman Link
    https://www.getpostman.com/collections/2a150296f8642329c3a8
_________________________________________________________

## Api Endpoints

#### 1. for ADMIN-SERVICE

    1.1=> SIGNUP :

        Method: POST
        Endpoint: user/signup
        Payload:
                {
                    "username" : "Rahul",
                    "password" : "rahu@123",  
                    "password_confirm" : "rahu@123"
                }
    
    1.2=> LOGIN
        Method: POST
        Endpoint: user/login
        Payload:
                {
                    "username": "Rahul",
                    "password": "rahu@123"
                }
    
    1.3=> GET Users
        Method: GET
        Endpoint: user/get-users

#### For SHOP-Service

    2.1=> GET categories
        Method: GET
        Endpoint: shop/categories
    
    2.2=>  GET Products
        Method: GET
        Endpoint: shop/products
    
    2.3=>  GET PRODUCT BY FIELD
        Method: POST
        Endpoint: shop/products
        Payload: { "FIELD_NAME": "VALUE" }
    
    2.4=>  GET CATEGORY BY FIELD
        Method: POST
        Endpoint: shop/categories
        Payload: { "FIELD_NAME": "VALUE" }
        allowed fields : description OR name OR id


### Token-service

    ->  GET TOKEN
    Method: GET
    Endpoint: consumer/get-token/{id}

#### CONSUMER SERVICES: (TOKEN REQUIRED)
    3.1) CATEGORIES:

    3.1.1)=> GET categories:
        Method: GET
        Endpoint: consumer/shop-management/categories
    
    3.1.2)=> ADD category
        Method: POST
        Endpoint: consumer/shop-management/add-category

    3.1.3)=> UPDATE category by ID
        Method: POST
        Endpoint: consumer/shop-management/update-category-by-id/{id}
    
    3.1.4)=> DELETE category by ID
        Method: DELETE
        Endpoint: consumer/shop-management/delete-category-by-id/{id}
    
    3.2) PRODUCTS:
    
    3.2.1)=> GET Products
        Method: GET
        Endpoint: consumer/shop-management/products
    
    3.2.2)=> ADD PRODUCT
    Method: POST
    Endpoint: consumer/shop-management/add-product
    
    3.2.3)=> LINK PRODUCT WITH CATEGORY
        METHOD: PUT
        Endpoint: consumer/shop-management/product-with-category/{product_id}/{category_id}
    
    3.2.4)=> UPDATE PRODUCT by ID
        Method: POST
        Endpoint: consumer/shop-management/update-product-by-id/{id}
    allowed fields: description OR name OR id OR price
    
    3.2.5)=> DELETE PRODUCT by ID
        Method: DELETE
        Endpoint: consumer/shop-management/delete-product-by-id/{id}
    
