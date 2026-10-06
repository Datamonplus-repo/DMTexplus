package app ;
import com.genexus.*;

public final  class StructSdtGoogleChart implements Cloneable, java.io.Serializable
{
   public StructSdtGoogleChart( )
   {
      this( -1, new ModelContext( StructSdtGoogleChart.class ));
   }

   public StructSdtGoogleChart( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtGoogleChart_Categories_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Series_N = (byte)(1) ;
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

   public java.util.Vector getCategories( )
   {
      return gxTv_SdtGoogleChart_Categories ;
   }

   public void setCategories( java.util.Vector value )
   {
      gxTv_SdtGoogleChart_Categories_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Categories = value ;
   }

   public java.util.Vector<app.StructSdtGoogleChart_Series> getSeries( )
   {
      return gxTv_SdtGoogleChart_Series ;
   }

   public void setSeries( java.util.Vector<app.StructSdtGoogleChart_Series> value )
   {
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series = value ;
   }

   protected byte gxTv_SdtGoogleChart_Categories_N ;
   protected byte gxTv_SdtGoogleChart_Series_N ;
   protected byte gxTv_SdtGoogleChart_N ;
   protected java.util.Vector gxTv_SdtGoogleChart_Categories=null ;
   protected java.util.Vector<app.StructSdtGoogleChart_Series> gxTv_SdtGoogleChart_Series=null ;
}

