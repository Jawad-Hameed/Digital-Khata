package com.jawadkhansahil.digitalkhata

import com.jawadkhansahil.digitalkhata.model.Detail

interface AdapterListener {
    fun onCLick(position: Int, id: Detail)
}