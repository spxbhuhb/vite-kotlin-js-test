/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.frontend.browser.components

import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppDarkTheme
import hu.simplexion.kotlin.test.vite.frontend.browser.resources.AppLightTheme
import zakadabar.core.browser.application.application
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.browser.util.marginRight
import zakadabar.core.resource.ZkIcons
import zakadabar.core.resource.css.AlignSelf
import zakadabar.core.resource.css.Display
import zakadabar.core.resource.css.px
import zakadabar.softui.browser.titlebar.SuiAppHeader

class AppHeader(
    onToggleSideBar: () -> Unit = { },
) : SuiAppHeader(onToggleSideBar) {

    override fun onCreate() {
        super.onCreate()

        titleContainer += zke {
            + Display.flex
            + AlignSelf.center

            element.style.fontSize = 14.px

            + div { + application.serverDescription.name } marginRight 20.px
            + application.serverDescription.version
        }

        globalElements += ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        )
    }

}