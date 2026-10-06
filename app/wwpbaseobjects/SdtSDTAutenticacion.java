package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTAutenticacion extends GxUserType
{
   public SdtSDTAutenticacion( )
   {
      this(  new ModelContext(SdtSDTAutenticacion.class));
   }

   public SdtSDTAutenticacion( ModelContext context )
   {
      super( context, "SdtSDTAutenticacion");
   }

   public SdtSDTAutenticacion( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTAutenticacion");
   }

   public SdtSDTAutenticacion( StructSdtSDTAutenticacion struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cadena01") )
            {
               gxTv_SdtSDTAutenticacion_Cadena01 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cadena02") )
            {
               gxTv_SdtSDTAutenticacion_Cadena02 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cadena03") )
            {
               gxTv_SdtSDTAutenticacion_Cadena03 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cadena04") )
            {
               gxTv_SdtSDTAutenticacion_Cadena04 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
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
         sName = "SDTAutenticacion" ;
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
      oWriter.writeElement("Cadena01", gxTv_SdtSDTAutenticacion_Cadena01);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cadena02", gxTv_SdtSDTAutenticacion_Cadena02);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cadena03", gxTv_SdtSDTAutenticacion_Cadena03);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cadena04", gxTv_SdtSDTAutenticacion_Cadena04);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Cadena01", gxTv_SdtSDTAutenticacion_Cadena01, false, false);
      AddObjectProperty("Cadena02", gxTv_SdtSDTAutenticacion_Cadena02, false, false);
      AddObjectProperty("Cadena03", gxTv_SdtSDTAutenticacion_Cadena03, false, false);
      AddObjectProperty("Cadena04", gxTv_SdtSDTAutenticacion_Cadena04, false, false);
   }

   public String getgxTv_SdtSDTAutenticacion_Cadena01( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena01 ;
   }

   public void setgxTv_SdtSDTAutenticacion_Cadena01( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena01 = value ;
   }

   public String getgxTv_SdtSDTAutenticacion_Cadena02( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena02 ;
   }

   public void setgxTv_SdtSDTAutenticacion_Cadena02( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena02 = value ;
   }

   public String getgxTv_SdtSDTAutenticacion_Cadena03( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena03 ;
   }

   public void setgxTv_SdtSDTAutenticacion_Cadena03( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena03 = value ;
   }

   public String getgxTv_SdtSDTAutenticacion_Cadena04( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena04 ;
   }

   public void setgxTv_SdtSDTAutenticacion_Cadena04( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena04 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTAutenticacion_Cadena01 = "" ;
      gxTv_SdtSDTAutenticacion_N = (byte)(1) ;
      gxTv_SdtSDTAutenticacion_Cadena02 = "" ;
      gxTv_SdtSDTAutenticacion_Cadena03 = "" ;
      gxTv_SdtSDTAutenticacion_Cadena04 = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTAutenticacion_N ;
   }

   public app.wwpbaseobjects.SdtSDTAutenticacion Clone( )
   {
      return (app.wwpbaseobjects.SdtSDTAutenticacion)(clone()) ;
   }

   public void setStruct( app.wwpbaseobjects.StructSdtSDTAutenticacion struct )
   {
      setgxTv_SdtSDTAutenticacion_Cadena01(struct.getCadena01());
      setgxTv_SdtSDTAutenticacion_Cadena02(struct.getCadena02());
      setgxTv_SdtSDTAutenticacion_Cadena03(struct.getCadena03());
      setgxTv_SdtSDTAutenticacion_Cadena04(struct.getCadena04());
   }

   @SuppressWarnings("unchecked")
   public app.wwpbaseobjects.StructSdtSDTAutenticacion getStruct( )
   {
      app.wwpbaseobjects.StructSdtSDTAutenticacion struct = new app.wwpbaseobjects.StructSdtSDTAutenticacion ();
      struct.setCadena01(getgxTv_SdtSDTAutenticacion_Cadena01());
      struct.setCadena02(getgxTv_SdtSDTAutenticacion_Cadena02());
      struct.setCadena03(getgxTv_SdtSDTAutenticacion_Cadena03());
      struct.setCadena04(getgxTv_SdtSDTAutenticacion_Cadena04());
      return struct ;
   }

   protected byte gxTv_SdtSDTAutenticacion_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTAutenticacion_Cadena01 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena02 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena03 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena04 ;
}

