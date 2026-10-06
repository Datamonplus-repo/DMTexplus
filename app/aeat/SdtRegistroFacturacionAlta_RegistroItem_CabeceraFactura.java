package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroSerieFacturaEmisor") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaExpedicionFacturaEmisor") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoFactura") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaveRegimenFactura") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura = oReader.getValue() ;
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
         sName = "RegistroFacturacionAlta.RegistroItem.CabeceraFactura" ;
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
      oWriter.writeElement("NumeroSerieFacturaEmisor", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("FechaExpedicionFacturaEmisor", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("TipoFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("ClaveRegimenFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
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
      AddObjectProperty("NumeroSerieFacturaEmisor", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor, false, false);
      AddObjectProperty("FechaExpedicionFacturaEmisor", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor, false, false);
      AddObjectProperty("TipoFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura, false, false);
      AddObjectProperty("ClaveRegimenFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura, false, false);
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor(struct.getNumeroseriefacturaemisor());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor(struct.getFechaexpedicionfacturaemisor());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura(struct.getTipofactura());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura(struct.getClaveregimenfactura());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura ();
      struct.setNumeroseriefacturaemisor(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor());
      struct.setFechaexpedicionfacturaemisor(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor());
      struct.setTipofactura(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura());
      struct.setClaveregimenfactura(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura ;
}

