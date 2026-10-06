package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtin_Data1_SDT_in_Data1_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtin_Data1_SDT_in_Data1_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtin_Data1_SDT_in_Data1_SDTItem.class ));
   }

   public StructSdtin_Data1_SDT_in_Data1_SDTItem( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha = "" ;
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

   public String getFecha( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha ;
   }

   public void setFecha( String value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha = value ;
   }

   public short getMaquina( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina ;
   }

   public void setMaquina( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina = value ;
   }

   public short getHdr( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr ;
   }

   public void setHdr( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr = value ;
   }

   public short getArticulo( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo ;
   }

   public void setArticulo( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo = value ;
   }

   public short getCliente( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente ;
   }

   public void setCliente( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente = value ;
   }

   public short getFase( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase ;
   }

   public void setFase( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase = value ;
   }

   protected byte gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase ;
   protected String gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha ;
}

