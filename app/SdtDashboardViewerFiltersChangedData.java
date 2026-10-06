package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerFiltersChangedData extends GxUserType
{
   public SdtDashboardViewerFiltersChangedData( )
   {
      this(  new ModelContext(SdtDashboardViewerFiltersChangedData.class));
   }

   public SdtDashboardViewerFiltersChangedData( ModelContext context )
   {
      super( context, "SdtDashboardViewerFiltersChangedData");
   }

   public SdtDashboardViewerFiltersChangedData( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerFiltersChangedData");
   }

   public SdtDashboardViewerFiltersChangedData( StructSdtDashboardViewerFiltersChangedData struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "ChangedFilters") )
            {
               if ( gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters == null )
               {
                  gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter>(app.SdtDashboardViewerFiltersChangedData_ChangedFilter.class, "DashboardViewerFiltersChangedData.ChangedFilter", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters.readxmlcollection(oReader, "ChangedFilters", "ChangedFilter") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "ChangedFilters") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AllFilters") )
            {
               if ( gxTv_SdtDashboardViewerFiltersChangedData_Allfilters == null )
               {
                  gxTv_SdtDashboardViewerFiltersChangedData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter>(app.SdtDashboardViewerFiltersChangedData_Filter.class, "DashboardViewerFiltersChangedData.Filter", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerFiltersChangedData_Allfilters.readxmlcollection(oReader, "AllFilters", "Filter") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "AllFilters") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "DashboardViewerFiltersChangedData" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters.writexmlcollection(oWriter, "ChangedFilters", sNameSpace1, "ChangedFilter", sNameSpace1);
      }
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Allfilters != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtDashboardViewerFiltersChangedData_Allfilters.writexmlcollection(oWriter, "AllFilters", sNameSpace1, "Filter", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters != null )
      {
         AddObjectProperty("ChangedFilters", gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters, false, false);
      }
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Allfilters != null )
      {
         AddObjectProperty("AllFilters", gxTv_SdtDashboardViewerFiltersChangedData_Allfilters, false, false);
      }
   }

   public GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter> getgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters == null )
      {
         gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter>(app.SdtDashboardViewerFiltersChangedData_ChangedFilter.class, "DashboardViewerFiltersChangedData.ChangedFilter", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters( GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter> value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters = value ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_SetNull( )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters = null ;
   }

   public boolean getgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N ;
   }

   public GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter> getgxTv_SdtDashboardViewerFiltersChangedData_Allfilters( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Allfilters == null )
      {
         gxTv_SdtDashboardViewerFiltersChangedData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter>(app.SdtDashboardViewerFiltersChangedData_Filter.class, "DashboardViewerFiltersChangedData.Filter", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerFiltersChangedData_Allfilters ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_Allfilters( GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter> value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters = value ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_Allfilters_SetNull( )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters = null ;
   }

   public boolean getgxTv_SdtDashboardViewerFiltersChangedData_Allfilters_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_Allfilters == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_N ;
   }

   public app.SdtDashboardViewerFiltersChangedData Clone( )
   {
      return (app.SdtDashboardViewerFiltersChangedData)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerFiltersChangedData struct )
   {
      GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter> gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter>(app.SdtDashboardViewerFiltersChangedData_ChangedFilter.class, "DashboardViewerFiltersChangedData.ChangedFilter", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter> gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux1 = struct.getChangedfilters();
      if (gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux.add(new app.SdtDashboardViewerFiltersChangedData_ChangedFilter(gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters(gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux);
      GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter> gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux = new GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter>(app.SdtDashboardViewerFiltersChangedData_Filter.class, "DashboardViewerFiltersChangedData.Filter", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerFiltersChangedData_Filter> gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux1 = struct.getAllfilters();
      if (gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux.add(new app.SdtDashboardViewerFiltersChangedData_Filter(gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerFiltersChangedData_Allfilters(gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerFiltersChangedData getStruct( )
   {
      app.StructSdtDashboardViewerFiltersChangedData struct = new app.StructSdtDashboardViewerFiltersChangedData ();
      struct.setChangedfilters(getgxTv_SdtDashboardViewerFiltersChangedData_Changedfilters().getStruct());
      struct.setAllfilters(getgxTv_SdtDashboardViewerFiltersChangedData_Allfilters().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter> gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter> gxTv_SdtDashboardViewerFiltersChangedData_Allfilters_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_ChangedFilter> gxTv_SdtDashboardViewerFiltersChangedData_Changedfilters=null ;
   protected GXBaseCollection<app.SdtDashboardViewerFiltersChangedData_Filter> gxTv_SdtDashboardViewerFiltersChangedData_Allfilters=null ;
}

