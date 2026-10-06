package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTReoperados", namespace ="TexplusNET")
public final  class StructSdtColSDTReoperados implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTReoperados( )
   {
      this( -1, new ModelContext( StructSdtColSDTReoperados.class ));
   }

   public StructSdtColSDTReoperados( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColSDTReoperados( java.util.Vector<StructSdtSDTReoperados> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTReoperados",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTReoperados> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTReoperados> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTReoperados> item = new java.util.Vector<>();
}

