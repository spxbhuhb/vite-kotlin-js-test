/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package hu.simplexion.kotlin.test.vite.frontend.browser

import hu.simplexion.kotlin.test.vite.frontend.browser.pages.ExampleEntityCrud
import hu.simplexion.kotlin.test.vite.frontend.browser.pages.Home
import zakadabar.core.browser.application.ZkAppRouting

class Routing : ZkAppRouting(DefaultLayout, Home) {

    init {
        zakadabar.lib.accounts.browser.install(this)
        zakadabar.lib.i18n.browser.install(this)
        + Home
        + ExampleEntityCrud()
    }

}