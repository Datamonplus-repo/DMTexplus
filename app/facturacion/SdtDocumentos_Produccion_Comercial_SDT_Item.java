package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDocumentos_Produccion_Comercial_SDT_Item extends GxUserType
{
   public SdtDocumentos_Produccion_Comercial_SDT_Item( )
   {
      this(  new ModelContext(SdtDocumentos_Produccion_Comercial_SDT_Item.class));
   }

   public SdtDocumentos_Produccion_Comercial_SDT_Item( ModelContext context )
   {
      super( context, "SdtDocumentos_Produccion_Comercial_SDT_Item");
   }

   public SdtDocumentos_Produccion_Comercial_SDT_Item( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtDocumentos_Produccion_Comercial_SDT_Item");
   }

   public SdtDocumentos_Produccion_Comercial_SDT_Item( StructSdtDocumentos_Produccion_Comercial_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipo") )
            {
               gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Documento") )
            {
               gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Documentos_Produccion_Comercial_SDT.Item" ;
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
      oWriter.writeElement("Tipo", gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Documento", GXutil.trim( GXutil.str( gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      AddObjectProperty("Tipo", gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo, false, false);
      AddObjectProperty("Documento", gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento, false, false);
   }

   public String getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo( )
   {
      return gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo ;
   }

   public void setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo( String value )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo = value ;
   }

   public long getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento( )
   {
      return gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento ;
   }

   public void setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento( long value )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo = "" ;
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N ;
   }

   public app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item Clone( )
   {
      return (app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtDocumentos_Produccion_Comercial_SDT_Item struct )
   {
      setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo(struct.getTipo());
      setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento(struct.getDocumento());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtDocumentos_Produccion_Comercial_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtDocumentos_Produccion_Comercial_SDT_Item struct = new app.facturacion.StructSdtDocumentos_Produccion_Comercial_SDT_Item ();
      struct.setTipo(getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo());
      struct.setDocumento(getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento());
      return struct ;
   }

   protected byte gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo ;
}

