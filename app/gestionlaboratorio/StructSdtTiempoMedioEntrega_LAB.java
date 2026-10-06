package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtTiempoMedioEntrega_LAB implements Cloneable, java.io.Serializable
{
   public StructSdtTiempoMedioEntrega_LAB( )
   {
      this( -1, new ModelContext( StructSdtTiempoMedioEntrega_LAB.class ));
   }

   public StructSdtTiempoMedioEntrega_LAB( int remoteHandle ,
                                           ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTiempoMedioEntrega_LAB_Clinom = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = cal.getTime() ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = cal.getTime() ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Clinom = value ;
   }

   public int getLb_numero( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero = value ;
   }

   public String getLb_artcod( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod ;
   }

   public void setLb_artcod( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod = value ;
   }

   public String getLb_colnom( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom ;
   }

   public void setLb_colnom( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz = value ;
   }

   public java.util.Date getLb_fechae( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae ;
   }

   public void setLb_fechae( java.util.Date value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = value ;
   }

   public java.util.Date getLb_fechaen( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen ;
   }

   public void setLb_fechaen( java.util.Date value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = value ;
   }

   public short getLb_dias( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias ;
   }

   public void setLb_dias( short value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias = value ;
   }

   protected byte gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N ;
   protected byte gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N ;
   protected byte gxTv_SdtTiempoMedioEntrega_LAB_N ;
   protected short gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias ;
   protected int gxTv_SdtTiempoMedioEntrega_LAB_Clicod ;
   protected int gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Clinom ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz ;
   protected java.util.Date gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae ;
   protected java.util.Date gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen ;
}

