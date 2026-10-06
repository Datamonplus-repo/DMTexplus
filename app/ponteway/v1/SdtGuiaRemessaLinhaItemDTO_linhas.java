package app.ponteway.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGuiaRemessaLinhaItemDTO_linhas extends GxUserType
{
   public SdtGuiaRemessaLinhaItemDTO_linhas( )
   {
      this(  new ModelContext(SdtGuiaRemessaLinhaItemDTO_linhas.class));
   }

   public SdtGuiaRemessaLinhaItemDTO_linhas( ModelContext context )
   {
      super( context, "SdtGuiaRemessaLinhaItemDTO_linhas");
   }

   public SdtGuiaRemessaLinhaItemDTO_linhas( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtGuiaRemessaLinhaItemDTO_linhas");
   }

   public SdtGuiaRemessaLinhaItemDTO_linhas( StructSdtGuiaRemessaLinhaItemDTO_linhas struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "selected") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "emprCod") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "nmrGui") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serie") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "localDes") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ordemTingimento") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fecha") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = GXutil.nullDate() ;
                  gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(0) ;
                  gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codFornecedor") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "linha") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigo") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "artigo") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolos") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolos_anterior") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "quantidade") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "quantidade_anterior") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "referencia") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unidade") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unidade_anterior") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "reclamacion") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lote") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lu") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lfa") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "relatorioComposicao") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tear") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "aberta") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "jogo") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "polegadas") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "observacoes") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "localizacao") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "localizacao_anterior") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "afn") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fio") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fio_anterior") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "maquina") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "entrada") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "vossaRequisicao") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigoClienteCR") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigoClienteAC") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SerieNmrGuia") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia = oReader.getValue() ;
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
         sName = "GuiaRemessaLinhaItemDTO.linhas" ;
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
      oWriter.writeElement("selected", GXutil.booltostr( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("emprCod", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("nmrGui", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("serie", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("localDes", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ordemTingimento", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha)) && ( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N == 1 ) )
      {
         oWriter.writeElement("fecha", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("fecha", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("codFornecedor", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("linha", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("artigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("rolos", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("rolos_anterior", GXutil.trim( GXutil.str( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("quantidade", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("quantidade_anterior", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("referencia", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("unidade", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("unidade_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("reclamacion", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lote", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lu", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lfa", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("relatorioComposicao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("tear", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("aberta", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("jogo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("polegadas", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("observacoes", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("localizacao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("localizacao_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("afn", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("fio", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("fio_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("maquina", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("entrada", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("vossaRequisicao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigoClienteCR", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigoClienteAC", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SerieNmrGuia", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia);
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
      AddObjectProperty("selected", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected, false, false);
      AddObjectProperty("emprCod", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod, false, false);
      AddObjectProperty("nmrGui", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui, false, false);
      AddObjectProperty("serie", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie, false, false);
      AddObjectProperty("localDes", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes, false, false);
      AddObjectProperty("ordemTingimento", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("fecha", sDateCnv, false, false);
      AddObjectProperty("codFornecedor", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor, false, false);
      AddObjectProperty("linha", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha, false, false);
      AddObjectProperty("codArtigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo, false, false);
      AddObjectProperty("artigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo, false, false);
      AddObjectProperty("rolos", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos, false, false);
      AddObjectProperty("rolos_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior, false, false);
      AddObjectProperty("quantidade", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade, false, false);
      AddObjectProperty("quantidade_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior, false, false);
      AddObjectProperty("referencia", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia, false, false);
      AddObjectProperty("unidade", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade, false, false);
      AddObjectProperty("unidade_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior, false, false);
      AddObjectProperty("reclamacion", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion, false, false);
      AddObjectProperty("lote", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote, false, false);
      AddObjectProperty("lu", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu, false, false);
      AddObjectProperty("lfa", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa, false, false);
      AddObjectProperty("relatorioComposicao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao, false, false);
      AddObjectProperty("tear", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear, false, false);
      AddObjectProperty("aberta", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta, false, false);
      AddObjectProperty("jogo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo, false, false);
      AddObjectProperty("polegadas", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas, false, false);
      AddObjectProperty("observacoes", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes, false, false);
      AddObjectProperty("localizacao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao, false, false);
      AddObjectProperty("localizacao_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior, false, false);
      AddObjectProperty("afn", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn, false, false);
      AddObjectProperty("fio", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio, false, false);
      AddObjectProperty("fio_anterior", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior, false, false);
      AddObjectProperty("maquina", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina, false, false);
      AddObjectProperty("entrada", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada, false, false);
      AddObjectProperty("vossaRequisicao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao, false, false);
      AddObjectProperty("codArtigoClienteCR", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr, false, false);
      AddObjectProperty("codArtigoClienteAC", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac, false, false);
      AddObjectProperty("SerieNmrGuia", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia, false, false);
   }

   public boolean getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected( boolean value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod = value ;
   }

   public long getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui = value ;
   }

   public short getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = value ;
   }

   public java.util.Date getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha( java.util.Date value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = value ;
   }

   public long getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor = value ;
   }

   public long getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha( long value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = value ;
   }

   public short getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = value ;
   }

   public short getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior( short value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha = GXutil.nullDate() ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N ;
   }

   public app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas Clone( )
   {
      return (app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)(clone()) ;
   }

   public void setStruct( app.ponteway.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas struct )
   {
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected(struct.getSelected());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod(struct.getEmprcod());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui(struct.getNmrgui());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie(struct.getSerie());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes(struct.getLocaldes());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento(struct.getOrdemtingimento());
      if ( struct.gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N == 0 )
      {
         setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha(struct.getFecha());
      }
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor(struct.getCodfornecedor());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha(struct.getLinha());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo(struct.getCodartigo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo(struct.getArtigo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos(struct.getRolos());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior(struct.getRolos_anterior());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade(struct.getQuantidade());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior(struct.getQuantidade_anterior());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia(struct.getReferencia());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade(struct.getUnidade());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior(struct.getUnidade_anterior());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion(struct.getReclamacion());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote(struct.getLote());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu(struct.getLu());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa(struct.getLfa());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao(struct.getRelatoriocomposicao());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear(struct.getTear());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta(struct.getAberta());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo(struct.getJogo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas(struct.getPolegadas());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes(struct.getObservacoes());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao(struct.getLocalizacao());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior(struct.getLocalizacao_anterior());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn(struct.getAfn());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio(struct.getFio());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior(struct.getFio_anterior());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina(struct.getMaquina());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada(struct.getEntrada());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao(struct.getVossarequisicao());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr(struct.getCodartigoclientecr());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac(struct.getCodartigoclienteac());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia(struct.getSerienmrguia());
   }

   @SuppressWarnings("unchecked")
   public app.ponteway.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas getStruct( )
   {
      app.ponteway.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas struct = new app.ponteway.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas ();
      struct.setSelected(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected());
      struct.setEmprcod(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod());
      struct.setNmrgui(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui());
      struct.setSerie(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie());
      struct.setLocaldes(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes());
      struct.setOrdemtingimento(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento());
      if ( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N == 0 )
      {
         struct.setFecha(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha());
      }
      struct.setCodfornecedor(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor());
      struct.setLinha(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha());
      struct.setCodartigo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo());
      struct.setArtigo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo());
      struct.setRolos(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos());
      struct.setRolos_anterior(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior());
      struct.setQuantidade(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade());
      struct.setQuantidade_anterior(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior());
      struct.setReferencia(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia());
      struct.setUnidade(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade());
      struct.setUnidade_anterior(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior());
      struct.setReclamacion(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion());
      struct.setLote(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote());
      struct.setLu(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu());
      struct.setLfa(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa());
      struct.setRelatoriocomposicao(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao());
      struct.setTear(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear());
      struct.setAberta(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta());
      struct.setJogo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo());
      struct.setPolegadas(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas());
      struct.setObservacoes(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes());
      struct.setLocalizacao(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao());
      struct.setLocalizacao_anterior(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior());
      struct.setAfn(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn());
      struct.setFio(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio());
      struct.setFio_anterior(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior());
      struct.setMaquina(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina());
      struct.setEntrada(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada());
      struct.setVossarequisicao(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao());
      struct.setCodartigoclientecr(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr());
      struct.setCodartigoclienteac(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac());
      struct.setSerienmrguia(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha_N ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   protected short gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor ;
   protected long gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Aberta ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha ;
   protected boolean gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia ;
}

