package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerItemClickData.Element", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerItemClickData_Element implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerItemClickData_Element( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerItemClickData_Element.class ));
   }

   public StructSdtColDashboardViewerItemClickData_Element( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerItemClickData_Element( java.util.Vector<StructSdtDashboardViewerItemClickData_Element> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerItemClickData.Element",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerItemClickData_Element> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerItemClickData_Element> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerItemClickData_Element> item = new java.util.Vector<>();
}

