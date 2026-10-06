package app.core ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TRMSDT", namespace ="TexplusNET")
public final  class StructSdtTRMSDT implements Cloneable, java.io.Serializable
{
   public StructSdtTRMSDT( )
   {
      this( -1, new ModelContext( StructSdtTRMSDT.class ));
   }

   public StructSdtTRMSDT( int remoteHandle ,
                           ModelContext context )
   {
   }

   public  StructSdtTRMSDT( java.util.Vector<StructSdtTRMSDT_TRMSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TRMSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtTRMSDT_TRMSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTRMSDT_TRMSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTRMSDT_TRMSDTItem> item = new java.util.Vector<>();
}

