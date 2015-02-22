/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace BerkeleyDB.Internal {

using System;
using System.Runtime.InteropServices;

internal class DB_KEY_RANGE : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DB_KEY_RANGE(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(DB_KEY_RANGE obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~DB_KEY_RANGE() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libdb_csharpPINVOKE.delete_DB_KEY_RANGE(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  internal double less {
    get {
      double ret = libdb_csharpPINVOKE.DB_KEY_RANGE_less_get(swigCPtr);
      return ret;
    } 
  }

  internal double equal {
    get {
      double ret = libdb_csharpPINVOKE.DB_KEY_RANGE_equal_get(swigCPtr);
      return ret;
    } 
  }

  internal double greater {
    get {
      double ret = libdb_csharpPINVOKE.DB_KEY_RANGE_greater_get(swigCPtr);
      return ret;
    } 
  }

  internal DB_KEY_RANGE() : this(libdb_csharpPINVOKE.new_DB_KEY_RANGE(), true) {
  }

}

}
