package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerItemClickData.Filter", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerItemClickData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerItemClickData_Filter( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerItemClickData_Filter.class ));
   }

   public StructSdtColDashboardViewerItemClickData_Filter( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerItemClickData_Filter( java.util.Vector<StructSdtDashboardViewerItemClickData_Filter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerItemClickData.Filter",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerItemClickData_Filter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerItemClickData_Filter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerItemClickData_Filter> item = new java.util.Vector<>();
}

