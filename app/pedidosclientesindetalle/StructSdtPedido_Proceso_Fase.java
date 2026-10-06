package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Proceso_Fase implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Proceso_Fase( )
   {
      this( -1, new ModelContext( StructSdtPedido_Proceso_Fase.class ));
   }

   public StructSdtPedido_Proceso_Fase( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtPedido_Proceso_Fase_Fascod = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc = "" ;
      gxTv_SdtPedido_Proceso_Fase_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fascod_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = "" ;
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

   public short getDisfaslin( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disfaslin ;
   }

   public void setDisfaslin( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Disfaslin = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc = value ;
   }

   public short getDisquiul( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disquiul ;
   }

   public void setDisquiul( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Disquiul = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico> getTratamientoquimico( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico ;
   }

   public void setTratamientoquimico( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico> value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro> getParametro( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro ;
   }

   public void setParametro( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro> value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Initialized = value ;
   }

   public short getDisfaslin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z ;
   }

   public void setDisfaslin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z = value ;
   }

   public String getFascod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fascod_Z ;
   }

   public void setFascod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Fascod_Z = value ;
   }

   public String getFasdsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z ;
   }

   public void setFasdsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = value ;
   }

   public short getDisquiul_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disquiul_Z ;
   }

   public void setDisquiul_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Disquiul_Z = value ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_N ;
   protected short gxTv_SdtPedido_Proceso_Fase_Disfaslin ;
   protected short gxTv_SdtPedido_Proceso_Fase_Disquiul ;
   protected short gxTv_SdtPedido_Proceso_Fase_Modified ;
   protected short gxTv_SdtPedido_Proceso_Fase_Initialized ;
   protected short gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z ;
   protected short gxTv_SdtPedido_Proceso_Fase_Disquiul_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_Fascod ;
   protected String gxTv_SdtPedido_Proceso_Fase_Fasdsc ;
   protected String gxTv_SdtPedido_Proceso_Fase_Mode ;
   protected String gxTv_SdtPedido_Proceso_Fase_Fascod_Z ;
   protected String gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico> gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico=null ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro> gxTv_SdtPedido_Proceso_Fase_Parametro=null ;
}

