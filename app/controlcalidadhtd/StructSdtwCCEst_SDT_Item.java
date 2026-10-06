package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtwCCEst_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtwCCEst_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtwCCEst_SDT_Item.class ));
   }

   public StructSdtwCCEst_SDT_Item( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtwCCEst_SDT_Item_Barnhdr = "" ;
      gxTv_SdtwCCEst_SDT_Item_Clinom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barser = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barserdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Procod = "" ;
      gxTv_SdtwCCEst_SDT_Item_Fascod = "" ;
      gxTv_SdtwCCEst_SDT_Item_Fasdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Cctdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Openom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch = cal.getTime() ;
      gxTv_SdtwCCEst_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Cctval = "" ;
      gxTv_SdtwCCEst_SDT_Item_Obs = "" ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(1) ;
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

   public String getBarnhdr( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barnhdr = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barserdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnum = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Procod = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Fasdsc = value ;
   }

   public int getCctcod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctcod ;
   }

   public void setCctcod( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctcod = value ;
   }

   public String getCctdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctdsc ;
   }

   public void setCctdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctdsc = value ;
   }

   public int getCcopecod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Ccopecod ;
   }

   public void setCcopecod( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Ccopecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Openom = value ;
   }

   public java.util.Date getCcfch( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Ccfch ;
   }

   public void setCcfch( java.util.Date value )
   {
      gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch = value ;
   }

   public short getCctlin( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctlin ;
   }

   public void setCctlin( short value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctlin = value ;
   }

   public String getCctlindsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctlindsc ;
   }

   public void setCctlindsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctlindsc = value ;
   }

   public String getCctval( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctval ;
   }

   public void setCctval( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctval = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Obs = value ;
   }

   protected byte gxTv_SdtwCCEst_SDT_Item_Ccfch_N ;
   protected byte gxTv_SdtwCCEst_SDT_Item_N ;
   protected short gxTv_SdtwCCEst_SDT_Item_Cctlin ;
   protected int gxTv_SdtwCCEst_SDT_Item_Barcolnum ;
   protected int gxTv_SdtwCCEst_SDT_Item_Cctcod ;
   protected int gxTv_SdtwCCEst_SDT_Item_Ccopecod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barnhdr ;
   protected String gxTv_SdtwCCEst_SDT_Item_Clinom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barser ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barserdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barcolnom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Procod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Fascod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Fasdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Openom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctval ;
   protected String gxTv_SdtwCCEst_SDT_Item_Obs ;
   protected java.util.Date gxTv_SdtwCCEst_SDT_Item_Ccfch ;
}

