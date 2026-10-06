package app.asyncbatch ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColJobParameterData.JobParSdtItem", namespace ="TexplusNET")
public final  class StructSdtColJobParameterData_JobParSdtItem implements Cloneable, java.io.Serializable
{
   public StructSdtColJobParameterData_JobParSdtItem( )
   {
      this( -1, new ModelContext( StructSdtColJobParameterData_JobParSdtItem.class ));
   }

   public StructSdtColJobParameterData_JobParSdtItem( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColJobParameterData_JobParSdtItem( java.util.Vector<StructSdtJobParameterData_JobParSdtItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="JobParameterData.JobParSdtItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtJobParameterData_JobParSdtItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtJobParameterData_JobParSdtItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtJobParameterData_JobParSdtItem> item = new java.util.Vector<>();
}

