package app.devops ;
import com.genexus.*;

public final  class StructSdtBuildVersion implements Cloneable, java.io.Serializable
{
   public StructSdtBuildVersion( )
   {
      this( -1, new ModelContext( StructSdtBuildVersion.class ));
   }

   public StructSdtBuildVersion( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtBuildVersion_Build_number = "" ;
      gxTv_SdtBuildVersion_Product = "" ;
      gxTv_SdtBuildVersion_Date = "" ;
      gxTv_SdtBuildVersion_Release = "" ;
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

   public String getBuild_number( )
   {
      return gxTv_SdtBuildVersion_Build_number ;
   }

   public void setBuild_number( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Build_number = value ;
   }

   public String getProduct( )
   {
      return gxTv_SdtBuildVersion_Product ;
   }

   public void setProduct( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Product = value ;
   }

   public String getDate( )
   {
      return gxTv_SdtBuildVersion_Date ;
   }

   public void setDate( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Date = value ;
   }

   public String getRelease( )
   {
      return gxTv_SdtBuildVersion_Release ;
   }

   public void setRelease( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Release = value ;
   }

   protected byte gxTv_SdtBuildVersion_N ;
   protected String gxTv_SdtBuildVersion_Release ;
   protected String gxTv_SdtBuildVersion_Build_number ;
   protected String gxTv_SdtBuildVersion_Product ;
   protected String gxTv_SdtBuildVersion_Date ;
}

