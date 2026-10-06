package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem");
   }

   public SdtRegistroFacturacionAlta_RegistroItem( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem");
   }

   public SdtRegistroFacturacionAlta_RegistroItem( StructSdtRegistroFacturacionAlta_RegistroItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CabeceraFactura") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura.readxml(oReader, "CabeceraFactura") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DatosFactura") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura.readxml(oReader, "DatosFactura") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Receptor") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor.readxml(oReader, "Receptor") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HuellaFacturaAnterior") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HuellaFactura") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura = oReader.getValue() ;
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
         sName = "RegistroFacturacionAlta.RegistroItem" ;
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
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         else
         {
            sNameSpace1 = "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura.writexml(oWriter, "CabeceraFactura", sNameSpace1);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         else
         {
            sNameSpace1 = "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura.writexml(oWriter, "DatosFactura", sNameSpace1);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         else
         {
            sNameSpace1 = "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor.writexml(oWriter, "Receptor", sNameSpace1);
      }
      oWriter.writeElement("HuellaFacturaAnterior", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("HuellaFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura);
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
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura != null )
      {
         AddObjectProperty("CabeceraFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura, false, false);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura != null )
      {
         AddObjectProperty("DatosFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura, false, false);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor != null )
      {
         AddObjectProperty("Receptor", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor, false, false);
      }
      AddObjectProperty("HuellaFacturaAnterior", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior, false, false);
      AddObjectProperty("HuellaFactura", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura, false, false);
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura == null )
      {
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura( app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura == null )
      {
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura( app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor == null )
      {
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor( app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura(struct.getCabecerafactura()));
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura(struct.getDatosfactura()));
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor(struct.getReceptor()));
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior(struct.getHuellafacturaanterior());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura(struct.getHuellafactura());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem ();
      struct.setCabecerafactura(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().getStruct());
      struct.setDatosfactura(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().getStruct());
      struct.setReceptor(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor().getStruct());
      struct.setHuellafacturaanterior(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior());
      struct.setHuellafactura(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura ;
   protected app.aeat.SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura=null ;
   protected app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura=null ;
   protected app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor=null ;
}

