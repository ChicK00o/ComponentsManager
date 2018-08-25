package me.vponomarenko.componentmanager

import android.app.Application
import me.vponomarenko.componentmanager.di.AppComponent
import me.vponomarenko.injectionmanager.IHasComponent
import me.vponomarenko.injectionmanager.InjectionManager

/**
 * Author: Valery Ponomarenko
 * Date: 25/08/2018
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class App : Application(), IHasComponent {

    override fun onCreate() {
        super.onCreate()
        InjectionManager.instance
            .bindComponent<AppComponent>(this)
            .inject(this)
    }

    override fun createComponent() = AppComponent.Initializer.init()
}