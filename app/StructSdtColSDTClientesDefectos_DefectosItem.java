package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientesDefectos.DefectosItem", namespace ="TexplusNET")
public final  class StructSdtColSDTClientesDefectos_DefectosItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientesDefectos_DefectosItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientesDefectos_DefectosItem.class ));
   }

   public StructSdtColSDTClientesDefectos_DefectosItem( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtColSDTClientesDefectos_DefectosItem( java.util.Vector<StructSdtSDTClientesDefectos_DefectosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientesDefectos.DefectosItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientesDefectos_DefectosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientesDefectos_DefectosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientesDefectos_DefectosItem> item = new java.util.Vector<>();
}

