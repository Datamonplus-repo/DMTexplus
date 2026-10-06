package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtEnviodeEnsayo_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtEnviodeEnsayo_SDT( )
   {
      this( -1, new ModelContext( StructSdtEnviodeEnsayo_SDT.class ));
   }

   public StructSdtEnviodeEnsayo_SDT( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion = "" ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz = "" ;
      gxTv_SdtEnviodeEnsayo_SDT_Coste = new java.math.BigDecimal(0) ;
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

   public int getLb_numero( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_numero ;
   }

   public void setLb_numero( int value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_numero = value ;
   }

   public String getLb_opcion( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion ;
   }

   public void setLb_opcion( String value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion = value ;
   }

   public String getLb_cartaz( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz ;
   }

   public void setLb_cartaz( String value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz = value ;
   }

   public java.math.BigDecimal getCoste( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Coste ;
   }

   public void setCoste( java.math.BigDecimal value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Coste = value ;
   }

   protected byte gxTv_SdtEnviodeEnsayo_SDT_N ;
   protected int gxTv_SdtEnviodeEnsayo_SDT_Lb_numero ;
   protected String gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion ;
   protected String gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz ;
   protected java.math.BigDecimal gxTv_SdtEnviodeEnsayo_SDT_Coste ;
}

