package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientesDefectosMaquinas.MaqItem.DefItem", namespace ="TexplusNET")
public final  class StructSdtColSDTClientesDefectosMaquinas_MaqItem_DefItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientesDefectosMaquinas_MaqItem_DefItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientesDefectosMaquinas_MaqItem_DefItem.class ));
   }

   public StructSdtColSDTClientesDefectosMaquinas_MaqItem_DefItem( int remoteHandle ,
                                                                   ModelContext context )
   {
   }

   public  StructSdtColSDTClientesDefectosMaquinas_MaqItem_DefItem( java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientesDefectosMaquinas.MaqItem.DefItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> item = new java.util.Vector<>();
}

