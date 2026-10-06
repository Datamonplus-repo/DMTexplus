package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido_Norma implements Cloneable, java.io.Serializable
{
   public StructSdtPedido_Norma( )
   {
      this( -1, new ModelContext( StructSdtPedido_Norma.class ));
   }

   public StructSdtPedido_Norma( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtPedido_Norma_Disnormid = "" ;
      gxTv_SdtPedido_Norma_Disnormdsc = "" ;
      gxTv_SdtPedido_Norma_Disnormst = "" ;
      gxTv_SdtPedido_Norma_Disnormnc = "" ;
      gxTv_SdtPedido_Norma_Mode = "" ;
      gxTv_SdtPedido_Norma_Disnormid_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormdsc_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormst_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormnc_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(1) ;
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

   public String getDisnormid( )
   {
      return gxTv_SdtPedido_Norma_Disnormid ;
   }

   public void setDisnormid( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormid = value ;
   }

   public String getDisnormdsc( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc ;
   }

   public void setDisnormdsc( String value )
   {
      gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormdsc = value ;
   }

   public String getDisnormst( )
   {
      return gxTv_SdtPedido_Norma_Disnormst ;
   }

   public void setDisnormst( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormst = value ;
   }

   public String getDisnormnc( )
   {
      return gxTv_SdtPedido_Norma_Disnormnc ;
   }

   public void setDisnormnc( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormnc = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Norma_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtPedido_Norma_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Norma_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Initialized = value ;
   }

   public String getDisnormid_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormid_Z ;
   }

   public void setDisnormid_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormid_Z = value ;
   }

   public String getDisnormdsc_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc_Z ;
   }

   public void setDisnormdsc_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormdsc_Z = value ;
   }

   public String getDisnormst_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormst_Z ;
   }

   public void setDisnormst_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormst_Z = value ;
   }

   public String getDisnormnc_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormnc_Z ;
   }

   public void setDisnormnc_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormnc_Z = value ;
   }

   public byte getDisnormdsc_N( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc_N ;
   }

   public void setDisnormdsc_N( byte value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Disnormdsc_N = value ;
   }

   protected byte gxTv_SdtPedido_Norma_Disnormdsc_N ;
   private byte gxTv_SdtPedido_Norma_N ;
   protected short gxTv_SdtPedido_Norma_Modified ;
   protected short gxTv_SdtPedido_Norma_Initialized ;
   protected String gxTv_SdtPedido_Norma_Disnormid ;
   protected String gxTv_SdtPedido_Norma_Disnormdsc ;
   protected String gxTv_SdtPedido_Norma_Disnormst ;
   protected String gxTv_SdtPedido_Norma_Disnormnc ;
   protected String gxTv_SdtPedido_Norma_Mode ;
   protected String gxTv_SdtPedido_Norma_Disnormid_Z ;
   protected String gxTv_SdtPedido_Norma_Disnormdsc_Z ;
   protected String gxTv_SdtPedido_Norma_Disnormst_Z ;
   protected String gxTv_SdtPedido_Norma_Disnormnc_Z ;
}

