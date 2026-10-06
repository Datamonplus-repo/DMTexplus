package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Proceso_Fase_TratamientoQuimico implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Proceso_Fase_TratamientoQuimico( )
   {
      this( -1, new ModelContext( StructSdtPedido_Proceso_Fase_TratamientoQuimico.class ));
   }

   public StructSdtPedido_Proceso_Fase_TratamientoQuimico( int remoteHandle ,
                                                           ModelContext context )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = "" ;
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

   public short getDisquilin( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin ;
   }

   public void setDisquilin( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin = value ;
   }

   public String getProforcod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod ;
   }

   public void setProforcod( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = value ;
   }

   public String getProfordsc( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc ;
   }

   public void setProfordsc( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized = value ;
   }

   public short getDisquilin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z ;
   }

   public void setDisquilin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z = value ;
   }

   public String getProforcod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z ;
   }

   public void setProforcod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = value ;
   }

   public String getProfordsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z ;
   }

   public void setProfordsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = value ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N ;
   protected short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin ;
   protected short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified ;
   protected short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized ;
   protected short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod ;
   protected String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc ;
   protected String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode ;
   protected String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z ;
}

