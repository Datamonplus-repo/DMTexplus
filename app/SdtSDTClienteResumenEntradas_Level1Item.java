package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClienteResumenEntradas_Level1Item extends GxUserType
{
   public SdtSDTClienteResumenEntradas_Level1Item( )
   {
      this(  new ModelContext(SdtSDTClienteResumenEntradas_Level1Item.class));
   }

   public SdtSDTClienteResumenEntradas_Level1Item( ModelContext context )
   {
      super( context, "SdtSDTClienteResumenEntradas_Level1Item");
   }

   public SdtSDTClienteResumenEntradas_Level1Item( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClienteResumenEntradas_Level1Item");
   }

   public SdtSDTClienteResumenEntradas_Level1Item( StructSdtSDTClienteResumenEntradas_Level1Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UndEnt") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsEnt") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UndUti") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsUti") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Undstk") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pzsstk") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTClienteResumenEntradas.Level1Item" ;
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
      oWriter.writeElement("UndEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsEnt", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UndUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsUti", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Undstk", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pzsstk", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk, 6, 0)));
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
      AddObjectProperty("UndEnt", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent, false, false);
      AddObjectProperty("PzsEnt", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent, false, false);
      AddObjectProperty("UndUti", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti, false, false);
      AddObjectProperty("PzsUti", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti, false, false);
      AddObjectProperty("Undstk", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk, false, false);
      AddObjectProperty("Pzsstk", gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent = value ;
   }

   public int getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti = value ;
   }

   public int getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk = value ;
   }

   public int getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent = DecimalUtil.ZERO ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(1) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti = DecimalUtil.ZERO ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_N ;
   }

   public app.SdtSDTClienteResumenEntradas_Level1Item Clone( )
   {
      return (app.SdtSDTClienteResumenEntradas_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClienteResumenEntradas_Level1Item struct )
   {
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent(struct.getUndent());
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent(struct.getPzsent());
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti(struct.getUnduti());
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti(struct.getPzsuti());
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk(struct.getUndstk());
      setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk(struct.getPzsstk());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClienteResumenEntradas_Level1Item getStruct( )
   {
      app.StructSdtSDTClienteResumenEntradas_Level1Item struct = new app.StructSdtSDTClienteResumenEntradas_Level1Item ();
      struct.setUndent(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent());
      struct.setPzsent(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent());
      struct.setUnduti(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti());
      struct.setPzsuti(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti());
      struct.setUndstk(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk());
      struct.setPzsstk(getgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk());
      return struct ;
   }

   protected byte gxTv_SdtSDTClienteResumenEntradas_Level1Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

