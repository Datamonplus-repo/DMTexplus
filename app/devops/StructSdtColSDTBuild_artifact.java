package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTBuild.artifact", namespace ="TexplusNET")
public final  class StructSdtColSDTBuild_artifact implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTBuild_artifact( )
   {
      this( -1, new ModelContext( StructSdtColSDTBuild_artifact.class ));
   }

   public StructSdtColSDTBuild_artifact( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSDTBuild_artifact( java.util.Vector<StructSdtSDTBuild_artifact> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTBuild.artifact",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTBuild_artifact> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTBuild_artifact> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTBuild_artifact> item = new java.util.Vector<>();
}

