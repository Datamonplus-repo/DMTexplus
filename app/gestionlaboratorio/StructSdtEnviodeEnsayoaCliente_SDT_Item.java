package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtEnviodeEnsayoaCliente_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtEnviodeEnsayoaCliente_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtEnviodeEnsayoaCliente_SDT_Item.class ));
   }

   public StructSdtEnviodeEnsayoaCliente_SDT_Item( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb = new java.math.BigDecimal(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae = cal.getTime() ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen = cal.getTime() ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee = new java.math.BigDecimal(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti = cal.getTime() ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artdsc = "" ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti_N = (byte)(1) ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Selected = value ;
   }

   public boolean getSeleccionar( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Seleccionar = value ;
   }

   public int getLb_numero( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom = value ;
   }

   public String getLb_artcod( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod ;
   }

   public void setLb_artcod( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod = value ;
   }

   public String getLb_colnomc( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc ;
   }

   public void setLb_colnomc( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc = value ;
   }

   public java.math.BigDecimal getLb_rb( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb ;
   }

   public void setLb_rb( java.math.BigDecimal value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb = value ;
   }

   public String getLb_opcion( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion ;
   }

   public void setLb_opcion( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion = value ;
   }

   public byte getLb_numop( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop ;
   }

   public void setLb_numop( byte value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getLb_fechae( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae ;
   }

   public void setLb_fechae( java.util.Date value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae = value ;
   }

   public java.util.Date getLb_fechaen( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen ;
   }

   public void setLb_fechaen( java.util.Date value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen = value ;
   }

   public byte getLb_estado( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado ;
   }

   public void setLb_estado( byte value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs = value ;
   }

   public boolean getEliminar( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar ;
   }

   public void setEliminar( boolean value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar = value ;
   }

   public byte getF_cformu( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu ;
   }

   public void setF_cformu( byte value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu = value ;
   }

   public java.math.BigDecimal getLb_costee( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee ;
   }

   public void setLb_costee( java.math.BigDecimal value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee = value ;
   }

   public long getLb_rgb( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb ;
   }

   public void setLb_rgb( long value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod = value ;
   }

   public String getLb_colnom( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom ;
   }

   public void setLb_colnom( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom = value ;
   }

   public int getLb_colnum( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum ;
   }

   public void setLb_colnum( int value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum = value ;
   }

   public int getFornumcol( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol ;
   }

   public void setFornumcol( int value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol = value ;
   }

   public java.util.Date getForultuti( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti ;
   }

   public void setForultuti( java.util.Date value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti = value ;
   }

   public String getLb_artdsc( )
   {
      return gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artdsc ;
   }

   public void setLb_artdsc( String value )
   {
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artdsc = value ;
   }

   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae_N ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti_N ;
   protected byte gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_N ;
   protected int gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero ;
   protected int gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod ;
   protected int gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum ;
   protected int gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol ;
   protected long gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artdsc ;
   protected boolean gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Selected ;
   protected boolean gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar ;
   protected String gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs ;
   protected java.math.BigDecimal gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb ;
   protected java.util.Date gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae ;
   protected java.util.Date gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen ;
   protected java.math.BigDecimal gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee ;
   protected java.util.Date gxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti ;
}

