package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerElements.Element.AxisOrder", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerElements_Element_AxisOrder implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerElements_Element_AxisOrder( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerElements_Element_AxisOrder.class ));
   }

   public StructSdtColQueryViewerElements_Element_AxisOrder( int remoteHandle ,
                                                             ModelContext context )
   {
   }

   public  StructSdtColQueryViewerElements_Element_AxisOrder( java.util.Vector<StructSdtQueryViewerElements_Element_AxisOrder> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerElements.Element.AxisOrder",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerElements_Element_AxisOrder> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerElements_Element_AxisOrder> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerElements_Element_AxisOrder> item = new java.util.Vector<>();
}

