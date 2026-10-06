package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionParos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionParos( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionParos.class ));
   }

   public StructSdtSDTProduccionParos( int remoteHandle ,
                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTProduccionParos_Maqcod = "" ;
      gxTv_SdtSDTProduccionParos_Maqdsc = "" ;
      gxTv_SdtSDTProduccionParos_Parcodnom = "" ;
      gxTv_SdtSDTProduccionParos_Hisprodti = cal.getTime() ;
      gxTv_SdtSDTProduccionParos_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(1) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtSDTProduccionParos_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTProduccionParos_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Maqdsc = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTProduccionParos_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtSDTProduccionParos_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Parcodnom = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtSDTProduccionParos_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTProduccionParos_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Hisprodtf = value ;
   }

   public int getTiempoparo( )
   {
      return gxTv_SdtSDTProduccionParos_Tiempoparo ;
   }

   public void setTiempoparo( int value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Tiempoparo = value ;
   }

   protected byte gxTv_SdtSDTProduccionParos_Hisprodti_N ;
   protected byte gxTv_SdtSDTProduccionParos_Hisprodtf_N ;
   protected byte gxTv_SdtSDTProduccionParos_N ;
   protected short gxTv_SdtSDTProduccionParos_Parcod ;
   protected int gxTv_SdtSDTProduccionParos_Tiempoparo ;
   protected String gxTv_SdtSDTProduccionParos_Maqcod ;
   protected String gxTv_SdtSDTProduccionParos_Maqdsc ;
   protected String gxTv_SdtSDTProduccionParos_Parcodnom ;
   protected java.util.Date gxTv_SdtSDTProduccionParos_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTProduccionParos_Hisprodtf ;
}

