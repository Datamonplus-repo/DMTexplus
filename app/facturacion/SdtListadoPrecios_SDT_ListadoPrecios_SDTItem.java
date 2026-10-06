package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtListadoPrecios_SDT_ListadoPrecios_SDTItem extends GxUserType
{
   public SdtListadoPrecios_SDT_ListadoPrecios_SDTItem( )
   {
      this(  new ModelContext(SdtListadoPrecios_SDT_ListadoPrecios_SDTItem.class));
   }

   public SdtListadoPrecios_SDT_ListadoPrecios_SDTItem( ModelContext context )
   {
      super( context, "SdtListadoPrecios_SDT_ListadoPrecios_SDTItem");
   }

   public SdtListadoPrecios_SDT_ListadoPrecios_SDTItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtListadoPrecios_SDT_ListadoPrecios_SDTItem");
   }

   public SdtListadoPrecios_SDT_ListadoPrecios_SDTItem( StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPreKgm") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPreMtr") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColCod") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColDsc") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntCod") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntDsc") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntPreKgm") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntPreMtr") )
            {
               gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ListadoPrecios_SDT.ListadoPrecios_SDTItem" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCod", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColCod", GXutil.trim( GXutil.str( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntCod", GXutil.trim( GXutil.str( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr, 13, 5)));
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
      AddObjectProperty("Clicod", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom, false, false);
      AddObjectProperty("ArtCod", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc, false, false);
      AddObjectProperty("ArtPreKgm", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm, false, false);
      AddObjectProperty("ArtPreMtr", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr, false, false);
      AddObjectProperty("TipColCod", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod, false, false);
      AddObjectProperty("TipColDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc, false, false);
      AddObjectProperty("IntCod", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod, false, false);
      AddObjectProperty("IntDsc", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc, false, false);
      AddObjectProperty("IntPreKgm", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm, false, false);
      AddObjectProperty("IntPreMtr", gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr, false, false);
   }

   public int getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod( int value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom( String value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom = value ;
   }

   public String getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod( String value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod = value ;
   }

   public String getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc( String value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr( java.math.BigDecimal value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr = value ;
   }

   public byte getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod( byte value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod = value ;
   }

   public String getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc( String value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc = value ;
   }

   public byte getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod( byte value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod = value ;
   }

   public String getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc( String value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr ;
   }

   public void setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr( java.math.BigDecimal value )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(0) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N = (byte)(1) ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom = "" ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod = "" ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc = "" ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm = DecimalUtil.ZERO ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr = DecimalUtil.ZERO ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc = "" ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc = "" ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm = DecimalUtil.ZERO ;
      gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N ;
   }

   public app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem Clone( )
   {
      return (app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem struct )
   {
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod(struct.getArtcod());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc(struct.getArtdsc());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm(struct.getArtprekgm());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr(struct.getArtpremtr());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod(struct.getTipcolcod());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc(struct.getTipcoldsc());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod(struct.getIntcod());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc(struct.getIntdsc());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm(struct.getIntprekgm());
      setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr(struct.getIntpremtr());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem getStruct( )
   {
      app.facturacion.StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem struct = new app.facturacion.StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem ();
      struct.setClicod(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom());
      struct.setArtcod(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod());
      struct.setArtdsc(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc());
      struct.setArtprekgm(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm());
      struct.setArtpremtr(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr());
      struct.setTipcolcod(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod());
      struct.setTipcoldsc(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc());
      struct.setIntcod(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod());
      struct.setIntdsc(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc());
      struct.setIntprekgm(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm());
      struct.setIntpremtr(getgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr());
      return struct ;
   }

   protected byte gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_N ;
   protected byte gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod ;
   protected byte gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod ;
   protected java.math.BigDecimal gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm ;
   protected java.math.BigDecimal gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr ;
   protected java.math.BigDecimal gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm ;
   protected java.math.BigDecimal gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr ;
   protected String gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom ;
   protected String gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod ;
   protected String gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc ;
   protected String gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc ;
   protected String gxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

