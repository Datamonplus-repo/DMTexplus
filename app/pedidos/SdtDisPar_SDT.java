package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDisPar_SDT extends GxUserType
{
   public SdtDisPar_SDT( )
   {
      this(  new ModelContext(SdtDisPar_SDT.class));
   }

   public SdtDisPar_SDT( ModelContext context )
   {
      super( context, "SdtDisPar_SDT");
   }

   public SdtDisPar_SDT( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtDisPar_SDT");
   }

   public SdtDisPar_SDT( StructSdtDisPar_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtDisPar_SDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtDisPar_SDT_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod") )
            {
               gxTv_SdtDisPar_SDT_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasLin") )
            {
               gxTv_SdtDisPar_SDT_Disfaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasCod") )
            {
               gxTv_SdtDisPar_SDT_Parfascod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasDsc") )
            {
               gxTv_SdtDisPar_SDT_Parfasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParVal") )
            {
               gxTv_SdtDisPar_SDT_Disparval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParObs") )
            {
               gxTv_SdtDisPar_SDT_Disparobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParTxt") )
            {
               gxTv_SdtDisPar_SDT_Dispartxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParOrd") )
            {
               gxTv_SdtDisPar_SDT_Disparord = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParVl2") )
            {
               gxTv_SdtDisPar_SDT_Disparvl2 = oReader.getValue() ;
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
         sName = "DisPar_SDT" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtDisPar_SDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtDisPar_SDT_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProCod", gxTv_SdtDisPar_SDT_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasLin", GXutil.trim( GXutil.str( gxTv_SdtDisPar_SDT_Disfaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasCod", GXutil.trim( GXutil.str( gxTv_SdtDisPar_SDT_Parfascod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasDsc", gxTv_SdtDisPar_SDT_Parfasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParVal", gxTv_SdtDisPar_SDT_Disparval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParObs", gxTv_SdtDisPar_SDT_Disparobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParTxt", gxTv_SdtDisPar_SDT_Dispartxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParOrd", GXutil.trim( GXutil.str( gxTv_SdtDisPar_SDT_Disparord, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParVl2", gxTv_SdtDisPar_SDT_Disparvl2);
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
      AddObjectProperty("EmprCod", gxTv_SdtDisPar_SDT_Emprcod, false, false);
      AddObjectProperty("DisCod", gxTv_SdtDisPar_SDT_Discod, false, false);
      AddObjectProperty("ProCod", gxTv_SdtDisPar_SDT_Procod, false, false);
      AddObjectProperty("DisFasLin", gxTv_SdtDisPar_SDT_Disfaslin, false, false);
      AddObjectProperty("ParFasCod", gxTv_SdtDisPar_SDT_Parfascod, false, false);
      AddObjectProperty("ParFasDsc", gxTv_SdtDisPar_SDT_Parfasdsc, false, false);
      AddObjectProperty("DisParVal", gxTv_SdtDisPar_SDT_Disparval, false, false);
      AddObjectProperty("DisParObs", gxTv_SdtDisPar_SDT_Disparobs, false, false);
      AddObjectProperty("DisParTxt", gxTv_SdtDisPar_SDT_Dispartxt, false, false);
      AddObjectProperty("DisParOrd", gxTv_SdtDisPar_SDT_Disparord, false, false);
      AddObjectProperty("DisParVl2", gxTv_SdtDisPar_SDT_Disparvl2, false, false);
   }

   public String getgxTv_SdtDisPar_SDT_Emprcod( )
   {
      return gxTv_SdtDisPar_SDT_Emprcod ;
   }

   public void setgxTv_SdtDisPar_SDT_Emprcod( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Emprcod = value ;
   }

   public int getgxTv_SdtDisPar_SDT_Discod( )
   {
      return gxTv_SdtDisPar_SDT_Discod ;
   }

   public void setgxTv_SdtDisPar_SDT_Discod( int value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Discod = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Procod( )
   {
      return gxTv_SdtDisPar_SDT_Procod ;
   }

   public void setgxTv_SdtDisPar_SDT_Procod( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Procod = value ;
   }

   public short getgxTv_SdtDisPar_SDT_Disfaslin( )
   {
      return gxTv_SdtDisPar_SDT_Disfaslin ;
   }

   public void setgxTv_SdtDisPar_SDT_Disfaslin( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disfaslin = value ;
   }

   public short getgxTv_SdtDisPar_SDT_Parfascod( )
   {
      return gxTv_SdtDisPar_SDT_Parfascod ;
   }

   public void setgxTv_SdtDisPar_SDT_Parfascod( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Parfascod = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Parfasdsc( )
   {
      return gxTv_SdtDisPar_SDT_Parfasdsc ;
   }

   public void setgxTv_SdtDisPar_SDT_Parfasdsc( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Parfasdsc = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Disparval( )
   {
      return gxTv_SdtDisPar_SDT_Disparval ;
   }

   public void setgxTv_SdtDisPar_SDT_Disparval( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparval = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Disparobs( )
   {
      return gxTv_SdtDisPar_SDT_Disparobs ;
   }

   public void setgxTv_SdtDisPar_SDT_Disparobs( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparobs = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Dispartxt( )
   {
      return gxTv_SdtDisPar_SDT_Dispartxt ;
   }

   public void setgxTv_SdtDisPar_SDT_Dispartxt( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Dispartxt = value ;
   }

   public short getgxTv_SdtDisPar_SDT_Disparord( )
   {
      return gxTv_SdtDisPar_SDT_Disparord ;
   }

   public void setgxTv_SdtDisPar_SDT_Disparord( short value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparord = value ;
   }

   public String getgxTv_SdtDisPar_SDT_Disparvl2( )
   {
      return gxTv_SdtDisPar_SDT_Disparvl2 ;
   }

   public void setgxTv_SdtDisPar_SDT_Disparvl2( String value )
   {
      gxTv_SdtDisPar_SDT_N = (byte)(0) ;
      gxTv_SdtDisPar_SDT_Disparvl2 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDisPar_SDT_Emprcod = "" ;
      gxTv_SdtDisPar_SDT_N = (byte)(1) ;
      gxTv_SdtDisPar_SDT_Procod = "" ;
      gxTv_SdtDisPar_SDT_Parfasdsc = "" ;
      gxTv_SdtDisPar_SDT_Disparval = "" ;
      gxTv_SdtDisPar_SDT_Disparobs = "" ;
      gxTv_SdtDisPar_SDT_Dispartxt = "" ;
      gxTv_SdtDisPar_SDT_Disparvl2 = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDisPar_SDT_N ;
   }

   public app.pedidos.SdtDisPar_SDT Clone( )
   {
      return (app.pedidos.SdtDisPar_SDT)(clone()) ;
   }

   public void setStruct( app.pedidos.StructSdtDisPar_SDT struct )
   {
      setgxTv_SdtDisPar_SDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtDisPar_SDT_Discod(struct.getDiscod());
      setgxTv_SdtDisPar_SDT_Procod(struct.getProcod());
      setgxTv_SdtDisPar_SDT_Disfaslin(struct.getDisfaslin());
      setgxTv_SdtDisPar_SDT_Parfascod(struct.getParfascod());
      setgxTv_SdtDisPar_SDT_Parfasdsc(struct.getParfasdsc());
      setgxTv_SdtDisPar_SDT_Disparval(struct.getDisparval());
      setgxTv_SdtDisPar_SDT_Disparobs(struct.getDisparobs());
      setgxTv_SdtDisPar_SDT_Dispartxt(struct.getDispartxt());
      setgxTv_SdtDisPar_SDT_Disparord(struct.getDisparord());
      setgxTv_SdtDisPar_SDT_Disparvl2(struct.getDisparvl2());
   }

   @SuppressWarnings("unchecked")
   public app.pedidos.StructSdtDisPar_SDT getStruct( )
   {
      app.pedidos.StructSdtDisPar_SDT struct = new app.pedidos.StructSdtDisPar_SDT ();
      struct.setEmprcod(getgxTv_SdtDisPar_SDT_Emprcod());
      struct.setDiscod(getgxTv_SdtDisPar_SDT_Discod());
      struct.setProcod(getgxTv_SdtDisPar_SDT_Procod());
      struct.setDisfaslin(getgxTv_SdtDisPar_SDT_Disfaslin());
      struct.setParfascod(getgxTv_SdtDisPar_SDT_Parfascod());
      struct.setParfasdsc(getgxTv_SdtDisPar_SDT_Parfasdsc());
      struct.setDisparval(getgxTv_SdtDisPar_SDT_Disparval());
      struct.setDisparobs(getgxTv_SdtDisPar_SDT_Disparobs());
      struct.setDispartxt(getgxTv_SdtDisPar_SDT_Dispartxt());
      struct.setDisparord(getgxTv_SdtDisPar_SDT_Disparord());
      struct.setDisparvl2(getgxTv_SdtDisPar_SDT_Disparvl2());
      return struct ;
   }

   protected byte gxTv_SdtDisPar_SDT_N ;
   protected short gxTv_SdtDisPar_SDT_Disfaslin ;
   protected short gxTv_SdtDisPar_SDT_Parfascod ;
   protected short gxTv_SdtDisPar_SDT_Disparord ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtDisPar_SDT_Discod ;
   protected String gxTv_SdtDisPar_SDT_Emprcod ;
   protected String gxTv_SdtDisPar_SDT_Procod ;
   protected String gxTv_SdtDisPar_SDT_Parfasdsc ;
   protected String gxTv_SdtDisPar_SDT_Disparval ;
   protected String gxTv_SdtDisPar_SDT_Disparobs ;
   protected String gxTv_SdtDisPar_SDT_Disparvl2 ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtDisPar_SDT_Dispartxt ;
}

