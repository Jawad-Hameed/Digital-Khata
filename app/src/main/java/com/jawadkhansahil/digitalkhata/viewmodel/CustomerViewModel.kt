package com.jawadkhansahil.digitalkhata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jawadkhansahil.digitalkhata.model.Customer
import com.jawadkhansahil.digitalkhata.repository.KhataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CustomerViewModel(val repository: KhataRepository) : ViewModel() {

    fun getCustomer() : LiveData<List<Customer>> {
        return repository.getCustomer()
    }

    fun createCustomer(customer: Customer){
        viewModelScope.launch(Dispatchers.IO) {
        repository.createCustomer(customer)
        }
    }

    fun deleteCustomer(customer: Customer){
        viewModelScope.launch(Dispatchers.IO) {
        repository.deleteCustomer(customer)
        }
    }

    fun updateCustomer(customer: Customer){
        viewModelScope.launch(Dispatchers.IO) {
        repository.updateCustomer(customer)
        }
    }
}