package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTEntregasResumenCliente_Level1Item extends GxUserType
{
   public SdtSDTEntregasResumenCliente_Level1Item( )
   {
      this(  new ModelContext(SdtSDTEntregasResumenCliente_Level1Item.class));
   }

   public SdtSDTEntregasResumenCliente_Level1Item( ModelContext context )
   {
      super( context, "SdtSDTEntregasResumenCliente_Level1Item");
   }

   public SdtSDTEntregasResumenCliente_Level1Item( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEntregasResumenCliente_Level1Item");
   }

   public SdtSDTEntregasResumenCliente_Level1Item( StructSdtSDTEntregasResumenCliente_Level1Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Totkgs") )
            {
               gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotMts") )
            {
               gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPzs") )
            {
               gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTEntregasResumenCliente.Level1Item" ;
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
      oWriter.writeElement("Totkgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPzs", GXutil.trim( GXutil.str( gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs, 6, 0)));
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
      AddObjectProperty("Totkgs", gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs, false, false);
      AddObjectProperty("TotMts", gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts, false, false);
      AddObjectProperty("TotPzs", gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts = value ;
   }

   public int getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs( int value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs = DecimalUtil.ZERO ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(1) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_N ;
   }

   public app.SdtSDTEntregasResumenCliente_Level1Item Clone( )
   {
      return (app.SdtSDTEntregasResumenCliente_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTEntregasResumenCliente_Level1Item struct )
   {
      setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs(struct.getTotkgs());
      setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts(struct.getTotmts());
      setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs(struct.getTotpzs());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTEntregasResumenCliente_Level1Item getStruct( )
   {
      app.StructSdtSDTEntregasResumenCliente_Level1Item struct = new app.StructSdtSDTEntregasResumenCliente_Level1Item ();
      struct.setTotkgs(getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs());
      struct.setTotmts(getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts());
      struct.setTotpzs(getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs());
      return struct ;
   }

   protected byte gxTv_SdtSDTEntregasResumenCliente_Level1Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs ;
   protected java.math.BigDecimal gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs ;
   protected java.math.BigDecimal gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

