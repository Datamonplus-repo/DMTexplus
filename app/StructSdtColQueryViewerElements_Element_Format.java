package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerElements.Element.Format", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerElements_Element_Format implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerElements_Element_Format( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerElements_Element_Format.class ));
   }

   public StructSdtColQueryViewerElements_Element_Format( int remoteHandle ,
                                                          ModelContext context )
   {
   }

   public  StructSdtColQueryViewerElements_Element_Format( java.util.Vector<StructSdtQueryViewerElements_Element_Format> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerElements.Element.Format",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerElements_Element_Format> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerElements_Element_Format> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerElements_Element_Format> item = new java.util.Vector<>();
}

