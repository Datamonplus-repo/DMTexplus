package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTBuild", namespace ="TexplusNET")
public final  class StructSdtColSDTBuild implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTBuild( )
   {
      this( -1, new ModelContext( StructSdtColSDTBuild.class ));
   }

   public StructSdtColSDTBuild( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColSDTBuild( java.util.Vector<StructSdtSDTBuild> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTBuild",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTBuild> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTBuild> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTBuild> item = new java.util.Vector<>();
}

