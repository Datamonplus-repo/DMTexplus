package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerFiltersChangedData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerFiltersChangedData_Filter( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerFiltersChangedData_Filter.class ));
   }

   public StructSdtDashboardViewerFiltersChangedData_Filter( int remoteHandle ,
                                                             ModelContext context )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_Name = "" ;
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values_N = (byte)(1) ;
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

   public String getName( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Filter_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_Name = value ;
   }

   public java.util.Vector getValues( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values ;
   }

   public void setValues( java.util.Vector value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values = value ;
   }

   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Filter_N ;
   protected String gxTv_SdtDashboardViewerFiltersChangedData_Filter_Name ;
   protected java.util.Vector gxTv_SdtDashboardViewerFiltersChangedData_Filter_Values=null ;
}

