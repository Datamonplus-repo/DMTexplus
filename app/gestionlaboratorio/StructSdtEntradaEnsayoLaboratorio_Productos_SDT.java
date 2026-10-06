package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "EntradaEnsayoLaboratorio_Productos_SDT", namespace ="TexplusNET")
public final  class StructSdtEntradaEnsayoLaboratorio_Productos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtEntradaEnsayoLaboratorio_Productos_SDT( )
   {
      this( -1, new ModelContext( StructSdtEntradaEnsayoLaboratorio_Productos_SDT.class ));
   }

   public StructSdtEntradaEnsayoLaboratorio_Productos_SDT( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtEntradaEnsayoLaboratorio_Productos_SDT( java.util.Vector<StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item> item = new java.util.Vector<>();
}

