Design Pattern in Java Creational
Pattern contains other pattern it is framework.
Class 3: 
	C:\Code\Java\DPJC-3-BuilderPattern1
	builder pattern with demo.
	builder pattern StringBuilder.
	Immutable, inner static class, design first and complexity.
	handel complex constructor, no interface required, can be a sperate class. 
		easy to work with legacy code. inner class could be external. 
	v/s prototype: work around clone, avoid complex constructors, difficult with legacy code.

Class 4: Prototype. Unique instance of the same object.
	SQL Stmt, you want original copy and hange little bit.
	avoid costly creation, avoid subclass??, dont use new, use clone, itilize interface, imp regestrey.
	u can decide shallow / deep copy.
	Some time not clear when to use. Deep copy sometime don't solve the probelm.
	Light weight constructor, copy it self, quick, v.s, give uniqe instance, 
	factory, flexbile object, multiple constrctor, conrete instance, fresh instance, dont get default value.
	
	