package app ;
import com.genexus.*;

public final  class StructSdtTMRCom_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtTMRCom_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtTMRCom_Level1Item.class ));
   }

   public StructSdtTMRCom_Level1Item( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom = "" ;
      gxTv_SdtTMRCom_Level1Item_Mode = "" ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = "" ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(1) ;
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

   public int getMrcomcod( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomcod ;
   }

   public void setMrcomcod( int value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomcod = value ;
   }

   public String getMrcomnom( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom ;
   }

   public void setMrcomnom( String value )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtTMRCom_Level1Item_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTMRCom_Level1Item_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Initialized = value ;
   }

   public int getMrcomcod_Z( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z ;
   }

   public void setMrcomcod_Z( int value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z = value ;
   }

   public String getMrcomnom_Z( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z ;
   }

   public void setMrcomnom_Z( String value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = value ;
   }

   public byte getMrcomnom_N( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom_N ;
   }

   public void setMrcomnom_N( byte value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = value ;
   }

   protected byte gxTv_SdtTMRCom_Level1Item_Mrcomnom_N ;
   private byte gxTv_SdtTMRCom_Level1Item_N ;
   protected short gxTv_SdtTMRCom_Level1Item_Modified ;
   protected short gxTv_SdtTMRCom_Level1Item_Initialized ;
   protected int gxTv_SdtTMRCom_Level1Item_Mrcomcod ;
   protected int gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z ;
   protected String gxTv_SdtTMRCom_Level1Item_Mrcomnom ;
   protected String gxTv_SdtTMRCom_Level1Item_Mode ;
   protected String gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z ;
}

