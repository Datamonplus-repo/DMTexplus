package app.pedidos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TiposdePresentacion_SDT", namespace ="TexplusNET")
public final  class StructSdtTiposdePresentacion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTiposdePresentacion_SDT( )
   {
      this( -1, new ModelContext( StructSdtTiposdePresentacion_SDT.class ));
   }

   public StructSdtTiposdePresentacion_SDT( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtTiposdePresentacion_SDT( java.util.Vector<StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> value )
   {
      item = value;
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

   @jakarta.xml.bind.annotation.XmlElement(name="TiposdePresentacion_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> item = new java.util.Vector<>();
}

