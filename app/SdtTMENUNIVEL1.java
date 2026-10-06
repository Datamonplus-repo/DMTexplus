package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTMENUNIVEL1 extends GxSilentTrnSdt
{
   public SdtTMENUNIVEL1( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTMENUNIVEL1.class));
   }

   public SdtTMENUNIVEL1( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtTMENUNIVEL1");
      initialize( remoteHandle) ;
   }

   public SdtTMENUNIVEL1( int remoteHandle ,
                          StructSdtTMENUNIVEL1 struct )
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

   public void Load( String AV945MnuId ,
                     byte AV946MnuOp )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV945MnuId,Byte.valueOf(AV946MnuOp)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"MnuId", String.class}, new Object[]{"MnuOp", byte.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TMENUNIVEL1");
      metadata.set("BT", "TXPMNUOP");
      metadata.set("PK", "[ \"MnuId\",\"MnuOp\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"MnuId\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuId") )
            {
               gxTv_SdtTMENUNIVEL1_Mnuid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuTxt") )
            {
               gxTv_SdtTMENUNIVEL1_Mnutxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuOp") )
            {
               gxTv_SdtTMENUNIVEL1_Mnuop = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgm") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmWeb") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmweb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmTpo") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmtpo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmTxt") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmtxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTMENUNIVEL1_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTMENUNIVEL1_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuId_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnuid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuTxt_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnutxt_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuOp_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnuop_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgm_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmWeb_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmTpo_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuPgmTxt_Z") )
            {
               gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MnuTxt_N") )
            {
               gxTv_SdtTMENUNIVEL1_Mnutxt_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TMENUNIVEL1" ;
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
      oWriter.writeElement("MnuId", gxTv_SdtTMENUNIVEL1_Mnuid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuTxt", gxTv_SdtTMENUNIVEL1_Mnutxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuOp", GXutil.trim( GXutil.str( gxTv_SdtTMENUNIVEL1_Mnuop, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuPgm", gxTv_SdtTMENUNIVEL1_Mnupgm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuPgmWeb", gxTv_SdtTMENUNIVEL1_Mnupgmweb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuPgmTpo", gxTv_SdtTMENUNIVEL1_Mnupgmtpo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MnuPgmTxt", gxTv_SdtTMENUNIVEL1_Mnupgmtxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTMENUNIVEL1_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTMENUNIVEL1_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuId_Z", gxTv_SdtTMENUNIVEL1_Mnuid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuTxt_Z", gxTv_SdtTMENUNIVEL1_Mnutxt_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuOp_Z", GXutil.trim( GXutil.str( gxTv_SdtTMENUNIVEL1_Mnuop_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuPgm_Z", gxTv_SdtTMENUNIVEL1_Mnupgm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuPgmWeb_Z", gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuPgmTpo_Z", gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuPgmTxt_Z", gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MnuTxt_N", GXutil.trim( GXutil.str( gxTv_SdtTMENUNIVEL1_Mnutxt_N, 1, 0)));
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
      AddObjectProperty("MnuId", gxTv_SdtTMENUNIVEL1_Mnuid, false, includeNonInitialized);
      AddObjectProperty("MnuTxt", gxTv_SdtTMENUNIVEL1_Mnutxt, false, includeNonInitialized);
      AddObjectProperty("MnuTxt_N", gxTv_SdtTMENUNIVEL1_Mnutxt_N, false, includeNonInitialized);
      AddObjectProperty("MnuOp", gxTv_SdtTMENUNIVEL1_Mnuop, false, includeNonInitialized);
      AddObjectProperty("MnuPgm", gxTv_SdtTMENUNIVEL1_Mnupgm, false, includeNonInitialized);
      AddObjectProperty("MnuPgmWeb", gxTv_SdtTMENUNIVEL1_Mnupgmweb, false, includeNonInitialized);
      AddObjectProperty("MnuPgmTpo", gxTv_SdtTMENUNIVEL1_Mnupgmtpo, false, includeNonInitialized);
      AddObjectProperty("MnuPgmTxt", gxTv_SdtTMENUNIVEL1_Mnupgmtxt, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTMENUNIVEL1_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTMENUNIVEL1_Initialized, false, includeNonInitialized);
         AddObjectProperty("MnuId_Z", gxTv_SdtTMENUNIVEL1_Mnuid_Z, false, includeNonInitialized);
         AddObjectProperty("MnuTxt_Z", gxTv_SdtTMENUNIVEL1_Mnutxt_Z, false, includeNonInitialized);
         AddObjectProperty("MnuOp_Z", gxTv_SdtTMENUNIVEL1_Mnuop_Z, false, includeNonInitialized);
         AddObjectProperty("MnuPgm_Z", gxTv_SdtTMENUNIVEL1_Mnupgm_Z, false, includeNonInitialized);
         AddObjectProperty("MnuPgmWeb_Z", gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z, false, includeNonInitialized);
         AddObjectProperty("MnuPgmTpo_Z", gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z, false, includeNonInitialized);
         AddObjectProperty("MnuPgmTxt_Z", gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z, false, includeNonInitialized);
         AddObjectProperty("MnuTxt_N", gxTv_SdtTMENUNIVEL1_Mnutxt_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTMENUNIVEL1 sdt )
   {
      if ( sdt.IsDirty("MnuId") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnuid = sdt.getgxTv_SdtTMENUNIVEL1_Mnuid() ;
      }
      if ( sdt.IsDirty("MnuTxt") )
      {
         gxTv_SdtTMENUNIVEL1_Mnutxt_N = sdt.getgxTv_SdtTMENUNIVEL1_Mnutxt_N() ;
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnutxt = sdt.getgxTv_SdtTMENUNIVEL1_Mnutxt() ;
      }
      if ( sdt.IsDirty("MnuOp") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnuop = sdt.getgxTv_SdtTMENUNIVEL1_Mnuop() ;
      }
      if ( sdt.IsDirty("MnuPgm") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnupgm = sdt.getgxTv_SdtTMENUNIVEL1_Mnupgm() ;
      }
      if ( sdt.IsDirty("MnuPgmWeb") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnupgmweb = sdt.getgxTv_SdtTMENUNIVEL1_Mnupgmweb() ;
      }
      if ( sdt.IsDirty("MnuPgmTpo") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnupgmtpo = sdt.getgxTv_SdtTMENUNIVEL1_Mnupgmtpo() ;
      }
      if ( sdt.IsDirty("MnuPgmTxt") )
      {
         gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
         gxTv_SdtTMENUNIVEL1_Mnupgmtxt = sdt.getgxTv_SdtTMENUNIVEL1_Mnupgmtxt() ;
      }
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnuid( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnuid ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuid( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTMENUNIVEL1_Mnuid, value) != 0 )
      {
         gxTv_SdtTMENUNIVEL1_Mode = "INS" ;
         this.setgxTv_SdtTMENUNIVEL1_Mnuid_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnutxt_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnuop_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgm_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z_SetNull( );
      }
      SetDirty("Mnuid");
      gxTv_SdtTMENUNIVEL1_Mnuid = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnutxt( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnutxt ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt( String value )
   {
      gxTv_SdtTMENUNIVEL1_Mnutxt_N = (byte)(0) ;
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnutxt");
      gxTv_SdtTMENUNIVEL1_Mnutxt = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnutxt_N = (byte)(1) ;
      gxTv_SdtTMENUNIVEL1_Mnutxt = "" ;
      SetDirty("Mnutxt");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnutxt_IsNull( )
   {
      return (gxTv_SdtTMENUNIVEL1_Mnutxt_N==1) ;
   }

   public byte getgxTv_SdtTMENUNIVEL1_Mnuop( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnuop ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuop( byte value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      if ( gxTv_SdtTMENUNIVEL1_Mnuop != value )
      {
         gxTv_SdtTMENUNIVEL1_Mode = "INS" ;
         this.setgxTv_SdtTMENUNIVEL1_Mnuid_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnutxt_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnuop_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgm_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z_SetNull( );
         this.setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z_SetNull( );
      }
      SetDirty("Mnuop");
      gxTv_SdtTMENUNIVEL1_Mnuop = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgm( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgm ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgm( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgm");
      gxTv_SdtTMENUNIVEL1_Mnupgm = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmweb( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmweb ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmweb( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmweb");
      gxTv_SdtTMENUNIVEL1_Mnupgmweb = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmtpo( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmtpo ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtpo( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmtpo");
      gxTv_SdtTMENUNIVEL1_Mnupgmtpo = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmtxt( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmtxt ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtxt( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmtxt");
      gxTv_SdtTMENUNIVEL1_Mnupgmtxt = value ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mode( )
   {
      return gxTv_SdtTMENUNIVEL1_Mode ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mode( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTMENUNIVEL1_Mode = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mode_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTMENUNIVEL1_Initialized( )
   {
      return gxTv_SdtTMENUNIVEL1_Initialized ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Initialized( short value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTMENUNIVEL1_Initialized = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Initialized_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnuid_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnuid_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuid_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnuid_Z");
      gxTv_SdtTMENUNIVEL1_Mnuid_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuid_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnuid_Z = "" ;
      SetDirty("Mnuid_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnuid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnutxt_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnutxt_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnutxt_Z");
      gxTv_SdtTMENUNIVEL1_Mnutxt_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnutxt_Z = "" ;
      SetDirty("Mnutxt_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnutxt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTMENUNIVEL1_Mnuop_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnuop_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuop_Z( byte value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnuop_Z");
      gxTv_SdtTMENUNIVEL1_Mnuop_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnuop_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnuop_Z = (byte)(0) ;
      SetDirty("Mnuop_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnuop_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgm_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgm_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgm_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgm_Z");
      gxTv_SdtTMENUNIVEL1_Mnupgm_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgm_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnupgm_Z = "" ;
      SetDirty("Mnupgm_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnupgm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmweb_Z");
      gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z = "" ;
      SetDirty("Mnupgmweb_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmtpo_Z");
      gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z = "" ;
      SetDirty("Mnupgmtpo_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z( String value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnupgmtxt_Z");
      gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z = "" ;
      SetDirty("Mnupgmtxt_Z");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTMENUNIVEL1_Mnutxt_N( )
   {
      return gxTv_SdtTMENUNIVEL1_Mnutxt_N ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt_N( byte value )
   {
      gxTv_SdtTMENUNIVEL1_N = (byte)(0) ;
      SetDirty("Mnutxt_N");
      gxTv_SdtTMENUNIVEL1_Mnutxt_N = value ;
   }

   public void setgxTv_SdtTMENUNIVEL1_Mnutxt_N_SetNull( )
   {
      gxTv_SdtTMENUNIVEL1_Mnutxt_N = (byte)(0) ;
      SetDirty("Mnutxt_N");
   }

   public boolean getgxTv_SdtTMENUNIVEL1_Mnutxt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tmenunivel1_bc obj;
      obj = new app.tmenunivel1_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTMENUNIVEL1_Mnuid = "" ;
      gxTv_SdtTMENUNIVEL1_N = (byte)(1) ;
      gxTv_SdtTMENUNIVEL1_Mnutxt = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgm = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmweb = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmtpo = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmtxt = "" ;
      gxTv_SdtTMENUNIVEL1_Mode = "" ;
      gxTv_SdtTMENUNIVEL1_Mnuid_Z = "" ;
      gxTv_SdtTMENUNIVEL1_Mnutxt_Z = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgm_Z = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z = "" ;
      gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTMENUNIVEL1_N ;
   }

   public app.SdtTMENUNIVEL1 Clone( )
   {
      app.SdtTMENUNIVEL1 sdt;
      app.tmenunivel1_bc obj;
      sdt = (app.SdtTMENUNIVEL1)(clone()) ;
      obj = (app.tmenunivel1_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTMENUNIVEL1 struct )
   {
      setgxTv_SdtTMENUNIVEL1_Mnuid(struct.getMnuid());
      setgxTv_SdtTMENUNIVEL1_Mnutxt(struct.getMnutxt());
      setgxTv_SdtTMENUNIVEL1_Mnuop(struct.getMnuop());
      setgxTv_SdtTMENUNIVEL1_Mnupgm(struct.getMnupgm());
      setgxTv_SdtTMENUNIVEL1_Mnupgmweb(struct.getMnupgmweb());
      setgxTv_SdtTMENUNIVEL1_Mnupgmtpo(struct.getMnupgmtpo());
      setgxTv_SdtTMENUNIVEL1_Mnupgmtxt(struct.getMnupgmtxt());
      setgxTv_SdtTMENUNIVEL1_Mode(struct.getMode());
      setgxTv_SdtTMENUNIVEL1_Initialized(struct.getInitialized());
      setgxTv_SdtTMENUNIVEL1_Mnuid_Z(struct.getMnuid_Z());
      setgxTv_SdtTMENUNIVEL1_Mnutxt_Z(struct.getMnutxt_Z());
      setgxTv_SdtTMENUNIVEL1_Mnuop_Z(struct.getMnuop_Z());
      setgxTv_SdtTMENUNIVEL1_Mnupgm_Z(struct.getMnupgm_Z());
      setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z(struct.getMnupgmweb_Z());
      setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z(struct.getMnupgmtpo_Z());
      setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z(struct.getMnupgmtxt_Z());
      setgxTv_SdtTMENUNIVEL1_Mnutxt_N(struct.getMnutxt_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTMENUNIVEL1 getStruct( )
   {
      app.StructSdtTMENUNIVEL1 struct = new app.StructSdtTMENUNIVEL1 ();
      struct.setMnuid(getgxTv_SdtTMENUNIVEL1_Mnuid());
      struct.setMnutxt(getgxTv_SdtTMENUNIVEL1_Mnutxt());
      struct.setMnuop(getgxTv_SdtTMENUNIVEL1_Mnuop());
      struct.setMnupgm(getgxTv_SdtTMENUNIVEL1_Mnupgm());
      struct.setMnupgmweb(getgxTv_SdtTMENUNIVEL1_Mnupgmweb());
      struct.setMnupgmtpo(getgxTv_SdtTMENUNIVEL1_Mnupgmtpo());
      struct.setMnupgmtxt(getgxTv_SdtTMENUNIVEL1_Mnupgmtxt());
      struct.setMode(getgxTv_SdtTMENUNIVEL1_Mode());
      struct.setInitialized(getgxTv_SdtTMENUNIVEL1_Initialized());
      struct.setMnuid_Z(getgxTv_SdtTMENUNIVEL1_Mnuid_Z());
      struct.setMnutxt_Z(getgxTv_SdtTMENUNIVEL1_Mnutxt_Z());
      struct.setMnuop_Z(getgxTv_SdtTMENUNIVEL1_Mnuop_Z());
      struct.setMnupgm_Z(getgxTv_SdtTMENUNIVEL1_Mnupgm_Z());
      struct.setMnupgmweb_Z(getgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z());
      struct.setMnupgmtpo_Z(getgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z());
      struct.setMnupgmtxt_Z(getgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z());
      struct.setMnutxt_N(getgxTv_SdtTMENUNIVEL1_Mnutxt_N());
      return struct ;
   }

   private byte gxTv_SdtTMENUNIVEL1_N ;
   private byte gxTv_SdtTMENUNIVEL1_Mnuop ;
   private byte gxTv_SdtTMENUNIVEL1_Mnuop_Z ;
   private byte gxTv_SdtTMENUNIVEL1_Mnutxt_N ;
   private short gxTv_SdtTMENUNIVEL1_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTMENUNIVEL1_Mnuid ;
   private String gxTv_SdtTMENUNIVEL1_Mnutxt ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgm ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmtpo ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmtxt ;
   private String gxTv_SdtTMENUNIVEL1_Mode ;
   private String gxTv_SdtTMENUNIVEL1_Mnuid_Z ;
   private String gxTv_SdtTMENUNIVEL1_Mnutxt_Z ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgm_Z ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmweb ;
   private String gxTv_SdtTMENUNIVEL1_Mnupgmweb_Z ;
}

