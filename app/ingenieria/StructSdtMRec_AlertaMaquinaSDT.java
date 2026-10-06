package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "MRec_AlertaMaquinaSDT", namespace ="TexplusNET")
public final  class StructSdtMRec_AlertaMaquinaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AlertaMaquinaSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_AlertaMaquinaSDT.class ));
   }

   public StructSdtMRec_AlertaMaquinaSDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtMRec_AlertaMaquinaSDT( java.util.Vector<StructSdtMRec_AlertaMaquinaSDT_Item> value )
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
   public java.util.Vector<StructSdtMRec_AlertaMaquinaSDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AlertaMaquinaSDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AlertaMaquinaSDT_Item> item = new java.util.Vector<>();
}

