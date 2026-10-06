package app ;
import com.genexus.*;

public final  class StructSdtPasos__SDT_Pasos__SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtPasos__SDT_Pasos__SDTItem( )
   {
      this( -1, new ModelContext( StructSdtPasos__SDT_Pasos__SDTItem.class ));
   }

   public StructSdtPasos__SDT_Pasos__SDTItem( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente = "" ;
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

   public String getPaso( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso ;
   }

   public void setPaso( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso = value ;
   }

   public String getTitulo( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo ;
   }

   public void setTitulo( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion = value ;
   }

   public String getPasoanterior( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior ;
   }

   public void setPasoanterior( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior = value ;
   }

   public String getPasosiguiente( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente ;
   }

   public void setPasosiguiente( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente = value ;
   }

   protected byte gxTv_SdtPasos__SDT_Pasos__SDTItem_N ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente ;
}

