object Dependencies {

    val coreKts by lazy {"androidx.core:core-ktx:${Versions.coreKts}"}
    val appcompat by lazy {"androidx.appcompat:appcompat:${Versions.appCompat}"}
    val material by lazy {"com.google.android.material:material:${Versions.material}"}
    val lifecycleRuntimeKtx by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy {"androidx.compose.ui:ui"}
    val composeUiGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composeUiTooling by lazy {"androidx.compose.ui:ui-tooling:${Versions.composeUiTooling}"}
    val composeUiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 by lazy {"androidx.compose.material3:material3"}
    val navigationCompose by lazy {"androidx.navigation:navigation-compose:${Versions.navigationCompose}"}
    val composeTestJUnit4 by lazy {"androidx.compose.ui:ui-test-junit4:${Versions.composeTestJUnit4}"}
    val composeUiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest"}
    val lifecycleViewModelKtx by lazy {"androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}"}

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
}
