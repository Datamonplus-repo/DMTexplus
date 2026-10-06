package app ;
import com.genexus.*;

public final  class StructSdtSdtPConCos implements Cloneable, java.io.Serializable
{
   public StructSdtSdtPConCos( )
   {
      this( -1, new ModelContext( StructSdtSdtPConCos.class ));
   }

   public StructSdtSdtPConCos( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSdtPConCos_Prdunicprm = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtPConCos_Prdvalcprm = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtPConCos_Prduniconm = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtPConCos_Prdvalconm = new java.math.BigDecimal(0) ;
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

   public int getPrdanymes( )
   {
      return gxTv_SdtSdtPConCos_Prdanymes ;
   }

   public void setPrdanymes( int value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdanymes = value ;
   }

   public short getPrdany( )
   {
      return gxTv_SdtSdtPConCos_Prdany ;
   }

   public void setPrdany( short value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdany = value ;
   }

   public byte getPrdnummes( )
   {
      return gxTv_SdtSdtPConCos_Prdnummes ;
   }

   public void setPrdnummes( byte value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdnummes = value ;
   }

   public java.math.BigDecimal getPrdunicprm( )
   {
      return gxTv_SdtSdtPConCos_Prdunicprm ;
   }

   public void setPrdunicprm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdunicprm = value ;
   }

   public java.math.BigDecimal getPrdvalcprm( )
   {
      return gxTv_SdtSdtPConCos_Prdvalcprm ;
   }

   public void setPrdvalcprm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdvalcprm = value ;
   }

   public java.math.BigDecimal getPrduniconm( )
   {
      return gxTv_SdtSdtPConCos_Prduniconm ;
   }

   public void setPrduniconm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prduniconm = value ;
   }

   public java.math.BigDecimal getPrdvalconm( )
   {
      return gxTv_SdtSdtPConCos_Prdvalconm ;
   }

   public void setPrdvalconm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdvalconm = value ;
   }

   protected byte gxTv_SdtSdtPConCos_Prdnummes ;
   protected byte gxTv_SdtSdtPConCos_N ;
   protected short gxTv_SdtSdtPConCos_Prdany ;
   protected int gxTv_SdtSdtPConCos_Prdanymes ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdunicprm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdvalcprm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prduniconm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdvalconm ;
}

