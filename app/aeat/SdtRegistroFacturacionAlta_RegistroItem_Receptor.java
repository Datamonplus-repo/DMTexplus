package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem_Receptor extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem_Receptor( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem_Receptor.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem_Receptor( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem_Receptor");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_Receptor( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem_Receptor");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_Receptor( StructSdtRegistroFacturacionAlta_RegistroItem_Receptor struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NIF") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NombreRazon") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon = oReader.getValue() ;
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
         sName = "RegistroFacturacionAlta.RegistroItem.Receptor" ;
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
      oWriter.writeElement("NIF", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("NombreRazon", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon);
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
      AddObjectProperty("NIF", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif, false, false);
      AddObjectProperty("NombreRazon", gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon, false, false);
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_Receptor)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif(struct.getNif());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon(struct.getNombrerazon());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor ();
      struct.setNif(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif());
      struct.setNombrerazon(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon ;
}

