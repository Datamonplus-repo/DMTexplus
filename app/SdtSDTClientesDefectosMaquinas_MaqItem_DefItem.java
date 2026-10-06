package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientesDefectosMaquinas_MaqItem_DefItem extends GxUserType
{
   public SdtSDTClientesDefectosMaquinas_MaqItem_DefItem( )
   {
      this(  new ModelContext(SdtSDTClientesDefectosMaquinas_MaqItem_DefItem.class));
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem_DefItem( ModelContext context )
   {
      super( context, "SdtSDTClientesDefectosMaquinas_MaqItem_DefItem");
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem_DefItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientesDefectosMaquinas_MaqItem_DefItem");
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem_DefItem( StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosDefecto") )
            {
               gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosDefecto") )
            {
               gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTClientesDefectosMaquinas.MaqItem.DefItem" ;
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
      oWriter.writeElement("TipDefDsc", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosDefecto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosDefecto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto, 9, 2)));
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
      AddObjectProperty("TipDefDsc", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc, false, false);
      AddObjectProperty("KilosDefecto", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto, false, false);
      AddObjectProperty("MetrosDefecto", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto, false, false);
   }

   public String getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto = DecimalUtil.ZERO ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N ;
   }

   public app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem Clone( )
   {
      return (app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem struct )
   {
      setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto(struct.getKilosdefecto());
      setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto(struct.getMetrosdefecto());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem getStruct( )
   {
      app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem struct = new app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem ();
      struct.setTipdefdsc(getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc());
      struct.setKilosdefecto(getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto());
      struct.setMetrosdefecto(getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

