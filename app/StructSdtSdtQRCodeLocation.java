package app ;
import com.genexus.*;

public final  class StructSdtSdtQRCodeLocation implements Cloneable, java.io.Serializable
{
   public StructSdtSdtQRCodeLocation( )
   {
      this( -1, new ModelContext( StructSdtSdtQRCodeLocation.class ));
   }

   public StructSdtSdtQRCodeLocation( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtSdtQRCodeLocation_Address = "" ;
      gxTv_SdtSdtQRCodeLocation_Lng = "" ;
      gxTv_SdtSdtQRCodeLocation_Lat = "" ;
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

   public String getAddress( )
   {
      return gxTv_SdtSdtQRCodeLocation_Address ;
   }

   public void setAddress( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Address = value ;
   }

   public String getLng( )
   {
      return gxTv_SdtSdtQRCodeLocation_Lng ;
   }

   public void setLng( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Lng = value ;
   }

   public String getLat( )
   {
      return gxTv_SdtSdtQRCodeLocation_Lat ;
   }

   public void setLat( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Lat = value ;
   }

   protected byte gxTv_SdtSdtQRCodeLocation_N ;
   protected String gxTv_SdtSdtQRCodeLocation_Address ;
   protected String gxTv_SdtSdtQRCodeLocation_Lng ;
   protected String gxTv_SdtSdtQRCodeLocation_Lat ;
}

