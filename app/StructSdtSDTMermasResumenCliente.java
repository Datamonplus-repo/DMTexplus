package app ;
import com.genexus.*;

public final  class StructSdtSDTMermasResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtSDTMermasResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtSDTMermasResumenCliente.class ));
   }

   public StructSdtSDTMermasResumenCliente( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtSDTMermasResumenCliente_Clinom = "" ;
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(1) ;
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
      return gxTv_SdtSDTMermasResumenCliente_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTMermasResumenCliente_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTMermasResumenCliente_ResumenItem> getResumen( )
   {
      return gxTv_SdtSDTMermasResumenCliente_Resumen ;
   }

   public void setResumen( java.util.Vector<app.StructSdtSDTMermasResumenCliente_ResumenItem> value )
   {
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Resumen = value ;
   }

   protected byte gxTv_SdtSDTMermasResumenCliente_Resumen_N ;
   protected byte gxTv_SdtSDTMermasResumenCliente_N ;
   protected int gxTv_SdtSDTMermasResumenCliente_Clicod ;
   protected String gxTv_SdtSDTMermasResumenCliente_Clinom ;
   protected java.util.Vector<app.StructSdtSDTMermasResumenCliente_ResumenItem> gxTv_SdtSDTMermasResumenCliente_Resumen=null ;
}

