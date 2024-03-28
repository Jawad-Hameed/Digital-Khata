package com.jawadkhansahil.digitalkhata.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jawadkhansahil.digitalkhata.repository.DetailsRepository
import com.jawadkhansahil.digitalkhata.viewmodel.DetailsViewModel

class DetailsVMFactory(val repository: DetailsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailsViewModel(repository) as T
    }
}