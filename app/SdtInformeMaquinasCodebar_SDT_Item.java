package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeMaquinasCodebar_SDT_Item extends GxUserType
{
   public SdtInformeMaquinasCodebar_SDT_Item( )
   {
      this(  new ModelContext(SdtInformeMaquinasCodebar_SDT_Item.class));
   }

   public SdtInformeMaquinasCodebar_SDT_Item( ModelContext context )
   {
      super( context, "SdtInformeMaquinasCodebar_SDT_Item");
   }

   public SdtInformeMaquinasCodebar_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeMaquinasCodebar_SDT_Item");
   }

   public SdtInformeMaquinasCodebar_SDT_Item( StructSdtInformeMaquinasCodebar_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqEst") )
            {
               gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest = oReader.getValue() ;
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
         sName = "InformeMaquinasCodebar_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqcod", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqEst", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest);
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
      AddObjectProperty("Seleccionar", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Maqcod", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc, false, false);
      AddObjectProperty("MaqEst", gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest, false, false);
   }

   public boolean getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod ;
   }

   public void setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod = value ;
   }

   public String getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc ;
   }

   public void setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc = value ;
   }

   public String getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest ;
   }

   public void setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(1) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod = "" ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc = "" ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_N ;
   }

   public app.SdtInformeMaquinasCodebar_SDT_Item Clone( )
   {
      return (app.SdtInformeMaquinasCodebar_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtInformeMaquinasCodebar_SDT_Item struct )
   {
      setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod(struct.getMaqcod());
      setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest(struct.getMaqest());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtInformeMaquinasCodebar_SDT_Item getStruct( )
   {
      app.StructSdtInformeMaquinasCodebar_SDT_Item struct = new app.StructSdtInformeMaquinasCodebar_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar());
      struct.setMaqcod(getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod());
      struct.setMaqdsc(getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc());
      struct.setMaqest(getgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest());
      return struct ;
   }

   protected byte gxTv_SdtInformeMaquinasCodebar_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest ;
   protected String sTagName ;
   protected boolean gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

