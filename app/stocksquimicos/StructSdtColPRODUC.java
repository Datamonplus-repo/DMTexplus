package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPRODUC", namespace ="TexplusNET")
public final  class StructSdtColPRODUC implements Cloneable, java.io.Serializable
{
   public StructSdtColPRODUC( )
   {
      this( -1, new ModelContext( StructSdtColPRODUC.class ));
   }

   public StructSdtColPRODUC( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColPRODUC( java.util.Vector<StructSdtPRODUC> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="PRODUC",namespace="TexplusNET")
   public java.util.Vector<StructSdtPRODUC> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPRODUC> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPRODUC> item = new java.util.Vector<>();
}

