package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtSalidasManualesProductos_Detalle_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesProductos_Detalle_SDT( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesProductos_Detalle_SDT.class ));
   }

   public StructSdtSalidasManualesProductos_Detalle_SDT( int remoteHandle ,
                                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = cal.getTime() ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(1) ;
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
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod = value ;
   }

   public int getCumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont ;
   }

   public void setCumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom = value ;
   }

   public String getPrdnum( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom = value ;
   }

   public java.math.BigDecimal getCumconcant( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant ;
   }

   public void setCumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant = value ;
   }

   public java.math.BigDecimal getCumconcbis( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis ;
   }

   public void setCumconcbis( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis = value ;
   }

   public java.math.BigDecimal getCumcospro( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro ;
   }

   public void setCumcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdexicc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc ;
   }

   public void setPrdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc = value ;
   }

   public java.math.BigDecimal getPrdcanres( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres ;
   }

   public void setPrdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres = value ;
   }

   public java.math.BigDecimal getPrdpremed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed ;
   }

   public void setPrdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed = value ;
   }

   public java.util.Date getUltfecccs( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs ;
   }

   public void setUltfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = value ;
   }

   public java.math.BigDecimal getPrdfaccon( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon ;
   }

   public void setPrdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon = value ;
   }

   public String getCumconlot( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot ;
   }

   public void setCumconlot( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot = value ;
   }

   public java.math.BigDecimal getPrdvalstk( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk ;
   }

   public void setPrdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk = value ;
   }

   public byte getForprdume( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume ;
   }

   public void setForprdume( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume = value ;
   }

   public String getForprddsc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc ;
   }

   public void setForprddsc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc = value ;
   }

   public byte getCumunidad( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad ;
   }

   public void setCumunidad( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad = value ;
   }

   public String getPrdcomid( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid ;
   }

   public void setPrdcomid( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid = value ;
   }

   public String getPrdlote( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote ;
   }

   public void setPrdlote( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote = value ;
   }

   public byte getCumumed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed ;
   }

   public void setCumumed( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed = value ;
   }

   public boolean getEliminar( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar ;
   }

   public void setEliminar( boolean value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar = value ;
   }

   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_N ;
   protected int gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote ;
   protected boolean gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk ;
}

