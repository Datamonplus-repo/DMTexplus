package app ;
import com.genexus.*;

public final  class StructSdtSDTHdrsporMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHdrsporMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTHdrsporMaquina.class ));
   }

   public StructSdtSDTHdrsporMaquina( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtSDTHdrsporMaquina_Barcodpar = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barcolnom = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barnomcli = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsporMaquina_Clinom = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barser = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barserdsc = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrest = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barenccli = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(1) ;
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

   public int getBarcod( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcodpar = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcolnom = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barnomcli = value ;
   }

   public java.math.BigDecimal getBarkgs( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barkgs ;
   }

   public void setBarkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barkgs = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Clinom = value ;
   }

   public long getBarrgb( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barrgb ;
   }

   public void setBarrgb( long value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barrgb = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barserdsc = value ;
   }

   public String getBaragrest( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrest ;
   }

   public void setBaragrest( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrest = value ;
   }

   public String getBarhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barhdr ;
   }

   public void setBarhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barhdr = value ;
   }

   public String getBaragrhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrhdr ;
   }

   public void setBaragrhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrhdr = value ;
   }

   public byte getBarfasest( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barfasest ;
   }

   public void setBarfasest( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barfasest = value ;
   }

   public byte getBarpritin( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barpritin ;
   }

   public void setBarpritin( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barpritin = value ;
   }

   public String getBarenccli( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barenccli ;
   }

   public void setBarenccli( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barenccli = value ;
   }

   public java.math.BigDecimal getBaragrtotkgr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr ;
   }

   public void setBaragrtotkgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr = value ;
   }

   public java.util.Vector getBarnotdsc( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barnotdsc ;
   }

   public void setBarnotdsc( java.util.Vector value )
   {
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHdrsporMaquina_Agr> getBaragr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragr ;
   }

   public void setBaragr( java.util.Vector<app.StructSdtSDTHdrsporMaquina_Agr> value )
   {
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragr = value ;
   }

   protected byte gxTv_SdtSDTHdrsporMaquina_Barcodreo ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barfasest ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barpritin ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Baragr_N ;
   protected byte gxTv_SdtSDTHdrsporMaquina_N ;
   protected int gxTv_SdtSDTHdrsporMaquina_Barcod ;
   protected int gxTv_SdtSDTHdrsporMaquina_Clicod ;
   protected long gxTv_SdtSDTHdrsporMaquina_Barrgb ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barcodpar ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barcolnom ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barnomcli ;
   protected String gxTv_SdtSDTHdrsporMaquina_Clinom ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barser ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barserdsc ;
   protected String gxTv_SdtSDTHdrsporMaquina_Baragrest ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Baragrhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barenccli ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Barkgs ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr ;
   protected java.util.Vector gxTv_SdtSDTHdrsporMaquina_Barnotdsc=null ;
   protected java.util.Vector<app.StructSdtSDTHdrsporMaquina_Agr> gxTv_SdtSDTHdrsporMaquina_Baragr=null ;
}

