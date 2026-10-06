package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerFiltersChangedData.ChangedFilter", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerFiltersChangedData_ChangedFilter implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerFiltersChangedData_ChangedFilter( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerFiltersChangedData_ChangedFilter.class ));
   }

   public StructSdtColDashboardViewerFiltersChangedData_ChangedFilter( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerFiltersChangedData_ChangedFilter( java.util.Vector<StructSdtDashboardViewerFiltersChangedData_ChangedFilter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerFiltersChangedData.ChangedFilter",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerFiltersChangedData_ChangedFilter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerFiltersChangedData_ChangedFilter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerFiltersChangedData_ChangedFilter> item = new java.util.Vector<>();
}

