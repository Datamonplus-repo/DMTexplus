package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem extends GxUserType
{
   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( )
   {
      this(  new ModelContext(SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class));
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( ModelContext context )
   {
      super( context, "SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem");
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem");
   }

   public SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem struct )
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
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigo") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "artigo") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolos") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "quantidade") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lote") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "jogo") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "polegadas") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fio") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ordemTingimento") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "vossaRequisicao") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigoClienteCR") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "codArtigoClienteAC") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "maquina") )
            {
               gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina = oReader.getValue() ;
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
         sName = "GuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem" ;
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
      oWriter.writeElement("linha", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("artigo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("rolos", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("quantidade", GXutil.trim( GXutil.strNoRound( gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lote", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("jogo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("polegadas", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("fio", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ordemTingimento", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("vossaRequisicao", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigoClienteCR", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("codArtigoClienteAC", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("maquina", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina);
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
      AddObjectProperty("linha", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha, false, false);
      AddObjectProperty("codArtigo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo, false, false);
      AddObjectProperty("artigo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo, false, false);
      AddObjectProperty("rolos", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos, false, false);
      AddObjectProperty("quantidade", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade, false, false);
      AddObjectProperty("lote", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote, false, false);
      AddObjectProperty("jogo", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo, false, false);
      AddObjectProperty("polegadas", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas, false, false);
      AddObjectProperty("fio", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio, false, false);
      AddObjectProperty("ordemTingimento", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento, false, false);
      AddObjectProperty("vossaRequisicao", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao, false, false);
      AddObjectProperty("codArtigoClienteCR", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr, false, false);
      AddObjectProperty("codArtigoClienteAC", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac, false, false);
      AddObjectProperty("maquina", gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade( java.math.BigDecimal value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac = value ;
   }

   public String getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina( String value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade = DecimalUtil.ZERO ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac = "" ;
      gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N ;
   }

   public app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem struct )
   {
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha(struct.getLinha());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo(struct.getCodartigo());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo(struct.getArtigo());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos(struct.getRolos());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade(struct.getQuantidade());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote(struct.getLote());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo(struct.getJogo());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas(struct.getPolegadas());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio(struct.getFio());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento(struct.getOrdemtingimento());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao(struct.getVossarequisicao());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr(struct.getCodartigoclientecr());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac(struct.getCodartigoclienteac());
      setgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina(struct.getMaquina());
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem struct = new app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem ();
      struct.setLinha(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha());
      struct.setCodartigo(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo());
      struct.setArtigo(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo());
      struct.setRolos(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos());
      struct.setQuantidade(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade());
      struct.setLote(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote());
      struct.setJogo(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo());
      struct.setPolegadas(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas());
      struct.setFio(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio());
      struct.setOrdemtingimento(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento());
      struct.setVossarequisicao(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao());
      struct.setCodartigoclientecr(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr());
      struct.setCodartigoclienteac(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac());
      struct.setMaquina(getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos ;
   protected java.math.BigDecimal gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac ;
   protected String gxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina ;
}

