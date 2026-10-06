package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerFiltersChangedData_ChangedFilter extends GxUserType
{
   public SdtDashboardViewerFiltersChangedData_ChangedFilter( )
   {
      this(  new ModelContext(SdtDashboardViewerFiltersChangedData_ChangedFilter.class));
   }

   public SdtDashboardViewerFiltersChangedData_ChangedFilter( ModelContext context )
   {
      super( context, "SdtDashboardViewerFiltersChangedData_ChangedFilter");
   }

   public SdtDashboardViewerFiltersChangedData_ChangedFilter( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerFiltersChangedData_ChangedFilter");
   }

   public SdtDashboardViewerFiltersChangedData_ChangedFilter( StructSdtDashboardViewerFiltersChangedData_ChangedFilter struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Enabled") )
            {
               gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Values") )
            {
               if ( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values == null )
               {
                  gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values.readxmlcollection(oReader, "Values", "Value") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Values") )
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
         sName = "DashboardViewerFiltersChangedData.ChangedFilter" ;
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
      oWriter.writeElement("Enabled", GXutil.booltostr( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Name", gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values != null )
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
         gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values.writexmlcollection(oWriter, "Values", sNameSpace1, "Value", sNameSpace1);
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
      AddObjectProperty("Enabled", gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled, false, false);
      AddObjectProperty("Name", gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name, false, false);
      if ( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values != null )
      {
         AddObjectProperty("Values", gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values, false, false);
      }
   }

   public boolean getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled( boolean value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled = value ;
   }

   public String getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name( String value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name = value ;
   }

   public GXSimpleCollection<String> getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values == null )
      {
         gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values( GXSimpleCollection<String> value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values = value ;
   }

   public void setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_SetNull( )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values = null ;
   }

   public boolean getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(1) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name = "" ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N ;
   }

   public app.SdtDashboardViewerFiltersChangedData_ChangedFilter Clone( )
   {
      return (app.SdtDashboardViewerFiltersChangedData_ChangedFilter)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter struct )
   {
      setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled(struct.getEnabled());
      setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name(struct.getName());
      setgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values(new GXSimpleCollection<String>(String.class, "internal", "", struct.getValues()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter getStruct( )
   {
      app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter struct = new app.StructSdtDashboardViewerFiltersChangedData_ChangedFilter ();
      struct.setEnabled(getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled());
      struct.setName(getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name());
      struct.setValues(getgxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name ;
   protected String sTagName ;
   protected boolean gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXSimpleCollection<String> gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values=null ;
}

