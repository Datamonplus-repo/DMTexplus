package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_AlertaMaquinaSDT_Item extends GxUserType
{
   public SdtMRec_AlertaMaquinaSDT_Item( )
   {
      this(  new ModelContext(SdtMRec_AlertaMaquinaSDT_Item.class));
   }

   public SdtMRec_AlertaMaquinaSDT_Item( ModelContext context )
   {
      super( context, "SdtMRec_AlertaMaquinaSDT_Item");
   }

   public SdtMRec_AlertaMaquinaSDT_Item( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_AlertaMaquinaSDT_Item");
   }

   public SdtMRec_AlertaMaquinaSDT_Item( StructSdtMRec_AlertaMaquinaSDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEnvOrd") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRecLin") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqErr") )
            {
               gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "MRec_AlertaMaquinaSDT.Item" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MEnvOrd", GXutil.trim( GXutil.str( gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRecLin", GXutil.trim( GXutil.str( gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqErr", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr, 10, 2)));
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
      AddObjectProperty("EmprCod", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar, false, false);
      AddObjectProperty("MEnvOrd", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord, false, false);
      AddObjectProperty("MRecLin", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc, false, false);
      AddObjectProperty("MaqErr", gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr, false, false);
   }

   public String getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod = value ;
   }

   public int getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod( int value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar = value ;
   }

   public short getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord( short value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord = value ;
   }

   public long getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin( long value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin = value ;
   }

   public String getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod = value ;
   }

   public String getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr ;
   }

   public void setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(1) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_N ;
   }

   public app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item Clone( )
   {
      return (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_AlertaMaquinaSDT_Item struct )
   {
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod(struct.getEmprcod());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord(struct.getMenvord());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin(struct.getMreclin());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(struct.getMaqcod());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr(struct.getMaqerr());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_AlertaMaquinaSDT_Item getStruct( )
   {
      app.ingenieria.StructSdtMRec_AlertaMaquinaSDT_Item struct = new app.ingenieria.StructSdtMRec_AlertaMaquinaSDT_Item ();
      struct.setEmprcod(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod());
      struct.setBarcod(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar());
      struct.setMenvord(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord());
      struct.setMreclin(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin());
      struct.setMaqcod(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod());
      struct.setMaqdsc(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc());
      struct.setMaqerr(getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr());
      return struct ;
   }

   protected byte gxTv_SdtMRec_AlertaMaquinaSDT_Item_N ;
   protected byte gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo ;
   protected short gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod ;
   protected long gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

