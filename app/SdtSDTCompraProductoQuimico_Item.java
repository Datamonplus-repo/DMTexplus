package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCompraProductoQuimico_Item extends GxUserType
{
   public SdtSDTCompraProductoQuimico_Item( )
   {
      this(  new ModelContext(SdtSDTCompraProductoQuimico_Item.class));
   }

   public SdtSDTCompraProductoQuimico_Item( ModelContext context )
   {
      super( context, "SdtSDTCompraProductoQuimico_Item");
   }

   public SdtSDTCompraProductoQuimico_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCompraProductoQuimico_Item");
   }

   public SdtSDTCompraProductoQuimico_Item( StructSdtSDTCompraProductoQuimico_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanPen") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disponible") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Disponible = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValDsc") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cantidad") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtSDTCompraProductoQuimico_Item_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTCompraProductoQuimico.Item" ;
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
      oWriter.writeElement("PrdNum", gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanPen", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Disponible", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Disponible, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValDsc", gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cantidad", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCompraProductoQuimico_Item_Valor, 11, 2)));
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
      AddObjectProperty("PrdNum", gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum, false, false);
      AddObjectProperty("PrdNom", gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom, false, false);
      AddObjectProperty("PrdExiAlm", gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm, false, false);
      AddObjectProperty("PrdCanPen", gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen, false, false);
      AddObjectProperty("Disponible", gxTv_SdtSDTCompraProductoQuimico_Item_Disponible, false, false);
      AddObjectProperty("ValDsc", gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc, false, false);
      AddObjectProperty("Cantidad", gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad, false, false);
      AddObjectProperty("PrdPreAct", gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact, false, false);
      AddObjectProperty("Valor", gxTv_SdtSDTCompraProductoQuimico_Item_Valor, false, false);
   }

   public String getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum = value ;
   }

   public String getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Disponible ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Disponible( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Disponible = value ;
   }

   public String getgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCompraProductoQuimico_Item_Valor( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Valor ;
   }

   public void setgxTv_SdtSDTCompraProductoQuimico_Item_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(1) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen = DecimalUtil.ZERO ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Disponible = DecimalUtil.ZERO ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad = DecimalUtil.ZERO ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact = DecimalUtil.ZERO ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valor = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_N ;
   }

   public app.SdtSDTCompraProductoQuimico_Item Clone( )
   {
      return (app.SdtSDTCompraProductoQuimico_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTCompraProductoQuimico_Item struct )
   {
      setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum(struct.getPrdnum());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom(struct.getPrdnom());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen(struct.getPrdcanpen());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Disponible(struct.getDisponible());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc(struct.getValdsc());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad(struct.getCantidad());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact(struct.getPrdpreact());
      setgxTv_SdtSDTCompraProductoQuimico_Item_Valor(struct.getValor());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTCompraProductoQuimico_Item getStruct( )
   {
      app.StructSdtSDTCompraProductoQuimico_Item struct = new app.StructSdtSDTCompraProductoQuimico_Item ();
      struct.setPrdnum(getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum());
      struct.setPrdnom(getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom());
      struct.setPrdexialm(getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm());
      struct.setPrdcanpen(getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen());
      struct.setDisponible(getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible());
      struct.setValdsc(getgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc());
      struct.setCantidad(getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad());
      struct.setPrdpreact(getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact());
      struct.setValor(getgxTv_SdtSDTCompraProductoQuimico_Item_Valor());
      return struct ;
   }

   protected byte gxTv_SdtSDTCompraProductoQuimico_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Disponible ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Valor ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

