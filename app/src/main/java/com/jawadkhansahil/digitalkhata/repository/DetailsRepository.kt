package com.jawadkhansahil.digitalkhata.repository

import androidx.lifecycle.LiveData

import com.jawadkhansahil.digitalkhata.database.DetailsDao
import com.jawadkhansahil.digitalkhata.model.Detail

class DetailsRepository(val detailsDao: DetailsDao) {


    fun getDetails(): LiveData<List<Detail>>{
        return detailsDao.getDetails()
    }

    suspend fun createDetails(detail: Detail){
        return detailsDao.createDetails(detail)
    }

    suspend fun deleteDetails(detail: Detail){
        return detailsDao.deleteDetails(detail)
    }

    suspend fun updateDetails(detail: Detail){
        return detailsDao.updateDetails(detail)
    }
}