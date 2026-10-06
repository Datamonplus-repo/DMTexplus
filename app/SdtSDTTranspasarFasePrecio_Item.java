package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTTranspasarFasePrecio_Item extends GxUserType
{
   public SdtSDTTranspasarFasePrecio_Item( )
   {
      this(  new ModelContext(SdtSDTTranspasarFasePrecio_Item.class));
   }

   public SdtSDTTranspasarFasePrecio_Item( ModelContext context )
   {
      super( context, "SdtSDTTranspasarFasePrecio_Item");
   }

   public SdtSDTTranspasarFasePrecio_Item( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTranspasarFasePrecio_Item");
   }

   public SdtSDTTranspasarFasePrecio_Item( StructSdtSDTTranspasarFasePrecio_Item struct )
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
               gxTv_SdtSDTTranspasarFasePrecio_Item_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreKgm") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreMtr") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreU") )
            {
               gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTTranspasarFasePrecio.Item" ;
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
      oWriter.writeElement("selected", GXutil.booltostr( gxTv_SdtSDTTranspasarFasePrecio_Item_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreU", GXutil.trim( GXutil.str( gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu, 1, 0)));
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
      AddObjectProperty("selected", gxTv_SdtSDTTranspasarFasePrecio_Item_Selected, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod, false, false);
      AddObjectProperty("FasCod", gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc, false, false);
      AddObjectProperty("FasPreKgm", gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm, false, false);
      AddObjectProperty("FasPreMtr", gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr, false, false);
      AddObjectProperty("FasPreU", gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu, false, false);
   }

   public boolean getgxTv_SdtSDTTranspasarFasePrecio_Item_Selected( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Selected ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Selected( boolean value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Selected = value ;
   }

   public String getgxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod = value ;
   }

   public int getgxTv_SdtSDTTranspasarFasePrecio_Item_Clicod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Clicod( int value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod = value ;
   }

   public String getgxTv_SdtSDTTranspasarFasePrecio_Item_Fascod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Fascod( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod = value ;
   }

   public String getgxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr = value ;
   }

   public byte getgxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu ;
   }

   public void setgxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu( byte value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(1) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_N ;
   }

   public app.SdtSDTTranspasarFasePrecio_Item Clone( )
   {
      return (app.SdtSDTTranspasarFasePrecio_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTTranspasarFasePrecio_Item struct )
   {
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Selected(struct.getSelected());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Clicod(struct.getClicod());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Fascod(struct.getFascod());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm(struct.getFasprekgm());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr(struct.getFaspremtr());
      setgxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu(struct.getFaspreu());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTTranspasarFasePrecio_Item getStruct( )
   {
      app.StructSdtSDTTranspasarFasePrecio_Item struct = new app.StructSdtSDTTranspasarFasePrecio_Item ();
      struct.setSelected(getgxTv_SdtSDTTranspasarFasePrecio_Item_Selected());
      struct.setEmprcod(getgxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod());
      struct.setClicod(getgxTv_SdtSDTTranspasarFasePrecio_Item_Clicod());
      struct.setFascod(getgxTv_SdtSDTTranspasarFasePrecio_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc());
      struct.setFasprekgm(getgxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm());
      struct.setFaspremtr(getgxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr());
      struct.setFaspreu(getgxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu());
      return struct ;
   }

   protected byte gxTv_SdtSDTTranspasarFasePrecio_Item_N ;
   protected byte gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTTranspasarFasePrecio_Item_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

