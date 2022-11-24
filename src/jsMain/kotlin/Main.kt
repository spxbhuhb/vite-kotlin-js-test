/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("unused")

import hu.simplexion.kotlin.test.vite.frontend.browser.Routing
import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppDarkTheme
import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppLightTheme
import hu.simplexion.kotlin.test.vite.resources.strings
import zakadabar.core.browser.application.ZkApplication
import zakadabar.core.browser.application.application
import zakadabar.core.browser.util.io
import zakadabar.core.resource.initTheme

object ViteMain {

    fun viteMain() {

        application = ZkApplication()

        zakadabar.lib.accounts.browser.install(application)
        zakadabar.lib.i18n.browser.install(application)
        zakadabar.softui.browser.install()

        io {

            with(application) {

                initSession()

                initTheme(AppLightTheme(), AppDarkTheme())

                initLocale(strings)

                initRouting(Routing())

                run()

            }

        }

    }
}