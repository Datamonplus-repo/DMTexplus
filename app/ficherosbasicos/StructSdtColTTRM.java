package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTRM", namespace ="TexplusNET")
public final  class StructSdtColTTRM implements Cloneable, java.io.Serializable
{
   public StructSdtColTTRM( )
   {
      this( -1, new ModelContext( StructSdtColTTRM.class ));
   }

   public StructSdtColTTRM( int remoteHandle ,
                            ModelContext context )
   {
   }

   public  StructSdtColTTRM( java.util.Vector<StructSdtTTRM> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTRM",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTRM> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTRM> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTRM> item = new java.util.Vector<>();
}

