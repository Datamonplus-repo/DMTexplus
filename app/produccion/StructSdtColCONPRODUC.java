package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCONPRODUC", namespace ="TexplusNET")
public final  class StructSdtColCONPRODUC implements Cloneable, java.io.Serializable
{
   public StructSdtColCONPRODUC( )
   {
      this( -1, new ModelContext( StructSdtColCONPRODUC.class ));
   }

   public StructSdtColCONPRODUC( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColCONPRODUC( java.util.Vector<StructSdtCONPRODUC> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CONPRODUC",namespace="TexplusNET")
   public java.util.Vector<StructSdtCONPRODUC> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCONPRODUC> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCONPRODUC> item = new java.util.Vector<>();
}

