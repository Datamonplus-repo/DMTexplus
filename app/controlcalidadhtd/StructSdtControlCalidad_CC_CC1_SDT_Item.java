package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlCalidad_CC_CC1_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CC_CC1_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CC_CC1_SDT_Item.class ));
   }

   public StructSdtControlCalidad_CC_CC1_SDT_Item( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = cal.getTime() ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(1) ;
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

   public short getBarordlin( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod = value ;
   }

   public String getProdsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc ;
   }

   public void setProdsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc = value ;
   }

   public int getCctcod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod ;
   }

   public void setCctcod( int value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod = value ;
   }

   public String getCctdsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc ;
   }

   public void setCctdsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc = value ;
   }

   public short getCcfas( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas ;
   }

   public void setCcfas( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas = value ;
   }

   public short getErrcontrol( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol ;
   }

   public void setErrcontrol( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol = value ;
   }

   public int getCcopecod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod ;
   }

   public void setCcopecod( int value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod = value ;
   }

   public byte getBarfasest( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest ;
   }

   public void setBarfasest( byte value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest = value ;
   }

   public java.util.Date getCcfch( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch ;
   }

   public void setCcfch( java.util.Date value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = value ;
   }

   public short getCc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc ;
   }

   public void setCc( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc = value ;
   }

   public short getCcser1( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 ;
   }

   public void setCcser1( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 = value ;
   }

   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest ;
   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N ;
   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 ;
   protected int gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod ;
   protected int gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc ;
   protected java.util.Date gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch ;
}

