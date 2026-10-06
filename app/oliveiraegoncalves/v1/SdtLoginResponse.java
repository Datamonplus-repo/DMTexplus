package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLoginResponse extends GxUserType
{
   public SdtLoginResponse( )
   {
      this(  new ModelContext(SdtLoginResponse.class));
   }

   public SdtLoginResponse( ModelContext context )
   {
      super( context, "SdtLoginResponse");
   }

   public SdtLoginResponse( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtLoginResponse");
   }

   public SdtLoginResponse( StructSdtLoginResponse struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "accessToken") )
            {
               gxTv_SdtLoginResponse_Accesstoken = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "expiresIn") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtLoginResponse_Expiresin = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtLoginResponse_Expiresin_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtLoginResponse_Expiresin_N = (byte)(0) ;
                  gxTv_SdtLoginResponse_Expiresin = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "autenticado") )
            {
               gxTv_SdtLoginResponse_Autenticado = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codUtilizador") )
            {
               gxTv_SdtLoginResponse_Codutilizador = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codPerfil") )
            {
               gxTv_SdtLoginResponse_Codperfil = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "programaInicial") )
            {
               gxTv_SdtLoginResponse_Programainicial = oReader.getValue() ;
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
         sName = "LoginResponse" ;
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
      oWriter.writeElement("accessToken", gxTv_SdtLoginResponse_Accesstoken);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtLoginResponse_Expiresin) && ( gxTv_SdtLoginResponse_Expiresin_N == 1 ) )
      {
         oWriter.writeElement("expiresIn", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtLoginResponse_Expiresin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("expiresIn", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("autenticado", GXutil.booltostr( gxTv_SdtLoginResponse_Autenticado));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codUtilizador", gxTv_SdtLoginResponse_Codutilizador);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codPerfil", gxTv_SdtLoginResponse_Codperfil);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("programaInicial", gxTv_SdtLoginResponse_Programainicial);
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
      AddObjectProperty("accessToken", gxTv_SdtLoginResponse_Accesstoken, false, false);
      datetime_STZ = gxTv_SdtLoginResponse_Expiresin ;
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
      AddObjectProperty("expiresIn", sDateCnv, false, false);
      AddObjectProperty("autenticado", gxTv_SdtLoginResponse_Autenticado, false, false);
      AddObjectProperty("codUtilizador", gxTv_SdtLoginResponse_Codutilizador, false, false);
      AddObjectProperty("codPerfil", gxTv_SdtLoginResponse_Codperfil, false, false);
      AddObjectProperty("programaInicial", gxTv_SdtLoginResponse_Programainicial, false, false);
   }

   public String getgxTv_SdtLoginResponse_Accesstoken( )
   {
      return gxTv_SdtLoginResponse_Accesstoken ;
   }

   public void setgxTv_SdtLoginResponse_Accesstoken( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Accesstoken = value ;
   }

   public java.util.Date getgxTv_SdtLoginResponse_Expiresin( )
   {
      return gxTv_SdtLoginResponse_Expiresin ;
   }

   public void setgxTv_SdtLoginResponse_Expiresin( java.util.Date value )
   {
      gxTv_SdtLoginResponse_Expiresin_N = (byte)(0) ;
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Expiresin = value ;
   }

   public boolean getgxTv_SdtLoginResponse_Autenticado( )
   {
      return gxTv_SdtLoginResponse_Autenticado ;
   }

   public void setgxTv_SdtLoginResponse_Autenticado( boolean value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Autenticado = value ;
   }

   public String getgxTv_SdtLoginResponse_Codutilizador( )
   {
      return gxTv_SdtLoginResponse_Codutilizador ;
   }

   public void setgxTv_SdtLoginResponse_Codutilizador( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Codutilizador = value ;
   }

   public String getgxTv_SdtLoginResponse_Codperfil( )
   {
      return gxTv_SdtLoginResponse_Codperfil ;
   }

   public void setgxTv_SdtLoginResponse_Codperfil( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Codperfil = value ;
   }

   public String getgxTv_SdtLoginResponse_Programainicial( )
   {
      return gxTv_SdtLoginResponse_Programainicial ;
   }

   public void setgxTv_SdtLoginResponse_Programainicial( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Programainicial = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLoginResponse_Accesstoken = "" ;
      gxTv_SdtLoginResponse_N = (byte)(1) ;
      gxTv_SdtLoginResponse_Expiresin = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtLoginResponse_Expiresin_N = (byte)(1) ;
      gxTv_SdtLoginResponse_Codutilizador = "" ;
      gxTv_SdtLoginResponse_Codperfil = "" ;
      gxTv_SdtLoginResponse_Programainicial = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtLoginResponse_N ;
   }

   public app.oliveiraegoncalves.v1.SdtLoginResponse Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtLoginResponse)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtLoginResponse struct )
   {
      setgxTv_SdtLoginResponse_Accesstoken(struct.getAccesstoken());
      if ( struct.gxTv_SdtLoginResponse_Expiresin_N == 0 )
      {
         setgxTv_SdtLoginResponse_Expiresin(struct.getExpiresin());
      }
      setgxTv_SdtLoginResponse_Autenticado(struct.getAutenticado());
      setgxTv_SdtLoginResponse_Codutilizador(struct.getCodutilizador());
      setgxTv_SdtLoginResponse_Codperfil(struct.getCodperfil());
      setgxTv_SdtLoginResponse_Programainicial(struct.getProgramainicial());
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtLoginResponse getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtLoginResponse struct = new app.oliveiraegoncalves.v1.StructSdtLoginResponse ();
      struct.setAccesstoken(getgxTv_SdtLoginResponse_Accesstoken());
      if ( gxTv_SdtLoginResponse_Expiresin_N == 0 )
      {
         struct.setExpiresin(getgxTv_SdtLoginResponse_Expiresin());
      }
      struct.setAutenticado(getgxTv_SdtLoginResponse_Autenticado());
      struct.setCodutilizador(getgxTv_SdtLoginResponse_Codutilizador());
      struct.setCodperfil(getgxTv_SdtLoginResponse_Codperfil());
      struct.setProgramainicial(getgxTv_SdtLoginResponse_Programainicial());
      return struct ;
   }

   protected byte gxTv_SdtLoginResponse_N ;
   protected byte gxTv_SdtLoginResponse_Expiresin_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtLoginResponse_Expiresin ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtLoginResponse_Autenticado ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLoginResponse_Accesstoken ;
   protected String gxTv_SdtLoginResponse_Codutilizador ;
   protected String gxTv_SdtLoginResponse_Codperfil ;
   protected String gxTv_SdtLoginResponse_Programainicial ;
}

