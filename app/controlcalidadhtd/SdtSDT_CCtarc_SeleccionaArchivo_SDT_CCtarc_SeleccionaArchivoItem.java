package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem extends GxUserType
{
   public SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( )
   {
      this(  new ModelContext(SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem.class));
   }

   public SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( ModelContext context )
   {
      super( context, "SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem");
   }

   public SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( int remoteHandle ,
                                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem");
   }

   public SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SelOP") )
            {
               gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NomFile") )
            {
               gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile = oReader.getValue() ;
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
         sName = "SDT_CCtarc_SeleccionaArchivo.SDT_CCtarc_SeleccionaArchivoItem" ;
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
      oWriter.writeElement("SelOP", GXutil.booltostr( gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NomFile", gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile);
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
      AddObjectProperty("SelOP", gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop, false, false);
      AddObjectProperty("NomFile", gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile, false, false);
   }

   public boolean getgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop( )
   {
      return gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop ;
   }

   public void setgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop( boolean value )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N = (byte)(0) ;
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop = value ;
   }

   public String getgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile( )
   {
      return gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile ;
   }

   public void setgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile( String value )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N = (byte)(0) ;
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N = (byte)(1) ;
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N ;
   }

   public app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem Clone( )
   {
      return (app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem struct )
   {
      setgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop(struct.getSelop());
      setgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile(struct.getNomfile());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem getStruct( )
   {
      app.controlcalidadhtd.StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem struct = new app.controlcalidadhtd.StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem ();
      struct.setSelop(getgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop());
      struct.setNomfile(getgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile());
      return struct ;
   }

   protected byte gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop ;
   protected boolean readElement ;
   protected boolean formatError ;
}

