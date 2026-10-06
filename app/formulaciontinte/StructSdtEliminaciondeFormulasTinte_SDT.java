package app.formulaciontinte ;
import com.genexus.*;

public final  class StructSdtEliminaciondeFormulasTinte_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtEliminaciondeFormulasTinte_SDT( )
   {
      this( -1, new ModelContext( StructSdtEliminaciondeFormulasTinte_SDT.class ));
   }

   public StructSdtEliminaciondeFormulasTinte_SDT( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = cal.getTime() ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(1) ;
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
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom = value ;
   }

   public String getForser( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser ;
   }

   public void setForser( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser = value ;
   }

   public String getForserdsc( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc ;
   }

   public void setForserdsc( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod = value ;
   }

   public java.util.Date getForultuti( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti ;
   }

   public void setForultuti( java.util.Date value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = value ;
   }

   public String getForpro( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro ;
   }

   public void setForpro( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro = value ;
   }

   public int getFornumcol( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol ;
   }

   public void setFornumcol( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol = value ;
   }

   public int getNumhdrsprod( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod ;
   }

   public void setNumhdrsprod( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod = value ;
   }

   public int getNumhdrshist( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist ;
   }

   public void setNumhdrshist( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist = value ;
   }

   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod ;
   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N ;
   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_N ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro ;
   protected java.util.Date gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti ;
}

