package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTDevPieCopy1_Level1Item extends GxSilentTrnSdt
{
   public SdtTDevPieCopy1_Level1Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTDevPieCopy1_Level1Item.class));
   }

   public SdtTDevPieCopy1_Level1Item( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTDevPieCopy1_Level1Item");
      initialize( remoteHandle) ;
   }

   public SdtTDevPieCopy1_Level1Item( int remoteHandle ,
                                      StructSdtTDevPieCopy1_Level1Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtTDevPieCopy1_Level1Item( )
   {
      super( new ModelContext(SdtTDevPieCopy1_Level1Item.class), "SdtTDevPieCopy1_Level1Item");
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
      return (Object[][])(new Object[][]{new Object[]{"AlbRecPie", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level1Item");
      metadata.set("BT", "TXPDevPie");
      metadata.set("PK", "[ \"AlbRecPie\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DevGenCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecPie") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecKgm") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecMtr") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecKgmU") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecMtrU") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevPieUni") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecPie_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecKgm_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecMtr_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecKgmU_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecMtrU_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevPieUni_Z") )
            {
               gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "TDevPieCopy1.Level1Item" ;
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
      oWriter.writeElement("AlbRecPie", gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecKgmU", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecMtrU", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevPieUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTDevPieCopy1_Level1Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtTDevPieCopy1_Level1Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTDevPieCopy1_Level1Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecPie_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecKgm_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecMtr_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecKgmU_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecMtrU_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevPieUni_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z, 9, 2)));
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
      AddObjectProperty("AlbRecPie", gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie, false, includeNonInitialized);
      AddObjectProperty("AlbRecKgm", gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm, false, includeNonInitialized);
      AddObjectProperty("AlbRecMtr", gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr, false, includeNonInitialized);
      AddObjectProperty("AlbRecKgmU", gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu, false, includeNonInitialized);
      AddObjectProperty("AlbRecMtrU", gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru, false, includeNonInitialized);
      AddObjectProperty("DevPieUni", gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTDevPieCopy1_Level1Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtTDevPieCopy1_Level1Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTDevPieCopy1_Level1Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("AlbRecPie_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecKgm_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecMtr_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecKgmU_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecMtrU_Z", gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z, false, includeNonInitialized);
         AddObjectProperty("DevPieUni_Z", gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTDevPieCopy1_Level1Item sdt )
   {
      if ( sdt.IsDirty("AlbRecPie") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie() ;
      }
      if ( sdt.IsDirty("AlbRecKgm") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm() ;
      }
      if ( sdt.IsDirty("AlbRecMtr") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr() ;
      }
      if ( sdt.IsDirty("AlbRecKgmU") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu() ;
      }
      if ( sdt.IsDirty("AlbRecMtrU") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru() ;
      }
      if ( sdt.IsDirty("DevPieUni") )
      {
         gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
         gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni = sdt.getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni() ;
      }
   }

   public String getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie( String value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecpie");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albreckgm");
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecmtr");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albreckgmu");
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecmtru");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Devpieuni");
      gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni = value ;
   }

   public String getgxTv_SdtTDevPieCopy1_Level1Item_Mode( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Mode ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Mode( String value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTDevPieCopy1_Level1Item_Mode = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Mode_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPieCopy1_Level1Item_Modified( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Modified ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Modified( short value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Modified_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPieCopy1_Level1Item_Initialized( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Initialized ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Initialized( short value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtTDevPieCopy1_Level1Item_Initialized = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Initialized_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z( String value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecpie_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z = "" ;
      SetDirty("Albrecpie_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albreckgm_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z = DecimalUtil.ZERO ;
      SetDirty("Albreckgm_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecmtr_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z = DecimalUtil.ZERO ;
      SetDirty("Albrecmtr_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albreckgmu_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z = DecimalUtil.ZERO ;
      SetDirty("Albreckgmu_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrecmtru_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z = DecimalUtil.ZERO ;
      SetDirty("Albrecmtru_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(0) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Modified = (short)(1) ;
      SetDirty("Devpieuni_Z");
      gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z = value ;
   }

   public void setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z_SetNull( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z = DecimalUtil.ZERO ;
      SetDirty("Devpieuni_Z");
   }

   public boolean getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie = "" ;
      gxTv_SdtTDevPieCopy1_Level1Item_N = (byte)(1) ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Mode = "" ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z = "" ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTDevPieCopy1_Level1Item_N ;
   }

   public app.SdtTDevPieCopy1_Level1Item Clone( )
   {
      return (app.SdtTDevPieCopy1_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtTDevPieCopy1_Level1Item struct )
   {
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie(struct.getAlbrecpie());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm(struct.getAlbreckgm());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr(struct.getAlbrecmtr());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu(struct.getAlbreckgmu());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru(struct.getAlbrecmtru());
      setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni(struct.getDevpieuni());
      setgxTv_SdtTDevPieCopy1_Level1Item_Mode(struct.getMode());
      setgxTv_SdtTDevPieCopy1_Level1Item_Modified(struct.getModified());
      setgxTv_SdtTDevPieCopy1_Level1Item_Initialized(struct.getInitialized());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z(struct.getAlbrecpie_Z());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z(struct.getAlbreckgm_Z());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z(struct.getAlbrecmtr_Z());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z(struct.getAlbreckgmu_Z());
      setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z(struct.getAlbrecmtru_Z());
      setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z(struct.getDevpieuni_Z());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTDevPieCopy1_Level1Item getStruct( )
   {
      app.StructSdtTDevPieCopy1_Level1Item struct = new app.StructSdtTDevPieCopy1_Level1Item ();
      struct.setAlbrecpie(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie());
      struct.setAlbreckgm(getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm());
      struct.setAlbrecmtr(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr());
      struct.setAlbreckgmu(getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu());
      struct.setAlbrecmtru(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru());
      struct.setDevpieuni(getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni());
      struct.setMode(getgxTv_SdtTDevPieCopy1_Level1Item_Mode());
      struct.setModified(getgxTv_SdtTDevPieCopy1_Level1Item_Modified());
      struct.setInitialized(getgxTv_SdtTDevPieCopy1_Level1Item_Initialized());
      struct.setAlbrecpie_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z());
      struct.setAlbreckgm_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z());
      struct.setAlbrecmtr_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z());
      struct.setAlbreckgmu_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z());
      struct.setAlbrecmtru_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z());
      struct.setDevpieuni_Z(getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z());
      return struct ;
   }

   private byte gxTv_SdtTDevPieCopy1_Level1Item_N ;
   private short gxTv_SdtTDevPieCopy1_Level1Item_Modified ;
   private short gxTv_SdtTDevPieCopy1_Level1Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z ;
   private String gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie ;
   private String gxTv_SdtTDevPieCopy1_Level1Item_Mode ;
   private String gxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

