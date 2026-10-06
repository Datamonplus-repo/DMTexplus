package app ;
import com.genexus.*;

public final  class StructSdtGoogleChart_Series implements Cloneable, java.io.Serializable
{
   public StructSdtGoogleChart_Series( )
   {
      this( -1, new ModelContext( StructSdtGoogleChart_Series.class ));
   }

   public StructSdtGoogleChart_Series( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtGoogleChart_Series_Name = "" ;
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(1) ;
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
      return gxTv_SdtGoogleChart_Series_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_Name = value ;
   }

   public java.util.Vector getValues( )
   {
      return gxTv_SdtGoogleChart_Series_Values ;
   }

   public void setValues( java.util.Vector value )
   {
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_Values = value ;
   }

   protected byte gxTv_SdtGoogleChart_Series_Values_N ;
   protected byte gxTv_SdtGoogleChart_Series_N ;
   protected String gxTv_SdtGoogleChart_Series_Name ;
   protected java.util.Vector gxTv_SdtGoogleChart_Series_Values=null ;
}

