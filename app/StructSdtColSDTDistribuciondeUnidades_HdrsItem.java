package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDistribuciondeUnidades.HdrsItem", namespace ="TexplusNET")
public final  class StructSdtColSDTDistribuciondeUnidades_HdrsItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDistribuciondeUnidades_HdrsItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTDistribuciondeUnidades_HdrsItem.class ));
   }

   public StructSdtColSDTDistribuciondeUnidades_HdrsItem( int remoteHandle ,
                                                          ModelContext context )
   {
   }

   public  StructSdtColSDTDistribuciondeUnidades_HdrsItem( java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDistribuciondeUnidades.HdrsItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem> item = new java.util.Vector<>();
}

