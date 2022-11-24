/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.frontend.browser.pages

import hu.simplexion.kotlin.test.vite.frontend.browser.resources.appStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.util.plusAssign

object Home : ZkPage() {

    override fun onCreate() {
        classList += appStyles.home

        + "This is the home page of your application. Click on \"Login\" (on the left) and use \"so\" - \"so\" to log in."
    }

}