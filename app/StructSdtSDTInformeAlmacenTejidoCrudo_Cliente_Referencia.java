package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class ));
   }

   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> getReferencias( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias ;
   }

   public void setReferencias( java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom ;
   protected java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias=null ;
}

