package app ;
import com.genexus.*;

public final  class StructSdtObsalb_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtObsalb_SDT( )
   {
      this( -1, new ModelContext( StructSdtObsalb_SDT.class ));
   }

   public StructSdtObsalb_SDT( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtObsalb_SDT_Emprcod = "" ;
      gxTv_SdtObsalb_SDT_Albpobs = "" ;
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
      return gxTv_SdtObsalb_SDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Emprcod = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtObsalb_SDT_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albprocod = value ;
   }

   public byte getAlbpobslin( )
   {
      return gxTv_SdtObsalb_SDT_Albpobslin ;
   }

   public void setAlbpobslin( byte value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albpobslin = value ;
   }

   public String getAlbpobs( )
   {
      return gxTv_SdtObsalb_SDT_Albpobs ;
   }

   public void setAlbpobs( String value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albpobs = value ;
   }

   protected byte gxTv_SdtObsalb_SDT_Albpobslin ;
   protected byte gxTv_SdtObsalb_SDT_N ;
   protected long gxTv_SdtObsalb_SDT_Albprocod ;
   protected String gxTv_SdtObsalb_SDT_Emprcod ;
   protected String gxTv_SdtObsalb_SDT_Albpobs ;
}

