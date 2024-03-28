package com.jawadkhansahil.digitalkhata.repository

import androidx.lifecycle.LiveData
import com.jawadkhansahil.digitalkhata.database.CustomerDao
import com.jawadkhansahil.digitalkhata.model.Customer

class KhataRepository(val customerDao: CustomerDao) {

    fun getCustomer() : LiveData<List<Customer>>{
        return customerDao.getCustomer()
    }

    suspend fun createCustomer(customer: Customer){
        return customerDao.createCustomer(customer)
    }

    suspend fun deleteCustomer(customer: Customer){
        return customerDao.deleteCustomer(customer)
    }

    suspend fun updateCustomer(customer: Customer){
        return customerDao.updateCustomer(customer)
    }
}