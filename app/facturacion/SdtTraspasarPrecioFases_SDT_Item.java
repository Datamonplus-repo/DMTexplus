package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTraspasarPrecioFases_SDT_Item extends GxUserType
{
   public SdtTraspasarPrecioFases_SDT_Item( )
   {
      this(  new ModelContext(SdtTraspasarPrecioFases_SDT_Item.class));
   }

   public SdtTraspasarPrecioFases_SDT_Item( ModelContext context )
   {
      super( context, "SdtTraspasarPrecioFases_SDT_Item");
   }

   public SdtTraspasarPrecioFases_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtTraspasarPrecioFases_SDT_Item");
   }

   public SdtTraspasarPrecioFases_SDT_Item( StructSdtTraspasarPrecioFases_SDT_Item struct )
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
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreKgm") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreMtr") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreU") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasactiva") )
            {
               gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva = oReader.getValue() ;
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
         sName = "TraspasarPrecioFases_SDT.Item" ;
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
      oWriter.writeElement("selected", GXutil.booltostr( gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreU", GXutil.trim( GXutil.str( gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasactiva", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva);
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
      AddObjectProperty("selected", gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected, false, false);
      AddObjectProperty("CliCod", gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod, false, false);
      AddObjectProperty("FasCod", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc, false, false);
      AddObjectProperty("FasPreKgm", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm, false, false);
      AddObjectProperty("FasPreMtr", gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr, false, false);
      AddObjectProperty("FasPreU", gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu, false, false);
      AddObjectProperty("Fasactiva", gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva, false, false);
   }

   public boolean getgxTv_SdtTraspasarPrecioFases_SDT_Item_Selected( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Selected( boolean value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected = value ;
   }

   public int getgxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod( int value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr( java.math.BigDecimal value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr = value ;
   }

   public byte getgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu( byte value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu = value ;
   }

   public String getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva ;
   }

   public void setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(1) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod = "" ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc = "" ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm = DecimalUtil.ZERO ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr = DecimalUtil.ZERO ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_N ;
   }

   public app.facturacion.SdtTraspasarPrecioFases_SDT_Item Clone( )
   {
      return (app.facturacion.SdtTraspasarPrecioFases_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtTraspasarPrecioFases_SDT_Item struct )
   {
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Selected(struct.getSelected());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm(struct.getFasprekgm());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr(struct.getFaspremtr());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu(struct.getFaspreu());
      setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva(struct.getFasactiva());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtTraspasarPrecioFases_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtTraspasarPrecioFases_SDT_Item struct = new app.facturacion.StructSdtTraspasarPrecioFases_SDT_Item ();
      struct.setSelected(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Selected());
      struct.setClicod(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod());
      struct.setFascod(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc());
      struct.setFasprekgm(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm());
      struct.setFaspremtr(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr());
      struct.setFaspreu(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu());
      struct.setFasactiva(getgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva());
      return struct ;
   }

   protected byte gxTv_SdtTraspasarPrecioFases_SDT_Item_N ;
   protected byte gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm ;
   protected java.math.BigDecimal gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva ;
   protected String sTagName ;
   protected boolean gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

