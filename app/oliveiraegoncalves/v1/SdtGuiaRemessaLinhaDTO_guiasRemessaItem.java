package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGuiaRemessaLinhaDTO_guiasRemessaItem extends GxUserType
{
   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem( )
   {
      this(  new ModelContext(SdtGuiaRemessaLinhaDTO_guiasRemessaItem.class));
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem( ModelContext context )
   {
      super( context, "SdtGuiaRemessaLinhaDTO_guiasRemessaItem");
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtGuiaRemessaLinhaDTO_guiasRemessaItem");
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem( StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "linhas") )
            {
               if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas == null )
               {
                  gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas.readxmlcollection(oReader, "linhas", "linhasItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "linhas") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serie") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numeroGuia") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codCliente") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codClienteIntegracao") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "nomeCliente") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataDocumento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(0) ;
                  gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "totalDocumento") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "localDescarga") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga = oReader.getValue() ;
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
         sName = "GuiaRemessaLinhaDTO.guiasRemessaItem" ;
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
      if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas != null )
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
         gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas.writexmlcollection(oWriter, "linhas", sNameSpace1, "linhasItem", sNameSpace1);
      }
      oWriter.writeElement("serie", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("numeroGuia", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codCliente", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codClienteIntegracao", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("nomeCliente", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento) && ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N == 1 ) )
      {
         oWriter.writeElement("dataDocumento", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("dataDocumento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("totalDocumento", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("localDescarga", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga);
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
      if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas != null )
      {
         AddObjectProperty("linhas", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas, false, false);
      }
      AddObjectProperty("serie", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie, false, false);
      AddObjectProperty("numeroGuia", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia, false, false);
      AddObjectProperty("codCliente", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente, false, false);
      AddObjectProperty("codClienteIntegracao", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao, false, false);
      AddObjectProperty("nomeCliente", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente, false, false);
      datetime_STZ = gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento ;
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
      AddObjectProperty("dataDocumento", sDateCnv, false, false);
      AddObjectProperty("totalDocumento", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento, false, false);
      AddObjectProperty("localDescarga", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga, false, false);
   }

   public GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas == null )
      {
         gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas( GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas = value ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_SetNull( )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas = null ;
   }

   public boolean getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_IsNull( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente = value ;
   }

   public java.util.Date getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento( java.util.Date value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N ;
   }

   public app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem struct )
   {
      GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem", "TexplusNET", remoteHandle);
      Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux1 = struct.getLinhas();
      if (gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux1.size(); i++)
         {
            gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux.add(new app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem(gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas(gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux);
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie(struct.getSerie());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia(struct.getNumeroguia());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente(struct.getCodcliente());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao(struct.getCodclienteintegracao());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente(struct.getNomecliente());
      if ( struct.gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N == 0 )
      {
         setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento(struct.getDatadocumento());
      }
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento(struct.getTotaldocumento());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga(struct.getLocaldescarga());
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem struct = new app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem ();
      struct.setLinhas(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas().getStruct());
      struct.setSerie(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie());
      struct.setNumeroguia(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia());
      struct.setCodcliente(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente());
      struct.setCodclienteintegracao(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao());
      struct.setNomecliente(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente());
      if ( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N == 0 )
      {
         struct.setDatadocumento(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento());
      }
      struct.setTotaldocumento(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento());
      struct.setLocaldescarga(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Totaldocumento ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codcliente ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Nomecliente ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas_aux ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas=null ;
}

