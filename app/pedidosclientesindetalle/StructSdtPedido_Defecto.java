package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Defecto implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Defecto( )
   {
      this( -1, new ModelContext( StructSdtPedido_Defecto.class ));
   }

   public StructSdtPedido_Defecto( int remoteHandle ,
                                   ModelContext context )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc = "" ;
      gxTv_SdtPedido_Defecto_Mode = "" ;
      gxTv_SdtPedido_Defecto_Tipdefdsc_Z = "" ;
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(1) ;
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

   public short getTipdefcod( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefdsc = value ;
   }

   public short getDefpor( )
   {
      return gxTv_SdtPedido_Defecto_Defpor ;
   }

   public void setDefpor( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Defpor = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Defecto_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Defecto_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Defecto_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Initialized = value ;
   }

   public short getTipdefcod_Z( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod_Z ;
   }

   public void setTipdefcod_Z( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefcod_Z = value ;
   }

   public String getTipdefdsc_Z( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc_Z ;
   }

   public void setTipdefdsc_Z( String value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefdsc_Z = value ;
   }

   public short getDefpor_Z( )
   {
      return gxTv_SdtPedido_Defecto_Defpor_Z ;
   }

   public void setDefpor_Z( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Defpor_Z = value ;
   }

   public byte getTipdefcod_N( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod_N ;
   }

   public void setTipdefcod_N( byte value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefcod_N = value ;
   }

   public byte getTipdefdsc_N( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc_N ;
   }

   public void setTipdefdsc_N( byte value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = value ;
   }

   protected byte gxTv_SdtPedido_Defecto_Tipdefcod_N ;
   protected byte gxTv_SdtPedido_Defecto_Tipdefdsc_N ;
   private byte gxTv_SdtPedido_Defecto_N ;
   protected short gxTv_SdtPedido_Defecto_Tipdefcod ;
   protected short gxTv_SdtPedido_Defecto_Defpor ;
   protected short gxTv_SdtPedido_Defecto_Modified ;
   protected short gxTv_SdtPedido_Defecto_Initialized ;
   protected short gxTv_SdtPedido_Defecto_Tipdefcod_Z ;
   protected short gxTv_SdtPedido_Defecto_Defpor_Z ;
   protected String gxTv_SdtPedido_Defecto_Tipdefdsc ;
   protected String gxTv_SdtPedido_Defecto_Mode ;
   protected String gxTv_SdtPedido_Defecto_Tipdefdsc_Z ;
}

