package app.datamon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SdtMenuAux", namespace ="TexplusNET")
public final  class StructSdtSdtMenuAux implements Cloneable, java.io.Serializable
{
   public StructSdtSdtMenuAux( )
   {
      this( -1, new ModelContext( StructSdtSdtMenuAux.class ));
   }

   public StructSdtSdtMenuAux( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtSdtMenuAux( java.util.Vector<StructSdtSdtMenuAux_ITEM> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ITEM",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtMenuAux_ITEM> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtMenuAux_ITEM> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtMenuAux_ITEM> item = new java.util.Vector<>();
}

