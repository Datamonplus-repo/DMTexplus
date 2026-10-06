package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeComprasMes_MesesItem extends GxUserType
{
   public SdtSDTInformeComprasMes_MesesItem( )
   {
      this(  new ModelContext(SdtSDTInformeComprasMes_MesesItem.class));
   }

   public SdtSDTInformeComprasMes_MesesItem( ModelContext context )
   {
      super( context, "SdtSDTInformeComprasMes_MesesItem");
   }

   public SdtSDTInformeComprasMes_MesesItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeComprasMes_MesesItem");
   }

   public SdtSDTInformeComprasMes_MesesItem( StructSdtSDTInformeComprasMes_MesesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mes") )
            {
               gxTv_SdtSDTInformeComprasMes_MesesItem_Mes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Compras") )
            {
               gxTv_SdtSDTInformeComprasMes_MesesItem_Compras = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValorCompras") )
            {
               gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeComprasMes.MesesItem" ;
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
      oWriter.writeElement("Mes", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeComprasMes_MesesItem_Mes, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Compras", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeComprasMes_MesesItem_Compras, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValorCompras", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras, 12, 2)));
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
      AddObjectProperty("Mes", gxTv_SdtSDTInformeComprasMes_MesesItem_Mes, false, false);
      AddObjectProperty("Compras", gxTv_SdtSDTInformeComprasMes_MesesItem_Compras, false, false);
      AddObjectProperty("ValorCompras", gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras, false, false);
   }

   public byte getgxTv_SdtSDTInformeComprasMes_MesesItem_Mes( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Mes ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_MesesItem_Mes( byte value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Mes = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeComprasMes_MesesItem_Compras( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Compras ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_MesesItem_Compras( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Compras = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(1) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Compras = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_N ;
   }

   public app.SdtSDTInformeComprasMes_MesesItem Clone( )
   {
      return (app.SdtSDTInformeComprasMes_MesesItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeComprasMes_MesesItem struct )
   {
      setgxTv_SdtSDTInformeComprasMes_MesesItem_Mes(struct.getMes());
      setgxTv_SdtSDTInformeComprasMes_MesesItem_Compras(struct.getCompras());
      setgxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras(struct.getValorcompras());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeComprasMes_MesesItem getStruct( )
   {
      app.StructSdtSDTInformeComprasMes_MesesItem struct = new app.StructSdtSDTInformeComprasMes_MesesItem ();
      struct.setMes(getgxTv_SdtSDTInformeComprasMes_MesesItem_Mes());
      struct.setCompras(getgxTv_SdtSDTInformeComprasMes_MesesItem_Compras());
      struct.setValorcompras(getgxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeComprasMes_MesesItem_Mes ;
   protected byte gxTv_SdtSDTInformeComprasMes_MesesItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeComprasMes_MesesItem_Compras ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

