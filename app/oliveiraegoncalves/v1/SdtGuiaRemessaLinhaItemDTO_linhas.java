package app.oliveiraegoncalves.v1 ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "linha") )
            {
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha = DecimalUtil.stringToDec( oReader.getValue()) ;
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
               gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = DecimalUtil.stringToDec( oReader.getValue()) ;
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
      oWriter.writeElement("linha", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha, 10, 5)));
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
      oWriter.writeElement("rolos", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("quantidade", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lote", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote);
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
      oWriter.writeElement("fio", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ordemTingimento", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento);
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
      oWriter.writeElement("maquina", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina);
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
      AddObjectProperty("linha", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha, false, false);
      AddObjectProperty("codArtigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo, false, false);
      AddObjectProperty("artigo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo, false, false);
      AddObjectProperty("rolos", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos, false, false);
      AddObjectProperty("quantidade", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade, false, false);
      AddObjectProperty("lote", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote, false, false);
      AddObjectProperty("jogo", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo, false, false);
      AddObjectProperty("polegadas", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas, false, false);
      AddObjectProperty("fio", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio, false, false);
      AddObjectProperty("ordemTingimento", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento, false, false);
      AddObjectProperty("vossaRequisicao", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao, false, false);
      AddObjectProperty("codArtigoClienteCR", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr, false, false);
      AddObjectProperty("codArtigoClienteAC", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac, false, false);
      AddObjectProperty("maquina", gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha( java.math.BigDecimal value )
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

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = value ;
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

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = value ;
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

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = value ;
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

   public String getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina( String value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac = "" ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N ;
   }

   public app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhas Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhas)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas struct )
   {
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha(struct.getLinha());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo(struct.getCodartigo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo(struct.getArtigo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos(struct.getRolos());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade(struct.getQuantidade());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote(struct.getLote());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo(struct.getJogo());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas(struct.getPolegadas());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio(struct.getFio());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento(struct.getOrdemtingimento());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao(struct.getVossarequisicao());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr(struct.getCodartigoclientecr());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac(struct.getCodartigoclienteac());
      setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina(struct.getMaquina());
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas struct = new app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO_linhas ();
      struct.setLinha(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha());
      struct.setCodartigo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo());
      struct.setArtigo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo());
      struct.setRolos(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos());
      struct.setQuantidade(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade());
      struct.setLote(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote());
      struct.setJogo(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo());
      struct.setPolegadas(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas());
      struct.setFio(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio());
      struct.setOrdemtingimento(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento());
      struct.setVossarequisicao(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao());
      struct.setCodartigoclientecr(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr());
      struct.setCodartigoclienteac(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac());
      struct.setMaquina(getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac ;
   protected String gxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina ;
}

