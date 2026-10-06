package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerElements.Element.Grouping", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerElements_Element_Grouping implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerElements_Element_Grouping( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerElements_Element_Grouping.class ));
   }

   public StructSdtColQueryViewerElements_Element_Grouping( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColQueryViewerElements_Element_Grouping( java.util.Vector<StructSdtQueryViewerElements_Element_Grouping> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerElements.Element.Grouping",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerElements_Element_Grouping> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerElements_Element_Grouping> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerElements_Element_Grouping> item = new java.util.Vector<>();
}

