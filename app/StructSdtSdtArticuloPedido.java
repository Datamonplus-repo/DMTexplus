package app ;
import com.genexus.*;

public final  class StructSdtSdtArticuloPedido implements Cloneable, java.io.Serializable
{
   public StructSdtSdtArticuloPedido( )
   {
      this( -1, new ModelContext( StructSdtSdtArticuloPedido.class ));
   }

   public StructSdtSdtArticuloPedido( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSdtArticuloPedido_Disartcod = "" ;
      gxTv_SdtSdtArticuloPedido_Artdsc = "" ;
      gxTv_SdtSdtArticuloPedido_Procod = "" ;
      gxTv_SdtSdtArticuloPedido_Prodsc = "" ;
      gxTv_SdtSdtArticuloPedido_Kilos = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtArticuloPedido_Metros = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtArticuloPedido_Disfasapr = "" ;
      gxTv_SdtSdtArticuloPedido_Prostsfec = cal.getTime() ;
      gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(1) ;
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

   public String getDisartcod( )
   {
      return gxTv_SdtSdtArticuloPedido_Disartcod ;
   }

   public void setDisartcod( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disartcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtSdtArticuloPedido_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Artdsc = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtSdtArticuloPedido_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Procod = value ;
   }

   public String getProdsc( )
   {
      return gxTv_SdtSdtArticuloPedido_Prodsc ;
   }

   public void setProdsc( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prodsc = value ;
   }

   public short getDisnumpie( )
   {
      return gxTv_SdtSdtArticuloPedido_Disnumpie ;
   }

   public void setDisnumpie( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disnumpie = value ;
   }

   public java.math.BigDecimal getKilos( )
   {
      return gxTv_SdtSdtArticuloPedido_Kilos ;
   }

   public void setKilos( java.math.BigDecimal value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Kilos = value ;
   }

   public java.math.BigDecimal getMetros( )
   {
      return gxTv_SdtSdtArticuloPedido_Metros ;
   }

   public void setMetros( java.math.BigDecimal value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Metros = value ;
   }

   public short getDisartanh( )
   {
      return gxTv_SdtSdtArticuloPedido_Disartanh ;
   }

   public void setDisartanh( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disartanh = value ;
   }

   public short getDisgraaca( )
   {
      return gxTv_SdtSdtArticuloPedido_Disgraaca ;
   }

   public void setDisgraaca( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disgraaca = value ;
   }

   public short getUltfaslin( )
   {
      return gxTv_SdtSdtArticuloPedido_Ultfaslin ;
   }

   public void setUltfaslin( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Ultfaslin = value ;
   }

   public String getDisfasapr( )
   {
      return gxTv_SdtSdtArticuloPedido_Disfasapr ;
   }

   public void setDisfasapr( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disfasapr = value ;
   }

   public byte getProsts( )
   {
      return gxTv_SdtSdtArticuloPedido_Prosts ;
   }

   public void setProsts( byte value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prosts = value ;
   }

   public java.util.Date getProstsfec( )
   {
      return gxTv_SdtSdtArticuloPedido_Prostsfec ;
   }

   public void setProstsfec( java.util.Date value )
   {
      gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prostsfec = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtSdtArticuloPedido_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Discod = value ;
   }

   public java.util.Vector<app.StructSdtSdtFasePedido> getFases( )
   {
      return gxTv_SdtSdtArticuloPedido_Fases ;
   }

   public void setFases( java.util.Vector<app.StructSdtSdtFasePedido> value )
   {
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Fases = value ;
   }

   public java.util.Vector<app.StructSdtSdtRecepcionPedido> getConsultaalmacen( )
   {
      return gxTv_SdtSdtArticuloPedido_Consultaalmacen ;
   }

   public void setConsultaalmacen( java.util.Vector<app.StructSdtSdtRecepcionPedido> value )
   {
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Consultaalmacen = value ;
   }

   protected byte gxTv_SdtSdtArticuloPedido_Prosts ;
   protected byte gxTv_SdtSdtArticuloPedido_Prostsfec_N ;
   protected byte gxTv_SdtSdtArticuloPedido_Fases_N ;
   protected byte gxTv_SdtSdtArticuloPedido_Consultaalmacen_N ;
   protected byte gxTv_SdtSdtArticuloPedido_N ;
   protected short gxTv_SdtSdtArticuloPedido_Disnumpie ;
   protected short gxTv_SdtSdtArticuloPedido_Disartanh ;
   protected short gxTv_SdtSdtArticuloPedido_Disgraaca ;
   protected short gxTv_SdtSdtArticuloPedido_Ultfaslin ;
   protected int gxTv_SdtSdtArticuloPedido_Discod ;
   protected String gxTv_SdtSdtArticuloPedido_Disartcod ;
   protected String gxTv_SdtSdtArticuloPedido_Artdsc ;
   protected String gxTv_SdtSdtArticuloPedido_Procod ;
   protected String gxTv_SdtSdtArticuloPedido_Prodsc ;
   protected String gxTv_SdtSdtArticuloPedido_Disfasapr ;
   protected java.math.BigDecimal gxTv_SdtSdtArticuloPedido_Kilos ;
   protected java.math.BigDecimal gxTv_SdtSdtArticuloPedido_Metros ;
   protected java.util.Date gxTv_SdtSdtArticuloPedido_Prostsfec ;
   protected java.util.Vector<app.StructSdtSdtFasePedido> gxTv_SdtSdtArticuloPedido_Fases=null ;
   protected java.util.Vector<app.StructSdtSdtRecepcionPedido> gxTv_SdtSdtArticuloPedido_Consultaalmacen=null ;
}

