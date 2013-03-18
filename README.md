CQ Commerce implementation sample
=======================

A simple example that shows how to implement the CQ Commerce API.

This content package provides a bundle with a new custom implementation of the CQ Commerce API.
The bundle doesn't provide any particular extension; it just help understanding how to set it up and define it as the commerce provider.

Installation
===========

mvn clean install -P installPackage

change /content/geometrixx-outdoors/en/jcr:content/cq:commerceProvider value to 'training'
