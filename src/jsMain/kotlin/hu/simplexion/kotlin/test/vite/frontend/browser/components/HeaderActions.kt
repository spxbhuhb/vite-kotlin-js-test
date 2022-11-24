/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.frontend.browser.components

import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppDarkTheme
import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppLightTheme
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.resource.ZkIcons

class HeaderActions : ZkElement() {

    override fun onCreate() {
        + ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        )
    }

}