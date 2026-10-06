package app ;
import com.genexus.*;

public final  class StructSdtControlProductossinMovimientos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtControlProductossinMovimientos_SDT( )
   {
      this( -1, new ModelContext( StructSdtControlProductossinMovimientos_SDT.class ));
   }

   public StructSdtControlProductossinMovimientos_SDT( int remoteHandle ,
                                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnum = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnom = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = cal.getTime() ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(1) ;
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

   public String getPrdnum( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnom = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm = value ;
   }

   public java.util.Date getPrdfecultmov( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov ;
   }

   public void setPrdfecultmov( java.util.Date value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = value ;
   }

   public String getPrdtipmovult( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult ;
   }

   public void setPrdtipmovult( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult = value ;
   }

   public short getPrddiasinactivo( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo ;
   }

   public void setPrddiasinactivo( short value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact = value ;
   }

   protected byte gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N ;
   protected byte gxTv_SdtControlProductossinMovimientos_SDT_N ;
   protected short gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdnum ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdnom ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult ;
   protected java.math.BigDecimal gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm ;
   protected java.util.Date gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov ;
   protected java.math.BigDecimal gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact ;
}

