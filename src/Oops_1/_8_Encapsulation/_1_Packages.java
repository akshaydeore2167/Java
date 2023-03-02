package Oops_1._8_Encapsulation;
//import Oops_1._8_Encapsulation.Package.*;
      //or
import Oops_1._8_Encapsulation.Package._1_Import_Package;

/*
-There are three ways to access the package from outside the package.

import package.*;
import package.classname;
fully qualified name.

-If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
-The import keyword is used to make the classes and interface of another package accessible to the current package.

 */


public class _1_Packages {
    public static void main(String[] args) {
        _1_Import_Package i1=new _1_Import_Package();
        i1.print();



    }
}
/*
1.A java package is a group of similar types of classes, interfaces and sub-packages.
2.Two types of packages-:1.user defined.
                         2.Built in packages.
3.Advantage of Java Package
1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

2) Java package provides access protection.

3) Java package removes naming collision.


 */