package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTGridMaquina_SDTGridMaquinaItem extends GxUserType
{
   public SdtSDTGridMaquina_SDTGridMaquinaItem( )
   {
      this(  new ModelContext(SdtSDTGridMaquina_SDTGridMaquinaItem.class));
   }

   public SdtSDTGridMaquina_SDTGridMaquinaItem( ModelContext context )
   {
      super( context, "SdtSDTGridMaquina_SDTGridMaquinaItem");
   }

   public SdtSDTGridMaquina_SDTGridMaquinaItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTGridMaquina_SDTGridMaquinaItem");
   }

   public SdtSDTGridMaquina_SDTGridMaquinaItem( StructSdtSDTGridMaquina_SDTGridMaquinaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Selected") )
            {
               gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tabla_mpreven") )
            {
               gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTGridMaquina.SDTGridMaquinaItem" ;
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
      oWriter.writeElement("Selected", GXutil.booltostr( gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tabla_mpreven", GXutil.trim( GXutil.str( gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Selected", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc, false, false);
      AddObjectProperty("Tabla_mpreven", gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven, false, false);
   }

   public boolean getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected ;
   }

   public void setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected( boolean value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected = value ;
   }

   public String getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod ;
   }

   public void setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod( String value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod = value ;
   }

   public String getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc ;
   }

   public void setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc( String value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc = value ;
   }

   public byte getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven ;
   }

   public void setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven( byte value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(1) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod = "" ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N ;
   }

   public app.SdtSDTGridMaquina_SDTGridMaquinaItem Clone( )
   {
      return (app.SdtSDTGridMaquina_SDTGridMaquinaItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTGridMaquina_SDTGridMaquinaItem struct )
   {
      setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected(struct.getSelected());
      setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven(struct.getTabla_mpreven());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTGridMaquina_SDTGridMaquinaItem getStruct( )
   {
      app.StructSdtSDTGridMaquina_SDTGridMaquinaItem struct = new app.StructSdtSDTGridMaquina_SDTGridMaquinaItem ();
      struct.setSelected(getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected());
      struct.setMaqcod(getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc());
      struct.setTabla_mpreven(getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven());
      return struct ;
   }

   protected byte gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N ;
   protected byte gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod ;
   protected String gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

