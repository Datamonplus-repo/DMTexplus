package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDefectos extends GxUserType
{
   public SdtSDTDefectos( )
   {
      this(  new ModelContext(SdtSDTDefectos.class));
   }

   public SdtSDTDefectos( ModelContext context )
   {
      super( context, "SdtSDTDefectos");
   }

   public SdtSDTDefectos( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDefectos");
   }

   public SdtSDTDefectos( StructSdtSDTDefectos struct )
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
               gxTv_SdtSDTDefectos_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroDefectos") )
            {
               gxTv_SdtSDTDefectos_Numerodefectos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosDefectos") )
            {
               gxTv_SdtSDTDefectos_Kilosdefectos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosDefectos") )
            {
               gxTv_SdtSDTDefectos_Metrosdefectos = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTDefectos" ;
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
      oWriter.writeElement("TipDefDsc", gxTv_SdtSDTDefectos_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NumeroDefectos", GXutil.trim( GXutil.str( gxTv_SdtSDTDefectos_Numerodefectos, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosDefectos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDefectos_Kilosdefectos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosDefectos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDefectos_Metrosdefectos, 9, 2)));
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
      AddObjectProperty("TipDefDsc", gxTv_SdtSDTDefectos_Tipdefdsc, false, false);
      AddObjectProperty("NumeroDefectos", gxTv_SdtSDTDefectos_Numerodefectos, false, false);
      AddObjectProperty("KilosDefectos", gxTv_SdtSDTDefectos_Kilosdefectos, false, false);
      AddObjectProperty("MetrosDefectos", gxTv_SdtSDTDefectos_Metrosdefectos, false, false);
   }

   public String getgxTv_SdtSDTDefectos_Tipdefdsc( )
   {
      return gxTv_SdtSDTDefectos_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTDefectos_Tipdefdsc( String value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Tipdefdsc = value ;
   }

   public short getgxTv_SdtSDTDefectos_Numerodefectos( )
   {
      return gxTv_SdtSDTDefectos_Numerodefectos ;
   }

   public void setgxTv_SdtSDTDefectos_Numerodefectos( short value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Numerodefectos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDefectos_Kilosdefectos( )
   {
      return gxTv_SdtSDTDefectos_Kilosdefectos ;
   }

   public void setgxTv_SdtSDTDefectos_Kilosdefectos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Kilosdefectos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDefectos_Metrosdefectos( )
   {
      return gxTv_SdtSDTDefectos_Metrosdefectos ;
   }

   public void setgxTv_SdtSDTDefectos_Metrosdefectos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Metrosdefectos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDefectos_Tipdefdsc = "" ;
      gxTv_SdtSDTDefectos_N = (byte)(1) ;
      gxTv_SdtSDTDefectos_Kilosdefectos = DecimalUtil.ZERO ;
      gxTv_SdtSDTDefectos_Metrosdefectos = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDefectos_N ;
   }

   public app.SdtSDTDefectos Clone( )
   {
      return (app.SdtSDTDefectos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDefectos struct )
   {
      setgxTv_SdtSDTDefectos_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtSDTDefectos_Numerodefectos(struct.getNumerodefectos());
      setgxTv_SdtSDTDefectos_Kilosdefectos(struct.getKilosdefectos());
      setgxTv_SdtSDTDefectos_Metrosdefectos(struct.getMetrosdefectos());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDefectos getStruct( )
   {
      app.StructSdtSDTDefectos struct = new app.StructSdtSDTDefectos ();
      struct.setTipdefdsc(getgxTv_SdtSDTDefectos_Tipdefdsc());
      struct.setNumerodefectos(getgxTv_SdtSDTDefectos_Numerodefectos());
      struct.setKilosdefectos(getgxTv_SdtSDTDefectos_Kilosdefectos());
      struct.setMetrosdefectos(getgxTv_SdtSDTDefectos_Metrosdefectos());
      return struct ;
   }

   protected byte gxTv_SdtSDTDefectos_N ;
   protected short gxTv_SdtSDTDefectos_Numerodefectos ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTDefectos_Kilosdefectos ;
   protected java.math.BigDecimal gxTv_SdtSDTDefectos_Metrosdefectos ;
   protected String gxTv_SdtSDTDefectos_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

