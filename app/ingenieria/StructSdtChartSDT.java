package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ChartSDT", namespace ="TexplusNET")
public final  class StructSdtChartSDT implements Cloneable, java.io.Serializable
{
   public StructSdtChartSDT( )
   {
      this( -1, new ModelContext( StructSdtChartSDT.class ));
   }

   public StructSdtChartSDT( int remoteHandle ,
                             ModelContext context )
   {
   }

   public  StructSdtChartSDT( java.util.Vector<StructSdtChartSDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtChartSDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtChartSDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtChartSDT_Item> item = new java.util.Vector<>();
}

