package app ;
import com.genexus.*;

public final  class StructSdtTDevPieCopy1_Level2Item implements Cloneable, java.io.Serializable
{
   public StructSdtTDevPieCopy1_Level2Item( )
   {
      this( -1, new ModelContext( StructSdtTDevPieCopy1_Level2Item.class ));
   }

   public StructSdtTDevPieCopy1_Level2Item( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_Devobs = "" ;
      gxTv_SdtTDevPieCopy1_Level2Item_Mode = "" ;
      gxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z = "" ;
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

   public byte getDevlin( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Devlin ;
   }

   public void setDevlin( byte value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Devlin = value ;
   }

   public String getDevobs( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Devobs ;
   }

   public void setDevobs( String value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Devobs = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Initialized = value ;
   }

   public byte getDevlin_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Devlin_Z ;
   }

   public void setDevlin_Z( byte value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Devlin_Z = value ;
   }

   public String getDevobs_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z ;
   }

   public void setDevobs_Z( String value )
   {
      gxTv_SdtTDevPieCopy1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z = value ;
   }

   protected byte gxTv_SdtTDevPieCopy1_Level2Item_Devlin ;
   protected byte gxTv_SdtTDevPieCopy1_Level2Item_Devlin_Z ;
   private byte gxTv_SdtTDevPieCopy1_Level2Item_N ;
   protected short gxTv_SdtTDevPieCopy1_Level2Item_Modified ;
   protected short gxTv_SdtTDevPieCopy1_Level2Item_Initialized ;
   protected String gxTv_SdtTDevPieCopy1_Level2Item_Devobs ;
   protected String gxTv_SdtTDevPieCopy1_Level2Item_Mode ;
   protected String gxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z ;
}

