package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerItemDoubleClickData.Element", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerItemDoubleClickData_Element implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerItemDoubleClickData_Element( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerItemDoubleClickData_Element.class ));
   }

   public StructSdtColQueryViewerItemDoubleClickData_Element( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtColQueryViewerItemDoubleClickData_Element( java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Element> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerItemDoubleClickData.Element",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Element> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Element> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Element> item = new java.util.Vector<>();
}

