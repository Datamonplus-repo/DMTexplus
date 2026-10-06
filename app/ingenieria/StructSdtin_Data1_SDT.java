package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "in_Data1_SDT", namespace ="TexplusNET")
public final  class StructSdtin_Data1_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtin_Data1_SDT( )
   {
      this( -1, new ModelContext( StructSdtin_Data1_SDT.class ));
   }

   public StructSdtin_Data1_SDT( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtin_Data1_SDT( java.util.Vector<StructSdtin_Data1_SDT_in_Data1_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="in_Data1_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtin_Data1_SDT_in_Data1_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtin_Data1_SDT_in_Data1_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtin_Data1_SDT_in_Data1_SDTItem> item = new java.util.Vector<>();
}

