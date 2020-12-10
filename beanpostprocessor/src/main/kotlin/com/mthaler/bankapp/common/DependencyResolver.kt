package com.mthaler.bankapp.common

interface DependencyResolver {
    fun resolveDependency(myApplicationContext: MyApplicationContext?)
}