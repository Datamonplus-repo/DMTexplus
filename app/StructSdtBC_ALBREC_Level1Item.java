package app ;
import com.genexus.*;

public final  class StructSdtBC_ALBREC_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtBC_ALBREC_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtBC_ALBREC_Level1Item.class ));
   }

   public StructSdtBC_ALBREC_Level1Item( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs = "" ;
      gxTv_SdtBC_ALBREC_Level1Item_Mode = "" ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = "" ;
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

   public byte getAlbrlin( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrlin ;
   }

   public void setAlbrlin( byte value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrlin = value ;
   }

   public String getAlbrobs( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrobs ;
   }

   public void setAlbrobs( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Initialized = value ;
   }

   public byte getAlbrlin_Z( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z ;
   }

   public void setAlbrlin_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z = value ;
   }

   public String getAlbrobs_Z( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z ;
   }

   public void setAlbrobs_Z( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = value ;
   }

   protected byte gxTv_SdtBC_ALBREC_Level1Item_Albrlin ;
   protected byte gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z ;
   private byte gxTv_SdtBC_ALBREC_Level1Item_N ;
   protected short gxTv_SdtBC_ALBREC_Level1Item_Modified ;
   protected short gxTv_SdtBC_ALBREC_Level1Item_Initialized ;
   protected String gxTv_SdtBC_ALBREC_Level1Item_Albrobs ;
   protected String gxTv_SdtBC_ALBREC_Level1Item_Mode ;
   protected String gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z ;
}

