/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.backend.business

import hu.simplexion.kotlin.test.vite.backend.persistence.ExampleEntityPa
import hu.simplexion.kotlin.test.vite.data.ExampleEntityBo
import zakadabar.core.authorize.BusinessLogicAuthorizer
import zakadabar.core.business.EntityBusinessLogicBase

/**
 * Business Logic for ExampleEntityBo.
 *
 * Generated with Bender at 2021-06-01T09:28:42.142Z.
 */
open class ExampleEntityBl : EntityBusinessLogicBase<ExampleEntityBo>(
    boClass = ExampleEntityBo::class
) {

    override val pa = ExampleEntityPa()

    override val authorizer: BusinessLogicAuthorizer<ExampleEntityBo> by provider()

}