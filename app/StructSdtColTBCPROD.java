package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTBCPROD", namespace ="TexplusNET")
public final  class StructSdtColTBCPROD implements Cloneable, java.io.Serializable
{
   public StructSdtColTBCPROD( )
   {
      this( -1, new ModelContext( StructSdtColTBCPROD.class ));
   }

   public StructSdtColTBCPROD( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTBCPROD( java.util.Vector<StructSdtTBCPROD> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TBCPROD",namespace="TexplusNET")
   public java.util.Vector<StructSdtTBCPROD> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTBCPROD> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTBCPROD> item = new java.util.Vector<>();
}

