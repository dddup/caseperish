# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#指定代码的压缩级别
-optimizationpasses 5
#是否使用大小写混合
-dontusemixedcaseclassnames
#是否混淆第三方jar
-dontskipnonpubliclibraryclasses
#混淆时是否做预校验
-dontpreverify
#混淆时是否记录日志
-verbose

#-keep class com.fire.caseperish.**{*; }
-keep class android.app.servertransaction.ClientTransaction
-keepclassmembers class android.app.servertransaction.ClientTransaction{*;}
-keepclassmembers class com.fire.caseperish.CasePerish
-keep class com.fire.caseperish.CasePerish
-keep class com.fire.caseperish.ExceptionHandler
-keepclassmembers class com.fire.caseperish.CasePerish {
   public *;
}
-keep class me.weishu.reflection.Reflection
-keepclassmembers class me.weishu.reflection.Reflection{*;}
-keep class me.weishu.reflection.BootstrapClass
-keepclassmembers class me.weishu.reflection.BootstrapClass{*;}
#-keep class me.weishu.reflection.**{*; }
#-keep class me.weishu.freereflection.**{*; }
#-keep class me.weishu.**{*; }