package app ;
import com.genexus.*;

public final  class StructSdtTNORMAS implements Cloneable, java.io.Serializable
{
   public StructSdtTNORMAS( )
   {
      this( -1, new ModelContext( StructSdtTNORMAS.class ));
   }

   public StructSdtTNORMAS( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtTNORMAS_Emprcod = "" ;
      gxTv_SdtTNORMAS_Emprnom = "" ;
      gxTv_SdtTNORMAS_Normaid = "" ;
      gxTv_SdtTNORMAS_Normadsc = "" ;
      gxTv_SdtTNORMAS_Normadscid = "" ;
      gxTv_SdtTNORMAS_Mode = "" ;
      gxTv_SdtTNORMAS_Emprcod_Z = "" ;
      gxTv_SdtTNORMAS_Emprnom_Z = "" ;
      gxTv_SdtTNORMAS_Normaid_Z = "" ;
      gxTv_SdtTNORMAS_Normadsc_Z = "" ;
      gxTv_SdtTNORMAS_Normadscid_Z = "" ;
      gxTv_SdtTNORMAS_Emprnom_N = (byte)(1) ;
      gxTv_SdtTNORMAS_Normadsc_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtTNORMAS_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTNORMAS_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTNORMAS_Emprnom_N = (byte)(0) ;
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Emprnom = value ;
   }

   public String getNormaid( )
   {
      return gxTv_SdtTNORMAS_Normaid ;
   }

   public void setNormaid( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normaid = value ;
   }

   public String getNormadsc( )
   {
      return gxTv_SdtTNORMAS_Normadsc ;
   }

   public void setNormadsc( String value )
   {
      gxTv_SdtTNORMAS_Normadsc_N = (byte)(0) ;
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normadsc = value ;
   }

   public String getNormadscid( )
   {
      return gxTv_SdtTNORMAS_Normadscid ;
   }

   public void setNormadscid( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normadscid = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTNORMAS_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTNORMAS_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTNORMAS_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTNORMAS_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Emprnom_Z = value ;
   }

   public String getNormaid_Z( )
   {
      return gxTv_SdtTNORMAS_Normaid_Z ;
   }

   public void setNormaid_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normaid_Z = value ;
   }

   public String getNormadsc_Z( )
   {
      return gxTv_SdtTNORMAS_Normadsc_Z ;
   }

   public void setNormadsc_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normadsc_Z = value ;
   }

   public String getNormadscid_Z( )
   {
      return gxTv_SdtTNORMAS_Normadscid_Z ;
   }

   public void setNormadscid_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normadscid_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTNORMAS_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Emprnom_N = value ;
   }

   public byte getNormadsc_N( )
   {
      return gxTv_SdtTNORMAS_Normadsc_N ;
   }

   public void setNormadsc_N( byte value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      gxTv_SdtTNORMAS_Normadsc_N = value ;
   }

   protected byte gxTv_SdtTNORMAS_Emprnom_N ;
   protected byte gxTv_SdtTNORMAS_Normadsc_N ;
   private byte gxTv_SdtTNORMAS_N ;
   protected short gxTv_SdtTNORMAS_Initialized ;
   protected String gxTv_SdtTNORMAS_Emprcod ;
   protected String gxTv_SdtTNORMAS_Emprnom ;
   protected String gxTv_SdtTNORMAS_Normaid ;
   protected String gxTv_SdtTNORMAS_Normadsc ;
   protected String gxTv_SdtTNORMAS_Mode ;
   protected String gxTv_SdtTNORMAS_Emprcod_Z ;
   protected String gxTv_SdtTNORMAS_Emprnom_Z ;
   protected String gxTv_SdtTNORMAS_Normaid_Z ;
   protected String gxTv_SdtTNORMAS_Normadsc_Z ;
   protected String gxTv_SdtTNORMAS_Normadscid ;
   protected String gxTv_SdtTNORMAS_Normadscid_Z ;
}

