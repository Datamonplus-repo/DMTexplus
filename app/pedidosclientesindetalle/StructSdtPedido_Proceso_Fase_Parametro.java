package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Proceso_Fase_Parametro implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Proceso_Fase_Parametro( )
   {
      this( -1, new ModelContext( StructSdtPedido_Proceso_Fase_Parametro.class ));
   }

   public StructSdtPedido_Proceso_Fase_Parametro( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = "" ;
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

   public short getParfascod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod ;
   }

   public void setParfascod( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod = value ;
   }

   public String getDisparvl2( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 ;
   }

   public void setDisparvl2( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = value ;
   }

   public String getDisparobs( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs ;
   }

   public void setDisparobs( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized = value ;
   }

   public short getParfascod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z ;
   }

   public void setParfascod_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z = value ;
   }

   public String getDisparvl2_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z ;
   }

   public void setDisparvl2_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = value ;
   }

   public String getDisparobs_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z ;
   }

   public void setDisparobs_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = value ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_Parametro_N ;
   protected short gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod ;
   protected short gxTv_SdtPedido_Proceso_Fase_Parametro_Modified ;
   protected short gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized ;
   protected short gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 ;
   protected String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs ;
   protected String gxTv_SdtPedido_Proceso_Fase_Parametro_Mode ;
   protected String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z ;
}

