package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTIPART extends GxSilentTrnSdt
{
   public SdtTTIPART( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTIPART.class));
   }

   public SdtTTIPART( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTTIPART");
      initialize( remoteHandle) ;
   }

   public SdtTTIPART( int remoteHandle ,
                      StructSdtTTIPART struct )
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
                     short AV829TipArtCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Short.valueOf(AV829TipArtCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"TipArtCod", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TTIPART");
      metadata.set("BT", "TXPTIPART");
      metadata.set("PK", "[ \"TipArtCod\" ]");
      metadata.set("PKAssigned", "[ \"TipArtCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtTTIPART_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod") )
            {
               gxTv_SdtTTIPART_Tipartcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtTTIPART_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2") )
            {
               gxTv_SdtTTIPART_Tipartdsc2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtClas") )
            {
               gxTv_SdtTTIPART_Tipartclas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCtb") )
            {
               gxTv_SdtTTIPART_Tipartctb = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtProd") )
            {
               gxTv_SdtTTIPART_Tipartprod = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDias") )
            {
               gxTv_SdtTTIPART_Tipartdias = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtEst") )
            {
               gxTv_SdtTTIPART_Tipartest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtOrd") )
            {
               gxTv_SdtTTIPART_Tipartord = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtAct") )
            {
               gxTv_SdtTTIPART_Tipartact = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCodDsc") )
            {
               gxTv_SdtTTIPART_Tipartcoddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID_TipArtDsc") )
            {
               gxTv_SdtTTIPART_Id_tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTIPART_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTIPART_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTTIPART_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod_Z") )
            {
               gxTv_SdtTTIPART_Tipartcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc_Z") )
            {
               gxTv_SdtTTIPART_Tipartdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2_Z") )
            {
               gxTv_SdtTTIPART_Tipartdsc2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtClas_Z") )
            {
               gxTv_SdtTTIPART_Tipartclas_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCtb_Z") )
            {
               gxTv_SdtTTIPART_Tipartctb_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtProd_Z") )
            {
               gxTv_SdtTTIPART_Tipartprod_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDias_Z") )
            {
               gxTv_SdtTTIPART_Tipartdias_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtEst_Z") )
            {
               gxTv_SdtTTIPART_Tipartest_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtOrd_Z") )
            {
               gxTv_SdtTTIPART_Tipartord_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtAct_Z") )
            {
               gxTv_SdtTTIPART_Tipartact_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCodDsc_Z") )
            {
               gxTv_SdtTTIPART_Tipartcoddsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID_TipArtDsc_Z") )
            {
               gxTv_SdtTTIPART_Id_tipartdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod_N") )
            {
               gxTv_SdtTTIPART_Tipartcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc_N") )
            {
               gxTv_SdtTTIPART_Tipartdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2_N") )
            {
               gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtClas_N") )
            {
               gxTv_SdtTTIPART_Tipartclas_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCtb_N") )
            {
               gxTv_SdtTTIPART_Tipartctb_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtProd_N") )
            {
               gxTv_SdtTTIPART_Tipartprod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDias_N") )
            {
               gxTv_SdtTTIPART_Tipartdias_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtEst_N") )
            {
               gxTv_SdtTTIPART_Tipartest_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtOrd_N") )
            {
               gxTv_SdtTTIPART_Tipartord_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TTIPART" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTTIPART_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtCod", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtTTIPART_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc2", gxTv_SdtTTIPART_Tipartdsc2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtClas", gxTv_SdtTTIPART_Tipartclas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtCtb", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartctb, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtProd", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTIPART_Tipartprod, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDias", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartdias, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtEst", gxTv_SdtTTIPART_Tipartest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtOrd", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartord, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtAct", gxTv_SdtTTIPART_Tipartact);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtCodDsc", gxTv_SdtTTIPART_Tipartcoddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ID_TipArtDsc", gxTv_SdtTTIPART_Id_tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTIPART_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTTIPART_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc_Z", gxTv_SdtTTIPART_Tipartdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc2_Z", gxTv_SdtTTIPART_Tipartdsc2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtClas_Z", gxTv_SdtTTIPART_Tipartclas_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCtb_Z", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartctb_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtProd_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTIPART_Tipartprod_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDias_Z", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartdias_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtEst_Z", gxTv_SdtTTIPART_Tipartest_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtOrd_Z", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartord_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtAct_Z", gxTv_SdtTTIPART_Tipartact_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCodDsc_Z", gxTv_SdtTTIPART_Tipartcoddsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ID_TipArtDsc_Z", gxTv_SdtTTIPART_Id_tipartdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCod_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc2_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartdsc2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtClas_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartclas_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCtb_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartctb_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtProd_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartprod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDias_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartdias_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtEst_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartest_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtOrd_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPART_Tipartord_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTTIPART_Emprcod, false, includeNonInitialized);
      AddObjectProperty("TipArtCod", gxTv_SdtTTIPART_Tipartcod, false, includeNonInitialized);
      AddObjectProperty("TipArtCod_N", gxTv_SdtTTIPART_Tipartcod_N, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc", gxTv_SdtTTIPART_Tipartdsc, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc_N", gxTv_SdtTTIPART_Tipartdsc_N, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc2", gxTv_SdtTTIPART_Tipartdsc2, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc2_N", gxTv_SdtTTIPART_Tipartdsc2_N, false, includeNonInitialized);
      AddObjectProperty("TipArtClas", gxTv_SdtTTIPART_Tipartclas, false, includeNonInitialized);
      AddObjectProperty("TipArtClas_N", gxTv_SdtTTIPART_Tipartclas_N, false, includeNonInitialized);
      AddObjectProperty("TipArtCtb", gxTv_SdtTTIPART_Tipartctb, false, includeNonInitialized);
      AddObjectProperty("TipArtCtb_N", gxTv_SdtTTIPART_Tipartctb_N, false, includeNonInitialized);
      AddObjectProperty("TipArtProd", gxTv_SdtTTIPART_Tipartprod, false, includeNonInitialized);
      AddObjectProperty("TipArtProd_N", gxTv_SdtTTIPART_Tipartprod_N, false, includeNonInitialized);
      AddObjectProperty("TipArtDias", gxTv_SdtTTIPART_Tipartdias, false, includeNonInitialized);
      AddObjectProperty("TipArtDias_N", gxTv_SdtTTIPART_Tipartdias_N, false, includeNonInitialized);
      AddObjectProperty("TipArtEst", gxTv_SdtTTIPART_Tipartest, false, includeNonInitialized);
      AddObjectProperty("TipArtEst_N", gxTv_SdtTTIPART_Tipartest_N, false, includeNonInitialized);
      AddObjectProperty("TipArtOrd", gxTv_SdtTTIPART_Tipartord, false, includeNonInitialized);
      AddObjectProperty("TipArtOrd_N", gxTv_SdtTTIPART_Tipartord_N, false, includeNonInitialized);
      AddObjectProperty("TipArtAct", gxTv_SdtTTIPART_Tipartact, false, includeNonInitialized);
      AddObjectProperty("TipArtCodDsc", gxTv_SdtTTIPART_Tipartcoddsc, false, includeNonInitialized);
      AddObjectProperty("ID_TipArtDsc", gxTv_SdtTTIPART_Id_tipartdsc, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTIPART_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTIPART_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTTIPART_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtCod_Z", gxTv_SdtTTIPART_Tipartcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc_Z", gxTv_SdtTTIPART_Tipartdsc_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc2_Z", gxTv_SdtTTIPART_Tipartdsc2_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtClas_Z", gxTv_SdtTTIPART_Tipartclas_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtCtb_Z", gxTv_SdtTTIPART_Tipartctb_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtProd_Z", gxTv_SdtTTIPART_Tipartprod_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtDias_Z", gxTv_SdtTTIPART_Tipartdias_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtEst_Z", gxTv_SdtTTIPART_Tipartest_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtOrd_Z", gxTv_SdtTTIPART_Tipartord_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtAct_Z", gxTv_SdtTTIPART_Tipartact_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtCodDsc_Z", gxTv_SdtTTIPART_Tipartcoddsc_Z, false, includeNonInitialized);
         AddObjectProperty("ID_TipArtDsc_Z", gxTv_SdtTTIPART_Id_tipartdsc_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtCod_N", gxTv_SdtTTIPART_Tipartcod_N, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc_N", gxTv_SdtTTIPART_Tipartdsc_N, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc2_N", gxTv_SdtTTIPART_Tipartdsc2_N, false, includeNonInitialized);
         AddObjectProperty("TipArtClas_N", gxTv_SdtTTIPART_Tipartclas_N, false, includeNonInitialized);
         AddObjectProperty("TipArtCtb_N", gxTv_SdtTTIPART_Tipartctb_N, false, includeNonInitialized);
         AddObjectProperty("TipArtProd_N", gxTv_SdtTTIPART_Tipartprod_N, false, includeNonInitialized);
         AddObjectProperty("TipArtDias_N", gxTv_SdtTTIPART_Tipartdias_N, false, includeNonInitialized);
         AddObjectProperty("TipArtEst_N", gxTv_SdtTTIPART_Tipartest_N, false, includeNonInitialized);
         AddObjectProperty("TipArtOrd_N", gxTv_SdtTTIPART_Tipartord_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTTIPART sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Emprcod = sdt.getgxTv_SdtTTIPART_Emprcod() ;
      }
      if ( sdt.IsDirty("TipArtCod") )
      {
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartcod = sdt.getgxTv_SdtTTIPART_Tipartcod() ;
      }
      if ( sdt.IsDirty("TipArtDsc") )
      {
         gxTv_SdtTTIPART_Tipartdsc_N = sdt.getgxTv_SdtTTIPART_Tipartdsc_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartdsc = sdt.getgxTv_SdtTTIPART_Tipartdsc() ;
      }
      if ( sdt.IsDirty("TipArtDsc2") )
      {
         gxTv_SdtTTIPART_Tipartdsc2_N = sdt.getgxTv_SdtTTIPART_Tipartdsc2_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartdsc2 = sdt.getgxTv_SdtTTIPART_Tipartdsc2() ;
      }
      if ( sdt.IsDirty("TipArtClas") )
      {
         gxTv_SdtTTIPART_Tipartclas_N = sdt.getgxTv_SdtTTIPART_Tipartclas_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartclas = sdt.getgxTv_SdtTTIPART_Tipartclas() ;
      }
      if ( sdt.IsDirty("TipArtCtb") )
      {
         gxTv_SdtTTIPART_Tipartctb_N = sdt.getgxTv_SdtTTIPART_Tipartctb_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartctb = sdt.getgxTv_SdtTTIPART_Tipartctb() ;
      }
      if ( sdt.IsDirty("TipArtProd") )
      {
         gxTv_SdtTTIPART_Tipartprod_N = sdt.getgxTv_SdtTTIPART_Tipartprod_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartprod = sdt.getgxTv_SdtTTIPART_Tipartprod() ;
      }
      if ( sdt.IsDirty("TipArtDias") )
      {
         gxTv_SdtTTIPART_Tipartdias_N = sdt.getgxTv_SdtTTIPART_Tipartdias_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartdias = sdt.getgxTv_SdtTTIPART_Tipartdias() ;
      }
      if ( sdt.IsDirty("TipArtEst") )
      {
         gxTv_SdtTTIPART_Tipartest_N = sdt.getgxTv_SdtTTIPART_Tipartest_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartest = sdt.getgxTv_SdtTTIPART_Tipartest() ;
      }
      if ( sdt.IsDirty("TipArtOrd") )
      {
         gxTv_SdtTTIPART_Tipartord_N = sdt.getgxTv_SdtTTIPART_Tipartord_N() ;
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartord = sdt.getgxTv_SdtTTIPART_Tipartord() ;
      }
      if ( sdt.IsDirty("TipArtAct") )
      {
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartact = sdt.getgxTv_SdtTTIPART_Tipartact() ;
      }
      if ( sdt.IsDirty("TipArtCodDsc") )
      {
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Tipartcoddsc = sdt.getgxTv_SdtTTIPART_Tipartcoddsc() ;
      }
      if ( sdt.IsDirty("ID_TipArtDsc") )
      {
         gxTv_SdtTTIPART_N = (byte)(0) ;
         gxTv_SdtTTIPART_Id_tipartdsc = sdt.getgxTv_SdtTTIPART_Id_tipartdsc() ;
      }
   }

   public String getgxTv_SdtTTIPART_Emprcod( )
   {
      return gxTv_SdtTTIPART_Emprcod ;
   }

   public void setgxTv_SdtTTIPART_Emprcod( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTIPART_Emprcod, value) != 0 )
      {
         gxTv_SdtTTIPART_Mode = "INS" ;
         this.setgxTv_SdtTTIPART_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartcod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdsc_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdsc2_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartclas_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartctb_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartprod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdias_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartest_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartord_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartact_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartcoddsc_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Id_tipartdsc_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTTIPART_Emprcod = value ;
   }

   public short getgxTv_SdtTTIPART_Tipartcod( )
   {
      return gxTv_SdtTTIPART_Tipartcod ;
   }

   public void setgxTv_SdtTTIPART_Tipartcod( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      if ( gxTv_SdtTTIPART_Tipartcod != value )
      {
         gxTv_SdtTTIPART_Mode = "INS" ;
         this.setgxTv_SdtTTIPART_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartcod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdsc_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdsc2_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartclas_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartctb_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartprod_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartdias_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartest_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartord_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartact_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Tipartcoddsc_Z_SetNull( );
         this.setgxTv_SdtTTIPART_Id_tipartdsc_Z_SetNull( );
      }
      SetDirty("Tipartcod");
      gxTv_SdtTTIPART_Tipartcod = value ;
   }

   public String getgxTv_SdtTTIPART_Tipartdsc( )
   {
      return gxTv_SdtTTIPART_Tipartdsc ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc( String value )
   {
      gxTv_SdtTTIPART_Tipartdsc_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc");
      gxTv_SdtTTIPART_Tipartdsc = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdsc = "" ;
      SetDirty("Tipartdsc");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartdsc_N==1) ;
   }

   public String getgxTv_SdtTTIPART_Tipartdsc2( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2 ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2( String value )
   {
      gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc2");
      gxTv_SdtTTIPART_Tipartdsc2 = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdsc2 = "" ;
      SetDirty("Tipartdsc2");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc2_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartdsc2_N==1) ;
   }

   public String getgxTv_SdtTTIPART_Tipartclas( )
   {
      return gxTv_SdtTTIPART_Tipartclas ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas( String value )
   {
      gxTv_SdtTTIPART_Tipartclas_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartclas");
      gxTv_SdtTTIPART_Tipartclas = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartclas_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartclas = "" ;
      SetDirty("Tipartclas");
   }

   public boolean getgxTv_SdtTTIPART_Tipartclas_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartclas_N==1) ;
   }

   public byte getgxTv_SdtTTIPART_Tipartctb( )
   {
      return gxTv_SdtTTIPART_Tipartctb ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb( byte value )
   {
      gxTv_SdtTTIPART_Tipartctb_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartctb");
      gxTv_SdtTTIPART_Tipartctb = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartctb_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartctb = (byte)(0) ;
      SetDirty("Tipartctb");
   }

   public boolean getgxTv_SdtTTIPART_Tipartctb_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartctb_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTTIPART_Tipartprod( )
   {
      return gxTv_SdtTTIPART_Tipartprod ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod( java.math.BigDecimal value )
   {
      gxTv_SdtTTIPART_Tipartprod_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartprod");
      gxTv_SdtTTIPART_Tipartprod = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartprod_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartprod = DecimalUtil.ZERO ;
      SetDirty("Tipartprod");
   }

   public boolean getgxTv_SdtTTIPART_Tipartprod_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartprod_N==1) ;
   }

   public short getgxTv_SdtTTIPART_Tipartdias( )
   {
      return gxTv_SdtTTIPART_Tipartdias ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias( short value )
   {
      gxTv_SdtTTIPART_Tipartdias_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdias");
      gxTv_SdtTTIPART_Tipartdias = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdias_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdias = (short)(0) ;
      SetDirty("Tipartdias");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdias_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartdias_N==1) ;
   }

   public String getgxTv_SdtTTIPART_Tipartest( )
   {
      return gxTv_SdtTTIPART_Tipartest ;
   }

   public void setgxTv_SdtTTIPART_Tipartest( String value )
   {
      gxTv_SdtTTIPART_Tipartest_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartest");
      gxTv_SdtTTIPART_Tipartest = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartest_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartest_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartest = "" ;
      SetDirty("Tipartest");
   }

   public boolean getgxTv_SdtTTIPART_Tipartest_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartest_N==1) ;
   }

   public short getgxTv_SdtTTIPART_Tipartord( )
   {
      return gxTv_SdtTTIPART_Tipartord ;
   }

   public void setgxTv_SdtTTIPART_Tipartord( short value )
   {
      gxTv_SdtTTIPART_Tipartord_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartord");
      gxTv_SdtTTIPART_Tipartord = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartord_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartord_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartord = (short)(0) ;
      SetDirty("Tipartord");
   }

   public boolean getgxTv_SdtTTIPART_Tipartord_IsNull( )
   {
      return (gxTv_SdtTTIPART_Tipartord_N==1) ;
   }

   public String getgxTv_SdtTTIPART_Tipartact( )
   {
      return gxTv_SdtTTIPART_Tipartact ;
   }

   public void setgxTv_SdtTTIPART_Tipartact( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartact");
      gxTv_SdtTTIPART_Tipartact = value ;
   }

   public String getgxTv_SdtTTIPART_Tipartcoddsc( )
   {
      return gxTv_SdtTTIPART_Tipartcoddsc ;
   }

   public void setgxTv_SdtTTIPART_Tipartcoddsc( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartcoddsc");
      gxTv_SdtTTIPART_Tipartcoddsc = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartcoddsc_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartcoddsc = "" ;
      SetDirty("Tipartcoddsc");
   }

   public boolean getgxTv_SdtTTIPART_Tipartcoddsc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Id_tipartdsc( )
   {
      return gxTv_SdtTTIPART_Id_tipartdsc ;
   }

   public void setgxTv_SdtTTIPART_Id_tipartdsc( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Id_tipartdsc");
      gxTv_SdtTTIPART_Id_tipartdsc = value ;
   }

   public void setgxTv_SdtTTIPART_Id_tipartdsc_SetNull( )
   {
      gxTv_SdtTTIPART_Id_tipartdsc = "" ;
      SetDirty("Id_tipartdsc");
   }

   public boolean getgxTv_SdtTTIPART_Id_tipartdsc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Mode( )
   {
      return gxTv_SdtTTIPART_Mode ;
   }

   public void setgxTv_SdtTTIPART_Mode( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTIPART_Mode = value ;
   }

   public void setgxTv_SdtTTIPART_Mode_SetNull( )
   {
      gxTv_SdtTTIPART_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTIPART_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPART_Initialized( )
   {
      return gxTv_SdtTTIPART_Initialized ;
   }

   public void setgxTv_SdtTTIPART_Initialized( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTTIPART_Initialized = value ;
   }

   public void setgxTv_SdtTTIPART_Initialized_SetNull( )
   {
      gxTv_SdtTTIPART_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTIPART_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Emprcod_Z( )
   {
      return gxTv_SdtTTIPART_Emprcod_Z ;
   }

   public void setgxTv_SdtTTIPART_Emprcod_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTTIPART_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTTIPART_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPART_Tipartcod_Z( )
   {
      return gxTv_SdtTTIPART_Tipartcod_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartcod_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartcod_Z");
      gxTv_SdtTTIPART_Tipartcod_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartcod_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartcod_Z = (short)(0) ;
      SetDirty("Tipartcod_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartdsc_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdsc_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc_Z");
      gxTv_SdtTTIPART_Tipartdsc_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc_Z = "" ;
      SetDirty("Tipartdsc_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartdsc2_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc2_Z");
      gxTv_SdtTTIPART_Tipartdsc2_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc2_Z = "" ;
      SetDirty("Tipartdsc2_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartclas_Z( )
   {
      return gxTv_SdtTTIPART_Tipartclas_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartclas_Z");
      gxTv_SdtTTIPART_Tipartclas_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartclas_Z = "" ;
      SetDirty("Tipartclas_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartclas_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartctb_Z( )
   {
      return gxTv_SdtTTIPART_Tipartctb_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb_Z( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartctb_Z");
      gxTv_SdtTTIPART_Tipartctb_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartctb_Z = (byte)(0) ;
      SetDirty("Tipartctb_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartctb_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTIPART_Tipartprod_Z( )
   {
      return gxTv_SdtTTIPART_Tipartprod_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartprod_Z");
      gxTv_SdtTTIPART_Tipartprod_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartprod_Z = DecimalUtil.ZERO ;
      SetDirty("Tipartprod_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartprod_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPART_Tipartdias_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdias_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdias_Z");
      gxTv_SdtTTIPART_Tipartdias_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdias_Z = (short)(0) ;
      SetDirty("Tipartdias_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdias_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartest_Z( )
   {
      return gxTv_SdtTTIPART_Tipartest_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartest_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartest_Z");
      gxTv_SdtTTIPART_Tipartest_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartest_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartest_Z = "" ;
      SetDirty("Tipartest_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartest_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPART_Tipartord_Z( )
   {
      return gxTv_SdtTTIPART_Tipartord_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartord_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartord_Z");
      gxTv_SdtTTIPART_Tipartord_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartord_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartord_Z = (short)(0) ;
      SetDirty("Tipartord_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartord_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartact_Z( )
   {
      return gxTv_SdtTTIPART_Tipartact_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartact_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartact_Z");
      gxTv_SdtTTIPART_Tipartact_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartact_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartact_Z = "" ;
      SetDirty("Tipartact_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartact_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Tipartcoddsc_Z( )
   {
      return gxTv_SdtTTIPART_Tipartcoddsc_Z ;
   }

   public void setgxTv_SdtTTIPART_Tipartcoddsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartcoddsc_Z");
      gxTv_SdtTTIPART_Tipartcoddsc_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartcoddsc_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartcoddsc_Z = "" ;
      SetDirty("Tipartcoddsc_Z");
   }

   public boolean getgxTv_SdtTTIPART_Tipartcoddsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPART_Id_tipartdsc_Z( )
   {
      return gxTv_SdtTTIPART_Id_tipartdsc_Z ;
   }

   public void setgxTv_SdtTTIPART_Id_tipartdsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Id_tipartdsc_Z");
      gxTv_SdtTTIPART_Id_tipartdsc_Z = value ;
   }

   public void setgxTv_SdtTTIPART_Id_tipartdsc_Z_SetNull( )
   {
      gxTv_SdtTTIPART_Id_tipartdsc_Z = "" ;
      SetDirty("Id_tipartdsc_Z");
   }

   public boolean getgxTv_SdtTTIPART_Id_tipartdsc_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartcod_N( )
   {
      return gxTv_SdtTTIPART_Tipartcod_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartcod_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartcod_N");
      gxTv_SdtTTIPART_Tipartcod_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartcod_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartcod_N = (byte)(0) ;
      SetDirty("Tipartcod_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartdsc_N( )
   {
      return gxTv_SdtTTIPART_Tipartdsc_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc_N");
      gxTv_SdtTTIPART_Tipartdsc_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc_N = (byte)(0) ;
      SetDirty("Tipartdsc_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartdsc2_N( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdsc2_N");
      gxTv_SdtTTIPART_Tipartdsc2_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdsc2_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(0) ;
      SetDirty("Tipartdsc2_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdsc2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartclas_N( )
   {
      return gxTv_SdtTTIPART_Tipartclas_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartclas_N");
      gxTv_SdtTTIPART_Tipartclas_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartclas_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartclas_N = (byte)(0) ;
      SetDirty("Tipartclas_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartclas_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartctb_N( )
   {
      return gxTv_SdtTTIPART_Tipartctb_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartctb_N");
      gxTv_SdtTTIPART_Tipartctb_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartctb_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartctb_N = (byte)(0) ;
      SetDirty("Tipartctb_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartctb_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartprod_N( )
   {
      return gxTv_SdtTTIPART_Tipartprod_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartprod_N");
      gxTv_SdtTTIPART_Tipartprod_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartprod_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartprod_N = (byte)(0) ;
      SetDirty("Tipartprod_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartprod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartdias_N( )
   {
      return gxTv_SdtTTIPART_Tipartdias_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartdias_N");
      gxTv_SdtTTIPART_Tipartdias_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartdias_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartdias_N = (byte)(0) ;
      SetDirty("Tipartdias_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartdias_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartest_N( )
   {
      return gxTv_SdtTTIPART_Tipartest_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartest_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartest_N");
      gxTv_SdtTTIPART_Tipartest_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartest_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartest_N = (byte)(0) ;
      SetDirty("Tipartest_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartest_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPART_Tipartord_N( )
   {
      return gxTv_SdtTTIPART_Tipartord_N ;
   }

   public void setgxTv_SdtTTIPART_Tipartord_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      SetDirty("Tipartord_N");
      gxTv_SdtTTIPART_Tipartord_N = value ;
   }

   public void setgxTv_SdtTTIPART_Tipartord_N_SetNull( )
   {
      gxTv_SdtTTIPART_Tipartord_N = (byte)(0) ;
      SetDirty("Tipartord_N");
   }

   public boolean getgxTv_SdtTTIPART_Tipartord_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.ttipart_bc obj;
      obj = new app.ttipart_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTTIPART_Emprcod = "" ;
      gxTv_SdtTTIPART_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdsc = "" ;
      gxTv_SdtTTIPART_Tipartdsc2 = "" ;
      gxTv_SdtTTIPART_Tipartclas = "" ;
      gxTv_SdtTTIPART_Tipartprod = DecimalUtil.ZERO ;
      gxTv_SdtTTIPART_Tipartest = "" ;
      gxTv_SdtTTIPART_Tipartact = "" ;
      gxTv_SdtTTIPART_Tipartcoddsc = "" ;
      gxTv_SdtTTIPART_Id_tipartdsc = "" ;
      gxTv_SdtTTIPART_Mode = "" ;
      gxTv_SdtTTIPART_Emprcod_Z = "" ;
      gxTv_SdtTTIPART_Tipartdsc_Z = "" ;
      gxTv_SdtTTIPART_Tipartdsc2_Z = "" ;
      gxTv_SdtTTIPART_Tipartclas_Z = "" ;
      gxTv_SdtTTIPART_Tipartprod_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTIPART_Tipartest_Z = "" ;
      gxTv_SdtTTIPART_Tipartact_Z = "" ;
      gxTv_SdtTTIPART_Tipartcoddsc_Z = "" ;
      gxTv_SdtTTIPART_Id_tipartdsc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTTIPART_N ;
   }

   public app.SdtTTIPART Clone( )
   {
      app.SdtTTIPART sdt;
      app.ttipart_bc obj;
      sdt = (app.SdtTTIPART)(clone()) ;
      obj = (app.ttipart_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTTIPART struct )
   {
      setgxTv_SdtTTIPART_Emprcod(struct.getEmprcod());
      setgxTv_SdtTTIPART_Tipartcod(struct.getTipartcod());
      setgxTv_SdtTTIPART_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtTTIPART_Tipartdsc2(struct.getTipartdsc2());
      setgxTv_SdtTTIPART_Tipartclas(struct.getTipartclas());
      setgxTv_SdtTTIPART_Tipartctb(struct.getTipartctb());
      setgxTv_SdtTTIPART_Tipartprod(struct.getTipartprod());
      setgxTv_SdtTTIPART_Tipartdias(struct.getTipartdias());
      setgxTv_SdtTTIPART_Tipartest(struct.getTipartest());
      setgxTv_SdtTTIPART_Tipartord(struct.getTipartord());
      setgxTv_SdtTTIPART_Tipartact(struct.getTipartact());
      setgxTv_SdtTTIPART_Tipartcoddsc(struct.getTipartcoddsc());
      setgxTv_SdtTTIPART_Id_tipartdsc(struct.getId_tipartdsc());
      setgxTv_SdtTTIPART_Mode(struct.getMode());
      setgxTv_SdtTTIPART_Initialized(struct.getInitialized());
      setgxTv_SdtTTIPART_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTTIPART_Tipartcod_Z(struct.getTipartcod_Z());
      setgxTv_SdtTTIPART_Tipartdsc_Z(struct.getTipartdsc_Z());
      setgxTv_SdtTTIPART_Tipartdsc2_Z(struct.getTipartdsc2_Z());
      setgxTv_SdtTTIPART_Tipartclas_Z(struct.getTipartclas_Z());
      setgxTv_SdtTTIPART_Tipartctb_Z(struct.getTipartctb_Z());
      setgxTv_SdtTTIPART_Tipartprod_Z(struct.getTipartprod_Z());
      setgxTv_SdtTTIPART_Tipartdias_Z(struct.getTipartdias_Z());
      setgxTv_SdtTTIPART_Tipartest_Z(struct.getTipartest_Z());
      setgxTv_SdtTTIPART_Tipartord_Z(struct.getTipartord_Z());
      setgxTv_SdtTTIPART_Tipartact_Z(struct.getTipartact_Z());
      setgxTv_SdtTTIPART_Tipartcoddsc_Z(struct.getTipartcoddsc_Z());
      setgxTv_SdtTTIPART_Id_tipartdsc_Z(struct.getId_tipartdsc_Z());
      setgxTv_SdtTTIPART_Tipartcod_N(struct.getTipartcod_N());
      setgxTv_SdtTTIPART_Tipartdsc_N(struct.getTipartdsc_N());
      setgxTv_SdtTTIPART_Tipartdsc2_N(struct.getTipartdsc2_N());
      setgxTv_SdtTTIPART_Tipartclas_N(struct.getTipartclas_N());
      setgxTv_SdtTTIPART_Tipartctb_N(struct.getTipartctb_N());
      setgxTv_SdtTTIPART_Tipartprod_N(struct.getTipartprod_N());
      setgxTv_SdtTTIPART_Tipartdias_N(struct.getTipartdias_N());
      setgxTv_SdtTTIPART_Tipartest_N(struct.getTipartest_N());
      setgxTv_SdtTTIPART_Tipartord_N(struct.getTipartord_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTTIPART getStruct( )
   {
      app.StructSdtTTIPART struct = new app.StructSdtTTIPART ();
      struct.setEmprcod(getgxTv_SdtTTIPART_Emprcod());
      struct.setTipartcod(getgxTv_SdtTTIPART_Tipartcod());
      struct.setTipartdsc(getgxTv_SdtTTIPART_Tipartdsc());
      struct.setTipartdsc2(getgxTv_SdtTTIPART_Tipartdsc2());
      struct.setTipartclas(getgxTv_SdtTTIPART_Tipartclas());
      struct.setTipartctb(getgxTv_SdtTTIPART_Tipartctb());
      struct.setTipartprod(getgxTv_SdtTTIPART_Tipartprod());
      struct.setTipartdias(getgxTv_SdtTTIPART_Tipartdias());
      struct.setTipartest(getgxTv_SdtTTIPART_Tipartest());
      struct.setTipartord(getgxTv_SdtTTIPART_Tipartord());
      struct.setTipartact(getgxTv_SdtTTIPART_Tipartact());
      struct.setTipartcoddsc(getgxTv_SdtTTIPART_Tipartcoddsc());
      struct.setId_tipartdsc(getgxTv_SdtTTIPART_Id_tipartdsc());
      struct.setMode(getgxTv_SdtTTIPART_Mode());
      struct.setInitialized(getgxTv_SdtTTIPART_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTTIPART_Emprcod_Z());
      struct.setTipartcod_Z(getgxTv_SdtTTIPART_Tipartcod_Z());
      struct.setTipartdsc_Z(getgxTv_SdtTTIPART_Tipartdsc_Z());
      struct.setTipartdsc2_Z(getgxTv_SdtTTIPART_Tipartdsc2_Z());
      struct.setTipartclas_Z(getgxTv_SdtTTIPART_Tipartclas_Z());
      struct.setTipartctb_Z(getgxTv_SdtTTIPART_Tipartctb_Z());
      struct.setTipartprod_Z(getgxTv_SdtTTIPART_Tipartprod_Z());
      struct.setTipartdias_Z(getgxTv_SdtTTIPART_Tipartdias_Z());
      struct.setTipartest_Z(getgxTv_SdtTTIPART_Tipartest_Z());
      struct.setTipartord_Z(getgxTv_SdtTTIPART_Tipartord_Z());
      struct.setTipartact_Z(getgxTv_SdtTTIPART_Tipartact_Z());
      struct.setTipartcoddsc_Z(getgxTv_SdtTTIPART_Tipartcoddsc_Z());
      struct.setId_tipartdsc_Z(getgxTv_SdtTTIPART_Id_tipartdsc_Z());
      struct.setTipartcod_N(getgxTv_SdtTTIPART_Tipartcod_N());
      struct.setTipartdsc_N(getgxTv_SdtTTIPART_Tipartdsc_N());
      struct.setTipartdsc2_N(getgxTv_SdtTTIPART_Tipartdsc2_N());
      struct.setTipartclas_N(getgxTv_SdtTTIPART_Tipartclas_N());
      struct.setTipartctb_N(getgxTv_SdtTTIPART_Tipartctb_N());
      struct.setTipartprod_N(getgxTv_SdtTTIPART_Tipartprod_N());
      struct.setTipartdias_N(getgxTv_SdtTTIPART_Tipartdias_N());
      struct.setTipartest_N(getgxTv_SdtTTIPART_Tipartest_N());
      struct.setTipartord_N(getgxTv_SdtTTIPART_Tipartord_N());
      return struct ;
   }

   private byte gxTv_SdtTTIPART_N ;
   private byte gxTv_SdtTTIPART_Tipartctb ;
   private byte gxTv_SdtTTIPART_Tipartctb_Z ;
   private byte gxTv_SdtTTIPART_Tipartcod_N ;
   private byte gxTv_SdtTTIPART_Tipartdsc_N ;
   private byte gxTv_SdtTTIPART_Tipartdsc2_N ;
   private byte gxTv_SdtTTIPART_Tipartclas_N ;
   private byte gxTv_SdtTTIPART_Tipartctb_N ;
   private byte gxTv_SdtTTIPART_Tipartprod_N ;
   private byte gxTv_SdtTTIPART_Tipartdias_N ;
   private byte gxTv_SdtTTIPART_Tipartest_N ;
   private byte gxTv_SdtTTIPART_Tipartord_N ;
   private short gxTv_SdtTTIPART_Tipartcod ;
   private short gxTv_SdtTTIPART_Tipartdias ;
   private short gxTv_SdtTTIPART_Tipartord ;
   private short gxTv_SdtTTIPART_Initialized ;
   private short gxTv_SdtTTIPART_Tipartcod_Z ;
   private short gxTv_SdtTTIPART_Tipartdias_Z ;
   private short gxTv_SdtTTIPART_Tipartord_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private java.math.BigDecimal gxTv_SdtTTIPART_Tipartprod ;
   private java.math.BigDecimal gxTv_SdtTTIPART_Tipartprod_Z ;
   private String gxTv_SdtTTIPART_Emprcod ;
   private String gxTv_SdtTTIPART_Tipartdsc ;
   private String gxTv_SdtTTIPART_Tipartdsc2 ;
   private String gxTv_SdtTTIPART_Tipartclas ;
   private String gxTv_SdtTTIPART_Tipartest ;
   private String gxTv_SdtTTIPART_Tipartact ;
   private String gxTv_SdtTTIPART_Id_tipartdsc ;
   private String gxTv_SdtTTIPART_Mode ;
   private String gxTv_SdtTTIPART_Emprcod_Z ;
   private String gxTv_SdtTTIPART_Tipartdsc_Z ;
   private String gxTv_SdtTTIPART_Tipartdsc2_Z ;
   private String gxTv_SdtTTIPART_Tipartclas_Z ;
   private String gxTv_SdtTTIPART_Tipartest_Z ;
   private String gxTv_SdtTTIPART_Tipartact_Z ;
   private String gxTv_SdtTTIPART_Id_tipartdsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTTIPART_Tipartcoddsc ;
   private String gxTv_SdtTTIPART_Tipartcoddsc_Z ;
}

