package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTMRCom extends GxSilentTrnSdt
{
   public SdtTMRCom( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTMRCom.class));
   }

   public SdtTMRCom( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "SdtTMRCom");
      initialize( remoteHandle) ;
   }

   public SdtTMRCom( int remoteHandle ,
                     StructSdtTMRCom struct )
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
                     int AV1061MRPriCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV1061MRPriCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"MRPriCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "MantenimientoMaquina\\TMRCom");
      metadata.set("BT", "TXPMRCom");
      metadata.set("PK", "[ \"EmprCod\",\"MRPriCod\" ]");
      metadata.set("PKAssigned", "[ \"MRPriCod\" ]");
      metadata.set("Levels", "[ \"Level1Item\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"MRCod\" ],\"FKMap\":[ \"MRPriCod-MRCod\" ] } ]");
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
               gxTv_SdtTMRCom_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTMRCom_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPriCod") )
            {
               gxTv_SdtTMRCom_Mrpricod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPriNom") )
            {
               gxTv_SdtTMRCom_Mrprinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtTMRCom_Level1 == null )
               {
                  gxTv_SdtTMRCom_Level1 = new GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item>(app.mantenimientomaquina.SdtTMRCom_Level1Item.class, "TMRCom.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTMRCom_Level1.readxml(oReader, "Level1") ;
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
               gxTv_SdtTMRCom_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTMRCom_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTMRCom_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTMRCom_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPriCod_Z") )
            {
               gxTv_SdtTMRCom_Mrpricod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPriNom_Z") )
            {
               gxTv_SdtTMRCom_Mrprinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTMRCom_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPriNom_N") )
            {
               gxTv_SdtTMRCom_Mrprinom_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TMRCom" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTMRCom_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTMRCom_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPriCod", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Mrpricod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPriNom", gxTv_SdtTMRCom_Mrprinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtTMRCom_Level1 != null )
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
         gxTv_SdtTMRCom_Level1.writexml(oWriter, "Level1", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTMRCom_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTMRCom_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTMRCom_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRPriCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Mrpricod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRPriNom_Z", gxTv_SdtTMRCom_Mrprinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRPriNom_N", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Mrprinom_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTMRCom_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTMRCom_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTMRCom_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("MRPriCod", gxTv_SdtTMRCom_Mrpricod, false, includeNonInitialized);
      AddObjectProperty("MRPriNom", gxTv_SdtTMRCom_Mrprinom, false, includeNonInitialized);
      AddObjectProperty("MRPriNom_N", gxTv_SdtTMRCom_Mrprinom_N, false, includeNonInitialized);
      if ( gxTv_SdtTMRCom_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtTMRCom_Level1, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTMRCom_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTMRCom_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTMRCom_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTMRCom_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("MRPriCod_Z", gxTv_SdtTMRCom_Mrpricod_Z, false, includeNonInitialized);
         AddObjectProperty("MRPriNom_Z", gxTv_SdtTMRCom_Mrprinom_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTMRCom_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("MRPriNom_N", gxTv_SdtTMRCom_Mrprinom_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.mantenimientomaquina.SdtTMRCom sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTMRCom_N = (byte)(0) ;
         gxTv_SdtTMRCom_Emprcod = sdt.getgxTv_SdtTMRCom_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTMRCom_Emprnom_N = sdt.getgxTv_SdtTMRCom_Emprnom_N() ;
         gxTv_SdtTMRCom_N = (byte)(0) ;
         gxTv_SdtTMRCom_Emprnom = sdt.getgxTv_SdtTMRCom_Emprnom() ;
      }
      if ( sdt.IsDirty("MRPriCod") )
      {
         gxTv_SdtTMRCom_N = (byte)(0) ;
         gxTv_SdtTMRCom_Mrpricod = sdt.getgxTv_SdtTMRCom_Mrpricod() ;
      }
      if ( sdt.IsDirty("MRPriNom") )
      {
         gxTv_SdtTMRCom_Mrprinom_N = sdt.getgxTv_SdtTMRCom_Mrprinom_N() ;
         gxTv_SdtTMRCom_N = (byte)(0) ;
         gxTv_SdtTMRCom_Mrprinom = sdt.getgxTv_SdtTMRCom_Mrprinom() ;
      }
      if ( gxTv_SdtTMRCom_Level1 != null )
      {
         GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> newCollectionLevel1 = sdt.getgxTv_SdtTMRCom_Level1();
         app.mantenimientomaquina.SdtTMRCom_Level1Item currItemLevel1;
         app.mantenimientomaquina.SdtTMRCom_Level1Item newItemLevel1;
         short idx = 1;
         while ( idx <= newCollectionLevel1.size() )
         {
            newItemLevel1 = (app.mantenimientomaquina.SdtTMRCom_Level1Item)((app.mantenimientomaquina.SdtTMRCom_Level1Item)newCollectionLevel1.elementAt(-1+idx));
            currItemLevel1 = (app.mantenimientomaquina.SdtTMRCom_Level1Item)gxTv_SdtTMRCom_Level1.getByKey(newItemLevel1.getgxTv_SdtTMRCom_Level1Item_Mrcomcod());
            if ( GXutil.strcmp(currItemLevel1.getgxTv_SdtTMRCom_Level1Item_Mode(), "UPD") == 0 )
            {
               currItemLevel1.updateDirties(newItemLevel1);
               if ( GXutil.strcmp(newItemLevel1.getgxTv_SdtTMRCom_Level1Item_Mode(), "DLT") == 0 )
               {
                  currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Mode( "DLT" );
               }
               currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtTMRCom_Level1.add(newItemLevel1, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtTMRCom_Emprcod( )
   {
      return gxTv_SdtTMRCom_Emprcod ;
   }

   public void setgxTv_SdtTMRCom_Emprcod( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTMRCom_Emprcod, value) != 0 )
      {
         gxTv_SdtTMRCom_Mode = "INS" ;
         this.setgxTv_SdtTMRCom_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Mrpricod_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Mrprinom_Z_SetNull( );
         if ( gxTv_SdtTMRCom_Level1 != null )
         {
            GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> collectionLevel1 = gxTv_SdtTMRCom_Level1;
            app.mantenimientomaquina.SdtTMRCom_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.mantenimientomaquina.SdtTMRCom_Level1Item)((app.mantenimientomaquina.SdtTMRCom_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Emprcod");
      gxTv_SdtTMRCom_Emprcod = value ;
   }

   public String getgxTv_SdtTMRCom_Emprnom( )
   {
      return gxTv_SdtTMRCom_Emprnom ;
   }

   public void setgxTv_SdtTMRCom_Emprnom( String value )
   {
      gxTv_SdtTMRCom_Emprnom_N = (byte)(0) ;
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTMRCom_Emprnom = value ;
   }

   public void setgxTv_SdtTMRCom_Emprnom_SetNull( )
   {
      gxTv_SdtTMRCom_Emprnom_N = (byte)(1) ;
      gxTv_SdtTMRCom_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTMRCom_Emprnom_IsNull( )
   {
      return (gxTv_SdtTMRCom_Emprnom_N==1) ;
   }

   public int getgxTv_SdtTMRCom_Mrpricod( )
   {
      return gxTv_SdtTMRCom_Mrpricod ;
   }

   public void setgxTv_SdtTMRCom_Mrpricod( int value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      if ( gxTv_SdtTMRCom_Mrpricod != value )
      {
         gxTv_SdtTMRCom_Mode = "INS" ;
         this.setgxTv_SdtTMRCom_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Mrpricod_Z_SetNull( );
         this.setgxTv_SdtTMRCom_Mrprinom_Z_SetNull( );
         if ( gxTv_SdtTMRCom_Level1 != null )
         {
            GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> collectionLevel1 = gxTv_SdtTMRCom_Level1;
            app.mantenimientomaquina.SdtTMRCom_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.mantenimientomaquina.SdtTMRCom_Level1Item)((app.mantenimientomaquina.SdtTMRCom_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTMRCom_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Mrpricod");
      gxTv_SdtTMRCom_Mrpricod = value ;
   }

   public String getgxTv_SdtTMRCom_Mrprinom( )
   {
      return gxTv_SdtTMRCom_Mrprinom ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom( String value )
   {
      gxTv_SdtTMRCom_Mrprinom_N = (byte)(0) ;
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Mrprinom");
      gxTv_SdtTMRCom_Mrprinom = value ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom_SetNull( )
   {
      gxTv_SdtTMRCom_Mrprinom_N = (byte)(1) ;
      gxTv_SdtTMRCom_Mrprinom = "" ;
      SetDirty("Mrprinom");
   }

   public boolean getgxTv_SdtTMRCom_Mrprinom_IsNull( )
   {
      return (gxTv_SdtTMRCom_Mrprinom_N==1) ;
   }

   public GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> getgxTv_SdtTMRCom_Level1( )
   {
      if ( gxTv_SdtTMRCom_Level1 == null )
      {
         gxTv_SdtTMRCom_Level1 = new GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item>(app.mantenimientomaquina.SdtTMRCom_Level1Item.class, "TMRCom.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtTMRCom_N = (byte)(0) ;
      return gxTv_SdtTMRCom_Level1 ;
   }

   public void setgxTv_SdtTMRCom_Level1( GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Level1");
      gxTv_SdtTMRCom_Level1 = value ;
   }

   public void setgxTv_SdtTMRCom_Level1_SetNull( )
   {
      gxTv_SdtTMRCom_Level1 = null ;
      SetDirty("Level1");
   }

   public boolean getgxTv_SdtTMRCom_Level1_IsNull( )
   {
      if ( gxTv_SdtTMRCom_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtTMRCom_Mode( )
   {
      return gxTv_SdtTMRCom_Mode ;
   }

   public void setgxTv_SdtTMRCom_Mode( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTMRCom_Mode = value ;
   }

   public void setgxTv_SdtTMRCom_Mode_SetNull( )
   {
      gxTv_SdtTMRCom_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTMRCom_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTMRCom_Initialized( )
   {
      return gxTv_SdtTMRCom_Initialized ;
   }

   public void setgxTv_SdtTMRCom_Initialized( short value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTMRCom_Initialized = value ;
   }

   public void setgxTv_SdtTMRCom_Initialized_SetNull( )
   {
      gxTv_SdtTMRCom_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTMRCom_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMRCom_Emprcod_Z( )
   {
      return gxTv_SdtTMRCom_Emprcod_Z ;
   }

   public void setgxTv_SdtTMRCom_Emprcod_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTMRCom_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTMRCom_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMRCom_Emprnom_Z( )
   {
      return gxTv_SdtTMRCom_Emprnom_Z ;
   }

   public void setgxTv_SdtTMRCom_Emprnom_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTMRCom_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTMRCom_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTMRCom_Mrpricod_Z( )
   {
      return gxTv_SdtTMRCom_Mrpricod_Z ;
   }

   public void setgxTv_SdtTMRCom_Mrpricod_Z( int value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Mrpricod_Z");
      gxTv_SdtTMRCom_Mrpricod_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Mrpricod_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Mrpricod_Z = 0 ;
      SetDirty("Mrpricod_Z");
   }

   public boolean getgxTv_SdtTMRCom_Mrpricod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMRCom_Mrprinom_Z( )
   {
      return gxTv_SdtTMRCom_Mrprinom_Z ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Mrprinom_Z");
      gxTv_SdtTMRCom_Mrprinom_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Mrprinom_Z = "" ;
      SetDirty("Mrprinom_Z");
   }

   public boolean getgxTv_SdtTMRCom_Mrprinom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTMRCom_Emprnom_N( )
   {
      return gxTv_SdtTMRCom_Emprnom_N ;
   }

   public void setgxTv_SdtTMRCom_Emprnom_N( byte value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTMRCom_Emprnom_N = value ;
   }

   public void setgxTv_SdtTMRCom_Emprnom_N_SetNull( )
   {
      gxTv_SdtTMRCom_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTMRCom_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTMRCom_Mrprinom_N( )
   {
      return gxTv_SdtTMRCom_Mrprinom_N ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom_N( byte value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      SetDirty("Mrprinom_N");
      gxTv_SdtTMRCom_Mrprinom_N = value ;
   }

   public void setgxTv_SdtTMRCom_Mrprinom_N_SetNull( )
   {
      gxTv_SdtTMRCom_Mrprinom_N = (byte)(0) ;
      SetDirty("Mrprinom_N");
   }

   public boolean getgxTv_SdtTMRCom_Mrprinom_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.mantenimientomaquina.tmrcom_bc obj;
      obj = new app.mantenimientomaquina.tmrcom_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTMRCom_Emprcod = "" ;
      gxTv_SdtTMRCom_N = (byte)(1) ;
      gxTv_SdtTMRCom_Emprnom = "" ;
      gxTv_SdtTMRCom_Mrprinom = "" ;
      gxTv_SdtTMRCom_Mode = "" ;
      gxTv_SdtTMRCom_Emprcod_Z = "" ;
      gxTv_SdtTMRCom_Emprnom_Z = "" ;
      gxTv_SdtTMRCom_Mrprinom_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTMRCom_N ;
   }

   public app.mantenimientomaquina.SdtTMRCom Clone( )
   {
      app.mantenimientomaquina.SdtTMRCom sdt;
      app.mantenimientomaquina.tmrcom_bc obj;
      sdt = (app.mantenimientomaquina.SdtTMRCom)(clone()) ;
      obj = (app.mantenimientomaquina.tmrcom_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.mantenimientomaquina.StructSdtTMRCom struct )
   {
      setgxTv_SdtTMRCom_Emprcod(struct.getEmprcod());
      setgxTv_SdtTMRCom_Emprnom(struct.getEmprnom());
      setgxTv_SdtTMRCom_Mrpricod(struct.getMrpricod());
      setgxTv_SdtTMRCom_Mrprinom(struct.getMrprinom());
      GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> gxTv_SdtTMRCom_Level1_aux = new GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item>(app.mantenimientomaquina.SdtTMRCom_Level1Item.class, "TMRCom.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.mantenimientomaquina.StructSdtTMRCom_Level1Item> gxTv_SdtTMRCom_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtTMRCom_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtTMRCom_Level1_aux1.size(); i++)
         {
            gxTv_SdtTMRCom_Level1_aux.add(new app.mantenimientomaquina.SdtTMRCom_Level1Item(remoteHandle, gxTv_SdtTMRCom_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtTMRCom_Level1(gxTv_SdtTMRCom_Level1_aux);
      setgxTv_SdtTMRCom_Mode(struct.getMode());
      setgxTv_SdtTMRCom_Initialized(struct.getInitialized());
      setgxTv_SdtTMRCom_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTMRCom_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTMRCom_Mrpricod_Z(struct.getMrpricod_Z());
      setgxTv_SdtTMRCom_Mrprinom_Z(struct.getMrprinom_Z());
      setgxTv_SdtTMRCom_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTMRCom_Mrprinom_N(struct.getMrprinom_N());
   }

   @SuppressWarnings("unchecked")
   public app.mantenimientomaquina.StructSdtTMRCom getStruct( )
   {
      app.mantenimientomaquina.StructSdtTMRCom struct = new app.mantenimientomaquina.StructSdtTMRCom ();
      struct.setEmprcod(getgxTv_SdtTMRCom_Emprcod());
      struct.setEmprnom(getgxTv_SdtTMRCom_Emprnom());
      struct.setMrpricod(getgxTv_SdtTMRCom_Mrpricod());
      struct.setMrprinom(getgxTv_SdtTMRCom_Mrprinom());
      struct.setLevel1(getgxTv_SdtTMRCom_Level1().getStruct());
      struct.setMode(getgxTv_SdtTMRCom_Mode());
      struct.setInitialized(getgxTv_SdtTMRCom_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTMRCom_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTMRCom_Emprnom_Z());
      struct.setMrpricod_Z(getgxTv_SdtTMRCom_Mrpricod_Z());
      struct.setMrprinom_Z(getgxTv_SdtTMRCom_Mrprinom_Z());
      struct.setEmprnom_N(getgxTv_SdtTMRCom_Emprnom_N());
      struct.setMrprinom_N(getgxTv_SdtTMRCom_Mrprinom_N());
      return struct ;
   }

   private byte gxTv_SdtTMRCom_N ;
   private byte gxTv_SdtTMRCom_Emprnom_N ;
   private byte gxTv_SdtTMRCom_Mrprinom_N ;
   private short gxTv_SdtTMRCom_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTMRCom_Mrpricod ;
   private int gxTv_SdtTMRCom_Mrpricod_Z ;
   private String gxTv_SdtTMRCom_Emprcod ;
   private String gxTv_SdtTMRCom_Emprnom ;
   private String gxTv_SdtTMRCom_Mrprinom ;
   private String gxTv_SdtTMRCom_Mode ;
   private String gxTv_SdtTMRCom_Emprcod_Z ;
   private String gxTv_SdtTMRCom_Emprnom_Z ;
   private String gxTv_SdtTMRCom_Mrprinom_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> gxTv_SdtTMRCom_Level1_aux ;
   private GXBCLevelCollection<app.mantenimientomaquina.SdtTMRCom_Level1Item> gxTv_SdtTMRCom_Level1=null ;
}

