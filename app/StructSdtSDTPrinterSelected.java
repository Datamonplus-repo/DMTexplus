package app ;
import com.genexus.*;

public final  class StructSdtSDTPrinterSelected implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPrinterSelected( )
   {
      this( -1, new ModelContext( StructSdtSDTPrinterSelected.class ));
   }

   public StructSdtSDTPrinterSelected( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtSDTPrinterSelected_Name = "" ;
      gxTv_SdtSDTPrinterSelected_Path = "" ;
      gxTv_SdtSDTPrinterSelected_Status = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getName( )
   {
      return gxTv_SdtSDTPrinterSelected_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Name = value ;
   }

   public String getPath( )
   {
      return gxTv_SdtSDTPrinterSelected_Path ;
   }

   public void setPath( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Path = value ;
   }

   public String getStatus( )
   {
      return gxTv_SdtSDTPrinterSelected_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Status = value ;
   }

   protected byte gxTv_SdtSDTPrinterSelected_N ;
   protected String gxTv_SdtSDTPrinterSelected_Name ;
   protected String gxTv_SdtSDTPrinterSelected_Path ;
   protected String gxTv_SdtSDTPrinterSelected_Status ;
}

