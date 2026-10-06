package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTBuild.allArtifactsItem", namespace ="TexplusNET")
public final  class StructSdtColSDTBuild_allArtifactsItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTBuild_allArtifactsItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTBuild_allArtifactsItem.class ));
   }

   public StructSdtColSDTBuild_allArtifactsItem( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTBuild_allArtifactsItem( java.util.Vector<StructSdtSDTBuild_allArtifactsItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTBuild.allArtifactsItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTBuild_allArtifactsItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTBuild_allArtifactsItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTBuild_allArtifactsItem> item = new java.util.Vector<>();
}

