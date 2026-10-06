package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRespuestaRegistroFacturacionAlta extends GxUserType
{
   public SdtRespuestaRegistroFacturacionAlta( )
   {
      this(  new ModelContext(SdtRespuestaRegistroFacturacionAlta.class));
   }

   public SdtRespuestaRegistroFacturacionAlta( ModelContext context )
   {
      super( context, "SdtRespuestaRegistroFacturacionAlta");
   }

   public SdtRespuestaRegistroFacturacionAlta( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtRespuestaRegistroFacturacionAlta");
   }

   public SdtRespuestaRegistroFacturacionAlta( StructSdtRespuestaRegistroFacturacionAlta struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EstadoRegistro") )
            {
               gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CSV") )
            {
               gxTv_SdtRespuestaRegistroFacturacionAlta_Csv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaRecepcion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(0) ;
                  gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Errores") )
            {
               if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Errores == null )
               {
                  gxTv_SdtRespuestaRegistroFacturacionAlta_Errores = new GXBaseCollection<app.aeat.SdtErrorType>(app.aeat.SdtErrorType.class, "ErrorType", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtRespuestaRegistroFacturacionAlta_Errores.readxmlcollection(oReader, "Errores", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Errores") )
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
         sName = "RespuestaRegistroFacturacionAlta" ;
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
      oWriter.writeElement("EstadoRegistro", gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CSV", gxTv_SdtRespuestaRegistroFacturacionAlta_Csv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion) && ( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N == 1 ) )
      {
         oWriter.writeElement("FechaRecepcion", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FechaRecepcion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Errores != null )
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
         gxTv_SdtRespuestaRegistroFacturacionAlta_Errores.writexmlcollection(oWriter, "Errores", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("EstadoRegistro", gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro, false, false);
      AddObjectProperty("CSV", gxTv_SdtRespuestaRegistroFacturacionAlta_Csv, false, false);
      datetime_STZ = gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FechaRecepcion", sDateCnv, false, false);
      if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Errores != null )
      {
         AddObjectProperty("Errores", gxTv_SdtRespuestaRegistroFacturacionAlta_Errores, false, false);
      }
   }

   public String getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro ;
   }

   public void setgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro( String value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro = value ;
   }

   public String getgxTv_SdtRespuestaRegistroFacturacionAlta_Csv( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Csv ;
   }

   public void setgxTv_SdtRespuestaRegistroFacturacionAlta_Csv( String value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Csv = value ;
   }

   public java.util.Date getgxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion ;
   }

   public void setgxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion( java.util.Date value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = value ;
   }

   public GXBaseCollection<app.aeat.SdtErrorType> getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores( )
   {
      if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Errores == null )
      {
         gxTv_SdtRespuestaRegistroFacturacionAlta_Errores = new GXBaseCollection<app.aeat.SdtErrorType>(app.aeat.SdtErrorType.class, "ErrorType", "TexplusNET", remoteHandle);
      }
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Errores ;
   }

   public void setgxTv_SdtRespuestaRegistroFacturacionAlta_Errores( GXBaseCollection<app.aeat.SdtErrorType> value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores = value ;
   }

   public void setgxTv_SdtRespuestaRegistroFacturacionAlta_Errores_SetNull( )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(1) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores = null ;
   }

   public boolean getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores_IsNull( )
   {
      if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Errores == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro = "" ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(1) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Csv = "" ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(1) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_N ;
   }

   public app.aeat.SdtRespuestaRegistroFacturacionAlta Clone( )
   {
      return (app.aeat.SdtRespuestaRegistroFacturacionAlta)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRespuestaRegistroFacturacionAlta struct )
   {
      setgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro(struct.getEstadoregistro());
      setgxTv_SdtRespuestaRegistroFacturacionAlta_Csv(struct.getCsv());
      if ( struct.gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N == 0 )
      {
         setgxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion(struct.getFecharecepcion());
      }
      GXBaseCollection<app.aeat.SdtErrorType> gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux = new GXBaseCollection<app.aeat.SdtErrorType>(app.aeat.SdtErrorType.class, "ErrorType", "TexplusNET", remoteHandle);
      Vector<app.aeat.StructSdtErrorType> gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux1 = struct.getErrores();
      if (gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux1.size(); i++)
         {
            gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux.add(new app.aeat.SdtErrorType(gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtRespuestaRegistroFacturacionAlta_Errores(gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux);
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRespuestaRegistroFacturacionAlta getStruct( )
   {
      app.aeat.StructSdtRespuestaRegistroFacturacionAlta struct = new app.aeat.StructSdtRespuestaRegistroFacturacionAlta ();
      struct.setEstadoregistro(getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro());
      struct.setCsv(getgxTv_SdtRespuestaRegistroFacturacionAlta_Csv());
      if ( gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N == 0 )
      {
         struct.setFecharecepcion(getgxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion());
      }
      struct.setErrores(getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_N ;
   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N ;
   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro ;
   protected String gxTv_SdtRespuestaRegistroFacturacionAlta_Csv ;
   protected GXBaseCollection<app.aeat.SdtErrorType> gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_aux ;
   protected GXBaseCollection<app.aeat.SdtErrorType> gxTv_SdtRespuestaRegistroFacturacionAlta_Errores=null ;
}

