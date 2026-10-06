package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientesDefectosMaquinas.MaqItem", namespace ="TexplusNET")
public final  class StructSdtColSDTClientesDefectosMaquinas_MaqItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientesDefectosMaquinas_MaqItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientesDefectosMaquinas_MaqItem.class ));
   }

   public StructSdtColSDTClientesDefectosMaquinas_MaqItem( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColSDTClientesDefectosMaquinas_MaqItem( java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientesDefectosMaquinas.MaqItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientesDefectosMaquinas_MaqItem> item = new java.util.Vector<>();
}

