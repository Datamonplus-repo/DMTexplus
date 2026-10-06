package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerItemDoubleClickData.Filter", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerItemDoubleClickData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerItemDoubleClickData_Filter( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerItemDoubleClickData_Filter.class ));
   }

   public StructSdtColQueryViewerItemDoubleClickData_Filter( int remoteHandle ,
                                                             ModelContext context )
   {
   }

   public  StructSdtColQueryViewerItemDoubleClickData_Filter( java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Filter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerItemDoubleClickData.Filter",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Filter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Filter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerItemDoubleClickData_Filter> item = new java.util.Vector<>();
}

