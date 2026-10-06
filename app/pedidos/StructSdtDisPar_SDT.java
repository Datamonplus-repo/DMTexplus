package app.pedidos ;
import com.genexus.*;

public final  class StructSdtDisPar_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtDisPar_SDT( )
   {
      this( -1, new ModelContext( StructSdtDisPar_SDT.class ));
   }

   public StructSdtDisPar_SDT( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtDisPar_SDT_Emprcod = "" ;
      gxTv_SdtDisPar_SDT_Procod = "" ;
      gxTv_SdtDisPar_SDT_Parfasdsc = "" ;
      gxTv_SdtDisPar_SDT_Disparval = "" ;
      gxTv_SdtDisPar_SDT_Disparobs = "" ;
      gxTv_SdtDisPar_SDT_Dispartxt = "" ;
      gxTv_SdtDisPar_SDT_Disparvl2 = "" ;
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
      return gxTv_SdtDisPar_SDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Emprcod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtDisPar_SDT_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Discod = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtDisPar_SDT_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Procod = value ;
   }

   public short getDisfaslin( )
   {
      return gxTv_SdtDisPar_SDT_Disfaslin ;
   }

   public void setDisfaslin( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disfaslin = value ;
   }

   public short getParfascod( )
   {
      return gxTv_SdtDisPar_SDT_Parfascod ;
   }

   public void setParfascod( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Parfascod = value ;
   }

   public String getParfasdsc( )
   {
      return gxTv_SdtDisPar_SDT_Parfasdsc ;
   }

   public void setParfasdsc( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Parfasdsc = value ;
   }

   public String getDisparval( )
   {
      return gxTv_SdtDisPar_SDT_Disparval ;
   }

   public void setDisparval( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparval = value ;
   }

   public String getDisparobs( )
   {
      return gxTv_SdtDisPar_SDT_Disparobs ;
   }

   public void setDisparobs( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparobs = value ;
   }

   public String getDispartxt( )
   {
      return gxTv_SdtDisPar_SDT_Dispartxt ;
   }

   public void setDispartxt( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Dispartxt = value ;
   }

   public short getDisparord( )
   {
      return gxTv_SdtDisPar_SDT_Disparord ;
   }

   public void setDisparord( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparord = value ;
   }

   public String getDisparvl2( )
   {
      return gxTv_SdtDisPar_SDT_Disparvl2 ;
   }

   public void setDisparvl2( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparvl2 = value ;
   }

   protected byte gxTv_SdtDisPar_SDT_N ;
   protected short gxTv_SdtDisPar_SDT_Disfaslin ;
   protected short gxTv_SdtDisPar_SDT_Parfascod ;
   protected short gxTv_SdtDisPar_SDT_Disparord ;
   protected int gxTv_SdtDisPar_SDT_Discod ;
   protected String gxTv_SdtDisPar_SDT_Emprcod ;
   protected String gxTv_SdtDisPar_SDT_Procod ;
   protected String gxTv_SdtDisPar_SDT_Parfasdsc ;
   protected String gxTv_SdtDisPar_SDT_Disparval ;
   protected String gxTv_SdtDisPar_SDT_Disparobs ;
   protected String gxTv_SdtDisPar_SDT_Disparvl2 ;
   protected String gxTv_SdtDisPar_SDT_Dispartxt ;
}

