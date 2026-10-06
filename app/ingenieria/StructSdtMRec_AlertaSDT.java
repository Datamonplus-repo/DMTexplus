package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "MRec_AlertaSDT", namespace ="TexplusNET")
public final  class StructSdtMRec_AlertaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AlertaSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_AlertaSDT.class ));
   }

   public StructSdtMRec_AlertaSDT( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtMRec_AlertaSDT( java.util.Vector<StructSdtMRec_AlertaSDT_Item> value )
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
   public java.util.Vector<StructSdtMRec_AlertaSDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AlertaSDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AlertaSDT_Item> item = new java.util.Vector<>();
}

