package app ;
import com.genexus.*;

public final  class StructSdtTUSUARI_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtTUSUARI_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtTUSUARI_Level1Item.class ));
   }

   public StructSdtTUSUARI_Level1Item( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtTUSUARI_Level1Item_Grpid = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt = "" ;
      gxTv_SdtTUSUARI_Level1Item_Mode = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grpid_Z = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(1) ;
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

   public String getGrpid( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grpid ;
   }

   public void setGrpid( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grpid = value ;
   }

   public String getGrptxt( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt ;
   }

   public void setGrptxt( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt = value ;
   }

   public byte getGrppri( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grppri ;
   }

   public void setGrppri( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grppri = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Mode = value ;
   }

   public short getModified( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Modified ;
   }

   public void setModified( short value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Initialized = value ;
   }

   public String getGrpid_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grpid_Z ;
   }

   public void setGrpid_Z( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grpid_Z = value ;
   }

   public String getGrptxt_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt_Z ;
   }

   public void setGrptxt_Z( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = value ;
   }

   public byte getGrppri_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grppri_Z ;
   }

   public void setGrppri_Z( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grppri_Z = value ;
   }

   public byte getGrptxt_N( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt_N ;
   }

   public void setGrptxt_N( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = value ;
   }

   protected byte gxTv_SdtTUSUARI_Level1Item_Grppri ;
   protected byte gxTv_SdtTUSUARI_Level1Item_Grppri_Z ;
   protected byte gxTv_SdtTUSUARI_Level1Item_Grptxt_N ;
   private byte gxTv_SdtTUSUARI_Level1Item_N ;
   protected short gxTv_SdtTUSUARI_Level1Item_Modified ;
   protected short gxTv_SdtTUSUARI_Level1Item_Initialized ;
   protected String gxTv_SdtTUSUARI_Level1Item_Grpid ;
   protected String gxTv_SdtTUSUARI_Level1Item_Grptxt ;
   protected String gxTv_SdtTUSUARI_Level1Item_Mode ;
   protected String gxTv_SdtTUSUARI_Level1Item_Grpid_Z ;
   protected String gxTv_SdtTUSUARI_Level1Item_Grptxt_Z ;
}

