package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA struct )
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
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BaseImponible") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cuota") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota = oReader.getValue() ;
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
         sName = "RegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos.IVA" ;
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
      oWriter.writeElement("Tipo", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("BaseImponible", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("Cuota", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota);
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
      AddObjectProperty("Tipo", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo, false, false);
      AddObjectProperty("BaseImponible", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible, false, false);
      AddObjectProperty("Cuota", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota, false, false);
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo(struct.getTipo());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible(struct.getBaseimponible());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota(struct.getCuota());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA ();
      struct.setTipo(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo());
      struct.setBaseimponible(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible());
      struct.setCuota(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota ;
}

