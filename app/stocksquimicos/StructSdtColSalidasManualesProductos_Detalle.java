package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesProductos_Detalle", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesProductos_Detalle implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesProductos_Detalle( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesProductos_Detalle.class ));
   }

   public StructSdtColSalidasManualesProductos_Detalle( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesProductos_Detalle( java.util.Vector<StructSdtSalidasManualesProductos_Detalle> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesProductos_Detalle",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesProductos_Detalle> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesProductos_Detalle> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesProductos_Detalle> item = new java.util.Vector<>();
}

