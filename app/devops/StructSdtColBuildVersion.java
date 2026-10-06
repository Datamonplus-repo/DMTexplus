package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColBuildVersion", namespace ="TexplusNET")
public final  class StructSdtColBuildVersion implements Cloneable, java.io.Serializable
{
   public StructSdtColBuildVersion( )
   {
      this( -1, new ModelContext( StructSdtColBuildVersion.class ));
   }

   public StructSdtColBuildVersion( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColBuildVersion( java.util.Vector<StructSdtBuildVersion> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="BuildVersion",namespace="TexplusNET")
   public java.util.Vector<StructSdtBuildVersion> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtBuildVersion> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtBuildVersion> item = new java.util.Vector<>();
}

