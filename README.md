Test project for Vite - Kotlin/JS integration.

User and password for web app login: `so` / `so`.

To start the backend:

```shell
./gradlew run
```

To install vite:

```shell
npm install vite@latest
```

To start the project with vite:

```shell
./gradlew jsMainClasses
cd build/js
cp ../../template/vite/* ./
npm run dev
```

`template/vite/main.js` calls the `ViteMain.viteMain` function.