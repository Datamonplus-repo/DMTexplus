package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTrabajoExterno_Fases_n_SDT_Item extends GxUserType
{
   public SdtTrabajoExterno_Fases_n_SDT_Item( )
   {
      this(  new ModelContext(SdtTrabajoExterno_Fases_n_SDT_Item.class));
   }

   public SdtTrabajoExterno_Fases_n_SDT_Item( ModelContext context )
   {
      super( context, "SdtTrabajoExterno_Fases_n_SDT_Item");
   }

   public SdtTrabajoExterno_Fases_n_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtTrabajoExterno_Fases_n_SDT_Item");
   }

   public SdtTrabajoExterno_Fases_n_SDT_Item( StructSdtTrabajoExterno_Fases_n_SDT_Item struct )
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
               gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procod") )
            {
               gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarOrdlin") )
            {
               gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc = oReader.getValue() ;
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
         sName = "TrabajoExterno_Fases_n_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procod", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarOrdlin", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc);
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
      AddObjectProperty("Seleccionar", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Procod", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod, false, false);
      AddObjectProperty("BarOrdlin", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin, false, false);
      AddObjectProperty("Fascod", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc, false, false);
   }

   public boolean getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod ;
   }

   public void setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin ;
   }

   public void setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin( short value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod = "" ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod = "" ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N ;
   }

   public app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item Clone( )
   {
      return (app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)(clone()) ;
   }

   public void setStruct( app.trabajosexternos.StructSdtTrabajoExterno_Fases_n_SDT_Item struct )
   {
      setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod(struct.getProcod());
      setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin(struct.getBarordlin());
      setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc(struct.getFasdsc());
   }

   @SuppressWarnings("unchecked")
   public app.trabajosexternos.StructSdtTrabajoExterno_Fases_n_SDT_Item getStruct( )
   {
      app.trabajosexternos.StructSdtTrabajoExterno_Fases_n_SDT_Item struct = new app.trabajosexternos.StructSdtTrabajoExterno_Fases_n_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar());
      struct.setProcod(getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod());
      struct.setBarordlin(getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin());
      struct.setFascod(getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc());
      return struct ;
   }

   protected byte gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N ;
   protected short gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

