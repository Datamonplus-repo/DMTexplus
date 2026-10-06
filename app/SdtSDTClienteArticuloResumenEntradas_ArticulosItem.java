package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClienteArticuloResumenEntradas_ArticulosItem extends GxUserType
{
   public SdtSDTClienteArticuloResumenEntradas_ArticulosItem( )
   {
      this(  new ModelContext(SdtSDTClienteArticuloResumenEntradas_ArticulosItem.class));
   }

   public SdtSDTClienteArticuloResumenEntradas_ArticulosItem( ModelContext context )
   {
      super( context, "SdtSDTClienteArticuloResumenEntradas_ArticulosItem");
   }

   public SdtSDTClienteArticuloResumenEntradas_ArticulosItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClienteArticuloResumenEntradas_ArticulosItem");
   }

   public SdtSDTClienteArticuloResumenEntradas_ArticulosItem( StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albref") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrefdsc") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albruni") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UndEnt") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsEnt") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UndUti") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsUti") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UndStk") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsStk") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTClienteArticuloResumenEntradas.ArticulosItem" ;
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
      oWriter.writeElement("Albref", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albrefdsc", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albruni", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UndEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsEnt", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UndUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsUti", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UndStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsStk", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk, 6, 0)));
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
      AddObjectProperty("Albref", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref, false, false);
      AddObjectProperty("Albrefdsc", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc, false, false);
      AddObjectProperty("Albruni", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni, false, false);
      AddObjectProperty("UndEnt", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent, false, false);
      AddObjectProperty("PzsEnt", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent, false, false);
      AddObjectProperty("UndUti", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti, false, false);
      AddObjectProperty("PzsUti", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti, false, false);
      AddObjectProperty("UndStk", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk, false, false);
      AddObjectProperty("PzsStk", gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk, false, false);
   }

   public String getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref( String value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref = value ;
   }

   public String getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc( String value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc = value ;
   }

   public String getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni( String value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent = value ;
   }

   public int getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent( int value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti = value ;
   }

   public int getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti( int value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk = value ;
   }

   public int getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk( int value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref = "" ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N = (byte)(1) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc = "" ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni = "" ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent = DecimalUtil.ZERO ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti = DecimalUtil.ZERO ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N ;
   }

   public app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem Clone( )
   {
      return (app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem struct )
   {
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref(struct.getAlbref());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni(struct.getAlbruni());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent(struct.getUndent());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent(struct.getPzsent());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti(struct.getUnduti());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti(struct.getPzsuti());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk(struct.getUndstk());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk(struct.getPzsstk());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem getStruct( )
   {
      app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem struct = new app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem ();
      struct.setAlbref(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref());
      struct.setAlbrefdsc(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc());
      struct.setAlbruni(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni());
      struct.setUndent(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent());
      struct.setPzsent(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent());
      struct.setUnduti(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti());
      struct.setPzsuti(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti());
      struct.setUndstk(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk());
      struct.setPzsstk(getgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk());
      return struct ;
   }

   protected byte gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent ;
   protected int gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti ;
   protected int gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk ;
   protected String gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref ;
   protected String gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc ;
   protected String gxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

