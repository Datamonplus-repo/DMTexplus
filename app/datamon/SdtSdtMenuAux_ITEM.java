package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtMenuAux_ITEM extends GxUserType
{
   public SdtSdtMenuAux_ITEM( )
   {
      this(  new ModelContext(SdtSdtMenuAux_ITEM.class));
   }

   public SdtSdtMenuAux_ITEM( ModelContext context )
   {
      super( context, "SdtSdtMenuAux_ITEM");
   }

   public SdtSdtMenuAux_ITEM( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtMenuAux_ITEM");
   }

   public SdtSdtMenuAux_ITEM( StructSdtSdtMenuAux_ITEM struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Id = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URL") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Url = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TITLE") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Title = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DESCRIPTION") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Description = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONTAWSOME") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Fontawsome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BADGE") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Badge = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COLOR") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Color = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Image = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE_GXI") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Image_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FAVORITO") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Favorito = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "WINDOW") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Window = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXIBIR_FAVORITO") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INFO") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Info = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INFO_TEXT") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Info_text = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_DISPLAY") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Mnu_display = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_UPDATE") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Mnu_update = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_INSERT") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Mnu_insert = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_DELETE") )
            {
               gxTv_SdtSdtMenuAux_ITEM_Mnu_delete = oReader.getValue() ;
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
         sName = "SdtMenuAux.ITEM" ;
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
      oWriter.writeElement("ID", GXutil.trim( GXutil.str( gxTv_SdtSdtMenuAux_ITEM_Id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("URL", gxTv_SdtSdtMenuAux_ITEM_Url);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TITLE", gxTv_SdtSdtMenuAux_ITEM_Title);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DESCRIPTION", gxTv_SdtSdtMenuAux_ITEM_Description);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FONTAWSOME", gxTv_SdtSdtMenuAux_ITEM_Fontawsome);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BADGE", GXutil.trim( GXutil.str( gxTv_SdtSdtMenuAux_ITEM_Badge, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("COLOR", gxTv_SdtSdtMenuAux_ITEM_Color);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IMAGE", gxTv_SdtSdtMenuAux_ITEM_Image);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IMAGE_GXI", gxTv_SdtSdtMenuAux_ITEM_Image_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FAVORITO", GXutil.booltostr( gxTv_SdtSdtMenuAux_ITEM_Favorito));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("WINDOW", GXutil.booltostr( gxTv_SdtSdtMenuAux_ITEM_Window));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EXIBIR_FAVORITO", GXutil.booltostr( gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("INFO", GXutil.booltostr( gxTv_SdtSdtMenuAux_ITEM_Info));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("INFO_TEXT", gxTv_SdtSdtMenuAux_ITEM_Info_text);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_DISPLAY", gxTv_SdtSdtMenuAux_ITEM_Mnu_display);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_UPDATE", gxTv_SdtSdtMenuAux_ITEM_Mnu_update);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_INSERT", gxTv_SdtSdtMenuAux_ITEM_Mnu_insert);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_DELETE", gxTv_SdtSdtMenuAux_ITEM_Mnu_delete);
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
      AddObjectProperty("ID", gxTv_SdtSdtMenuAux_ITEM_Id, false, false);
      AddObjectProperty("URL", gxTv_SdtSdtMenuAux_ITEM_Url, false, false);
      AddObjectProperty("TITLE", gxTv_SdtSdtMenuAux_ITEM_Title, false, false);
      AddObjectProperty("DESCRIPTION", gxTv_SdtSdtMenuAux_ITEM_Description, false, false);
      AddObjectProperty("FONTAWSOME", gxTv_SdtSdtMenuAux_ITEM_Fontawsome, false, false);
      AddObjectProperty("BADGE", gxTv_SdtSdtMenuAux_ITEM_Badge, false, false);
      AddObjectProperty("COLOR", gxTv_SdtSdtMenuAux_ITEM_Color, false, false);
      AddObjectProperty("IMAGE", gxTv_SdtSdtMenuAux_ITEM_Image, false, false);
      AddObjectProperty("IMAGE_GXI", gxTv_SdtSdtMenuAux_ITEM_Image_gxi, false, false);
      AddObjectProperty("FAVORITO", gxTv_SdtSdtMenuAux_ITEM_Favorito, false, false);
      AddObjectProperty("WINDOW", gxTv_SdtSdtMenuAux_ITEM_Window, false, false);
      AddObjectProperty("EXIBIR_FAVORITO", gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito, false, false);
      AddObjectProperty("INFO", gxTv_SdtSdtMenuAux_ITEM_Info, false, false);
      AddObjectProperty("INFO_TEXT", gxTv_SdtSdtMenuAux_ITEM_Info_text, false, false);
      AddObjectProperty("MNU_DISPLAY", gxTv_SdtSdtMenuAux_ITEM_Mnu_display, false, false);
      AddObjectProperty("MNU_UPDATE", gxTv_SdtSdtMenuAux_ITEM_Mnu_update, false, false);
      AddObjectProperty("MNU_INSERT", gxTv_SdtSdtMenuAux_ITEM_Mnu_insert, false, false);
      AddObjectProperty("MNU_DELETE", gxTv_SdtSdtMenuAux_ITEM_Mnu_delete, false, false);
   }

   public long getgxTv_SdtSdtMenuAux_ITEM_Id( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Id ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Id( long value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Id = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Url( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Url ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Url( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Url = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Title( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Title ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Title( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Title = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Description( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Description ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Description( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Description = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Fontawsome( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Fontawsome ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Fontawsome( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Fontawsome = value ;
   }

   public short getgxTv_SdtSdtMenuAux_ITEM_Badge( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Badge ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Badge( short value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Badge = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Color( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Color ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Color( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Color = value ;
   }

   @GxUpload
   public String getgxTv_SdtSdtMenuAux_ITEM_Image( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Image ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Image( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Image = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Image_gxi( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Image_gxi ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Image_gxi( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Image_gxi = value ;
   }

   public boolean getgxTv_SdtSdtMenuAux_ITEM_Favorito( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Favorito ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Favorito( boolean value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Favorito = value ;
   }

   public boolean getgxTv_SdtSdtMenuAux_ITEM_Window( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Window ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Window( boolean value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Window = value ;
   }

   public boolean getgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito( boolean value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito = value ;
   }

   public boolean getgxTv_SdtSdtMenuAux_ITEM_Info( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Info ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Info( boolean value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Info = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Info_text( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Info_text ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Info_text( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Info_text = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Mnu_display( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Mnu_display ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Mnu_display( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_display = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Mnu_update( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Mnu_update ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Mnu_update( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_update = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Mnu_insert( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Mnu_insert ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Mnu_insert( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_insert = value ;
   }

   public String getgxTv_SdtSdtMenuAux_ITEM_Mnu_delete( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_Mnu_delete ;
   }

   public void setgxTv_SdtSdtMenuAux_ITEM_Mnu_delete( String value )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_delete = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtMenuAux_ITEM_N = (byte)(1) ;
      gxTv_SdtSdtMenuAux_ITEM_Url = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Title = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Description = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Fontawsome = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Color = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Image = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Image_gxi = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Info_text = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_display = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_update = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_insert = "" ;
      gxTv_SdtSdtMenuAux_ITEM_Mnu_delete = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtMenuAux_ITEM_N ;
   }

   public app.datamon.SdtSdtMenuAux_ITEM Clone( )
   {
      return (app.datamon.SdtSdtMenuAux_ITEM)(clone()) ;
   }

   public void setStruct( app.datamon.StructSdtSdtMenuAux_ITEM struct )
   {
      setgxTv_SdtSdtMenuAux_ITEM_Id(struct.getId());
      setgxTv_SdtSdtMenuAux_ITEM_Url(struct.getUrl());
      setgxTv_SdtSdtMenuAux_ITEM_Title(struct.getTitle());
      setgxTv_SdtSdtMenuAux_ITEM_Description(struct.getDescription());
      setgxTv_SdtSdtMenuAux_ITEM_Fontawsome(struct.getFontawsome());
      setgxTv_SdtSdtMenuAux_ITEM_Badge(struct.getBadge());
      setgxTv_SdtSdtMenuAux_ITEM_Color(struct.getColor());
      setgxTv_SdtSdtMenuAux_ITEM_Image(struct.getImage());
      setgxTv_SdtSdtMenuAux_ITEM_Image_gxi(struct.getImage_gxi());
      setgxTv_SdtSdtMenuAux_ITEM_Favorito(struct.getFavorito());
      setgxTv_SdtSdtMenuAux_ITEM_Window(struct.getWindow());
      setgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito(struct.getExibir_favorito());
      setgxTv_SdtSdtMenuAux_ITEM_Info(struct.getInfo());
      setgxTv_SdtSdtMenuAux_ITEM_Info_text(struct.getInfo_text());
      setgxTv_SdtSdtMenuAux_ITEM_Mnu_display(struct.getMnu_display());
      setgxTv_SdtSdtMenuAux_ITEM_Mnu_update(struct.getMnu_update());
      setgxTv_SdtSdtMenuAux_ITEM_Mnu_insert(struct.getMnu_insert());
      setgxTv_SdtSdtMenuAux_ITEM_Mnu_delete(struct.getMnu_delete());
   }

   @SuppressWarnings("unchecked")
   public app.datamon.StructSdtSdtMenuAux_ITEM getStruct( )
   {
      app.datamon.StructSdtSdtMenuAux_ITEM struct = new app.datamon.StructSdtSdtMenuAux_ITEM ();
      struct.setId(getgxTv_SdtSdtMenuAux_ITEM_Id());
      struct.setUrl(getgxTv_SdtSdtMenuAux_ITEM_Url());
      struct.setTitle(getgxTv_SdtSdtMenuAux_ITEM_Title());
      struct.setDescription(getgxTv_SdtSdtMenuAux_ITEM_Description());
      struct.setFontawsome(getgxTv_SdtSdtMenuAux_ITEM_Fontawsome());
      struct.setBadge(getgxTv_SdtSdtMenuAux_ITEM_Badge());
      struct.setColor(getgxTv_SdtSdtMenuAux_ITEM_Color());
      struct.setImage(getgxTv_SdtSdtMenuAux_ITEM_Image());
      struct.setImage_gxi(getgxTv_SdtSdtMenuAux_ITEM_Image_gxi());
      struct.setFavorito(getgxTv_SdtSdtMenuAux_ITEM_Favorito());
      struct.setWindow(getgxTv_SdtSdtMenuAux_ITEM_Window());
      struct.setExibir_favorito(getgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito());
      struct.setInfo(getgxTv_SdtSdtMenuAux_ITEM_Info());
      struct.setInfo_text(getgxTv_SdtSdtMenuAux_ITEM_Info_text());
      struct.setMnu_display(getgxTv_SdtSdtMenuAux_ITEM_Mnu_display());
      struct.setMnu_update(getgxTv_SdtSdtMenuAux_ITEM_Mnu_update());
      struct.setMnu_insert(getgxTv_SdtSdtMenuAux_ITEM_Mnu_insert());
      struct.setMnu_delete(getgxTv_SdtSdtMenuAux_ITEM_Mnu_delete());
      return struct ;
   }

   protected byte gxTv_SdtSdtMenuAux_ITEM_N ;
   protected short gxTv_SdtSdtMenuAux_ITEM_Badge ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSdtMenuAux_ITEM_Id ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Mnu_display ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Mnu_update ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Mnu_insert ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Mnu_delete ;
   protected String sTagName ;
   protected boolean gxTv_SdtSdtMenuAux_ITEM_Favorito ;
   protected boolean gxTv_SdtSdtMenuAux_ITEM_Window ;
   protected boolean gxTv_SdtSdtMenuAux_ITEM_Exibir_favorito ;
   protected boolean gxTv_SdtSdtMenuAux_ITEM_Info ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Url ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Title ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Description ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Fontawsome ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Color ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Image_gxi ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Info_text ;
   protected String gxTv_SdtSdtMenuAux_ITEM_Image ;
}

