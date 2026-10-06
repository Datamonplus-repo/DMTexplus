package app ;
import com.genexus.*;

public final  class StructSdtTBCPROD implements Cloneable, java.io.Serializable
{
   public StructSdtTBCPROD( )
   {
      this( -1, new ModelContext( StructSdtTBCPROD.class ));
   }

   public StructSdtTBCPROD( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBCPROD_Emprcod = "" ;
      gxTv_SdtTBCPROD_Emprnom = "" ;
      gxTv_SdtTBCPROD_Bcproducto = "" ;
      gxTv_SdtTBCPROD_Bcdescripcion = "" ;
      gxTv_SdtTBCPROD_Bcprecio = new java.math.BigDecimal(0) ;
      gxTv_SdtTBCPROD_Bcproveedor = "" ;
      gxTv_SdtTBCPROD_Bcdescerror = "" ;
      gxTv_SdtTBCPROD_Bcfecherror = cal.getTime() ;
      gxTv_SdtTBCPROD_Bcpilaerror = "" ;
      gxTv_SdtTBCPROD_Mode = "" ;
      gxTv_SdtTBCPROD_Emprcod_Z = "" ;
      gxTv_SdtTBCPROD_Emprnom_Z = "" ;
      gxTv_SdtTBCPROD_Bcproducto_Z = "" ;
      gxTv_SdtTBCPROD_Bcdescripcion_Z = "" ;
      gxTv_SdtTBCPROD_Bcprecio_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTBCPROD_Bcproveedor_Z = "" ;
      gxTv_SdtTBCPROD_Bcdescerror_Z = "" ;
      gxTv_SdtTBCPROD_Bcfecherror_Z = cal.getTime() ;
      gxTv_SdtTBCPROD_Bcpilaerror_Z = "" ;
      gxTv_SdtTBCPROD_Emprnom_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcprecio_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcerror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtTBCPROD_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTBCPROD_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTBCPROD_Emprnom_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Emprnom = value ;
   }

   public String getBcproducto( )
   {
      return gxTv_SdtTBCPROD_Bcproducto ;
   }

   public void setBcproducto( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproducto = value ;
   }

   public String getBcdescripcion( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion ;
   }

   public void setBcdescripcion( String value )
   {
      gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescripcion = value ;
   }

   public java.math.BigDecimal getBcprecio( )
   {
      return gxTv_SdtTBCPROD_Bcprecio ;
   }

   public void setBcprecio( java.math.BigDecimal value )
   {
      gxTv_SdtTBCPROD_Bcprecio_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprecio = value ;
   }

   public short getBcundcomp( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp ;
   }

   public void setBcundcomp( short value )
   {
      gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcundcomp = value ;
   }

   public String getBcproveedor( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor ;
   }

   public void setBcproveedor( String value )
   {
      gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproveedor = value ;
   }

   public short getBcprocesado( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado ;
   }

   public void setBcprocesado( short value )
   {
      gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprocesado = value ;
   }

   public short getBcerror( )
   {
      return gxTv_SdtTBCPROD_Bcerror ;
   }

   public void setBcerror( short value )
   {
      gxTv_SdtTBCPROD_Bcerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcerror = value ;
   }

   public String getBcdescerror( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror ;
   }

   public void setBcdescerror( String value )
   {
      gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescerror = value ;
   }

   public java.util.Date getBcfecherror( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror ;
   }

   public void setBcfecherror( java.util.Date value )
   {
      gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcfecherror = value ;
   }

   public String getBcpilaerror( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror ;
   }

   public void setBcpilaerror( String value )
   {
      gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcpilaerror = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBCPROD_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBCPROD_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTBCPROD_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTBCPROD_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Emprnom_Z = value ;
   }

   public String getBcproducto_Z( )
   {
      return gxTv_SdtTBCPROD_Bcproducto_Z ;
   }

   public void setBcproducto_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproducto_Z = value ;
   }

   public String getBcdescripcion_Z( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion_Z ;
   }

   public void setBcdescripcion_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescripcion_Z = value ;
   }

   public java.math.BigDecimal getBcprecio_Z( )
   {
      return gxTv_SdtTBCPROD_Bcprecio_Z ;
   }

   public void setBcprecio_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprecio_Z = value ;
   }

   public short getBcundcomp_Z( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp_Z ;
   }

   public void setBcundcomp_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcundcomp_Z = value ;
   }

   public String getBcproveedor_Z( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor_Z ;
   }

   public void setBcproveedor_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproveedor_Z = value ;
   }

   public short getBcprocesado_Z( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado_Z ;
   }

   public void setBcprocesado_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprocesado_Z = value ;
   }

   public short getBcerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcerror_Z ;
   }

   public void setBcerror_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcerror_Z = value ;
   }

   public String getBcdescerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror_Z ;
   }

   public void setBcdescerror_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescerror_Z = value ;
   }

   public java.util.Date getBcfecherror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror_Z ;
   }

   public void setBcfecherror_Z( java.util.Date value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcfecherror_Z = value ;
   }

   public String getBcpilaerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror_Z ;
   }

   public void setBcpilaerror_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcpilaerror_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTBCPROD_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Emprnom_N = value ;
   }

   public byte getBcproducto_N( )
   {
      return gxTv_SdtTBCPROD_Bcproducto_N ;
   }

   public void setBcproducto_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproducto_N = value ;
   }

   public byte getBcdescripcion_N( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion_N ;
   }

   public void setBcdescripcion_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescripcion_N = value ;
   }

   public byte getBcprecio_N( )
   {
      return gxTv_SdtTBCPROD_Bcprecio_N ;
   }

   public void setBcprecio_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprecio_N = value ;
   }

   public byte getBcundcomp_N( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp_N ;
   }

   public void setBcundcomp_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcundcomp_N = value ;
   }

   public byte getBcproveedor_N( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor_N ;
   }

   public void setBcproveedor_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcproveedor_N = value ;
   }

   public byte getBcprocesado_N( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado_N ;
   }

   public void setBcprocesado_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcprocesado_N = value ;
   }

   public byte getBcerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcerror_N ;
   }

   public void setBcerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcerror_N = value ;
   }

   public byte getBcdescerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror_N ;
   }

   public void setBcdescerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcdescerror_N = value ;
   }

   public byte getBcfecherror_N( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror_N ;
   }

   public void setBcfecherror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcfecherror_N = value ;
   }

   public byte getBcpilaerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror_N ;
   }

   public void setBcpilaerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      gxTv_SdtTBCPROD_Bcpilaerror_N = value ;
   }

   protected byte gxTv_SdtTBCPROD_Emprnom_N ;
   protected byte gxTv_SdtTBCPROD_Bcproducto_N ;
   protected byte gxTv_SdtTBCPROD_Bcdescripcion_N ;
   protected byte gxTv_SdtTBCPROD_Bcprecio_N ;
   protected byte gxTv_SdtTBCPROD_Bcundcomp_N ;
   protected byte gxTv_SdtTBCPROD_Bcproveedor_N ;
   protected byte gxTv_SdtTBCPROD_Bcprocesado_N ;
   protected byte gxTv_SdtTBCPROD_Bcerror_N ;
   protected byte gxTv_SdtTBCPROD_Bcdescerror_N ;
   protected byte gxTv_SdtTBCPROD_Bcfecherror_N ;
   protected byte gxTv_SdtTBCPROD_Bcpilaerror_N ;
   private byte gxTv_SdtTBCPROD_N ;
   protected short gxTv_SdtTBCPROD_Bcundcomp ;
   protected short gxTv_SdtTBCPROD_Bcprocesado ;
   protected short gxTv_SdtTBCPROD_Bcerror ;
   protected short gxTv_SdtTBCPROD_Initialized ;
   protected short gxTv_SdtTBCPROD_Bcundcomp_Z ;
   protected short gxTv_SdtTBCPROD_Bcprocesado_Z ;
   protected short gxTv_SdtTBCPROD_Bcerror_Z ;
   protected String gxTv_SdtTBCPROD_Emprcod ;
   protected String gxTv_SdtTBCPROD_Emprnom ;
   protected String gxTv_SdtTBCPROD_Bcproducto ;
   protected String gxTv_SdtTBCPROD_Bcdescripcion ;
   protected String gxTv_SdtTBCPROD_Bcproveedor ;
   protected String gxTv_SdtTBCPROD_Mode ;
   protected String gxTv_SdtTBCPROD_Emprcod_Z ;
   protected String gxTv_SdtTBCPROD_Emprnom_Z ;
   protected String gxTv_SdtTBCPROD_Bcproducto_Z ;
   protected String gxTv_SdtTBCPROD_Bcdescripcion_Z ;
   protected String gxTv_SdtTBCPROD_Bcproveedor_Z ;
   protected String gxTv_SdtTBCPROD_Bcdescerror ;
   protected String gxTv_SdtTBCPROD_Bcpilaerror ;
   protected String gxTv_SdtTBCPROD_Bcdescerror_Z ;
   protected String gxTv_SdtTBCPROD_Bcpilaerror_Z ;
   protected java.math.BigDecimal gxTv_SdtTBCPROD_Bcprecio ;
   protected java.util.Date gxTv_SdtTBCPROD_Bcfecherror ;
   protected java.math.BigDecimal gxTv_SdtTBCPROD_Bcprecio_Z ;
   protected java.util.Date gxTv_SdtTBCPROD_Bcfecherror_Z ;
}

