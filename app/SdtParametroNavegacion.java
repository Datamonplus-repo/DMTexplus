package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtParametroNavegacion extends GxUserType
{
   public SdtParametroNavegacion( )
   {
      this(  new ModelContext(SdtParametroNavegacion.class));
   }

   public SdtParametroNavegacion( ModelContext context )
   {
      super( context, "SdtParametroNavegacion");
   }

   public SdtParametroNavegacion( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtParametroNavegacion");
   }

   public SdtParametroNavegacion( StructSdtParametroNavegacion struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Identificador") )
            {
               gxTv_SdtParametroNavegacion_Identificador = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtParametroNavegacion_Valor = oReader.getValue() ;
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
         sName = "ParametroNavegacion" ;
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
      oWriter.writeElement("Identificador", gxTv_SdtParametroNavegacion_Identificador);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valor", gxTv_SdtParametroNavegacion_Valor);
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
      AddObjectProperty("Identificador", gxTv_SdtParametroNavegacion_Identificador, false, false);
      AddObjectProperty("Valor", gxTv_SdtParametroNavegacion_Valor, false, false);
   }

   public String getgxTv_SdtParametroNavegacion_Identificador( )
   {
      return gxTv_SdtParametroNavegacion_Identificador ;
   }

   public void setgxTv_SdtParametroNavegacion_Identificador( String value )
   {
      gxTv_SdtParametroNavegacion_N = (byte)(0) ;
      gxTv_SdtParametroNavegacion_Identificador = value ;
   }

   public String getgxTv_SdtParametroNavegacion_Valor( )
   {
      return gxTv_SdtParametroNavegacion_Valor ;
   }

   public void setgxTv_SdtParametroNavegacion_Valor( String value )
   {
      gxTv_SdtParametroNavegacion_N = (byte)(0) ;
      gxTv_SdtParametroNavegacion_Valor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtParametroNavegacion_Identificador = "" ;
      gxTv_SdtParametroNavegacion_N = (byte)(1) ;
      gxTv_SdtParametroNavegacion_Valor = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtParametroNavegacion_N ;
   }

   public app.SdtParametroNavegacion Clone( )
   {
      return (app.SdtParametroNavegacion)(clone()) ;
   }

   public void setStruct( app.StructSdtParametroNavegacion struct )
   {
      setgxTv_SdtParametroNavegacion_Identificador(struct.getIdentificador());
      setgxTv_SdtParametroNavegacion_Valor(struct.getValor());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtParametroNavegacion getStruct( )
   {
      app.StructSdtParametroNavegacion struct = new app.StructSdtParametroNavegacion ();
      struct.setIdentificador(getgxTv_SdtParametroNavegacion_Identificador());
      struct.setValor(getgxTv_SdtParametroNavegacion_Valor());
      return struct ;
   }

   protected byte gxTv_SdtParametroNavegacion_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtParametroNavegacion_Identificador ;
   protected String gxTv_SdtParametroNavegacion_Valor ;
}

