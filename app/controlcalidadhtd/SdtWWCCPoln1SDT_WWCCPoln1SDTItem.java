package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWWCCPoln1SDT_WWCCPoln1SDTItem extends GxUserType
{
   public SdtWWCCPoln1SDT_WWCCPoln1SDTItem( )
   {
      this(  new ModelContext(SdtWWCCPoln1SDT_WWCCPoln1SDTItem.class));
   }

   public SdtWWCCPoln1SDT_WWCCPoln1SDTItem( ModelContext context )
   {
      super( context, "SdtWWCCPoln1SDT_WWCCPoln1SDTItem");
   }

   public SdtWWCCPoln1SDT_WWCCPoln1SDTItem( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtWWCCPoln1SDT_WWCCPoln1SDTItem");
   }

   public SdtWWCCPoln1SDT_WWCCPoln1SDTItem( StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridBarCod") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridBarCodReo") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridBarCodPar") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridBarProCod") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridBarOrdLin") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridFasCod") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridFasDsc") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GridNum_CC") )
            {
               gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "WWCCPoln1SDT.WWCCPoln1SDTItem" ;
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
      oWriter.writeElement("GridBarCod", GXutil.trim( GXutil.str( gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridBarCodReo", GXutil.trim( GXutil.str( gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridBarCodPar", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridBarProCod", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridBarOrdLin", GXutil.trim( GXutil.str( gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridFasCod", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridFasDsc", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GridNum_CC", GXutil.trim( GXutil.str( gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc, 4, 0)));
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
      AddObjectProperty("GridBarCod", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod, false, false);
      AddObjectProperty("GridBarCodReo", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo, false, false);
      AddObjectProperty("GridBarCodPar", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar, false, false);
      AddObjectProperty("GridBarProCod", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod, false, false);
      AddObjectProperty("GridBarOrdLin", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin, false, false);
      AddObjectProperty("GridFasCod", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod, false, false);
      AddObjectProperty("GridFasDsc", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc, false, false);
      AddObjectProperty("GridNum_CC", gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc, false, false);
   }

   public int getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod( int value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod = value ;
   }

   public byte getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo( byte value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo = value ;
   }

   public String getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar = value ;
   }

   public String getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod = value ;
   }

   public short getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin( short value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin = value ;
   }

   public String getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod = value ;
   }

   public String getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc = value ;
   }

   public short getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc ;
   }

   public void setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc( short value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(1) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N ;
   }

   public app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem Clone( )
   {
      return (app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem struct )
   {
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod(struct.getGridbarcod());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo(struct.getGridbarcodreo());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar(struct.getGridbarcodpar());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod(struct.getGridbarprocod());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin(struct.getGridbarordlin());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod(struct.getGridfascod());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc(struct.getGridfasdsc());
      setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc(struct.getGridnum_cc());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem getStruct( )
   {
      app.controlcalidadhtd.StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem struct = new app.controlcalidadhtd.StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem ();
      struct.setGridbarcod(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod());
      struct.setGridbarcodreo(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo());
      struct.setGridbarcodpar(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar());
      struct.setGridbarprocod(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod());
      struct.setGridbarordlin(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin());
      struct.setGridfascod(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod());
      struct.setGridfasdsc(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc());
      struct.setGridnum_cc(getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc());
      return struct ;
   }

   protected byte gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N ;
   protected byte gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo ;
   protected short gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin ;
   protected short gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

