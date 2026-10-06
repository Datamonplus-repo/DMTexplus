package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientes extends GxUserType
{
   public SdtSDTClientes( )
   {
      this(  new ModelContext(SdtSDTClientes.class));
   }

   public SdtSDTClientes( ModelContext context )
   {
      super( context, "SdtSDTClientes");
   }

   public SdtSDTClientes( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientes");
   }

   public SdtSDTClientes( StructSdtSDTClientes struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTClientes_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosReoperados") )
            {
               gxTv_SdtSDTClientes_Kilosreoperados = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosReoperados") )
            {
               gxTv_SdtSDTClientes_Metrosreoperados = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTClientes" ;
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
      oWriter.writeElement("CliNom", gxTv_SdtSDTClientes_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosReoperados", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientes_Kilosreoperados, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosReoperados", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTClientes_Metrosreoperados, 9, 2)));
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
      AddObjectProperty("CliNom", gxTv_SdtSDTClientes_Clinom, false, false);
      AddObjectProperty("KilosReoperados", gxTv_SdtSDTClientes_Kilosreoperados, false, false);
      AddObjectProperty("MetrosReoperados", gxTv_SdtSDTClientes_Metrosreoperados, false, false);
   }

   public String getgxTv_SdtSDTClientes_Clinom( )
   {
      return gxTv_SdtSDTClientes_Clinom ;
   }

   public void setgxTv_SdtSDTClientes_Clinom( String value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientes_Kilosreoperados( )
   {
      return gxTv_SdtSDTClientes_Kilosreoperados ;
   }

   public void setgxTv_SdtSDTClientes_Kilosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Kilosreoperados = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTClientes_Metrosreoperados( )
   {
      return gxTv_SdtSDTClientes_Metrosreoperados ;
   }

   public void setgxTv_SdtSDTClientes_Metrosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Metrosreoperados = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientes_Clinom = "" ;
      gxTv_SdtSDTClientes_N = (byte)(1) ;
      gxTv_SdtSDTClientes_Kilosreoperados = DecimalUtil.ZERO ;
      gxTv_SdtSDTClientes_Metrosreoperados = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientes_N ;
   }

   public app.SdtSDTClientes Clone( )
   {
      return (app.SdtSDTClientes)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientes struct )
   {
      setgxTv_SdtSDTClientes_Clinom(struct.getClinom());
      setgxTv_SdtSDTClientes_Kilosreoperados(struct.getKilosreoperados());
      setgxTv_SdtSDTClientes_Metrosreoperados(struct.getMetrosreoperados());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientes getStruct( )
   {
      app.StructSdtSDTClientes struct = new app.StructSdtSDTClientes ();
      struct.setClinom(getgxTv_SdtSDTClientes_Clinom());
      struct.setKilosreoperados(getgxTv_SdtSDTClientes_Kilosreoperados());
      struct.setMetrosreoperados(getgxTv_SdtSDTClientes_Metrosreoperados());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientes_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTClientes_Kilosreoperados ;
   protected java.math.BigDecimal gxTv_SdtSDTClientes_Metrosreoperados ;
   protected String gxTv_SdtSDTClientes_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

