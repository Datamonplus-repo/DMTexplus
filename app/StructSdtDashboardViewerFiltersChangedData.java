package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerFiltersChangedData implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerFiltersChangedData( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerFiltersChangedData.class ));
   }

   public StructSdtDashboardViewerFiltersChangedData( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(1) ;
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

   public java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter> getChangedfilters( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters ;
   }

   public void setChangedfilters( java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter> value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters = value ;
   }

   public java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_Filter> getAllfilters( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Allfilters ;
   }

   public void setAllfilters( java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_Filter> value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters = value ;
   }

   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_N ;
   protected java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter> gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters=null ;
   protected java.util.Vector<app.StructSdtDashboardViewerFiltersChangedData_Filter> gxTv_SdtDashboardViewerFiltersChangedData_Allfilters=null ;
}

