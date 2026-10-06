package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenTejidoCrudo_Cliente implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente.class ));
   }

   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> getUnidadespiezas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas ;
   }

   public void setUnidadespiezas( java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom ;
   protected java.util.Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas=null ;
}

