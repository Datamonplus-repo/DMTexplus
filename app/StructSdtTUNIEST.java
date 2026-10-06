package app ;
import com.genexus.*;

public final  class StructSdtTUNIEST implements Cloneable, java.io.Serializable
{
   public StructSdtTUNIEST( )
   {
      this( -1, new ModelContext( StructSdtTUNIEST.class ));
   }

   public StructSdtTUNIEST( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtTUNIEST_Uniestcod = "" ;
      gxTv_SdtTUNIEST_Uniestdes = "" ;
      gxTv_SdtTUNIEST_Uniestcdes = "" ;
      gxTv_SdtTUNIEST_Mode = "" ;
      gxTv_SdtTUNIEST_Uniestcod_Z = "" ;
      gxTv_SdtTUNIEST_Uniestdes_Z = "" ;
      gxTv_SdtTUNIEST_Uniestcdes_Z = "" ;
      gxTv_SdtTUNIEST_Uniestdes_N = (byte)(1) ;
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

   public String getUniestcod( )
   {
      return gxTv_SdtTUNIEST_Uniestcod ;
   }

   public void setUniestcod( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestcod = value ;
   }

   public String getUniestdes( )
   {
      return gxTv_SdtTUNIEST_Uniestdes ;
   }

   public void setUniestdes( String value )
   {
      gxTv_SdtTUNIEST_Uniestdes_N = (byte)(0) ;
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestdes = value ;
   }

   public String getUniestcdes( )
   {
      return gxTv_SdtTUNIEST_Uniestcdes ;
   }

   public void setUniestcdes( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestcdes = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTUNIEST_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTUNIEST_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Initialized = value ;
   }

   public String getUniestcod_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestcod_Z ;
   }

   public void setUniestcod_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestcod_Z = value ;
   }

   public String getUniestdes_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestdes_Z ;
   }

   public void setUniestdes_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestdes_Z = value ;
   }

   public String getUniestcdes_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestcdes_Z ;
   }

   public void setUniestcdes_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestcdes_Z = value ;
   }

   public byte getUniestcod_N( )
   {
      return gxTv_SdtTUNIEST_Uniestcod_N ;
   }

   public void setUniestcod_N( byte value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestcod_N = value ;
   }

   public byte getUniestdes_N( )
   {
      return gxTv_SdtTUNIEST_Uniestdes_N ;
   }

   public void setUniestdes_N( byte value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      gxTv_SdtTUNIEST_Uniestdes_N = value ;
   }

   protected byte gxTv_SdtTUNIEST_Uniestcod_N ;
   protected byte gxTv_SdtTUNIEST_Uniestdes_N ;
   private byte gxTv_SdtTUNIEST_N ;
   protected short gxTv_SdtTUNIEST_Initialized ;
   protected String gxTv_SdtTUNIEST_Uniestcod ;
   protected String gxTv_SdtTUNIEST_Uniestdes ;
   protected String gxTv_SdtTUNIEST_Mode ;
   protected String gxTv_SdtTUNIEST_Uniestcod_Z ;
   protected String gxTv_SdtTUNIEST_Uniestdes_Z ;
   protected String gxTv_SdtTUNIEST_Uniestcdes ;
   protected String gxTv_SdtTUNIEST_Uniestcdes_Z ;
}

