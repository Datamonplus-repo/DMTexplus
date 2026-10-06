package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "QueryViewerParameters", namespace ="TexplusNET")
public final  class StructSdtQueryViewerParameters implements Cloneable, java.io.Serializable
{
   public StructSdtQueryViewerParameters( )
   {
      this( -1, new ModelContext( StructSdtQueryViewerParameters.class ));
   }

   public StructSdtQueryViewerParameters( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtQueryViewerParameters( java.util.Vector<StructSdtQueryViewerParameters_Parameter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Parameter",namespace="TexplusNET")
   public java.util.Vector<StructSdtQueryViewerParameters_Parameter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtQueryViewerParameters_Parameter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtQueryViewerParameters_Parameter> item = new java.util.Vector<>();
}

