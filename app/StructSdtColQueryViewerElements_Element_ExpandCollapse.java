package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerElements.Element.ExpandCollapse", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerElements_Element_ExpandCollapse implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerElements_Element_ExpandCollapse( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerElements_Element_ExpandCollapse.class ));
   }

   public StructSdtColQueryViewerElements_Element_ExpandCollapse( int remoteHandle ,
                                                                  ModelContext context )
   {
   }

   public  StructSdtColQueryViewerElements_Element_ExpandCollapse( java.util.Vector<StructSdtQueryViewerElements_Element_ExpandCollapse> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerElements.Element.ExpandCollapse",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerElements_Element_ExpandCollapse> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerElements_Element_ExpandCollapse> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerElements_Element_ExpandCollapse> item = new java.util.Vector<>();
}

