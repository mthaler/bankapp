package com.mthaler.bankapp.common

import org.springframework.context.ApplicationContextAware
import org.springframework.context.ApplicationContext
import kotlin.Throws
import org.springframework.beans.BeansException

class MyApplicationContext : ApplicationContextAware {
    private var applicationContext: ApplicationContext? = null
    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    fun <T> getBean(klass: Class<T>?): T {
        return applicationContext!!.getBean(klass)
    }
}