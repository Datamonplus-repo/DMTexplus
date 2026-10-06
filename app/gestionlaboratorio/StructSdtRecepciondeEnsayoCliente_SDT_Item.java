package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtRecepciondeEnsayoCliente_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtRecepciondeEnsayoCliente_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtRecepciondeEnsayoCliente_SDT_Item.class ));
   }

   public StructSdtRecepciondeEnsayoCliente_SDT_Item( int remoteHandle ,
                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb = new java.math.BigDecimal(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = cal.getTime() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = cal.getTime() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = cal.getTime() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = cal.getTime() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee = new java.math.BigDecimal(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = cal.getTime() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(1) ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar = value ;
   }

   public int getLb_numero( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod = value ;
   }

   public String getLb_artcod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod ;
   }

   public void setLb_artcod( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod = value ;
   }

   public String getLb_colnomc( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc ;
   }

   public void setLb_colnomc( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc = value ;
   }

   public int getLb_colnum( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum ;
   }

   public void setLb_colnum( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum = value ;
   }

   public java.math.BigDecimal getLb_rb( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb ;
   }

   public void setLb_rb( java.math.BigDecimal value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb = value ;
   }

   public String getLb_opcion( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion ;
   }

   public void setLb_opcion( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion = value ;
   }

   public byte getLb_tiprec( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec ;
   }

   public void setLb_tiprec( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec = value ;
   }

   public byte getLb_numop( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop ;
   }

   public void setLb_numop( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getLb_fechae( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae ;
   }

   public void setLb_fechae( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = value ;
   }

   public java.util.Date getLb_fechaen( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen ;
   }

   public void setLb_fechaen( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = value ;
   }

   public java.util.Date getLb_fechar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar ;
   }

   public void setLb_fechar( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = value ;
   }

   public byte getLb_estado( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado ;
   }

   public void setLb_estado( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado = value ;
   }

   public boolean getEliminar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar ;
   }

   public void setEliminar( boolean value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar = value ;
   }

   public String getLb_provdef( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef ;
   }

   public void setLb_provdef( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef = value ;
   }

   public String getLb_obscr( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr ;
   }

   public void setLb_obscr( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr = value ;
   }

   public String getLb_opst( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst ;
   }

   public void setLb_opst( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst = value ;
   }

   public java.util.Date getLb_opfc( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc ;
   }

   public void setLb_opfc( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom = value ;
   }

   public short getF_cformu( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu ;
   }

   public void setF_cformu( short value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu = value ;
   }

   public int getFornumcol( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol ;
   }

   public void setFornumcol( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol = value ;
   }

   public java.math.BigDecimal getLb_costee( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee ;
   }

   public void setLb_costee( java.math.BigDecimal value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod = value ;
   }

   public String getLb_colnom( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom ;
   }

   public void setLb_colnom( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom = value ;
   }

   public java.util.Date getForultuti( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti ;
   }

   public void setForultuti( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = value ;
   }

   public long getLb_rgb( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb ;
   }

   public void setLb_rgb( long value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb = value ;
   }

   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N ;
   protected short gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol ;
   protected long gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom ;
   protected boolean gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr ;
   protected java.math.BigDecimal gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc ;
   protected java.math.BigDecimal gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti ;
}

