package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtNoAceptacionEnsayo_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtNoAceptacionEnsayo_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtNoAceptacionEnsayo_SDT_Item.class ));
   }

   public StructSdtNoAceptacionEnsayo_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = cal.getTime() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = cal.getTime() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = cal.getTime() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = cal.getTime() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = cal.getTime() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(1) ;
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
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar = value ;
   }

   public int getLb_numero( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero = value ;
   }

   public String getLb_opcion( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion ;
   }

   public void setLb_opcion( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion = value ;
   }

   public String getLb_colnom( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom ;
   }

   public void setLb_colnom( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom = value ;
   }

   public int getLb_colnum( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum ;
   }

   public void setLb_colnum( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getLb_cartazf( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf ;
   }

   public void setLb_cartazf( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = value ;
   }

   public java.util.Date getLb_fechaen( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen ;
   }

   public void setLb_fechaen( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = value ;
   }

   public java.util.Date getLb_fechar( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar ;
   }

   public void setLb_fechar( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = value ;
   }

   public byte getLb_estado( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado ;
   }

   public void setLb_estado( byte value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado = value ;
   }

   public java.util.Date getLb_fecnoa1( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 ;
   }

   public void setLb_fecnoa1( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = value ;
   }

   public java.util.Date getLb_hhnoa1( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 ;
   }

   public void setLb_hhnoa1( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = value ;
   }

   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_N ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz ;
   protected boolean gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 ;
}

