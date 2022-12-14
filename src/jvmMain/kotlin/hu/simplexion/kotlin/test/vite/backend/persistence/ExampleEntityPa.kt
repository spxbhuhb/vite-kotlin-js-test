/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package hu.simplexion.kotlin.test.vite.backend.persistence

import hu.simplexion.kotlin.test.vite.data.ExampleEntityBo
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import zakadabar.core.persistence.exposed.ExposedPaBase
import zakadabar.core.persistence.exposed.entityId

open class ExampleEntityPa : ExposedPaBase<ExampleEntityBo, ExampleEntityTable>(
    table = ExampleEntityTable
) {
    override fun ResultRow.toBo() = ExampleEntityBo(
        id = this[table.id].entityId(),
        name = this[ExampleEntityTable.name]
    )

    override fun UpdateBuilder<*>.fromBo(bo: ExampleEntityBo) {
        this[ExampleEntityTable.name] = bo.name
    }
}