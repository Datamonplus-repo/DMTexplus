package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientesDefectos_DefectosItem extends GxUserType
{
   public SdtSDTClientesDefectos_DefectosItem( )
   {
      this(  new ModelContext(SdtSDTClientesDefectos_DefectosItem.class));
   }

   public SdtSDTClientesDefectos_DefectosItem( ModelContext context )
   {
      super( context, "SdtSDTClientesDefectos_DefectosItem");
   }

   public SdtSDTClientesDefectos_DefectosItem( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientesDefectos_DefectosItem");
   }

   public SdtSDTClientesDefectos_DefectosItem( StructSdtSDTClientesDefectos_DefectosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipdefdsc") )
            {
               gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KIlosDefecto") )
            {
               gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosDefecto") )
            {
               gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTClientesDefectos.DefectosItem" ;
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
      oWriter.writeElement("Tipdefdsc", gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KIlosDefecto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosDefecto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto, 9, 2)));
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
      AddObjectProperty("Tipdefdsc", gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc, false, false);
      AddObjectProperty("KIlosDefecto", gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto, false, false);
      AddObjectProperty("MetrosDefecto", gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto, false, false);
   }

   public String getgxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc( String value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto ;
   }

   public void setgxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto ;
   }

   public void setgxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc = "" ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto = DecimalUtil.ZERO ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_N ;
   }

   public app.SdtSDTClientesDefectos_DefectosItem Clone( )
   {
      return (app.SdtSDTClientesDefectos_DefectosItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientesDefectos_DefectosItem struct )
   {
      setgxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto(struct.getKilosdefecto());
      setgxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto(struct.getMetrosdefecto());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientesDefectos_DefectosItem getStruct( )
   {
      app.StructSdtSDTClientesDefectos_DefectosItem struct = new app.StructSdtSDTClientesDefectos_DefectosItem ();
      struct.setTipdefdsc(getgxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc());
      struct.setKilosdefecto(getgxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto());
      struct.setMetrosdefecto(getgxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientesDefectos_DefectosItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto ;
   protected String gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

