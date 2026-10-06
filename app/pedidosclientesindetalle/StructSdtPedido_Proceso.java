package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Proceso implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Proceso( )
   {
      this( -1, new ModelContext( StructSdtPedido_Proceso.class ));
   }

   public StructSdtPedido_Proceso( int remoteHandle ,
                                   ModelContext context )
   {
      gxTv_SdtPedido_Proceso_Procod = "" ;
      gxTv_SdtPedido_Proceso_Prodsc = "" ;
      gxTv_SdtPedido_Proceso_Mode = "" ;
      gxTv_SdtPedido_Proceso_Procod_Z = "" ;
      gxTv_SdtPedido_Proceso_Prodsc_Z = "" ;
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

   public String getProcod( )
   {
      return gxTv_SdtPedido_Proceso_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Procod = value ;
   }

   public String getProdsc( )
   {
      return gxTv_SdtPedido_Proceso_Prodsc ;
   }

   public void setProdsc( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Prodsc = value ;
   }

   public short getUltfaslin( )
   {
      return gxTv_SdtPedido_Proceso_Ultfaslin ;
   }

   public void setUltfaslin( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Ultfaslin = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase> getFase( )
   {
      return gxTv_SdtPedido_Proceso_Fase ;
   }

   public void setFase( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase> value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Proceso_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Proceso_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Proceso_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Initialized = value ;
   }

   public String getProcod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Procod_Z ;
   }

   public void setProcod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Procod_Z = value ;
   }

   public String getProdsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Prodsc_Z ;
   }

   public void setProdsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Prodsc_Z = value ;
   }

   public short getUltfaslin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Ultfaslin_Z ;
   }

   public void setUltfaslin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Ultfaslin_Z = value ;
   }

   private byte gxTv_SdtPedido_Proceso_N ;
   protected short gxTv_SdtPedido_Proceso_Ultfaslin ;
   protected short gxTv_SdtPedido_Proceso_Modified ;
   protected short gxTv_SdtPedido_Proceso_Initialized ;
   protected short gxTv_SdtPedido_Proceso_Ultfaslin_Z ;
   protected String gxTv_SdtPedido_Proceso_Procod ;
   protected String gxTv_SdtPedido_Proceso_Prodsc ;
   protected String gxTv_SdtPedido_Proceso_Mode ;
   protected String gxTv_SdtPedido_Proceso_Procod_Z ;
   protected String gxTv_SdtPedido_Proceso_Prodsc_Z ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase> gxTv_SdtPedido_Proceso_Fase=null ;
}

