package app.pedidos ;
import com.genexus.*;

public final  class StructSdtDisObs_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtDisObs_SDT( )
   {
      this( -1, new ModelContext( StructSdtDisObs_SDT.class ));
   }

   public StructSdtDisObs_SDT( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtDisObs_SDT_Emprcod = "" ;
      gxTv_SdtDisObs_SDT_Disobstxt = "" ;
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

   public boolean getEliminar( )
   {
      return gxTv_SdtDisObs_SDT_Eliminar ;
   }

   public void setEliminar( boolean value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Eliminar = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtDisObs_SDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Emprcod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtDisObs_SDT_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Discod = value ;
   }

   public byte getDisobslin( )
   {
      return gxTv_SdtDisObs_SDT_Disobslin ;
   }

   public void setDisobslin( byte value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Disobslin = value ;
   }

   public String getDisobstxt( )
   {
      return gxTv_SdtDisObs_SDT_Disobstxt ;
   }

   public void setDisobstxt( String value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Disobstxt = value ;
   }

   protected byte gxTv_SdtDisObs_SDT_Disobslin ;
   protected byte gxTv_SdtDisObs_SDT_N ;
   protected int gxTv_SdtDisObs_SDT_Discod ;
   protected String gxTv_SdtDisObs_SDT_Emprcod ;
   protected String gxTv_SdtDisObs_SDT_Disobstxt ;
   protected boolean gxTv_SdtDisObs_SDT_Eliminar ;
}

