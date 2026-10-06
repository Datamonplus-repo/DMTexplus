package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTMermasResumenCliente_ResumenItem extends GxUserType
{
   public SdtSDTMermasResumenCliente_ResumenItem( )
   {
      this(  new ModelContext(SdtSDTMermasResumenCliente_ResumenItem.class));
   }

   public SdtSDTMermasResumenCliente_ResumenItem( ModelContext context )
   {
      super( context, "SdtSDTMermasResumenCliente_ResumenItem");
   }

   public SdtSDTMermasResumenCliente_ResumenItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTMermasResumenCliente_ResumenItem");
   }

   public SdtSDTMermasResumenCliente_ResumenItem( StructSdtSDTMermasResumenCliente_ResumenItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosEnt") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosExp") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DifKilos") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilos") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosEnt") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosExp") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DifMetros") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetros") )
            {
               gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTMermasResumenCliente.ResumenItem" ;
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
      oWriter.writeElement("KilosEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent, 14, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosExp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DifKilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosExp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp, 14, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DifMetros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros, 6, 2)));
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
      AddObjectProperty("KilosEnt", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent, false, false);
      AddObjectProperty("KilosExp", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp, false, false);
      AddObjectProperty("DifKilos", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos, false, false);
      AddObjectProperty("PorKilos", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos, false, false);
      AddObjectProperty("MetrosEnt", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent, false, false);
      AddObjectProperty("MetrosExp", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp, false, false);
      AddObjectProperty("DifMetros", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros, false, false);
      AddObjectProperty("PorMetros", gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_N = (byte)(1) ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros = DecimalUtil.ZERO ;
      gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTMermasResumenCliente_ResumenItem_N ;
   }

   public app.SdtSDTMermasResumenCliente_ResumenItem Clone( )
   {
      return (app.SdtSDTMermasResumenCliente_ResumenItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTMermasResumenCliente_ResumenItem struct )
   {
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent(struct.getKilosent());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp(struct.getKilosexp());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos(struct.getDifkilos());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos(struct.getPorkilos());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent(struct.getMetrosent());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp(struct.getMetrosexp());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros(struct.getDifmetros());
      setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros(struct.getPormetros());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTMermasResumenCliente_ResumenItem getStruct( )
   {
      app.StructSdtSDTMermasResumenCliente_ResumenItem struct = new app.StructSdtSDTMermasResumenCliente_ResumenItem ();
      struct.setKilosent(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent());
      struct.setKilosexp(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp());
      struct.setDifkilos(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos());
      struct.setPorkilos(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos());
      struct.setMetrosent(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent());
      struct.setMetrosexp(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp());
      struct.setDifmetros(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros());
      struct.setPormetros(getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros());
      return struct ;
   }

   protected byte gxTv_SdtSDTMermasResumenCliente_ResumenItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros ;
   protected java.math.BigDecimal gxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

