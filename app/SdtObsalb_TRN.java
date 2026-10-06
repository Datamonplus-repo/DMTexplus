package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtObsalb_TRN extends GxSilentTrnSdt
{
   public SdtObsalb_TRN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtObsalb_TRN.class));
   }

   public SdtObsalb_TRN( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtObsalb_TRN");
      initialize( remoteHandle) ;
   }

   public SdtObsalb_TRN( int remoteHandle ,
                         StructSdtObsalb_TRN struct )
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

   public void Load( String AV396EmprCod ,
                     long AV30AlbProCod ,
                     byte AV915AlbPObsLin )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Long.valueOf(AV30AlbProCod),Byte.valueOf(AV915AlbPObsLin)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"AlbProCod", long.class}, new Object[]{"AlbPObsLin", byte.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Obsalb_TRN");
      metadata.set("BT", "TXPOBSALB");
      metadata.set("PK", "[ \"EmprCod\",\"AlbProCod\",\"AlbPObsLin\" ]");
      metadata.set("PKAssigned", "[ \"AlbPObsLin\" ]");
      metadata.set("Serial", "[ [ \"Other\",\"TXPCALPRD\",\"AlbPObsCon\",\"AlbPObsLin\",\"EmprCod\",\"EmprCod\",\"AlbProCod\",\"AlbProCod\" ] ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\",\"AlbProCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtObsalb_TRN_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtObsalb_TRN_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon") )
            {
               gxTv_SdtObsalb_TRN_Albpobscon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst") )
            {
               gxTv_SdtObsalb_TRN_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsLin") )
            {
               gxTv_SdtObsalb_TRN_Albpobslin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObs") )
            {
               gxTv_SdtObsalb_TRN_Albpobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtObsalb_TRN_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtObsalb_TRN_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtObsalb_TRN_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod_Z") )
            {
               gxTv_SdtObsalb_TRN_Albprocod_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon_Z") )
            {
               gxTv_SdtObsalb_TRN_Albpobscon_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst_Z") )
            {
               gxTv_SdtObsalb_TRN_Albproest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsLin_Z") )
            {
               gxTv_SdtObsalb_TRN_Albpobslin_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObs_Z") )
            {
               gxTv_SdtObsalb_TRN_Albpobs_Z = oReader.getValue() ;
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
         sName = "Obsalb_TRN" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtObsalb_TRN_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsCon", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albpobscon, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEst", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsLin", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albpobslin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObs", gxTv_SdtObsalb_TRN_Albpobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtObsalb_TRN_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtObsalb_TRN_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProCod_Z", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albprocod_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPObsCon_Z", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albpobscon_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProEst_Z", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albproest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPObsLin_Z", GXutil.trim( GXutil.str( gxTv_SdtObsalb_TRN_Albpobslin_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPObs_Z", gxTv_SdtObsalb_TRN_Albpobs_Z);
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
      AddObjectProperty("EmprCod", gxTv_SdtObsalb_TRN_Emprcod, false, includeNonInitialized);
      AddObjectProperty("AlbProCod", gxTv_SdtObsalb_TRN_Albprocod, false, includeNonInitialized);
      AddObjectProperty("AlbPObsCon", gxTv_SdtObsalb_TRN_Albpobscon, false, includeNonInitialized);
      AddObjectProperty("AlbProEst", gxTv_SdtObsalb_TRN_Albproest, false, includeNonInitialized);
      AddObjectProperty("AlbPObsLin", gxTv_SdtObsalb_TRN_Albpobslin, false, includeNonInitialized);
      AddObjectProperty("AlbPObs", gxTv_SdtObsalb_TRN_Albpobs, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtObsalb_TRN_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtObsalb_TRN_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtObsalb_TRN_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProCod_Z", gxTv_SdtObsalb_TRN_Albprocod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPObsCon_Z", gxTv_SdtObsalb_TRN_Albpobscon_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProEst_Z", gxTv_SdtObsalb_TRN_Albproest_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPObsLin_Z", gxTv_SdtObsalb_TRN_Albpobslin_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPObs_Z", gxTv_SdtObsalb_TRN_Albpobs_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtObsalb_TRN sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Emprcod = sdt.getgxTv_SdtObsalb_TRN_Emprcod() ;
      }
      if ( sdt.IsDirty("AlbProCod") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Albprocod = sdt.getgxTv_SdtObsalb_TRN_Albprocod() ;
      }
      if ( sdt.IsDirty("AlbPObsCon") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Albpobscon = sdt.getgxTv_SdtObsalb_TRN_Albpobscon() ;
      }
      if ( sdt.IsDirty("AlbProEst") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Albproest = sdt.getgxTv_SdtObsalb_TRN_Albproest() ;
      }
      if ( sdt.IsDirty("AlbPObsLin") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Albpobslin = sdt.getgxTv_SdtObsalb_TRN_Albpobslin() ;
      }
      if ( sdt.IsDirty("AlbPObs") )
      {
         gxTv_SdtObsalb_TRN_N = (byte)(0) ;
         gxTv_SdtObsalb_TRN_Albpobs = sdt.getgxTv_SdtObsalb_TRN_Albpobs() ;
      }
   }

   public String getgxTv_SdtObsalb_TRN_Emprcod( )
   {
      return gxTv_SdtObsalb_TRN_Emprcod ;
   }

   public void setgxTv_SdtObsalb_TRN_Emprcod( String value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtObsalb_TRN_Emprcod, value) != 0 )
      {
         gxTv_SdtObsalb_TRN_Mode = "INS" ;
         this.setgxTv_SdtObsalb_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albprocod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobscon_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albproest_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobslin_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobs_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtObsalb_TRN_Emprcod = value ;
   }

   public long getgxTv_SdtObsalb_TRN_Albprocod( )
   {
      return gxTv_SdtObsalb_TRN_Albprocod ;
   }

   public void setgxTv_SdtObsalb_TRN_Albprocod( long value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      if ( gxTv_SdtObsalb_TRN_Albprocod != value )
      {
         gxTv_SdtObsalb_TRN_Mode = "INS" ;
         this.setgxTv_SdtObsalb_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albprocod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobscon_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albproest_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobslin_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobs_Z_SetNull( );
      }
      SetDirty("Albprocod");
      gxTv_SdtObsalb_TRN_Albprocod = value ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albpobscon( )
   {
      return gxTv_SdtObsalb_TRN_Albpobscon ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobscon( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albpobscon");
      gxTv_SdtObsalb_TRN_Albpobscon = value ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albproest( )
   {
      return gxTv_SdtObsalb_TRN_Albproest ;
   }

   public void setgxTv_SdtObsalb_TRN_Albproest( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albproest");
      gxTv_SdtObsalb_TRN_Albproest = value ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albpobslin( )
   {
      return gxTv_SdtObsalb_TRN_Albpobslin ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobslin( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      if ( gxTv_SdtObsalb_TRN_Albpobslin != value )
      {
         gxTv_SdtObsalb_TRN_Mode = "INS" ;
         this.setgxTv_SdtObsalb_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albprocod_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobscon_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albproest_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobslin_Z_SetNull( );
         this.setgxTv_SdtObsalb_TRN_Albpobs_Z_SetNull( );
      }
      SetDirty("Albpobslin");
      gxTv_SdtObsalb_TRN_Albpobslin = value ;
   }

   public String getgxTv_SdtObsalb_TRN_Albpobs( )
   {
      return gxTv_SdtObsalb_TRN_Albpobs ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobs( String value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albpobs");
      gxTv_SdtObsalb_TRN_Albpobs = value ;
   }

   public String getgxTv_SdtObsalb_TRN_Mode( )
   {
      return gxTv_SdtObsalb_TRN_Mode ;
   }

   public void setgxTv_SdtObsalb_TRN_Mode( String value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtObsalb_TRN_Mode = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Mode_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtObsalb_TRN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtObsalb_TRN_Initialized( )
   {
      return gxTv_SdtObsalb_TRN_Initialized ;
   }

   public void setgxTv_SdtObsalb_TRN_Initialized( short value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtObsalb_TRN_Initialized = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Initialized_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtObsalb_TRN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtObsalb_TRN_Emprcod_Z( )
   {
      return gxTv_SdtObsalb_TRN_Emprcod_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Emprcod_Z( String value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtObsalb_TRN_Emprcod_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Emprcod_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtObsalb_TRN_Albprocod_Z( )
   {
      return gxTv_SdtObsalb_TRN_Albprocod_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Albprocod_Z( long value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albprocod_Z");
      gxTv_SdtObsalb_TRN_Albprocod_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Albprocod_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Albprocod_Z = 0 ;
      SetDirty("Albprocod_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Albprocod_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albpobscon_Z( )
   {
      return gxTv_SdtObsalb_TRN_Albpobscon_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobscon_Z( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albpobscon_Z");
      gxTv_SdtObsalb_TRN_Albpobscon_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobscon_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Albpobscon_Z = (byte)(0) ;
      SetDirty("Albpobscon_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Albpobscon_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albproest_Z( )
   {
      return gxTv_SdtObsalb_TRN_Albproest_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Albproest_Z( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albproest_Z");
      gxTv_SdtObsalb_TRN_Albproest_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Albproest_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Albproest_Z = (byte)(0) ;
      SetDirty("Albproest_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Albproest_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtObsalb_TRN_Albpobslin_Z( )
   {
      return gxTv_SdtObsalb_TRN_Albpobslin_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobslin_Z( byte value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albpobslin_Z");
      gxTv_SdtObsalb_TRN_Albpobslin_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobslin_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Albpobslin_Z = (byte)(0) ;
      SetDirty("Albpobslin_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Albpobslin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtObsalb_TRN_Albpobs_Z( )
   {
      return gxTv_SdtObsalb_TRN_Albpobs_Z ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobs_Z( String value )
   {
      gxTv_SdtObsalb_TRN_N = (byte)(0) ;
      SetDirty("Albpobs_Z");
      gxTv_SdtObsalb_TRN_Albpobs_Z = value ;
   }

   public void setgxTv_SdtObsalb_TRN_Albpobs_Z_SetNull( )
   {
      gxTv_SdtObsalb_TRN_Albpobs_Z = "" ;
      SetDirty("Albpobs_Z");
   }

   public boolean getgxTv_SdtObsalb_TRN_Albpobs_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.obsalb_trn_bc obj;
      obj = new app.obsalb_trn_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtObsalb_TRN_Emprcod = "" ;
      gxTv_SdtObsalb_TRN_N = (byte)(1) ;
      gxTv_SdtObsalb_TRN_Albpobs = "" ;
      gxTv_SdtObsalb_TRN_Mode = "" ;
      gxTv_SdtObsalb_TRN_Emprcod_Z = "" ;
      gxTv_SdtObsalb_TRN_Albpobs_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtObsalb_TRN_N ;
   }

   public app.SdtObsalb_TRN Clone( )
   {
      app.SdtObsalb_TRN sdt;
      app.obsalb_trn_bc obj;
      sdt = (app.SdtObsalb_TRN)(clone()) ;
      obj = (app.obsalb_trn_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtObsalb_TRN struct )
   {
      setgxTv_SdtObsalb_TRN_Emprcod(struct.getEmprcod());
      setgxTv_SdtObsalb_TRN_Albprocod(struct.getAlbprocod());
      setgxTv_SdtObsalb_TRN_Albpobscon(struct.getAlbpobscon());
      setgxTv_SdtObsalb_TRN_Albproest(struct.getAlbproest());
      setgxTv_SdtObsalb_TRN_Albpobslin(struct.getAlbpobslin());
      setgxTv_SdtObsalb_TRN_Albpobs(struct.getAlbpobs());
      setgxTv_SdtObsalb_TRN_Mode(struct.getMode());
      setgxTv_SdtObsalb_TRN_Initialized(struct.getInitialized());
      setgxTv_SdtObsalb_TRN_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtObsalb_TRN_Albprocod_Z(struct.getAlbprocod_Z());
      setgxTv_SdtObsalb_TRN_Albpobscon_Z(struct.getAlbpobscon_Z());
      setgxTv_SdtObsalb_TRN_Albproest_Z(struct.getAlbproest_Z());
      setgxTv_SdtObsalb_TRN_Albpobslin_Z(struct.getAlbpobslin_Z());
      setgxTv_SdtObsalb_TRN_Albpobs_Z(struct.getAlbpobs_Z());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtObsalb_TRN getStruct( )
   {
      app.StructSdtObsalb_TRN struct = new app.StructSdtObsalb_TRN ();
      struct.setEmprcod(getgxTv_SdtObsalb_TRN_Emprcod());
      struct.setAlbprocod(getgxTv_SdtObsalb_TRN_Albprocod());
      struct.setAlbpobscon(getgxTv_SdtObsalb_TRN_Albpobscon());
      struct.setAlbproest(getgxTv_SdtObsalb_TRN_Albproest());
      struct.setAlbpobslin(getgxTv_SdtObsalb_TRN_Albpobslin());
      struct.setAlbpobs(getgxTv_SdtObsalb_TRN_Albpobs());
      struct.setMode(getgxTv_SdtObsalb_TRN_Mode());
      struct.setInitialized(getgxTv_SdtObsalb_TRN_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtObsalb_TRN_Emprcod_Z());
      struct.setAlbprocod_Z(getgxTv_SdtObsalb_TRN_Albprocod_Z());
      struct.setAlbpobscon_Z(getgxTv_SdtObsalb_TRN_Albpobscon_Z());
      struct.setAlbproest_Z(getgxTv_SdtObsalb_TRN_Albproest_Z());
      struct.setAlbpobslin_Z(getgxTv_SdtObsalb_TRN_Albpobslin_Z());
      struct.setAlbpobs_Z(getgxTv_SdtObsalb_TRN_Albpobs_Z());
      return struct ;
   }

   private byte gxTv_SdtObsalb_TRN_N ;
   private byte gxTv_SdtObsalb_TRN_Albpobscon ;
   private byte gxTv_SdtObsalb_TRN_Albproest ;
   private byte gxTv_SdtObsalb_TRN_Albpobslin ;
   private byte gxTv_SdtObsalb_TRN_Albpobscon_Z ;
   private byte gxTv_SdtObsalb_TRN_Albproest_Z ;
   private byte gxTv_SdtObsalb_TRN_Albpobslin_Z ;
   private short gxTv_SdtObsalb_TRN_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtObsalb_TRN_Albprocod ;
   private long gxTv_SdtObsalb_TRN_Albprocod_Z ;
   private String gxTv_SdtObsalb_TRN_Emprcod ;
   private String gxTv_SdtObsalb_TRN_Albpobs ;
   private String gxTv_SdtObsalb_TRN_Mode ;
   private String gxTv_SdtObsalb_TRN_Emprcod_Z ;
   private String gxTv_SdtObsalb_TRN_Albpobs_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

