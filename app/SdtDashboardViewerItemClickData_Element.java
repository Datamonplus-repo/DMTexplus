package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerItemClickData_Element extends GxUserType
{
   public SdtDashboardViewerItemClickData_Element( )
   {
      this(  new ModelContext(SdtDashboardViewerItemClickData_Element.class));
   }

   public SdtDashboardViewerItemClickData_Element( ModelContext context )
   {
      super( context, "SdtDashboardViewerItemClickData_Element");
   }

   public SdtDashboardViewerItemClickData_Element( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerItemClickData_Element");
   }

   public SdtDashboardViewerItemClickData_Element( StructSdtDashboardViewerItemClickData_Element struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtDashboardViewerItemClickData_Element_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Values") )
            {
               if ( gxTv_SdtDashboardViewerItemClickData_Element_Values == null )
               {
                  gxTv_SdtDashboardViewerItemClickData_Element_Values = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerItemClickData_Element_Values.readxmlcollection(oReader, "Values", "Value") ;
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
         sName = "DashboardViewerItemClickData.Element" ;
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
      oWriter.writeElement("Name", gxTv_SdtDashboardViewerItemClickData_Element_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtDashboardViewerItemClickData_Element_Values != null )
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
         gxTv_SdtDashboardViewerItemClickData_Element_Values.writexmlcollection(oWriter, "Values", sNameSpace1, "Value", sNameSpace1);
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
      AddObjectProperty("Name", gxTv_SdtDashboardViewerItemClickData_Element_Name, false, false);
      if ( gxTv_SdtDashboardViewerItemClickData_Element_Values != null )
      {
         AddObjectProperty("Values", gxTv_SdtDashboardViewerItemClickData_Element_Values, false, false);
      }
   }

   public String getgxTv_SdtDashboardViewerItemClickData_Element_Name( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Element_Name ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Element_Name( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element_Name = value ;
   }

   public GXSimpleCollection<String> getgxTv_SdtDashboardViewerItemClickData_Element_Values( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Element_Values == null )
      {
         gxTv_SdtDashboardViewerItemClickData_Element_Values = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtDashboardViewerItemClickData_Element_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerItemClickData_Element_Values ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Element_Values( GXSimpleCollection<String> value )
   {
      gxTv_SdtDashboardViewerItemClickData_Element_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element_Values = value ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Element_Values_SetNull( )
   {
      gxTv_SdtDashboardViewerItemClickData_Element_Values_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Element_Values = null ;
   }

   public boolean getgxTv_SdtDashboardViewerItemClickData_Element_Values_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Element_Values == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerItemClickData_Element_Values_N( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Element_Values_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerItemClickData_Element_Name = "" ;
      gxTv_SdtDashboardViewerItemClickData_Element_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Element_Values_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Element_N ;
   }

   public app.SdtDashboardViewerItemClickData_Element Clone( )
   {
      return (app.SdtDashboardViewerItemClickData_Element)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerItemClickData_Element struct )
   {
      setgxTv_SdtDashboardViewerItemClickData_Element_Name(struct.getName());
      setgxTv_SdtDashboardViewerItemClickData_Element_Values(new GXSimpleCollection<String>(String.class, "internal", "", struct.getValues()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerItemClickData_Element getStruct( )
   {
      app.StructSdtDashboardViewerItemClickData_Element struct = new app.StructSdtDashboardViewerItemClickData_Element ();
      struct.setName(getgxTv_SdtDashboardViewerItemClickData_Element_Name());
      struct.setValues(getgxTv_SdtDashboardViewerItemClickData_Element_Values().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerItemClickData_Element_N ;
   protected byte gxTv_SdtDashboardViewerItemClickData_Element_Values_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtDashboardViewerItemClickData_Element_Name ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXSimpleCollection<String> gxTv_SdtDashboardViewerItemClickData_Element_Values=null ;
}

