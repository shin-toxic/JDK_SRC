package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, May 7, 2014 12:49:10 PM PDT
*/


/**
   * Provides the server-side ORB service with access to the applicable 
   * policies during IOR construction and the ability to add components. 
   * The ORB passes an instance of its implementation of this interface as 
   * a parameter to <code>IORInterceptor.establish_components</code>.
   *
   * @see IORInterceptor
   */
public interface IORInfo extends IORInfoOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface IORInfo
