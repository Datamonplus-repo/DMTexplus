package app.asyncbatch ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColJOBITEM", namespace ="TexplusNET")
public final  class StructSdtColJOBITEM implements Cloneable, java.io.Serializable
{
   public StructSdtColJOBITEM( )
   {
      this( -1, new ModelContext( StructSdtColJOBITEM.class ));
   }

   public StructSdtColJOBITEM( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColJOBITEM( java.util.Vector<StructSdtJOBITEM> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="JOBITEM",namespace="TexplusNET")
   public java.util.Vector<StructSdtJOBITEM> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtJOBITEM> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtJOBITEM> item = new java.util.Vector<>();
}

