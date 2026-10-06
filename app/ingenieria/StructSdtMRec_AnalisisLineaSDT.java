package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_AnalisisLineaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AnalisisLineaSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_AnalisisLineaSDT.class ));
   }

   public StructSdtMRec_AnalisisLineaSDT( int remoteHandle ,
                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = cal.getTime() ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc = "" ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprval = "" ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod = "" ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(1) ;
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

   public java.util.Date getMrprfec( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec ;
   }

   public void setMrprfec( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = value ;
   }

   public long getMrprparid( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid ;
   }

   public void setMrprparid( long value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid = value ;
   }

   public String getMrprpardsc( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc ;
   }

   public void setMrprpardsc( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc = value ;
   }

   public String getMrprval( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprval ;
   }

   public void setMrprval( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprval = value ;
   }

   public boolean getMrprer( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprer ;
   }

   public void setMrprer( boolean value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprer = value ;
   }

   public String getMrprmaqcod( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod ;
   }

   public void setMrprmaqcod( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod = value ;
   }

   protected byte gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N ;
   protected byte gxTv_SdtMRec_AnalisisLineaSDT_N ;
   protected long gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprval ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod ;
   protected boolean gxTv_SdtMRec_AnalisisLineaSDT_Mrprer ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc ;
   protected java.util.Date gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec ;
}

