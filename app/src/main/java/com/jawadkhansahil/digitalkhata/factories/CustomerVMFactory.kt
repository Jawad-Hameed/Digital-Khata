package com.jawadkhansahil.digitalkhata.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jawadkhansahil.digitalkhata.repository.KhataRepository
import com.jawadkhansahil.digitalkhata.viewmodel.CustomerViewModel

class CustomerVMFactory(private val repository: KhataRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CustomerViewModel(repository) as T
    }
}