package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_DatoColumnaExisteSDT extends GxUserType
{
   public SdtMRec_DatoColumnaExisteSDT( )
   {
      this(  new ModelContext(SdtMRec_DatoColumnaExisteSDT.class));
   }

   public SdtMRec_DatoColumnaExisteSDT( ModelContext context )
   {
      super( context, "SdtMRec_DatoColumnaExisteSDT");
   }

   public SdtMRec_DatoColumnaExisteSDT( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_DatoColumnaExisteSDT");
   }

   public SdtMRec_DatoColumnaExisteSDT( StructSdtMRec_DatoColumnaExisteSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ColumnaExiste") )
            {
               gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "MRec_DatoColumnaExisteSDT" ;
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
      oWriter.writeElement("ColumnaExiste", GXutil.booltostr( gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste));
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
      AddObjectProperty("ColumnaExiste", gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste, false, false);
   }

   public boolean getgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( )
   {
      return gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste ;
   }

   public void setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste( boolean value )
   {
      gxTv_SdtMRec_DatoColumnaExisteSDT_N = (byte)(0) ;
      gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_DatoColumnaExisteSDT_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_DatoColumnaExisteSDT_N ;
   }

   public app.ingenieria.SdtMRec_DatoColumnaExisteSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_DatoColumnaExisteSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_DatoColumnaExisteSDT struct )
   {
      setgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste(struct.getColumnaexiste());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_DatoColumnaExisteSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_DatoColumnaExisteSDT struct = new app.ingenieria.StructSdtMRec_DatoColumnaExisteSDT ();
      struct.setColumnaexiste(getgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste());
      return struct ;
   }

   protected byte gxTv_SdtMRec_DatoColumnaExisteSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste ;
   protected boolean readElement ;
   protected boolean formatError ;
}

