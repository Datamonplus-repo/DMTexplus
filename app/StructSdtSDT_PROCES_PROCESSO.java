package app ;
import com.genexus.*;

public final  class StructSdtSDT_PROCES_PROCESSO implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_PROCES_PROCESSO( )
   {
      this( -1, new ModelContext( StructSdtSDT_PROCES_PROCESSO.class ));
   }

   public StructSdtSDT_PROCES_PROCESSO( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_Procod = "" ;
      gxTv_SdtSDT_PROCES_PROCESSO_Prodsc = "" ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Selected = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Procod = value ;
   }

   public String getProdsc( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Prodsc ;
   }

   public void setProdsc( String value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Prodsc = value ;
   }

   protected byte gxTv_SdtSDT_PROCES_PROCESSO_N ;
   protected String gxTv_SdtSDT_PROCES_PROCESSO_Procod ;
   protected String gxTv_SdtSDT_PROCES_PROCESSO_Prodsc ;
   protected boolean gxTv_SdtSDT_PROCES_PROCESSO_Selected ;
}

