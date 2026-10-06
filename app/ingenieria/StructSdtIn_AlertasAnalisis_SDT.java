package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "In_AlertasAnalisis_SDT", namespace ="TexplusNET")
public final  class StructSdtIn_AlertasAnalisis_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtIn_AlertasAnalisis_SDT( )
   {
      this( -1, new ModelContext( StructSdtIn_AlertasAnalisis_SDT.class ));
   }

   public StructSdtIn_AlertasAnalisis_SDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtIn_AlertasAnalisis_SDT( java.util.Vector<StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="In_AlertasAnalisis_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> item = new java.util.Vector<>();
}

