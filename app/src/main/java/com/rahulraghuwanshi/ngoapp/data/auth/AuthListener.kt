package com.rahulraghuwanshi.ngoapp.data.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}