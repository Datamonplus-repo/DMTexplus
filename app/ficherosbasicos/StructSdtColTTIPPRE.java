package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTIPPRE", namespace ="TexplusNET")
public final  class StructSdtColTTIPPRE implements Cloneable, java.io.Serializable
{
   public StructSdtColTTIPPRE( )
   {
      this( -1, new ModelContext( StructSdtColTTIPPRE.class ));
   }

   public StructSdtColTTIPPRE( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTTIPPRE( java.util.Vector<StructSdtTTIPPRE> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTIPPRE",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTIPPRE> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTIPPRE> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTIPPRE> item = new java.util.Vector<>();
}

