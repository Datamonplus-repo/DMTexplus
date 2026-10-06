package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTERPES extends GxSilentTrnSdt
{
   public SdtTTERPES( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTERPES.class));
   }

   public SdtTTERPES( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTTERPES");
      initialize( remoteHandle) ;
   }

   public SdtTTERPES( int remoteHandle ,
                      StructSdtTTERPES struct )
   {
      this(remoteHandle);
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

   public void Load( String AV942TermCod ,
                     String AV8900TermPesPro )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV942TermCod,AV8900TermPesPro});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TermCod", String.class}, new Object[]{"TermPesPro", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TTERPES");
      metadata.set("BT", "TXPTERMI1");
      metadata.set("PK", "[ \"TermCod\",\"TermPesPro\" ]");
      metadata.set("Levels", "[ \"Level1Item\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TermCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermCod") )
            {
               gxTv_SdtTTERPES_Termcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc") )
            {
               gxTv_SdtTTERPES_Termdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtTTERPES_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTTERPES_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes") )
            {
               gxTv_SdtTTERPES_Termpes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesPro") )
            {
               gxTv_SdtTTERPES_Termpespro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesUlt") )
            {
               gxTv_SdtTTERPES_Termpesult = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesTpo") )
            {
               gxTv_SdtTTERPES_Termpestpo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesQty") )
            {
               gxTv_SdtTTERPES_Termpesqty = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtTTERPES_Level1 == null )
               {
                  gxTv_SdtTTERPES_Level1 = new GXBCLevelCollection<app.SdtTTERPES_Level1Item>(app.SdtTTERPES_Level1Item.class, "TTERPES.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTTERPES_Level1.readxml(oReader, "Level1") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTERPES_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTERPES_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermCod_Z") )
            {
               gxTv_SdtTTERPES_Termcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc_Z") )
            {
               gxTv_SdtTTERPES_Termdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTTERPES_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTTERPES_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes_Z") )
            {
               gxTv_SdtTTERPES_Termpes_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesPro_Z") )
            {
               gxTv_SdtTTERPES_Termpespro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesUlt_Z") )
            {
               gxTv_SdtTTERPES_Termpesult_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesTpo_Z") )
            {
               gxTv_SdtTTERPES_Termpestpo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesQty_Z") )
            {
               gxTv_SdtTTERPES_Termpesqty_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc_N") )
            {
               gxTv_SdtTTERPES_Termdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_N") )
            {
               gxTv_SdtTTERPES_Emprcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTTERPES_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes_N") )
            {
               gxTv_SdtTTERPES_Termpes_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesUlt_N") )
            {
               gxTv_SdtTTERPES_Termpesult_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesTpo_N") )
            {
               gxTv_SdtTTERPES_Termpestpo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPesQty_N") )
            {
               gxTv_SdtTTERPES_Termpesqty_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TTERPES" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("TermCod", gxTv_SdtTTERPES_Termcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermDsc", gxTv_SdtTTERPES_Termdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtTTERPES_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTTERPES_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPes", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpes, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesPro", gxTv_SdtTTERPES_Termpespro);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesUlt", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesult, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesTpo", gxTv_SdtTTERPES_Termpestpo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPesQty", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesqty, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtTTERPES_Level1 != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtTTERPES_Level1.writexml(oWriter, "Level1", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTERPES_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermCod_Z", gxTv_SdtTTERPES_Termcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermDsc_Z", gxTv_SdtTTERPES_Termdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTTERPES_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTTERPES_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPes_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpes_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesPro_Z", gxTv_SdtTTERPES_Termpespro_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesUlt_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesult_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesTpo_Z", gxTv_SdtTTERPES_Termpestpo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesQty_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesqty_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Emprcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPes_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpes_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesUlt_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesult_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesTpo_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpestpo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPesQty_N", GXutil.trim( GXutil.str( gxTv_SdtTTERPES_Termpesqty_N, 1, 0)));
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
      AddObjectProperty("TermCod", gxTv_SdtTTERPES_Termcod, false, includeNonInitialized);
      AddObjectProperty("TermDsc", gxTv_SdtTTERPES_Termdsc, false, includeNonInitialized);
      AddObjectProperty("TermDsc_N", gxTv_SdtTTERPES_Termdsc_N, false, includeNonInitialized);
      AddObjectProperty("EmprCod", gxTv_SdtTTERPES_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprCod_N", gxTv_SdtTTERPES_Emprcod_N, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTTERPES_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTTERPES_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("TermPes", gxTv_SdtTTERPES_Termpes, false, includeNonInitialized);
      AddObjectProperty("TermPes_N", gxTv_SdtTTERPES_Termpes_N, false, includeNonInitialized);
      AddObjectProperty("TermPesPro", gxTv_SdtTTERPES_Termpespro, false, includeNonInitialized);
      AddObjectProperty("TermPesUlt", gxTv_SdtTTERPES_Termpesult, false, includeNonInitialized);
      AddObjectProperty("TermPesUlt_N", gxTv_SdtTTERPES_Termpesult_N, false, includeNonInitialized);
      AddObjectProperty("TermPesTpo", gxTv_SdtTTERPES_Termpestpo, false, includeNonInitialized);
      AddObjectProperty("TermPesTpo_N", gxTv_SdtTTERPES_Termpestpo_N, false, includeNonInitialized);
      AddObjectProperty("TermPesQty", gxTv_SdtTTERPES_Termpesqty, false, includeNonInitialized);
      AddObjectProperty("TermPesQty_N", gxTv_SdtTTERPES_Termpesqty_N, false, includeNonInitialized);
      if ( gxTv_SdtTTERPES_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtTTERPES_Level1, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTERPES_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTERPES_Initialized, false, includeNonInitialized);
         AddObjectProperty("TermCod_Z", gxTv_SdtTTERPES_Termcod_Z, false, includeNonInitialized);
         AddObjectProperty("TermDsc_Z", gxTv_SdtTTERPES_Termdsc_Z, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTTERPES_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTTERPES_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("TermPes_Z", gxTv_SdtTTERPES_Termpes_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesPro_Z", gxTv_SdtTTERPES_Termpespro_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesUlt_Z", gxTv_SdtTTERPES_Termpesult_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesTpo_Z", gxTv_SdtTTERPES_Termpestpo_Z, false, includeNonInitialized);
         AddObjectProperty("TermPesQty_Z", gxTv_SdtTTERPES_Termpesqty_Z, false, includeNonInitialized);
         AddObjectProperty("TermDsc_N", gxTv_SdtTTERPES_Termdsc_N, false, includeNonInitialized);
         AddObjectProperty("EmprCod_N", gxTv_SdtTTERPES_Emprcod_N, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTTERPES_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("TermPes_N", gxTv_SdtTTERPES_Termpes_N, false, includeNonInitialized);
         AddObjectProperty("TermPesUlt_N", gxTv_SdtTTERPES_Termpesult_N, false, includeNonInitialized);
         AddObjectProperty("TermPesTpo_N", gxTv_SdtTTERPES_Termpestpo_N, false, includeNonInitialized);
         AddObjectProperty("TermPesQty_N", gxTv_SdtTTERPES_Termpesqty_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTTERPES sdt )
   {
      if ( sdt.IsDirty("TermCod") )
      {
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termcod = sdt.getgxTv_SdtTTERPES_Termcod() ;
      }
      if ( sdt.IsDirty("TermDsc") )
      {
         gxTv_SdtTTERPES_Termdsc_N = sdt.getgxTv_SdtTTERPES_Termdsc_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termdsc = sdt.getgxTv_SdtTTERPES_Termdsc() ;
      }
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTTERPES_Emprcod_N = sdt.getgxTv_SdtTTERPES_Emprcod_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Emprcod = sdt.getgxTv_SdtTTERPES_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTTERPES_Emprnom_N = sdt.getgxTv_SdtTTERPES_Emprnom_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Emprnom = sdt.getgxTv_SdtTTERPES_Emprnom() ;
      }
      if ( sdt.IsDirty("TermPes") )
      {
         gxTv_SdtTTERPES_Termpes_N = sdt.getgxTv_SdtTTERPES_Termpes_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termpes = sdt.getgxTv_SdtTTERPES_Termpes() ;
      }
      if ( sdt.IsDirty("TermPesPro") )
      {
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termpespro = sdt.getgxTv_SdtTTERPES_Termpespro() ;
      }
      if ( sdt.IsDirty("TermPesUlt") )
      {
         gxTv_SdtTTERPES_Termpesult_N = sdt.getgxTv_SdtTTERPES_Termpesult_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termpesult = sdt.getgxTv_SdtTTERPES_Termpesult() ;
      }
      if ( sdt.IsDirty("TermPesTpo") )
      {
         gxTv_SdtTTERPES_Termpestpo_N = sdt.getgxTv_SdtTTERPES_Termpestpo_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termpestpo = sdt.getgxTv_SdtTTERPES_Termpestpo() ;
      }
      if ( sdt.IsDirty("TermPesQty") )
      {
         gxTv_SdtTTERPES_Termpesqty_N = sdt.getgxTv_SdtTTERPES_Termpesqty_N() ;
         gxTv_SdtTTERPES_N = (byte)(0) ;
         gxTv_SdtTTERPES_Termpesqty = sdt.getgxTv_SdtTTERPES_Termpesqty() ;
      }
      if ( gxTv_SdtTTERPES_Level1 != null )
      {
         GXBCLevelCollection<app.SdtTTERPES_Level1Item> newCollectionLevel1 = sdt.getgxTv_SdtTTERPES_Level1();
         app.SdtTTERPES_Level1Item currItemLevel1;
         app.SdtTTERPES_Level1Item newItemLevel1;
         short idx = 1;
         while ( idx <= newCollectionLevel1.size() )
         {
            newItemLevel1 = (app.SdtTTERPES_Level1Item)((app.SdtTTERPES_Level1Item)newCollectionLevel1.elementAt(-1+idx));
            currItemLevel1 = (app.SdtTTERPES_Level1Item)gxTv_SdtTTERPES_Level1.getByKey(newItemLevel1.getgxTv_SdtTTERPES_Level1Item_Termpesrng());
            if ( GXutil.strcmp(currItemLevel1.getgxTv_SdtTTERPES_Level1Item_Mode(), "UPD") == 0 )
            {
               currItemLevel1.updateDirties(newItemLevel1);
               if ( GXutil.strcmp(newItemLevel1.getgxTv_SdtTTERPES_Level1Item_Mode(), "DLT") == 0 )
               {
                  currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Mode( "DLT" );
               }
               currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtTTERPES_Level1.add(newItemLevel1, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtTTERPES_Termcod( )
   {
      return gxTv_SdtTTERPES_Termcod ;
   }

   public void setgxTv_SdtTTERPES_Termcod( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTERPES_Termcod, value) != 0 )
      {
         gxTv_SdtTTERPES_Mode = "INS" ;
         this.setgxTv_SdtTTERPES_Termcod_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termdsc_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpes_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpespro_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpesult_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpestpo_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpesqty_Z_SetNull( );
         if ( gxTv_SdtTTERPES_Level1 != null )
         {
            GXBCLevelCollection<app.SdtTTERPES_Level1Item> collectionLevel1 = gxTv_SdtTTERPES_Level1;
            app.SdtTTERPES_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtTTERPES_Level1Item)((app.SdtTTERPES_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Termcod");
      gxTv_SdtTTERPES_Termcod = value ;
   }

   public String getgxTv_SdtTTERPES_Termdsc( )
   {
      return gxTv_SdtTTERPES_Termdsc ;
   }

   public void setgxTv_SdtTTERPES_Termdsc( String value )
   {
      gxTv_SdtTTERPES_Termdsc_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termdsc");
      gxTv_SdtTTERPES_Termdsc = value ;
   }

   public void setgxTv_SdtTTERPES_Termdsc_SetNull( )
   {
      gxTv_SdtTTERPES_Termdsc_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termdsc = "" ;
      SetDirty("Termdsc");
   }

   public boolean getgxTv_SdtTTERPES_Termdsc_IsNull( )
   {
      return (gxTv_SdtTTERPES_Termdsc_N==1) ;
   }

   public String getgxTv_SdtTTERPES_Emprcod( )
   {
      return gxTv_SdtTTERPES_Emprcod ;
   }

   public void setgxTv_SdtTTERPES_Emprcod( String value )
   {
      gxTv_SdtTTERPES_Emprcod_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprcod");
      gxTv_SdtTTERPES_Emprcod = value ;
   }

   public void setgxTv_SdtTTERPES_Emprcod_SetNull( )
   {
      gxTv_SdtTTERPES_Emprcod_N = (byte)(1) ;
      gxTv_SdtTTERPES_Emprcod = "" ;
      SetDirty("Emprcod");
   }

   public boolean getgxTv_SdtTTERPES_Emprcod_IsNull( )
   {
      return (gxTv_SdtTTERPES_Emprcod_N==1) ;
   }

   public String getgxTv_SdtTTERPES_Emprnom( )
   {
      return gxTv_SdtTTERPES_Emprnom ;
   }

   public void setgxTv_SdtTTERPES_Emprnom( String value )
   {
      gxTv_SdtTTERPES_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTTERPES_Emprnom = value ;
   }

   public void setgxTv_SdtTTERPES_Emprnom_SetNull( )
   {
      gxTv_SdtTTERPES_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTERPES_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTTERPES_Emprnom_IsNull( )
   {
      return (gxTv_SdtTTERPES_Emprnom_N==1) ;
   }

   public byte getgxTv_SdtTTERPES_Termpes( )
   {
      return gxTv_SdtTTERPES_Termpes ;
   }

   public void setgxTv_SdtTTERPES_Termpes( byte value )
   {
      gxTv_SdtTTERPES_Termpes_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpes");
      gxTv_SdtTTERPES_Termpes = value ;
   }

   public void setgxTv_SdtTTERPES_Termpes_SetNull( )
   {
      gxTv_SdtTTERPES_Termpes_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpes = (byte)(0) ;
      SetDirty("Termpes");
   }

   public boolean getgxTv_SdtTTERPES_Termpes_IsNull( )
   {
      return (gxTv_SdtTTERPES_Termpes_N==1) ;
   }

   public String getgxTv_SdtTTERPES_Termpespro( )
   {
      return gxTv_SdtTTERPES_Termpespro ;
   }

   public void setgxTv_SdtTTERPES_Termpespro( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTERPES_Termpespro, value) != 0 )
      {
         gxTv_SdtTTERPES_Mode = "INS" ;
         this.setgxTv_SdtTTERPES_Termcod_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termdsc_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpes_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpespro_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpesult_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpestpo_Z_SetNull( );
         this.setgxTv_SdtTTERPES_Termpesqty_Z_SetNull( );
         if ( gxTv_SdtTTERPES_Level1 != null )
         {
            GXBCLevelCollection<app.SdtTTERPES_Level1Item> collectionLevel1 = gxTv_SdtTTERPES_Level1;
            app.SdtTTERPES_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtTTERPES_Level1Item)((app.SdtTTERPES_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTTERPES_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Termpespro");
      gxTv_SdtTTERPES_Termpespro = value ;
   }

   public long getgxTv_SdtTTERPES_Termpesult( )
   {
      return gxTv_SdtTTERPES_Termpesult ;
   }

   public void setgxTv_SdtTTERPES_Termpesult( long value )
   {
      gxTv_SdtTTERPES_Termpesult_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesult");
      gxTv_SdtTTERPES_Termpesult = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesult_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesult_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpesult = 0 ;
      SetDirty("Termpesult");
   }

   public boolean getgxTv_SdtTTERPES_Termpesult_IsNull( )
   {
      return (gxTv_SdtTTERPES_Termpesult_N==1) ;
   }

   public String getgxTv_SdtTTERPES_Termpestpo( )
   {
      return gxTv_SdtTTERPES_Termpestpo ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo( String value )
   {
      gxTv_SdtTTERPES_Termpestpo_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpestpo");
      gxTv_SdtTTERPES_Termpestpo = value ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo_SetNull( )
   {
      gxTv_SdtTTERPES_Termpestpo_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpestpo = "" ;
      SetDirty("Termpestpo");
   }

   public boolean getgxTv_SdtTTERPES_Termpestpo_IsNull( )
   {
      return (gxTv_SdtTTERPES_Termpestpo_N==1) ;
   }

   public short getgxTv_SdtTTERPES_Termpesqty( )
   {
      return gxTv_SdtTTERPES_Termpesqty ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty( short value )
   {
      gxTv_SdtTTERPES_Termpesqty_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesqty");
      gxTv_SdtTTERPES_Termpesqty = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesqty_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpesqty = (short)(0) ;
      SetDirty("Termpesqty");
   }

   public boolean getgxTv_SdtTTERPES_Termpesqty_IsNull( )
   {
      return (gxTv_SdtTTERPES_Termpesqty_N==1) ;
   }

   public GXBCLevelCollection<app.SdtTTERPES_Level1Item> getgxTv_SdtTTERPES_Level1( )
   {
      if ( gxTv_SdtTTERPES_Level1 == null )
      {
         gxTv_SdtTTERPES_Level1 = new GXBCLevelCollection<app.SdtTTERPES_Level1Item>(app.SdtTTERPES_Level1Item.class, "TTERPES.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtTTERPES_N = (byte)(0) ;
      return gxTv_SdtTTERPES_Level1 ;
   }

   public void setgxTv_SdtTTERPES_Level1( GXBCLevelCollection<app.SdtTTERPES_Level1Item> value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Level1");
      gxTv_SdtTTERPES_Level1 = value ;
   }

   public void setgxTv_SdtTTERPES_Level1_SetNull( )
   {
      gxTv_SdtTTERPES_Level1 = null ;
      SetDirty("Level1");
   }

   public boolean getgxTv_SdtTTERPES_Level1_IsNull( )
   {
      if ( gxTv_SdtTTERPES_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtTTERPES_Mode( )
   {
      return gxTv_SdtTTERPES_Mode ;
   }

   public void setgxTv_SdtTTERPES_Mode( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTERPES_Mode = value ;
   }

   public void setgxTv_SdtTTERPES_Mode_SetNull( )
   {
      gxTv_SdtTTERPES_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTERPES_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTERPES_Initialized( )
   {
      return gxTv_SdtTTERPES_Initialized ;
   }

   public void setgxTv_SdtTTERPES_Initialized( short value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTTERPES_Initialized = value ;
   }

   public void setgxTv_SdtTTERPES_Initialized_SetNull( )
   {
      gxTv_SdtTTERPES_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTERPES_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Termcod_Z( )
   {
      return gxTv_SdtTTERPES_Termcod_Z ;
   }

   public void setgxTv_SdtTTERPES_Termcod_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termcod_Z");
      gxTv_SdtTTERPES_Termcod_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termcod_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termcod_Z = "" ;
      SetDirty("Termcod_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Termdsc_Z( )
   {
      return gxTv_SdtTTERPES_Termdsc_Z ;
   }

   public void setgxTv_SdtTTERPES_Termdsc_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termdsc_Z");
      gxTv_SdtTTERPES_Termdsc_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termdsc_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termdsc_Z = "" ;
      SetDirty("Termdsc_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Emprcod_Z( )
   {
      return gxTv_SdtTTERPES_Emprcod_Z ;
   }

   public void setgxTv_SdtTTERPES_Emprcod_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTTERPES_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTTERPES_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Emprnom_Z( )
   {
      return gxTv_SdtTTERPES_Emprnom_Z ;
   }

   public void setgxTv_SdtTTERPES_Emprnom_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTTERPES_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTTERPES_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termpes_Z( )
   {
      return gxTv_SdtTTERPES_Termpes_Z ;
   }

   public void setgxTv_SdtTTERPES_Termpes_Z( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpes_Z");
      gxTv_SdtTTERPES_Termpes_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termpes_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termpes_Z = (byte)(0) ;
      SetDirty("Termpes_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termpes_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Termpespro_Z( )
   {
      return gxTv_SdtTTERPES_Termpespro_Z ;
   }

   public void setgxTv_SdtTTERPES_Termpespro_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpespro_Z");
      gxTv_SdtTTERPES_Termpespro_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termpespro_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termpespro_Z = "" ;
      SetDirty("Termpespro_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termpespro_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTTERPES_Termpesult_Z( )
   {
      return gxTv_SdtTTERPES_Termpesult_Z ;
   }

   public void setgxTv_SdtTTERPES_Termpesult_Z( long value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesult_Z");
      gxTv_SdtTTERPES_Termpesult_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesult_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesult_Z = 0 ;
      SetDirty("Termpesult_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termpesult_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERPES_Termpestpo_Z( )
   {
      return gxTv_SdtTTERPES_Termpestpo_Z ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpestpo_Z");
      gxTv_SdtTTERPES_Termpestpo_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termpestpo_Z = "" ;
      SetDirty("Termpestpo_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termpestpo_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTERPES_Termpesqty_Z( )
   {
      return gxTv_SdtTTERPES_Termpesqty_Z ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty_Z( short value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesqty_Z");
      gxTv_SdtTTERPES_Termpesqty_Z = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty_Z_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesqty_Z = (short)(0) ;
      SetDirty("Termpesqty_Z");
   }

   public boolean getgxTv_SdtTTERPES_Termpesqty_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termdsc_N( )
   {
      return gxTv_SdtTTERPES_Termdsc_N ;
   }

   public void setgxTv_SdtTTERPES_Termdsc_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termdsc_N");
      gxTv_SdtTTERPES_Termdsc_N = value ;
   }

   public void setgxTv_SdtTTERPES_Termdsc_N_SetNull( )
   {
      gxTv_SdtTTERPES_Termdsc_N = (byte)(0) ;
      SetDirty("Termdsc_N");
   }

   public boolean getgxTv_SdtTTERPES_Termdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Emprcod_N( )
   {
      return gxTv_SdtTTERPES_Emprcod_N ;
   }

   public void setgxTv_SdtTTERPES_Emprcod_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprcod_N");
      gxTv_SdtTTERPES_Emprcod_N = value ;
   }

   public void setgxTv_SdtTTERPES_Emprcod_N_SetNull( )
   {
      gxTv_SdtTTERPES_Emprcod_N = (byte)(0) ;
      SetDirty("Emprcod_N");
   }

   public boolean getgxTv_SdtTTERPES_Emprcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Emprnom_N( )
   {
      return gxTv_SdtTTERPES_Emprnom_N ;
   }

   public void setgxTv_SdtTTERPES_Emprnom_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTTERPES_Emprnom_N = value ;
   }

   public void setgxTv_SdtTTERPES_Emprnom_N_SetNull( )
   {
      gxTv_SdtTTERPES_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTTERPES_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termpes_N( )
   {
      return gxTv_SdtTTERPES_Termpes_N ;
   }

   public void setgxTv_SdtTTERPES_Termpes_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpes_N");
      gxTv_SdtTTERPES_Termpes_N = value ;
   }

   public void setgxTv_SdtTTERPES_Termpes_N_SetNull( )
   {
      gxTv_SdtTTERPES_Termpes_N = (byte)(0) ;
      SetDirty("Termpes_N");
   }

   public boolean getgxTv_SdtTTERPES_Termpes_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termpesult_N( )
   {
      return gxTv_SdtTTERPES_Termpesult_N ;
   }

   public void setgxTv_SdtTTERPES_Termpesult_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesult_N");
      gxTv_SdtTTERPES_Termpesult_N = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesult_N_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesult_N = (byte)(0) ;
      SetDirty("Termpesult_N");
   }

   public boolean getgxTv_SdtTTERPES_Termpesult_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termpestpo_N( )
   {
      return gxTv_SdtTTERPES_Termpestpo_N ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpestpo_N");
      gxTv_SdtTTERPES_Termpestpo_N = value ;
   }

   public void setgxTv_SdtTTERPES_Termpestpo_N_SetNull( )
   {
      gxTv_SdtTTERPES_Termpestpo_N = (byte)(0) ;
      SetDirty("Termpestpo_N");
   }

   public boolean getgxTv_SdtTTERPES_Termpestpo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERPES_Termpesqty_N( )
   {
      return gxTv_SdtTTERPES_Termpesqty_N ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      SetDirty("Termpesqty_N");
      gxTv_SdtTTERPES_Termpesqty_N = value ;
   }

   public void setgxTv_SdtTTERPES_Termpesqty_N_SetNull( )
   {
      gxTv_SdtTTERPES_Termpesqty_N = (byte)(0) ;
      SetDirty("Termpesqty_N");
   }

   public boolean getgxTv_SdtTTERPES_Termpesqty_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tterpes_bc obj;
      obj = new app.tterpes_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTTERPES_Termcod = "" ;
      gxTv_SdtTTERPES_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termdsc = "" ;
      gxTv_SdtTTERPES_Emprcod = "" ;
      gxTv_SdtTTERPES_Emprnom = "" ;
      gxTv_SdtTTERPES_Termpespro = "" ;
      gxTv_SdtTTERPES_Termpestpo = "" ;
      gxTv_SdtTTERPES_Mode = "" ;
      gxTv_SdtTTERPES_Termcod_Z = "" ;
      gxTv_SdtTTERPES_Termdsc_Z = "" ;
      gxTv_SdtTTERPES_Emprcod_Z = "" ;
      gxTv_SdtTTERPES_Emprnom_Z = "" ;
      gxTv_SdtTTERPES_Termpespro_Z = "" ;
      gxTv_SdtTTERPES_Termpestpo_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTTERPES_N ;
   }

   public app.SdtTTERPES Clone( )
   {
      app.SdtTTERPES sdt;
      app.tterpes_bc obj;
      sdt = (app.SdtTTERPES)(clone()) ;
      obj = (app.tterpes_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTTERPES struct )
   {
      setgxTv_SdtTTERPES_Termcod(struct.getTermcod());
      setgxTv_SdtTTERPES_Termdsc(struct.getTermdsc());
      setgxTv_SdtTTERPES_Emprcod(struct.getEmprcod());
      setgxTv_SdtTTERPES_Emprnom(struct.getEmprnom());
      setgxTv_SdtTTERPES_Termpes(struct.getTermpes());
      setgxTv_SdtTTERPES_Termpespro(struct.getTermpespro());
      setgxTv_SdtTTERPES_Termpesult(struct.getTermpesult());
      setgxTv_SdtTTERPES_Termpestpo(struct.getTermpestpo());
      setgxTv_SdtTTERPES_Termpesqty(struct.getTermpesqty());
      GXBCLevelCollection<app.SdtTTERPES_Level1Item> gxTv_SdtTTERPES_Level1_aux = new GXBCLevelCollection<app.SdtTTERPES_Level1Item>(app.SdtTTERPES_Level1Item.class, "TTERPES.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtTTERPES_Level1Item> gxTv_SdtTTERPES_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtTTERPES_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtTTERPES_Level1_aux1.size(); i++)
         {
            gxTv_SdtTTERPES_Level1_aux.add(new app.SdtTTERPES_Level1Item(remoteHandle, gxTv_SdtTTERPES_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtTTERPES_Level1(gxTv_SdtTTERPES_Level1_aux);
      setgxTv_SdtTTERPES_Mode(struct.getMode());
      setgxTv_SdtTTERPES_Initialized(struct.getInitialized());
      setgxTv_SdtTTERPES_Termcod_Z(struct.getTermcod_Z());
      setgxTv_SdtTTERPES_Termdsc_Z(struct.getTermdsc_Z());
      setgxTv_SdtTTERPES_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTTERPES_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTTERPES_Termpes_Z(struct.getTermpes_Z());
      setgxTv_SdtTTERPES_Termpespro_Z(struct.getTermpespro_Z());
      setgxTv_SdtTTERPES_Termpesult_Z(struct.getTermpesult_Z());
      setgxTv_SdtTTERPES_Termpestpo_Z(struct.getTermpestpo_Z());
      setgxTv_SdtTTERPES_Termpesqty_Z(struct.getTermpesqty_Z());
      setgxTv_SdtTTERPES_Termdsc_N(struct.getTermdsc_N());
      setgxTv_SdtTTERPES_Emprcod_N(struct.getEmprcod_N());
      setgxTv_SdtTTERPES_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTTERPES_Termpes_N(struct.getTermpes_N());
      setgxTv_SdtTTERPES_Termpesult_N(struct.getTermpesult_N());
      setgxTv_SdtTTERPES_Termpestpo_N(struct.getTermpestpo_N());
      setgxTv_SdtTTERPES_Termpesqty_N(struct.getTermpesqty_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTTERPES getStruct( )
   {
      app.StructSdtTTERPES struct = new app.StructSdtTTERPES ();
      struct.setTermcod(getgxTv_SdtTTERPES_Termcod());
      struct.setTermdsc(getgxTv_SdtTTERPES_Termdsc());
      struct.setEmprcod(getgxTv_SdtTTERPES_Emprcod());
      struct.setEmprnom(getgxTv_SdtTTERPES_Emprnom());
      struct.setTermpes(getgxTv_SdtTTERPES_Termpes());
      struct.setTermpespro(getgxTv_SdtTTERPES_Termpespro());
      struct.setTermpesult(getgxTv_SdtTTERPES_Termpesult());
      struct.setTermpestpo(getgxTv_SdtTTERPES_Termpestpo());
      struct.setTermpesqty(getgxTv_SdtTTERPES_Termpesqty());
      struct.setLevel1(getgxTv_SdtTTERPES_Level1().getStruct());
      struct.setMode(getgxTv_SdtTTERPES_Mode());
      struct.setInitialized(getgxTv_SdtTTERPES_Initialized());
      struct.setTermcod_Z(getgxTv_SdtTTERPES_Termcod_Z());
      struct.setTermdsc_Z(getgxTv_SdtTTERPES_Termdsc_Z());
      struct.setEmprcod_Z(getgxTv_SdtTTERPES_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTTERPES_Emprnom_Z());
      struct.setTermpes_Z(getgxTv_SdtTTERPES_Termpes_Z());
      struct.setTermpespro_Z(getgxTv_SdtTTERPES_Termpespro_Z());
      struct.setTermpesult_Z(getgxTv_SdtTTERPES_Termpesult_Z());
      struct.setTermpestpo_Z(getgxTv_SdtTTERPES_Termpestpo_Z());
      struct.setTermpesqty_Z(getgxTv_SdtTTERPES_Termpesqty_Z());
      struct.setTermdsc_N(getgxTv_SdtTTERPES_Termdsc_N());
      struct.setEmprcod_N(getgxTv_SdtTTERPES_Emprcod_N());
      struct.setEmprnom_N(getgxTv_SdtTTERPES_Emprnom_N());
      struct.setTermpes_N(getgxTv_SdtTTERPES_Termpes_N());
      struct.setTermpesult_N(getgxTv_SdtTTERPES_Termpesult_N());
      struct.setTermpestpo_N(getgxTv_SdtTTERPES_Termpestpo_N());
      struct.setTermpesqty_N(getgxTv_SdtTTERPES_Termpesqty_N());
      return struct ;
   }

   private byte gxTv_SdtTTERPES_N ;
   private byte gxTv_SdtTTERPES_Termpes ;
   private byte gxTv_SdtTTERPES_Termpes_Z ;
   private byte gxTv_SdtTTERPES_Termdsc_N ;
   private byte gxTv_SdtTTERPES_Emprcod_N ;
   private byte gxTv_SdtTTERPES_Emprnom_N ;
   private byte gxTv_SdtTTERPES_Termpes_N ;
   private byte gxTv_SdtTTERPES_Termpesult_N ;
   private byte gxTv_SdtTTERPES_Termpestpo_N ;
   private byte gxTv_SdtTTERPES_Termpesqty_N ;
   private short gxTv_SdtTTERPES_Termpesqty ;
   private short gxTv_SdtTTERPES_Initialized ;
   private short gxTv_SdtTTERPES_Termpesqty_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTTERPES_Termpesult ;
   private long gxTv_SdtTTERPES_Termpesult_Z ;
   private String gxTv_SdtTTERPES_Termcod ;
   private String gxTv_SdtTTERPES_Termdsc ;
   private String gxTv_SdtTTERPES_Emprcod ;
   private String gxTv_SdtTTERPES_Emprnom ;
   private String gxTv_SdtTTERPES_Termpespro ;
   private String gxTv_SdtTTERPES_Termpestpo ;
   private String gxTv_SdtTTERPES_Mode ;
   private String gxTv_SdtTTERPES_Termcod_Z ;
   private String gxTv_SdtTTERPES_Termdsc_Z ;
   private String gxTv_SdtTTERPES_Emprcod_Z ;
   private String gxTv_SdtTTERPES_Emprnom_Z ;
   private String gxTv_SdtTTERPES_Termpespro_Z ;
   private String gxTv_SdtTTERPES_Termpestpo_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private GXBCLevelCollection<app.SdtTTERPES_Level1Item> gxTv_SdtTTERPES_Level1_aux ;
   private GXBCLevelCollection<app.SdtTTERPES_Level1Item> gxTv_SdtTTERPES_Level1=null ;
}

