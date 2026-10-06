package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtPConCos extends GxUserType
{
   public SdtSdtPConCos( )
   {
      this(  new ModelContext(SdtSdtPConCos.class));
   }

   public SdtSdtPConCos( ModelContext context )
   {
      super( context, "SdtSdtPConCos");
   }

   public SdtSdtPConCos( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtPConCos");
   }

   public SdtSdtPConCos( StructSdtSdtPConCos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdAnyMes") )
            {
               gxTv_SdtSdtPConCos_Prdanymes = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdAny") )
            {
               gxTv_SdtSdtPConCos_Prdany = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumMes") )
            {
               gxTv_SdtSdtPConCos_Prdnummes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniCprM") )
            {
               gxTv_SdtSdtPConCos_Prdunicprm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValCprM") )
            {
               gxTv_SdtSdtPConCos_Prdvalcprm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniConM") )
            {
               gxTv_SdtSdtPConCos_Prduniconm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValConM") )
            {
               gxTv_SdtSdtPConCos_Prdvalconm = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SdtPConCos" ;
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
      oWriter.writeElement("PrdAnyMes", GXutil.trim( GXutil.str( gxTv_SdtSdtPConCos_Prdanymes, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdAny", GXutil.trim( GXutil.str( gxTv_SdtSdtPConCos_Prdany, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNumMes", GXutil.trim( GXutil.str( gxTv_SdtSdtPConCos_Prdnummes, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUniCprM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPConCos_Prdunicprm, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValCprM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPConCos_Prdvalcprm, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUniConM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPConCos_Prduniconm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValConM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPConCos_Prdvalconm, 12, 2)));
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
      AddObjectProperty("PrdAnyMes", gxTv_SdtSdtPConCos_Prdanymes, false, false);
      AddObjectProperty("PrdAny", gxTv_SdtSdtPConCos_Prdany, false, false);
      AddObjectProperty("PrdNumMes", gxTv_SdtSdtPConCos_Prdnummes, false, false);
      AddObjectProperty("PrdUniCprM", gxTv_SdtSdtPConCos_Prdunicprm, false, false);
      AddObjectProperty("PrdValCprM", gxTv_SdtSdtPConCos_Prdvalcprm, false, false);
      AddObjectProperty("PrdUniConM", gxTv_SdtSdtPConCos_Prduniconm, false, false);
      AddObjectProperty("PrdValConM", gxTv_SdtSdtPConCos_Prdvalconm, false, false);
   }

   public int getgxTv_SdtSdtPConCos_Prdanymes( )
   {
      return gxTv_SdtSdtPConCos_Prdanymes ;
   }

   public void setgxTv_SdtSdtPConCos_Prdanymes( int value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdanymes = value ;
   }

   public short getgxTv_SdtSdtPConCos_Prdany( )
   {
      return gxTv_SdtSdtPConCos_Prdany ;
   }

   public void setgxTv_SdtSdtPConCos_Prdany( short value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdany = value ;
   }

   public byte getgxTv_SdtSdtPConCos_Prdnummes( )
   {
      return gxTv_SdtSdtPConCos_Prdnummes ;
   }

   public void setgxTv_SdtSdtPConCos_Prdnummes( byte value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdnummes = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPConCos_Prdunicprm( )
   {
      return gxTv_SdtSdtPConCos_Prdunicprm ;
   }

   public void setgxTv_SdtSdtPConCos_Prdunicprm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdunicprm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPConCos_Prdvalcprm( )
   {
      return gxTv_SdtSdtPConCos_Prdvalcprm ;
   }

   public void setgxTv_SdtSdtPConCos_Prdvalcprm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdvalcprm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPConCos_Prduniconm( )
   {
      return gxTv_SdtSdtPConCos_Prduniconm ;
   }

   public void setgxTv_SdtSdtPConCos_Prduniconm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prduniconm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPConCos_Prdvalconm( )
   {
      return gxTv_SdtSdtPConCos_Prdvalconm ;
   }

   public void setgxTv_SdtSdtPConCos_Prdvalconm( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPConCos_N = (byte)(0) ;
      gxTv_SdtSdtPConCos_Prdvalconm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtPConCos_N = (byte)(1) ;
      gxTv_SdtSdtPConCos_Prdunicprm = DecimalUtil.ZERO ;
      gxTv_SdtSdtPConCos_Prdvalcprm = DecimalUtil.ZERO ;
      gxTv_SdtSdtPConCos_Prduniconm = DecimalUtil.ZERO ;
      gxTv_SdtSdtPConCos_Prdvalconm = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtPConCos_N ;
   }

   public app.SdtSdtPConCos Clone( )
   {
      return (app.SdtSdtPConCos)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtPConCos struct )
   {
      setgxTv_SdtSdtPConCos_Prdanymes(struct.getPrdanymes());
      setgxTv_SdtSdtPConCos_Prdany(struct.getPrdany());
      setgxTv_SdtSdtPConCos_Prdnummes(struct.getPrdnummes());
      setgxTv_SdtSdtPConCos_Prdunicprm(struct.getPrdunicprm());
      setgxTv_SdtSdtPConCos_Prdvalcprm(struct.getPrdvalcprm());
      setgxTv_SdtSdtPConCos_Prduniconm(struct.getPrduniconm());
      setgxTv_SdtSdtPConCos_Prdvalconm(struct.getPrdvalconm());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtPConCos getStruct( )
   {
      app.StructSdtSdtPConCos struct = new app.StructSdtSdtPConCos ();
      struct.setPrdanymes(getgxTv_SdtSdtPConCos_Prdanymes());
      struct.setPrdany(getgxTv_SdtSdtPConCos_Prdany());
      struct.setPrdnummes(getgxTv_SdtSdtPConCos_Prdnummes());
      struct.setPrdunicprm(getgxTv_SdtSdtPConCos_Prdunicprm());
      struct.setPrdvalcprm(getgxTv_SdtSdtPConCos_Prdvalcprm());
      struct.setPrduniconm(getgxTv_SdtSdtPConCos_Prduniconm());
      struct.setPrdvalconm(getgxTv_SdtSdtPConCos_Prdvalconm());
      return struct ;
   }

   protected byte gxTv_SdtSdtPConCos_N ;
   protected byte gxTv_SdtSdtPConCos_Prdnummes ;
   protected short gxTv_SdtSdtPConCos_Prdany ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdtPConCos_Prdanymes ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdunicprm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdvalcprm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prduniconm ;
   protected java.math.BigDecimal gxTv_SdtSdtPConCos_Prdvalconm ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

