package com.mthaler.bankapp.postprocessor

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import com.mthaler.bankapp.common.MyApplicationContext
import kotlin.Throws
import org.springframework.beans.BeansException
import com.mthaler.bankapp.common.DependencyResolver
import org.apache.logging.log4j.LogManager

class DependencyResolutionBeanPostProcessor : BeanPostProcessor, Ordered {
    private var myApplicationContext: MyApplicationContext? = null
    private var order = 0
    fun setOrder(order: Int) {
        this.order = order
    }

    override fun getOrder(): Int {
        return order
    }

    @Throws(BeansException::class)
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        logger.info("DependencyResolutionBeanPostProcessor's postProcessBeforeInitialization method invoked for bean " + beanName + " of type " + bean.javaClass)
        if (bean is DependencyResolver) {
            bean.resolveDependency(myApplicationContext)
        }
        return bean
    }

    @Throws(BeansException::class)
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        logger.info("DependencyResolutionBeanPostProcessor's postProcessAfterInitialization method invoked for bean " + beanName + " of type " + bean.javaClass)
        return bean
    }

    fun setMyApplicationContext(
        myApplicationContext: MyApplicationContext?
    ) {
        this.myApplicationContext = myApplicationContext
    }

    companion object {
        private val logger = LogManager
            .getLogger(DependencyResolutionBeanPostProcessor::class.java)
    }

    init {
        logger.info("Created DependencyResolutionBeanPostProcessor instance")
    }
}