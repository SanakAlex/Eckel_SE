var mapF1 = function () {
    emit(this.producer, this.model);
};

var reduceF1 = function (keyProducer, valueModels) {
    reducedValue = {producer:'', itemCount:0};

    reducedValue.producer = keyProducer;
    reducedValue.itemCount = valueModels.length;

    return reducedValue;
};

var mapF2 = function () {
    emit(this.producer, this.price);
};

var reduceF2 = function (keyProducer, valuePrices) {
    reducedValue = {producer:'', itemCount:0};

    reducedValue.producer = keyProducer;
    reducedValue.itemCount = Array.sum(valuePrices);

    return reducedValue;
};

var mapF3 = function () {
    emit(this.customer, this.totalPrice);
};

var reduceF3 = function (keyCustomer, valuePrices) {
    reducedValue = {customer:'', itemCount:0};

    reducedValue.producer = keyCustomer;
    reducedValue.itemCount = Array.sum(valuePrices);

    return reducedValue;
};

var mapF5 = function () {
    for (var idx = 0; idx < this.items.length; idx++) {
        var key = this._id;
        var value = {
            count: 1,
            price: this.items[idx].price
        };
        emit(key, value);
    }
};

var reduceF5 = function (keyOrder, valuePrices) {
    reducedValue = {count:0, total:0};

    for (var idx = 0; idx < valuePrices.length; idx++) {
        reducedValue.count += valuePrices[idx].count;
        reducedValue.total += valuePrices[idx].price;
    }

    return reducedValue;
};

var finalizeF5 = function (keyOrder, reducedValue) {

    reducedValue.avg = reducedValue.total/reducedValue.count;

    return reducedValue;
};

var mapF6 = function () {
    for (var idx = 0; idx < this.order_items_id.length; idx++) {
        var key = this.order_items_id.model;
        var value = {
            count: 1
        };
        emit(key, value);
    }
};

var reduceF6 = function (keyItem, valueCounts) {
    reducedValue = {count:0};

    for (var idx = 0; idx < valueCounts.length; idx++) {
        reducedValue.count += valueCounts[idx].count;
    }

    return reducedValue;
};

var mapF7 = function () {
    for (var idx = 0; idx < this.order_items_id.length; idx++) {
        var key = this.order_items_id[idx].model;
        var value = {
            customer:''
        };
        value.customer = this.customer;
        emit(key, value);
    }
};

var reduceF7 = function (keyItem, valueCustomers) {
    reducedValue = {customers:[]};

    for (var idx = 0; idx < valueCustomers.length; idx++) {
       if (!reducedValue.customers.includes(valueCustomers[idx].customer))
        reducedValue.customers.push(valueCustomers[idx].customer);
    }

    return reducedValue;
};

var mapF8 = function () {
    for (var idx = 0; idx < this.order_items_id.length; idx++) {
        var key = this.order_items_id[idx].model;
        var value = {
            customer: '',
            count: 1
        };
        value.customer = this.customer;
        emit(key, value);
    }
};

var reduceF8 = function (keyItem, valueCustomers) {
    var reducedValue = {customers: []};
    var customersName = [];
    var customers = [];

    for (var idx = 0; idx < valueCustomers.length; idx++) {
        if (!customersName.includes(valueCustomers[idx].customer))
        {
            customers.push(valueCustomers[idx]);
            customersName.push(valueCustomers[idx].customer);
        }
        else {
            var index = customersName.indexOf(valueCustomers[idx].customer);
            customers[index].count++;
        }
    }

    for (var id = 0; id < customers.length; id++) {
        if (customers[id].count > 1)
            reducedValue.customers.push(customers[id]);
        else if (customers.count > 1)
            reducedValue.customers.push(customers);
    }

    return reducedValue;
};

var finalizeF8 = function (keyItem, reducedValue) {
    var customers=[];
    for (var valueItem = 0; valueItem < reducedValue.length; valueItem++) {
        reducedValue[valueItem];
        for (var customer = 0; customer < reducedValue[valueItem].length; customer++){

        }

    }
    return reducedValue;
};

if (reducedValue[valueItem][customer].count > 1){
    customers.push(reducedValue[valueItem][customer]);
}
/*
{ "_id" : "AirPods", "value" : { "customers" : [ { "customer" : "Alex", "count" : 1 }, { "customer" : "Petro", "count" : 2 }, { "customer" : "Man", "count" : 2 }, { "customer" : "Alla", "count" : 1 } ] } }
{ "_id" : "CX-5", "value" : { "customers" : [ { "customer" : "Man", "count" : 3 } ] } }
{ "_id" : "IPad Pro 10.5", "value" : { "customer" : "Petro", "count" : 1 } }
{ "_id" : "ML 4k", "value" : { "customers" : [ { "customer" : "Petro", "count" : 1 }, { "customer" : "Alla", "count" : 1 } ] } }
{ "_id" : "QX 45", "value" : { "customers" : [ { "customer" : "Alex", "count" : 1 }, { "customer" : "Man", "count" : 1 } ] } }
{ "_id" : "iPhone 6", "value" : { "customers" : [ { "customer" : "Alex", "count" : 1 }, { "customer" : "Alla", "count" : 1 } ] } }
{ "_id" : "iPhone 7", "value" : { "customer" : "Petro", "count" : 1 } }
{ "_id" : "iPhone X", "value" : { "customer" : "Petro", "count" : 1 } }
*/


var mapF8 = function () {
    for (var idx = 0; idx < this.order_items_id.length; idx++) {
        var key = this.order_items_id[idx].model;
        emit(key+': '+this.customer, 1);
    }
};

var reduceF8 = function (keyItem, valueCustomers) {
    if (Array.sum(valueCustomers)>1)
        return Array.sum(valueCustomers);
};


var mapF81 = function () {
    if (this.value > 1)
        emit(this._id, this.value);
};

var reduceF81 = function (keyItem, valueCustomers) {
    return valueCustomers;
};

var mapF9 = function () {
    emit(this._id, this.value);
};

var reduceF9 = function (keyItem, valueCustomers) {
    return valueCustomers;
};

// for (idx = 0; idx < customers.length; idx++) {
//     emit(keyItem, customers[idx]);
// }



/*

{ "_id" : "AirPods", "value" : { "customers" : [ [ { "customers" : [ "Alex" ], "count" : 1 }, { "customers" : [ "Petro" ], "count" : 1 }, { "customers" : [ "Petro" ], "count" : 1 }, { "customers" : [ "Man" ], "count" : 1 }, { "customers" : [ "Man" ], "count" : 1 }, { "customers" : [ "Alla" ], "count" : 1 } ] ] } }
{ "_id" : "CX-5", "value" : { "customers" : [ [ { "customers" : [ "Man" ], "count" : 1 }, { "customers" : [ "Man" ], "count" : 1 }, { "customers" : [ "Man" ], "count" : 1 } ] ] } }
{ "_id" : "IPad Pro 10.5", "value" : { "customers" : [ "Petro" ], "count" : 1 } }
{ "_id" : "ML 4k", "value" : { "customers" : [ [ { "customers" : [ "Petro" ], "count" : 1 }, { "customers" : [ "Alla" ], "count" : 1 } ] ] } }
{ "_id" : "QX 45", "value" : { "customers" : [ [ { "customers" : [ "Alex" ], "count" : 1 }, { "customers" : [ "Man" ], "count" : 1 } ] ] } }
{ "_id" : "iPhone 6", "value" : { "customers" : [ [ { "customers" : [ "Alex" ], "count" : 1 }, { "customers" : [ "Alla" ], "count" : 1 } ] ] } }
{ "_id" : "iPhone 7", "value" : { "customers" : [ "Petro" ], "count" : 1 } }
{ "_id" : "iPhone X", "value" : { "customers" : [ "Petro" ], "count" : 1 } }
*/


var mapF11 = function () {
    emit('count', this.total_sum);
};

var reduceF11 = function (keyItem, valueCustomers) {
    return Array.sum(valueCustomers)/valueCustomers.length;
};

var mapF12 = function() {
    var key = 'avg';
    var value = {
        total_sum: this.total_sum,
        count: 1,
        avg_sum: 0
    };
    emit( key, value );
};

var reduceF12 = function(key, values) {

    var reducedObject = {
        total_sum: 0,
        count: 0,
        avg_sum: 0
    };

    values.forEach( function(value) {
            reducedObject.total_sum += value.total_sum;
            reducedObject.count += value.count;
        }
    );
    return reducedObject;
};

var finalizeF12 = function (key, reducedValue) {

    if (reducedValue.count > 0)
        reducedValue.avg_sum = reducedValue.total_sum / reducedValue.count;

    return reducedValue;
};

var mapF99 = function() {
    var key = 'avg';
    var value = {
        total_sum: this.order_items_id.length,
        count: 1,
        avg_sum: 0
    };
    emit( key, value );
};

var reduceF99 = function(key, values) {

    var reducedObject = {
        total_sum: 0,
        count: 0,
        avg_sum: 0
    };

    values.forEach( function(value) {
            reducedObject.total_sum += value.total_sum;
            reducedObject.count += value.count;
        }
    );
    return reducedObject;
};


var finalizeF99 = function (key, reducedValue) {

    if (reducedValue.count > 0)
        reducedValue.avg_sum = reducedValue.total_sum / reducedValue.count;

    return reducedValue;
};


var map = function() {
    for (var index = 0; index < this.order_items_id.length; index++){
        var key = this.order_items_id[index].model;
        emit(key, 1);
    }
};

var reduce = function(key, values) {
    return Array.sum(values);
};

var map = function() {
    mass = [0,0,0];
    for (var index = 0; index < this.order_items_id.length; index++){
        var key = this.order_items_id[index].model;
        emit(key, 1);
    }
};

var reduce = function(key, values) {
    return Array.sum(values);
};

var map1 = function() {
    emit (this.value+ " boughts", this._id);
};

var reduce1 = function(key, values) {
    var reduce = {
        items:[]
    };
    for (var index = 0; index < values.length; index++){
        reduce.items.push(values[index]);
    }
    return reduce;
};