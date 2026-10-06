package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_ParametroSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_ParametroSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_ParametroSDT.class ));
   }

   public StructSdtMRec_ParametroSDT( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtMRec_ParametroSDT_Mrprpardsc = "" ;
      gxTv_SdtMRec_ParametroSDT_Mrprplc = "" ;
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

   public long getMrprparid( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprparid ;
   }

   public void setMrprparid( long value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprparid = value ;
   }

   public short getMrprparcod( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprparcod ;
   }

   public void setMrprparcod( short value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprparcod = value ;
   }

   public String getMrprpardsc( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprpardsc ;
   }

   public void setMrprpardsc( String value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprpardsc = value ;
   }

   public String getMrprplc( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprplc ;
   }

   public void setMrprplc( String value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprplc = value ;
   }

   protected byte gxTv_SdtMRec_ParametroSDT_N ;
   protected short gxTv_SdtMRec_ParametroSDT_Mrprparcod ;
   protected long gxTv_SdtMRec_ParametroSDT_Mrprparid ;
   protected String gxTv_SdtMRec_ParametroSDT_Mrprpardsc ;
   protected String gxTv_SdtMRec_ParametroSDT_Mrprplc ;
}

