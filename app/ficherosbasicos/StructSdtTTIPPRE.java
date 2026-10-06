package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtTTIPPRE implements Cloneable, java.io.Serializable
{
   public StructSdtTTIPPRE( )
   {
      this( -1, new ModelContext( StructSdtTTIPPRE.class ));
   }

   public StructSdtTTIPPRE( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtTTIPPRE_Emprcod = "" ;
      gxTv_SdtTTIPPRE_Emprnom = "" ;
      gxTv_SdtTTIPPRE_Tippredsc = "" ;
      gxTv_SdtTTIPPRE_Tippredscid = "" ;
      gxTv_SdtTTIPPRE_Mode = "" ;
      gxTv_SdtTTIPPRE_Emprcod_Z = "" ;
      gxTv_SdtTTIPPRE_Emprnom_Z = "" ;
      gxTv_SdtTTIPPRE_Tippredsc_Z = "" ;
      gxTv_SdtTTIPPRE_Tippredscid_Z = "" ;
      gxTv_SdtTTIPPRE_Emprnom_N = (byte)(1) ;
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
      return gxTv_SdtTTIPPRE_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTTIPPRE_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTTIPPRE_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Emprnom = value ;
   }

   public short getTipprecod( )
   {
      return gxTv_SdtTTIPPRE_Tipprecod ;
   }

   public void setTipprecod( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tipprecod = value ;
   }

   public String getTippredsc( )
   {
      return gxTv_SdtTTIPPRE_Tippredsc ;
   }

   public void setTippredsc( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tippredsc = value ;
   }

   public String getTippredscid( )
   {
      return gxTv_SdtTTIPPRE_Tippredscid ;
   }

   public void setTippredscid( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tippredscid = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTTIPPRE_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTTIPPRE_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTTIPPRE_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTTIPPRE_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Emprnom_Z = value ;
   }

   public short getTipprecod_Z( )
   {
      return gxTv_SdtTTIPPRE_Tipprecod_Z ;
   }

   public void setTipprecod_Z( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tipprecod_Z = value ;
   }

   public String getTippredsc_Z( )
   {
      return gxTv_SdtTTIPPRE_Tippredsc_Z ;
   }

   public void setTippredsc_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tippredsc_Z = value ;
   }

   public String getTippredscid_Z( )
   {
      return gxTv_SdtTTIPPRE_Tippredscid_Z ;
   }

   public void setTippredscid_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Tippredscid_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTTIPPRE_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_Emprnom_N = value ;
   }

   protected byte gxTv_SdtTTIPPRE_Emprnom_N ;
   private byte gxTv_SdtTTIPPRE_N ;
   protected short gxTv_SdtTTIPPRE_Tipprecod ;
   protected short gxTv_SdtTTIPPRE_Initialized ;
   protected short gxTv_SdtTTIPPRE_Tipprecod_Z ;
   protected String gxTv_SdtTTIPPRE_Emprcod ;
   protected String gxTv_SdtTTIPPRE_Emprnom ;
   protected String gxTv_SdtTTIPPRE_Tippredsc ;
   protected String gxTv_SdtTTIPPRE_Mode ;
   protected String gxTv_SdtTTIPPRE_Emprcod_Z ;
   protected String gxTv_SdtTTIPPRE_Emprnom_Z ;
   protected String gxTv_SdtTTIPPRE_Tippredsc_Z ;
   protected String gxTv_SdtTTIPPRE_Tippredscid ;
   protected String gxTv_SdtTTIPPRE_Tippredscid_Z ;
}

