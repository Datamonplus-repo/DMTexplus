package app.ponteway.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColOgGuiaImport", namespace ="TexplusNET")
public final  class StructSdtColOgGuiaImport implements Cloneable, java.io.Serializable
{
   public StructSdtColOgGuiaImport( )
   {
      this( -1, new ModelContext( StructSdtColOgGuiaImport.class ));
   }

   public StructSdtColOgGuiaImport( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColOgGuiaImport( java.util.Vector<StructSdtOgGuiaImport> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="OgGuiaImport",namespace="TexplusNET")
   public java.util.Vector<StructSdtOgGuiaImport> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtOgGuiaImport> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtOgGuiaImport> item = new java.util.Vector<>();
}

