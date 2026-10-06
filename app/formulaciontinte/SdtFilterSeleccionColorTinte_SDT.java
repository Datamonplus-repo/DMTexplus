package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterSeleccionColorTinte_SDT extends GxUserType
{
   public SdtFilterSeleccionColorTinte_SDT( )
   {
      this(  new ModelContext(SdtFilterSeleccionColorTinte_SDT.class));
   }

   public SdtFilterSeleccionColorTinte_SDT( ModelContext context )
   {
      super( context, "SdtFilterSeleccionColorTinte_SDT");
   }

   public SdtFilterSeleccionColorTinte_SDT( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterSeleccionColorTinte_SDT");
   }

   public SdtFilterSeleccionColorTinte_SDT( StructSdtFilterSeleccionColorTinte_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forser") )
            {
               gxTv_SdtFilterSeleccionColorTinte_SDT_Forser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnom") )
            {
               gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnum") )
            {
               gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipcolcod") )
            {
               gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "FilterSeleccionColorTinte_SDT" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forser", gxTv_SdtFilterSeleccionColorTinte_SDT_Forser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnom", gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnum", GXutil.trim( GXutil.str( gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipcolcod", GXutil.trim( GXutil.str( gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod, 2, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod, false, false);
      AddObjectProperty("Forser", gxTv_SdtFilterSeleccionColorTinte_SDT_Forser, false, false);
      AddObjectProperty("Forcolnom", gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom, false, false);
      AddObjectProperty("Forcolnum", gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum, false, false);
      AddObjectProperty("Tipcolcod", gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod, false, false);
   }

   public int getgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod ;
   }

   public void setgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod( int value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod = value ;
   }

   public String getgxTv_SdtFilterSeleccionColorTinte_SDT_Forser( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forser ;
   }

   public void setgxTv_SdtFilterSeleccionColorTinte_SDT_Forser( String value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forser = value ;
   }

   public String getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom ;
   }

   public void setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom( String value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom = value ;
   }

   public int getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum ;
   }

   public void setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum( int value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum = value ;
   }

   public byte getgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod ;
   }

   public void setgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod( byte value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(1) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forser = "" ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_N ;
   }

   public app.formulaciontinte.SdtFilterSeleccionColorTinte_SDT Clone( )
   {
      return (app.formulaciontinte.SdtFilterSeleccionColorTinte_SDT)(clone()) ;
   }

   public void setStruct( app.formulaciontinte.StructSdtFilterSeleccionColorTinte_SDT struct )
   {
      setgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod(struct.getClicod());
      setgxTv_SdtFilterSeleccionColorTinte_SDT_Forser(struct.getForser());
      setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom(struct.getForcolnom());
      setgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum(struct.getForcolnum());
      setgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod(struct.getTipcolcod());
   }

   @SuppressWarnings("unchecked")
   public app.formulaciontinte.StructSdtFilterSeleccionColorTinte_SDT getStruct( )
   {
      app.formulaciontinte.StructSdtFilterSeleccionColorTinte_SDT struct = new app.formulaciontinte.StructSdtFilterSeleccionColorTinte_SDT ();
      struct.setClicod(getgxTv_SdtFilterSeleccionColorTinte_SDT_Clicod());
      struct.setForser(getgxTv_SdtFilterSeleccionColorTinte_SDT_Forser());
      struct.setForcolnom(getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom());
      struct.setForcolnum(getgxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum());
      struct.setTipcolcod(getgxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod());
      return struct ;
   }

   protected byte gxTv_SdtFilterSeleccionColorTinte_SDT_N ;
   protected byte gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod ;
   protected int gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum ;
   protected String gxTv_SdtFilterSeleccionColorTinte_SDT_Forser ;
   protected String gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

