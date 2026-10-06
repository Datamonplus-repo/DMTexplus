package app.datamon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SdtSystem", namespace ="TexplusNET")
public final  class StructSdtSdtSystem implements Cloneable, java.io.Serializable
{
   public StructSdtSdtSystem( )
   {
      this( -1, new ModelContext( StructSdtSdtSystem.class ));
   }

   public StructSdtSdtSystem( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtSdtSystem( java.util.Vector<StructSdtSdtSystem_System> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="System",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtSystem_System> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtSystem_System> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtSystem_System> item = new java.util.Vector<>();
}

