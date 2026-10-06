package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDistribuciondeUnidades.HdrsItem.AlbaranesItem", namespace ="TexplusNET")
public final  class StructSdtColSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class ));
   }

   public StructSdtColSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( int remoteHandle ,
                                                                        ModelContext context )
   {
   }

   public  StructSdtColSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDistribuciondeUnidades.HdrsItem.AlbaranesItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> item = new java.util.Vector<>();
}

