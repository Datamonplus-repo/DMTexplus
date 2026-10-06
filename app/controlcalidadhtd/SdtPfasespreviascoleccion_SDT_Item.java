package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPfasespreviascoleccion_SDT_Item extends GxUserType
{
   public SdtPfasespreviascoleccion_SDT_Item( )
   {
      this(  new ModelContext(SdtPfasespreviascoleccion_SDT_Item.class));
   }

   public SdtPfasespreviascoleccion_SDT_Item( ModelContext context )
   {
      super( context, "SdtPfasespreviascoleccion_SDT_Item");
   }

   public SdtPfasespreviascoleccion_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtPfasespreviascoleccion_SDT_Item");
   }

   public SdtPfasespreviascoleccion_SDT_Item( StructSdtPfasespreviascoleccion_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FaseDescripcion") )
            {
               gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion = oReader.getValue() ;
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
         sName = "Pfasespreviascoleccion_SDT.Item" ;
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
      oWriter.writeElement("FaseDescripcion", gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("FaseDescripcion", gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion, false, false);
   }

   public String getgxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion( )
   {
      return gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion ;
   }

   public void setgxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion( String value )
   {
      gxTv_SdtPfasespreviascoleccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion = "" ;
      gxTv_SdtPfasespreviascoleccion_SDT_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPfasespreviascoleccion_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtPfasespreviascoleccion_SDT_Item struct )
   {
      setgxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion(struct.getFasedescripcion());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtPfasespreviascoleccion_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtPfasespreviascoleccion_SDT_Item struct = new app.controlcalidadhtd.StructSdtPfasespreviascoleccion_SDT_Item ();
      struct.setFasedescripcion(getgxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion());
      return struct ;
   }

   protected byte gxTv_SdtPfasespreviascoleccion_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

