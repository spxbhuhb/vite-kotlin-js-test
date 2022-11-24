/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
export default {
    optimizeDeps: {
        include: ['vite-kotlin-js-test']
    },
    build: {
        commonjsOptions: {
            include: [/vite-kotlin-js-test/, /node_modules/]
        }
    },
    server: {
        proxy: {
            '/api': 'http://localhost:8080'
        }
    }
}
