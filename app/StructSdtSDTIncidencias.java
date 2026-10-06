package app ;
import com.genexus.*;

public final  class StructSdtSDTIncidencias implements Cloneable, java.io.Serializable
{
   public StructSdtSDTIncidencias( )
   {
      this( -1, new ModelContext( StructSdtSDTIncidencias.class ));
   }

   public StructSdtSDTIncidencias( int remoteHandle ,
                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTIncidencias_Inc_dia = cal.getTime() ;
      gxTv_SdtSDTIncidencias_Inc_hora = cal.getTime() ;
      gxTv_SdtSDTIncidencias_Inc_usuario = "" ;
      gxTv_SdtSDTIncidencias_Inc_terminal = "" ;
      gxTv_SdtSDTIncidencias_Inc_prog = "" ;
      gxTv_SdtSDTIncidencias_Inc_obstxt = "" ;
      gxTv_SdtSDTIncidencias_Inc_barpar = "" ;
      gxTv_SdtSDTIncidencias_Inc_hdr = "" ;
      gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(1) ;
      gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(1) ;
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

   public java.util.Date getInc_dia( )
   {
      return gxTv_SdtSDTIncidencias_Inc_dia ;
   }

   public void setInc_dia( java.util.Date value )
   {
      gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_dia = value ;
   }

   public long getInc_linea( )
   {
      return gxTv_SdtSDTIncidencias_Inc_linea ;
   }

   public void setInc_linea( long value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_linea = value ;
   }

   public java.util.Date getInc_hora( )
   {
      return gxTv_SdtSDTIncidencias_Inc_hora ;
   }

   public void setInc_hora( java.util.Date value )
   {
      gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_hora = value ;
   }

   public String getInc_usuario( )
   {
      return gxTv_SdtSDTIncidencias_Inc_usuario ;
   }

   public void setInc_usuario( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_usuario = value ;
   }

   public String getInc_terminal( )
   {
      return gxTv_SdtSDTIncidencias_Inc_terminal ;
   }

   public void setInc_terminal( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_terminal = value ;
   }

   public String getInc_prog( )
   {
      return gxTv_SdtSDTIncidencias_Inc_prog ;
   }

   public void setInc_prog( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_prog = value ;
   }

   public String getInc_obstxt( )
   {
      return gxTv_SdtSDTIncidencias_Inc_obstxt ;
   }

   public void setInc_obstxt( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_obstxt = value ;
   }

   public int getInc_barcod( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barcod ;
   }

   public void setInc_barcod( int value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barcod = value ;
   }

   public byte getInc_barreo( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barreo ;
   }

   public void setInc_barreo( byte value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barreo = value ;
   }

   public String getInc_barpar( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barpar ;
   }

   public void setInc_barpar( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barpar = value ;
   }

   public String getInc_hdr( )
   {
      return gxTv_SdtSDTIncidencias_Inc_hdr ;
   }

   public void setInc_hdr( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_hdr = value ;
   }

   protected byte gxTv_SdtSDTIncidencias_Inc_barreo ;
   protected byte gxTv_SdtSDTIncidencias_Inc_dia_N ;
   protected byte gxTv_SdtSDTIncidencias_Inc_hora_N ;
   protected byte gxTv_SdtSDTIncidencias_N ;
   protected int gxTv_SdtSDTIncidencias_Inc_barcod ;
   protected long gxTv_SdtSDTIncidencias_Inc_linea ;
   protected String gxTv_SdtSDTIncidencias_Inc_usuario ;
   protected String gxTv_SdtSDTIncidencias_Inc_terminal ;
   protected String gxTv_SdtSDTIncidencias_Inc_prog ;
   protected String gxTv_SdtSDTIncidencias_Inc_barpar ;
   protected String gxTv_SdtSDTIncidencias_Inc_hdr ;
   protected String gxTv_SdtSDTIncidencias_Inc_obstxt ;
   protected java.util.Date gxTv_SdtSDTIncidencias_Inc_dia ;
   protected java.util.Date gxTv_SdtSDTIncidencias_Inc_hora ;
}

