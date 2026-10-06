package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerItemCollapseData", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerItemCollapseData implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerItemCollapseData( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerItemCollapseData.class ));
   }

   public StructSdtColQueryViewerItemCollapseData( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColQueryViewerItemCollapseData( java.util.Vector<StructSdtQueryViewerItemCollapseData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerItemCollapseData",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerItemCollapseData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerItemCollapseData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerItemCollapseData> item = new java.util.Vector<>();
}

