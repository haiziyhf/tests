# Android apps
=======================

## Diana 框架
> gitlab: ssh://git@192.168.1.11:10022/xxstop/diana.git

###使用组件

```java
    compile 'com.android.support:appcompat-v7:22.1.1'
    compile 'com.android.support:support-v4:22.1.1'
    compile 'com.google.guava:guava:18.0'
    compile 'org.apache.commons:commons-lang3:3.4'
    compile 'org.roboguice:roboguice:3.0.1'
    compile 'com.loopj.android:android-async-http:1.4.6'
    compile 'de.greenrobot:greendao:1.3.7'
    compile 'com.nostra13.universalimageloader:universal-image-loader:1.9.3'
    compile 'net.simonvt.menudrawer:menudrawer:3.0.6'
```

### 目录结构
* core 核心类库
* local 共享/共用类
    - controller 控制器类
    - data req/resp类
    - exception 异常类
    - handler handler类
    - model 模型类
    - util 工具类
* util 工具类

### 项目目录结构
* controller 控制器类
* data req/resp类
* model 模型类
* ui 视图类

## LttCustomer 客户端
> gitlab: ssh://git@192.168.1.11:10022/xxstop/zac.git

### 使用组件

```java
    compile 'com.android.support:appcompat-v7:22.1.1'
    compile 'com.android.support:support-v4:22.1.1'
    compile 'com.beardedhen:androidbootstrap:1.2.1'
    compile 'info.hoang8f:android-segmented:1.0.5'
    compile 'net.glxn.qrgen:android:2.0'
    compile project(':diana')
    provided 'org.roboguice:roboblender:3.0.1'
```

## LttMerchant: 两条腿商户端
> gitlab: ssh://git@192.168.1.11:10022/xxstop/zac.git

### 使用组件

```java
    compile 'com.android.support:appcompat-v7:22.1.1'
    compile 'com.android.support:support-v4:22.1.1'
    compile 'com.beardedhen:androidbootstrap:1.2.1'
    compile 'info.hoang8f:android-segmented:1.0.5'
    compile 'com.dlazaro66.qrcodereaderview:qrcodereaderview:1.0.0'
    compile project(':diana')
    provided 'org.roboguice:roboblender:3.0.1'
```
