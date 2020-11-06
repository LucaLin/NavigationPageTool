# NavigationPageTool
使用kotlin的一個Navigation的簡易範例，包含換頁效果與參數傳送

step1：在gradle中導入所需套件

*專案層級的gradle中：

dependencies {

        //your dependencies here
        //...
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.0.0"
    }

    
*應用程式的gradle中：

        apply plugin: 'androidx.navigation.safeargs.kotlin'



step2：在res資料夾中建立navigation resourse
