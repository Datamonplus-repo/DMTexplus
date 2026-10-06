package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item.class ));
   }

   public StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( int remoteHandle ,
                                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb = new java.math.BigDecimal(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = cal.getTime() ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = cal.getTime() ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(1) ;
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
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar = value ;
   }

   public int getLb_numero( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod = value ;
   }

   public String getLb_artcod( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod ;
   }

   public void setLb_artcod( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod = value ;
   }

   public String getLb_colnomc( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc ;
   }

   public void setLb_colnomc( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc = value ;
   }

   public java.math.BigDecimal getLb_rb( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb ;
   }

   public void setLb_rb( java.math.BigDecimal value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb = value ;
   }

   public String getLb_opcion( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion ;
   }

   public void setLb_opcion( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion = value ;
   }

   public byte getLb_numop( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop ;
   }

   public void setLb_numop( byte value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getLb_fechae( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae ;
   }

   public void setLb_fechae( java.util.Date value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = value ;
   }

   public java.util.Date getLb_fechaen( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen ;
   }

   public void setLb_fechaen( java.util.Date value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = value ;
   }

   public byte getLb_estado( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado ;
   }

   public void setLb_estado( byte value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs = value ;
   }

   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N ;
   protected int gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero ;
   protected int gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs ;
   protected boolean gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar ;
   protected java.math.BigDecimal gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb ;
   protected java.util.Date gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae ;
   protected java.util.Date gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen ;
}

