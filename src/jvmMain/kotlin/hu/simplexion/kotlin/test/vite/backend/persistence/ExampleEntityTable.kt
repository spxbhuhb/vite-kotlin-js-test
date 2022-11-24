/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.backend.persistence

import hu.simplexion.kotlin.test.vite.data.ExampleEntityBo
import zakadabar.core.persistence.exposed.ExposedPaTable

object ExampleEntityTable : ExposedPaTable<ExampleEntityBo>(
    tableName = "example_entity"
) {

    internal val name = varchar("name", 100)

}