package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenTejidoCrudo_Detalle implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenTejidoCrudo_Detalle( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenTejidoCrudo_Detalle.class ));
   }

   public StructSdtSDTInformeAlmacenTejidoCrudo_Detalle( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> getLineas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas ;
   }

   public void setLineas( java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom ;
   protected java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas=null ;
}

