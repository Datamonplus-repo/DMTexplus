package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAbaranesData extends GxUserType
{
   public SdtAbaranesData( )
   {
      this(  new ModelContext(SdtAbaranesData.class));
   }

   public SdtAbaranesData( ModelContext context )
   {
      super( context, "SdtAbaranesData");
   }

   public SdtAbaranesData( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtAbaranesData");
   }

   public SdtAbaranesData( StructSdtAbaranesData struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AuxiliarData") )
            {
               if ( gxTv_SdtAbaranesData_Auxiliardata == null )
               {
                  gxTv_SdtAbaranesData_Auxiliardata = new GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem>(app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem.class, "WizardAuxiliarDataItem", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtAbaranesData_Auxiliardata.readxml(oReader, "AuxiliarData") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "AuxiliarData") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "AbaranesData" ;
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
      if ( gxTv_SdtAbaranesData_Auxiliardata != null )
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
         gxTv_SdtAbaranesData_Auxiliardata.writexml(oWriter, "AuxiliarData", sNameSpace1, sIncludeState);
      }
      oWriter.writeEndElement();
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
      if ( gxTv_SdtAbaranesData_Auxiliardata != null )
      {
         AddObjectProperty("AuxiliarData", gxTv_SdtAbaranesData_Auxiliardata, false, false);
      }
   }

   public GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem> getgxTv_SdtAbaranesData_Auxiliardata( )
   {
      if ( gxTv_SdtAbaranesData_Auxiliardata == null )
      {
         gxTv_SdtAbaranesData_Auxiliardata = new GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem>(app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem.class, "WizardAuxiliarDataItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(0) ;
      gxTv_SdtAbaranesData_N = (byte)(0) ;
      return gxTv_SdtAbaranesData_Auxiliardata ;
   }

   public void setgxTv_SdtAbaranesData_Auxiliardata( GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem> value )
   {
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(0) ;
      gxTv_SdtAbaranesData_N = (byte)(0) ;
      gxTv_SdtAbaranesData_Auxiliardata = value ;
   }

   public void setgxTv_SdtAbaranesData_Auxiliardata_SetNull( )
   {
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(1) ;
      gxTv_SdtAbaranesData_Auxiliardata = null ;
   }

   public boolean getgxTv_SdtAbaranesData_Auxiliardata_IsNull( )
   {
      if ( gxTv_SdtAbaranesData_Auxiliardata == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAbaranesData_Auxiliardata_N( )
   {
      return gxTv_SdtAbaranesData_Auxiliardata_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(1) ;
      gxTv_SdtAbaranesData_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAbaranesData_N ;
   }

   public app.test.SdtAbaranesData Clone( )
   {
      return (app.test.SdtAbaranesData)(clone()) ;
   }

   public void setStruct( app.test.StructSdtAbaranesData struct )
   {
      GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem> gxTv_SdtAbaranesData_Auxiliardata_aux = new GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem>(app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem.class, "WizardAuxiliarDataItem", "TexplusNET", remoteHandle);
      Vector<app.wwpbaseobjects.StructSdtWizardAuxiliarData_WizardAuxiliarDataItem> gxTv_SdtAbaranesData_Auxiliardata_aux1 = struct.getAuxiliardata();
      if (gxTv_SdtAbaranesData_Auxiliardata_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtAbaranesData_Auxiliardata_aux1.size(); i++)
         {
            gxTv_SdtAbaranesData_Auxiliardata_aux.add(new app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem(gxTv_SdtAbaranesData_Auxiliardata_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtAbaranesData_Auxiliardata(gxTv_SdtAbaranesData_Auxiliardata_aux);
   }

   @SuppressWarnings("unchecked")
   public app.test.StructSdtAbaranesData getStruct( )
   {
      app.test.StructSdtAbaranesData struct = new app.test.StructSdtAbaranesData ();
      struct.setAuxiliardata(getgxTv_SdtAbaranesData_Auxiliardata().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtAbaranesData_Auxiliardata_N ;
   protected byte gxTv_SdtAbaranesData_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem> gxTv_SdtAbaranesData_Auxiliardata_aux ;
   protected GXBaseCollection<app.wwpbaseobjects.SdtWizardAuxiliarData_WizardAuxiliarDataItem> gxTv_SdtAbaranesData_Auxiliardata=null ;
}

