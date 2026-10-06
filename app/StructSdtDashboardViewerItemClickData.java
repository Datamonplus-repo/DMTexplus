package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerItemClickData implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerItemClickData( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerItemClickData.class ));
   }

   public StructSdtDashboardViewerItemClickData( int remoteHandle ,
                                                 ModelContext context )
   {
      gxTv_SdtDashboardViewerItemClickData_Object = "" ;
      gxTv_SdtDashboardViewerItemClickData_Element = "" ;
      gxTv_SdtDashboardViewerItemClickData_Value = "" ;
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(1) ;
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

   public String getObject( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Object ;
   }

   public void setObject( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Object = value ;
   }

   public String getElement( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Element ;
   }

   public void setElement( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Value = value ;
   }

   public java.util.Vector<app.StructSdtDashboardViewerItemClickData_Element> getContext( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Context ;
   }

   public void setContext( java.util.Vector<app.StructSdtDashboardViewerItemClickData_Element> value )
   {
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Context = value ;
   }

   public java.util.Vector<app.StructSdtDashboardViewerItemClickData_Filter> getAllfilters( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Allfilters ;
   }

   public void setAllfilters( java.util.Vector<app.StructSdtDashboardViewerItemClickData_Filter> value )
   {
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Allfilters = value ;
   }

   protected byte gxTv_SdtDashboardViewerItemClickData_Context_N ;
   protected byte gxTv_SdtDashboardViewerItemClickData_Allfilters_N ;
   protected byte gxTv_SdtDashboardViewerItemClickData_N ;
   protected String gxTv_SdtDashboardViewerItemClickData_Object ;
   protected String gxTv_SdtDashboardViewerItemClickData_Element ;
   protected String gxTv_SdtDashboardViewerItemClickData_Value ;
   protected java.util.Vector<app.StructSdtDashboardViewerItemClickData_Element> gxTv_SdtDashboardViewerItemClickData_Context=null ;
   protected java.util.Vector<app.StructSdtDashboardViewerItemClickData_Filter> gxTv_SdtDashboardViewerItemClickData_Allfilters=null ;
}

