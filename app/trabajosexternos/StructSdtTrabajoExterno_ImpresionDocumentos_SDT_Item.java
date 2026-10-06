package app.trabajosexternos ;
import com.genexus.*;

public final  class StructSdtTrabajoExterno_ImpresionDocumentos_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno_ImpresionDocumentos_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno_ImpresionDocumentos_SDT_Item.class ));
   }

   public StructSdtTrabajoExterno_ImpresionDocumentos_SDT_Item( int remoteHandle ,
                                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec = cal.getTime() ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mannom = "" ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec_N = (byte)(1) ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Seleccionar = value ;
   }

   public int getSalextalb( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextalb ;
   }

   public void setSalextalb( int value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextalb = value ;
   }

   public java.util.Date getSalextfec( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec ;
   }

   public void setSalextfec( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec = value ;
   }

   public short getMancod( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mancod ;
   }

   public void setMancod( short value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mancod = value ;
   }

   public String getMannom( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mannom ;
   }

   public void setMannom( String value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mannom = value ;
   }

   public byte getSalextlis( )
   {
      return gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextlis ;
   }

   public void setSalextlis( byte value )
   {
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextlis = value ;
   }

   protected byte gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextlis ;
   protected byte gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec_N ;
   protected byte gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_N ;
   protected short gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mancod ;
   protected int gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextalb ;
   protected String gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mannom ;
   protected boolean gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Seleccionar ;
   protected java.util.Date gxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec ;
}

