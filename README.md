# AndroidTableView
程序的编写借鉴了SortableTableView的编码思路(https://github.com/ISchwarz23/SortableTableView), 基于GridLayout实现了跨行、列合并单元格。<br>
![github](https://github.com/WJKCharlie/AndroidTableView/raw/master/screenshot/2.gif)

# 结构图如下
![github](https://github.com/WJKCharlie/AndroidTableView/raw/master/screenshot/1.png)

# 添加依赖到自己的项目
### 1、在根目录的build.gradle添加如下代码
```Java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### 2、在项目所在目录的build.gradle添加如下代码
```Java
dependencies {
          ...
	        compile 'com.github.WJKCharlie:AndroidTableView:V1.0.0'
	}
```
