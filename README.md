CQ Commerce implementation sample
=================================

A simple example that shows how to implement the CQ Commerce API.

This content package provides a bundle with a new custom implementation of the CQ Commerce API.
The bundle doesn't provide any particular extension; it just help understanding how to set it up and define it as the commerce provider.

Prerequisites
=============

A clean installation of Adobe Experience Manager 5.6.1 with the Geometrixx Outdoors demo site.

Installation
===========

    mvn clean install -P installPackage

Change `/content/geometrixx-outdoors/en/jcr:content/cq:commerceProvider` value from `geometrixx` to `training` and then view a commerce page such as [http://localhost:4502/cf#/content/geometrixx-outdoors/en/equipment/skiing/banff-snow.html](http://localhost:4502/cf#/content/geometrixx-outdoors/en/equipment/skiing/banff-snow.html)
