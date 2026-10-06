package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTERPES_Level1Item extends GxSilentTrnSdt
{
   public SdtTTERPES_Level1Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTERPES_Level1Item.class));
   }

   public SdtTTERPES_Level1Item( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtTTERPES_Level1Item");
      initialize( remoteHandle) ;
   }

   public SdtTTERPES_Level1Item( int remoteHandle ,
                                 StructSdtTTERPES_Level1Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtTTERPES_Level1Item( )
   {
      super( new ModelContext(SdtTTERPES_Level1Item.class), "SdtTTERPES_Level1Item");
      initialize( ) ;
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TermPesRng", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level1Item");
      metadata.set("BT", "TXPTERMI2");
      metadata.set("PK", "[ \"TermPesRng\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TermCod\",\"TermPesPro\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesRng") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesrng = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesMin") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesmin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesMax") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesmax = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesOpe") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesope = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesTol") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpestol = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesOpP") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesopp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTERPES_Level1Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtTTERPES_Level1Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTERPES_Level1Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesRng_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesrng_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesMin_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesmin_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesMax_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesmax_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesOpe_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesope_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesTol_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpestol_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesOpP_Z") )
            {
               gxTv_SdtTTERPES_Level1Item_Termpesopp_Z = oReader.getValue() ;
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
         sName = "TTERPES.Level1Item" ;
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
      oWriter.writeElement("TermPesRng", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Level1Item_Termpesrng, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesMin", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpesmin, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesMax", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpesmax, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesOpe", gxTv_SdtTTERPES_Level1Item_Termpesope);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesTol", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpestol, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesOpP", gxTv_SdtTTERPES_Level1Item_Termpesopp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTERPES_Level1Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Level1Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Level1Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesRng_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Level1Item_Termpesrng_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesMin_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpesmin_Z, 12, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesMax_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpesmax_Z, 12, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesOpe_Z", gxTv_SdtTTERPES_Level1Item_Termpesope_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesTol_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTERPES_Level1Item_Termpestol_Z, 10, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesOpP_Z", gxTv_SdtTTERPES_Level1Item_Termpesopp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("TermPesRng", gxTv_SdtTTERPES_Level1Item_Termpesrng, false, includeNonInitialized);
      AddObjectProperty("TermPesMin", gxTv_SdtTTERPES_Level1Item_Termpesmin, false, includeNonInitialized);
      AddObjectProperty("TermPesMax", gxTv_SdtTTERPES_Level1Item_Termpesmax, false, includeNonInitialized);
      AddObjectProperty("TermPesOpe", gxTv_SdtTTERPES_Level1Item_Termpesope, false, includeNonInitialized);
      AddObjectProperty("TermPesTol", gxTv_SdtTTERPES_Level1Item_Termpestol, false, includeNonInitialized);
      AddObjectProperty("TermPesOpP", gxTv_SdtTTERPES_Level1Item_Termpesopp, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTERPES_Level1Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtTTERPES_Level1Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTERPES_Level1Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("TermPesRng_Z", gxTv_SdtTTERPES_Level1Item_Termpesrng_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesMin_Z", gxTv_SdtTTERPES_Level1Item_Termpesmin_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesMax_Z", gxTv_SdtTTERPES_Level1Item_Termpesmax_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesOpe_Z", gxTv_SdtTTERPES_Level1Item_Termpesope_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesTol_Z", gxTv_SdtTTERPES_Level1Item_Termpestol_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesOpP_Z", gxTv_SdtTTERPES_Level1Item_Termpesopp_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTTERPES_Level1Item sdt )
   {
      if ( sdt.IsDirty("TermPesRng") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpesrng = sdt.getgxTv_SdtTTERPES_Level1Item_Termpesrng() ;
      }
      if ( sdt.IsDirty("TermPesMin") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpesmin = sdt.getgxTv_SdtTTERPES_Level1Item_Termpesmin() ;
      }
      if ( sdt.IsDirty("TermPesMax") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpesmax = sdt.getgxTv_SdtTTERPES_Level1Item_Termpesmax() ;
      }
      if ( sdt.IsDirty("TermPesOpe") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpesope = sdt.getgxTv_SdtTTERPES_Level1Item_Termpesope() ;
      }
      if ( sdt.IsDirty("TermPesTol") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpestol = sdt.getgxTv_SdtTTERPES_Level1Item_Termpestol() ;
      }
      if ( sdt.IsDirty("TermPesOpP") )
      {
         gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
         gxTv_SdtTTERPES_Level1Item_Termpesopp = sdt.getgxTv_SdtTTERPES_Level1Item_Termpesopp() ;
      }
   }

   public long getgxTv_SdtTTERPES_Level1Item_Termpesrng( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesrng ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesrng( long value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesrng");
      gxTv_SdtTTERPES_Level1Item_Termpesrng = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpesmin( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesmin ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmin( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesmin");
      gxTv_SdtTTERPES_Level1Item_Termpesmin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpesmax( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesmax ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmax( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesmax");
      gxTv_SdtTTERPES_Level1Item_Termpesmax = value ;
   }

   public String getgxTv_SdtTTERPES_Level1Item_Termpesope( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesope ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesope( String value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesope");
      gxTv_SdtTTERPES_Level1Item_Termpesope = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpestol( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpestol ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpestol( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpestol");
      gxTv_SdtTTERPES_Level1Item_Termpestol = value ;
   }

   public String getgxTv_SdtTTERPES_Level1Item_Termpesopp( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesopp ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesopp( String value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesopp");
      gxTv_SdtTTERPES_Level1Item_Termpesopp = value ;
   }

   public String getgxTv_SdtTTERPES_Level1Item_Mode( )
   {
      return gxTv_SdtTTERPES_Level1Item_Mode ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Mode( String value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTERPES_Level1Item_Mode = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Mode_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTERPES_Level1Item_Modified( )
   {
      return gxTv_SdtTTERPES_Level1Item_Modified ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Modified( short value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtTTERPES_Level1Item_Modified = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Modified_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTERPES_Level1Item_Initialized( )
   {
      return gxTv_SdtTTERPES_Level1Item_Initialized ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Initialized( short value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtTTERPES_Level1Item_Initialized = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Initialized_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTTERPES_Level1Item_Termpesrng_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesrng_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesrng_Z( long value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesrng_Z");
      gxTv_SdtTTERPES_Level1Item_Termpesrng_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesrng_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpesrng_Z = 0 ;
      SetDirty("Termpesrng_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpesrng_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpesmin_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesmin_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmin_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesmin_Z");
      gxTv_SdtTTERPES_Level1Item_Termpesmin_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmin_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpesmin_Z = DecimalUtil.ZERO ;
      SetDirty("Termpesmin_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpesmin_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpesmax_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesmax_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmax_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesmax_Z");
      gxTv_SdtTTERPES_Level1Item_Termpesmax_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesmax_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpesmax_Z = DecimalUtil.ZERO ;
      SetDirty("Termpesmax_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpesmax_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Level1Item_Termpesope_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesope_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesope_Z( String value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesope_Z");
      gxTv_SdtTTERPES_Level1Item_Termpesope_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesope_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpesope_Z = "" ;
      SetDirty("Termpesope_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpesope_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTERPES_Level1Item_Termpestol_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpestol_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpestol_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpestol_Z");
      gxTv_SdtTTERPES_Level1Item_Termpestol_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpestol_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpestol_Z = DecimalUtil.ZERO ;
      SetDirty("Termpestol_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpestol_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Level1Item_Termpesopp_Z( )
   {
      return gxTv_SdtTTERPES_Level1Item_Termpesopp_Z ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesopp_Z( String value )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1Item_Modified = (short)(1) ;
      SetDirty("Termpesopp_Z");
      gxTv_SdtTTERPES_Level1Item_Termpesopp_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Level1Item_Termpesopp_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Level1Item_Termpesopp_Z = "" ;
      SetDirty("Termpesopp_Z");
   }

   public boolean getgxTv_SdtTTERPES_Level1Item_Termpesopp_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTTERPES_Level1Item_N = (byte)(1) ;
      gxTv_SdtTTERPES_Level1Item_Termpesmin = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesmax = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesope = "" ;
      gxTv_SdtTTERPES_Level1Item_Termpestol = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesopp = "" ;
      gxTv_SdtTTERPES_Level1Item_Mode = "" ;
      gxTv_SdtTTERPES_Level1Item_Termpesmin_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesmax_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesope_Z = "" ;
      gxTv_SdtTTERPES_Level1Item_Termpestol_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTERPES_Level1Item_Termpesopp_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTTERPES_Level1Item_N ;
   }

   public app.SdtTTERPES_Level1Item Clone( )
   {
      return (app.SdtTTERPES_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtTTERPES_Level1Item struct )
   {
      setgxTv_SdtTTERPES_Level1Item_Termpesrng(struct.getTermpesrng());
      setgxTv_SdtTTERPES_Level1Item_Termpesmin(struct.getTermpesmin());
      setgxTv_SdtTTERPES_Level1Item_Termpesmax(struct.getTermpesmax());
      setgxTv_SdtTTERPES_Level1Item_Termpesope(struct.getTermpesope());
      setgxTv_SdtTTERPES_Level1Item_Termpestol(struct.getTermpestol());
      setgxTv_SdtTTERPES_Level1Item_Termpesopp(struct.getTermpesopp());
      setgxTv_SdtTTERPES_Level1Item_Mode(struct.getMode());
      setgxTv_SdtTTERPES_Level1Item_Modified(struct.getModified());
      setgxTv_SdtTTERPES_Level1Item_Initialized(struct.getInitialized());
      setgxTv_SdtTTERPES_Level1Item_Termpesrng_Z(struct.getTermpesrng_Z());
      setgxTv_SdtTTERPES_Level1Item_Termpesmin_Z(struct.getTermpesmin_Z());
      setgxTv_SdtTTERPES_Level1Item_Termpesmax_Z(struct.getTermpesmax_Z());
      setgxTv_SdtTTERPES_Level1Item_Termpesope_Z(struct.getTermpesope_Z());
      setgxTv_SdtTTERPES_Level1Item_Termpestol_Z(struct.getTermpestol_Z());
      setgxTv_SdtTTERPES_Level1Item_Termpesopp_Z(struct.getTermpesopp_Z());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTTERPES_Level1Item getStruct( )
   {
      app.StructSdtTTERPES_Level1Item struct = new app.StructSdtTTERPES_Level1Item ();
      struct.setTermpesrng(getgxTv_SdtTTERPES_Level1Item_Termpesrng());
      struct.setTermpesmin(getgxTv_SdtTTERPES_Level1Item_Termpesmin());
      struct.setTermpesmax(getgxTv_SdtTTERPES_Level1Item_Termpesmax());
      struct.setTermpesope(getgxTv_SdtTTERPES_Level1Item_Termpesope());
      struct.setTermpestol(getgxTv_SdtTTERPES_Level1Item_Termpestol());
      struct.setTermpesopp(getgxTv_SdtTTERPES_Level1Item_Termpesopp());
      struct.setMode(getgxTv_SdtTTERPES_Level1Item_Mode());
      struct.setModified(getgxTv_SdtTTERPES_Level1Item_Modified());
      struct.setInitialized(getgxTv_SdtTTERPES_Level1Item_Initialized());
      struct.setTermpesrng_Z(getgxTv_SdtTTERPES_Level1Item_Termpesrng_Z());
      struct.setTermpesmin_Z(getgxTv_SdtTTERPES_Level1Item_Termpesmin_Z());
      struct.setTermpesmax_Z(getgxTv_SdtTTERPES_Level1Item_Termpesmax_Z());
      struct.setTermpesope_Z(getgxTv_SdtTTERPES_Level1Item_Termpesope_Z());
      struct.setTermpestol_Z(getgxTv_SdtTTERPES_Level1Item_Termpestol_Z());
      struct.setTermpesopp_Z(getgxTv_SdtTTERPES_Level1Item_Termpesopp_Z());
      return struct ;
   }

   private byte gxTv_SdtTTERPES_Level1Item_N ;
   private short gxTv_SdtTTERPES_Level1Item_Modified ;
   private short gxTv_SdtTTERPES_Level1Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTTERPES_Level1Item_Termpesrng ;
   private long gxTv_SdtTTERPES_Level1Item_Termpesrng_Z ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpesmin ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpesmax ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpestol ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpesmin_Z ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpesmax_Z ;
   private java.math.BigDecimal gxTv_SdtTTERPES_Level1Item_Termpestol_Z ;
   private String gxTv_SdtTTERPES_Level1Item_Termpesope ;
   private String gxTv_SdtTTERPES_Level1Item_Termpesopp ;
   private String gxTv_SdtTTERPES_Level1Item_Mode ;
   private String gxTv_SdtTTERPES_Level1Item_Termpesope_Z ;
   private String gxTv_SdtTTERPES_Level1Item_Termpesopp_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

