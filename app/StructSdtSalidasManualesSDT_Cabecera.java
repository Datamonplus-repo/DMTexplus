package app ;
import com.genexus.*;

public final  class StructSdtSalidasManualesSDT_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesSDT_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesSDT_Cabecera.class ));
   }

   public StructSdtSalidasManualesSDT_Cabecera( int remoteHandle ,
                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = cal.getTime() ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(1) ;
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

   public java.util.Date getCumconfec( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec ;
   }

   public void setCumconfec( java.util.Date value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = value ;
   }

   public short getCcocod( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod ;
   }

   public void setCcocod( short value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod = value ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   protected short gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod ;
   protected java.util.Date gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec ;
}

