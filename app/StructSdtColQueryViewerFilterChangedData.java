package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColQueryViewerFilterChangedData", namespace ="TexplusNET")
public final  class StructSdtColQueryViewerFilterChangedData implements Cloneable, java.io.Serializable
{
   public StructSdtColQueryViewerFilterChangedData( )
   {
      this( -1, new ModelContext( StructSdtColQueryViewerFilterChangedData.class ));
   }

   public StructSdtColQueryViewerFilterChangedData( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtColQueryViewerFilterChangedData( java.util.Vector<StructSdtQueryViewerFilterChangedData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="QueryViewerFilterChangedData",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerFilterChangedData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerFilterChangedData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerFilterChangedData> item = new java.util.Vector<>();
}

