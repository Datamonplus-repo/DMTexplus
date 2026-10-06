package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTUSUARI extends GxSilentTrnSdt
{
   public SdtTUSUARI( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTUSUARI.class));
   }

   public SdtTUSUARI( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTUSUARI");
      initialize( remoteHandle) ;
   }

   public SdtTUSUARI( int remoteHandle ,
                      StructSdtTUSUARI struct )
   {
      this(remoteHandle);
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

   public void Load( String AV850UsurCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV850UsurCod});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"UsurCod", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TUSUARI");
      metadata.set("BT", "TXPUSUARI");
      metadata.set("PK", "[ \"UsurCod\" ]");
      metadata.set("Levels", "[ \"Level1Item\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCod") )
            {
               gxTv_SdtTUSUARI_Usurcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurNom") )
            {
               gxTv_SdtTUSUARI_Usurnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPwd") )
            {
               gxTv_SdtTUSUARI_Usurpwd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurfec = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMail") )
            {
               gxTv_SdtTUSUARI_Usumail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailP") )
            {
               gxTv_SdtTUSUARI_Usumailp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailU") )
            {
               gxTv_SdtTUSUARI_Usumailu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCmbPwd") )
            {
               gxTv_SdtTUSUARI_Usurcmbpwd = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTkn") )
            {
               gxTv_SdtTUSUARI_Usurtkn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknCrd") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurtkncrd = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurtkncrd = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknVto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurtknvto = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurtknvto = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurGuid") )
            {
               gxTv_SdtTUSUARI_Usurguid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPrint") )
            {
               gxTv_SdtTUSUARI_Usurprint = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurSockt") )
            {
               gxTv_SdtTUSUARI_Usursockt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtTUSUARI_Level1 == null )
               {
                  gxTv_SdtTUSUARI_Level1 = new GXBCLevelCollection<app.SdtTUSUARI_Level1Item>(app.SdtTUSUARI_Level1Item.class, "TUSUARI.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTUSUARI_Level1.readxml(oReader, "Level1") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTUSUARI_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTUSUARI_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCod_Z") )
            {
               gxTv_SdtTUSUARI_Usurcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurNom_Z") )
            {
               gxTv_SdtTUSUARI_Usurnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPwd_Z") )
            {
               gxTv_SdtTUSUARI_Usurpwd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurfec_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurfec_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMail_Z") )
            {
               gxTv_SdtTUSUARI_Usumail_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailP_Z") )
            {
               gxTv_SdtTUSUARI_Usumailp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailU_Z") )
            {
               gxTv_SdtTUSUARI_Usumailu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCmbPwd_Z") )
            {
               gxTv_SdtTUSUARI_Usurcmbpwd_Z = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTkn_Z") )
            {
               gxTv_SdtTUSUARI_Usurtkn_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknCrd_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurtkncrd_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurtkncrd_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknVto_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTUSUARI_Usurtknvto_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTUSUARI_Usurtknvto_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurGuid_Z") )
            {
               gxTv_SdtTUSUARI_Usurguid_Z = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPrint_Z") )
            {
               gxTv_SdtTUSUARI_Usurprint_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurSockt_Z") )
            {
               gxTv_SdtTUSUARI_Usursockt_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurNom_N") )
            {
               gxTv_SdtTUSUARI_Usurnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPwd_N") )
            {
               gxTv_SdtTUSUARI_Usurpwd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurFec_N") )
            {
               gxTv_SdtTUSUARI_Usurfec_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailP_N") )
            {
               gxTv_SdtTUSUARI_Usumailp_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMailU_N") )
            {
               gxTv_SdtTUSUARI_Usumailu_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCmbPwd_N") )
            {
               gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTkn_N") )
            {
               gxTv_SdtTUSUARI_Usurtkn_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknCrd_N") )
            {
               gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurTknVto_N") )
            {
               gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurGuid_N") )
            {
               gxTv_SdtTUSUARI_Usurguid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPrint_N") )
            {
               gxTv_SdtTUSUARI_Usurprint_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurSockt_N") )
            {
               gxTv_SdtTUSUARI_Usursockt_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TUSUARI" ;
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
      oWriter.writeElement("UsurCod", gxTv_SdtTUSUARI_Usurcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurNom", gxTv_SdtTUSUARI_Usurnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurPwd", gxTv_SdtTUSUARI_Usurpwd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("UsurFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsuMail", gxTv_SdtTUSUARI_Usumail);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsuMailP", gxTv_SdtTUSUARI_Usumailp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsuMailU", gxTv_SdtTUSUARI_Usumailu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurCmbPwd", GXutil.booltostr( gxTv_SdtTUSUARI_Usurcmbpwd));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurTkn", gxTv_SdtTUSUARI_Usurtkn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTUSUARI_Usurtkncrd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("UsurTknCrd", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTUSUARI_Usurtknvto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("UsurTknVto", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurGuid", gxTv_SdtTUSUARI_Usurguid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurPrint", gxTv_SdtTUSUARI_Usurprint);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurSockt", gxTv_SdtTUSUARI_Usursockt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtTUSUARI_Level1 != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtTUSUARI_Level1.writexml(oWriter, "Level1", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTUSUARI_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurCod_Z", gxTv_SdtTUSUARI_Usurcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurNom_Z", gxTv_SdtTUSUARI_Usurnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurPwd_Z", gxTv_SdtTUSUARI_Usurpwd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UsurFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsuMail_Z", gxTv_SdtTUSUARI_Usumail_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsuMailP_Z", gxTv_SdtTUSUARI_Usumailp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsuMailU_Z", gxTv_SdtTUSUARI_Usumailu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurCmbPwd_Z", GXutil.booltostr( gxTv_SdtTUSUARI_Usurcmbpwd_Z));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurTkn_Z", gxTv_SdtTUSUARI_Usurtkn_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTUSUARI_Usurtkncrd_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UsurTknCrd_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTUSUARI_Usurtknvto_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UsurTknVto_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurGuid_Z", gxTv_SdtTUSUARI_Usurguid_Z.toString());
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurPrint_Z", gxTv_SdtTUSUARI_Usurprint_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurSockt_Z", gxTv_SdtTUSUARI_Usursockt_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurNom_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurPwd_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurpwd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurFec_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurfec_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsuMailP_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usumailp_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsuMailU_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usumailu_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurCmbPwd_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurcmbpwd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurTkn_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurtkn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurTknCrd_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurtkncrd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurTknVto_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurtknvto_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurGuid_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurguid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurPrint_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usurprint_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsurSockt_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Usursockt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("UsurCod", gxTv_SdtTUSUARI_Usurcod, false, includeNonInitialized);
      AddObjectProperty("UsurNom", gxTv_SdtTUSUARI_Usurnom, false, includeNonInitialized);
      AddObjectProperty("UsurNom_N", gxTv_SdtTUSUARI_Usurnom_N, false, includeNonInitialized);
      AddObjectProperty("UsurPwd", gxTv_SdtTUSUARI_Usurpwd, false, includeNonInitialized);
      AddObjectProperty("UsurPwd_N", gxTv_SdtTUSUARI_Usurpwd_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UsurFec", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("UsurFec_N", gxTv_SdtTUSUARI_Usurfec_N, false, includeNonInitialized);
      AddObjectProperty("UsuMail", gxTv_SdtTUSUARI_Usumail, false, includeNonInitialized);
      AddObjectProperty("UsuMailP", gxTv_SdtTUSUARI_Usumailp, false, includeNonInitialized);
      AddObjectProperty("UsuMailP_N", gxTv_SdtTUSUARI_Usumailp_N, false, includeNonInitialized);
      AddObjectProperty("UsuMailU", gxTv_SdtTUSUARI_Usumailu, false, includeNonInitialized);
      AddObjectProperty("UsuMailU_N", gxTv_SdtTUSUARI_Usumailu_N, false, includeNonInitialized);
      AddObjectProperty("UsurCmbPwd", gxTv_SdtTUSUARI_Usurcmbpwd, false, includeNonInitialized);
      AddObjectProperty("UsurCmbPwd_N", gxTv_SdtTUSUARI_Usurcmbpwd_N, false, includeNonInitialized);
      AddObjectProperty("UsurTkn", gxTv_SdtTUSUARI_Usurtkn, false, includeNonInitialized);
      AddObjectProperty("UsurTkn_N", gxTv_SdtTUSUARI_Usurtkn_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtTUSUARI_Usurtkncrd ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UsurTknCrd", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("UsurTknCrd_N", gxTv_SdtTUSUARI_Usurtkncrd_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtTUSUARI_Usurtknvto ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UsurTknVto", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("UsurTknVto_N", gxTv_SdtTUSUARI_Usurtknvto_N, false, includeNonInitialized);
      AddObjectProperty("UsurGuid", gxTv_SdtTUSUARI_Usurguid, false, includeNonInitialized);
      AddObjectProperty("UsurGuid_N", gxTv_SdtTUSUARI_Usurguid_N, false, includeNonInitialized);
      AddObjectProperty("UsurPrint", gxTv_SdtTUSUARI_Usurprint, false, includeNonInitialized);
      AddObjectProperty("UsurPrint_N", gxTv_SdtTUSUARI_Usurprint_N, false, includeNonInitialized);
      AddObjectProperty("UsurSockt", gxTv_SdtTUSUARI_Usursockt, false, includeNonInitialized);
      AddObjectProperty("UsurSockt_N", gxTv_SdtTUSUARI_Usursockt_N, false, includeNonInitialized);
      if ( gxTv_SdtTUSUARI_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtTUSUARI_Level1, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTUSUARI_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTUSUARI_Initialized, false, includeNonInitialized);
         AddObjectProperty("UsurCod_Z", gxTv_SdtTUSUARI_Usurcod_Z, false, includeNonInitialized);
         AddObjectProperty("UsurNom_Z", gxTv_SdtTUSUARI_Usurnom_Z, false, includeNonInitialized);
         AddObjectProperty("UsurPwd_Z", gxTv_SdtTUSUARI_Usurpwd_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTUSUARI_Usurfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("UsurFec_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("UsuMail_Z", gxTv_SdtTUSUARI_Usumail_Z, false, includeNonInitialized);
         AddObjectProperty("UsuMailP_Z", gxTv_SdtTUSUARI_Usumailp_Z, false, includeNonInitialized);
         AddObjectProperty("UsuMailU_Z", gxTv_SdtTUSUARI_Usumailu_Z, false, includeNonInitialized);
         AddObjectProperty("UsurCmbPwd_Z", gxTv_SdtTUSUARI_Usurcmbpwd_Z, false, includeNonInitialized);
         AddObjectProperty("UsurTkn_Z", gxTv_SdtTUSUARI_Usurtkn_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtTUSUARI_Usurtkncrd_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("UsurTknCrd_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtTUSUARI_Usurtknvto_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("UsurTknVto_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("UsurGuid_Z", gxTv_SdtTUSUARI_Usurguid_Z, false, includeNonInitialized);
         AddObjectProperty("UsurPrint_Z", gxTv_SdtTUSUARI_Usurprint_Z, false, includeNonInitialized);
         AddObjectProperty("UsurSockt_Z", gxTv_SdtTUSUARI_Usursockt_Z, false, includeNonInitialized);
         AddObjectProperty("UsurNom_N", gxTv_SdtTUSUARI_Usurnom_N, false, includeNonInitialized);
         AddObjectProperty("UsurPwd_N", gxTv_SdtTUSUARI_Usurpwd_N, false, includeNonInitialized);
         AddObjectProperty("UsurFec_N", gxTv_SdtTUSUARI_Usurfec_N, false, includeNonInitialized);
         AddObjectProperty("UsuMailP_N", gxTv_SdtTUSUARI_Usumailp_N, false, includeNonInitialized);
         AddObjectProperty("UsuMailU_N", gxTv_SdtTUSUARI_Usumailu_N, false, includeNonInitialized);
         AddObjectProperty("UsurCmbPwd_N", gxTv_SdtTUSUARI_Usurcmbpwd_N, false, includeNonInitialized);
         AddObjectProperty("UsurTkn_N", gxTv_SdtTUSUARI_Usurtkn_N, false, includeNonInitialized);
         AddObjectProperty("UsurTknCrd_N", gxTv_SdtTUSUARI_Usurtkncrd_N, false, includeNonInitialized);
         AddObjectProperty("UsurTknVto_N", gxTv_SdtTUSUARI_Usurtknvto_N, false, includeNonInitialized);
         AddObjectProperty("UsurGuid_N", gxTv_SdtTUSUARI_Usurguid_N, false, includeNonInitialized);
         AddObjectProperty("UsurPrint_N", gxTv_SdtTUSUARI_Usurprint_N, false, includeNonInitialized);
         AddObjectProperty("UsurSockt_N", gxTv_SdtTUSUARI_Usursockt_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTUSUARI sdt )
   {
      if ( sdt.IsDirty("UsurCod") )
      {
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurcod = sdt.getgxTv_SdtTUSUARI_Usurcod() ;
      }
      if ( sdt.IsDirty("UsurNom") )
      {
         gxTv_SdtTUSUARI_Usurnom_N = sdt.getgxTv_SdtTUSUARI_Usurnom_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurnom = sdt.getgxTv_SdtTUSUARI_Usurnom() ;
      }
      if ( sdt.IsDirty("UsurPwd") )
      {
         gxTv_SdtTUSUARI_Usurpwd_N = sdt.getgxTv_SdtTUSUARI_Usurpwd_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurpwd = sdt.getgxTv_SdtTUSUARI_Usurpwd() ;
      }
      if ( sdt.IsDirty("UsurFec") )
      {
         gxTv_SdtTUSUARI_Usurfec_N = sdt.getgxTv_SdtTUSUARI_Usurfec_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurfec = sdt.getgxTv_SdtTUSUARI_Usurfec() ;
      }
      if ( sdt.IsDirty("UsuMail") )
      {
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usumail = sdt.getgxTv_SdtTUSUARI_Usumail() ;
      }
      if ( sdt.IsDirty("UsuMailP") )
      {
         gxTv_SdtTUSUARI_Usumailp_N = sdt.getgxTv_SdtTUSUARI_Usumailp_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usumailp = sdt.getgxTv_SdtTUSUARI_Usumailp() ;
      }
      if ( sdt.IsDirty("UsuMailU") )
      {
         gxTv_SdtTUSUARI_Usumailu_N = sdt.getgxTv_SdtTUSUARI_Usumailu_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usumailu = sdt.getgxTv_SdtTUSUARI_Usumailu() ;
      }
      if ( sdt.IsDirty("UsurCmbPwd") )
      {
         gxTv_SdtTUSUARI_Usurcmbpwd_N = sdt.getgxTv_SdtTUSUARI_Usurcmbpwd_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurcmbpwd = sdt.getgxTv_SdtTUSUARI_Usurcmbpwd() ;
      }
      if ( sdt.IsDirty("UsurTkn") )
      {
         gxTv_SdtTUSUARI_Usurtkn_N = sdt.getgxTv_SdtTUSUARI_Usurtkn_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurtkn = sdt.getgxTv_SdtTUSUARI_Usurtkn() ;
      }
      if ( sdt.IsDirty("UsurTknCrd") )
      {
         gxTv_SdtTUSUARI_Usurtkncrd_N = sdt.getgxTv_SdtTUSUARI_Usurtkncrd_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurtkncrd = sdt.getgxTv_SdtTUSUARI_Usurtkncrd() ;
      }
      if ( sdt.IsDirty("UsurTknVto") )
      {
         gxTv_SdtTUSUARI_Usurtknvto_N = sdt.getgxTv_SdtTUSUARI_Usurtknvto_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurtknvto = sdt.getgxTv_SdtTUSUARI_Usurtknvto() ;
      }
      if ( sdt.IsDirty("UsurGuid") )
      {
         gxTv_SdtTUSUARI_Usurguid_N = sdt.getgxTv_SdtTUSUARI_Usurguid_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurguid = sdt.getgxTv_SdtTUSUARI_Usurguid() ;
      }
      if ( sdt.IsDirty("UsurPrint") )
      {
         gxTv_SdtTUSUARI_Usurprint_N = sdt.getgxTv_SdtTUSUARI_Usurprint_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usurprint = sdt.getgxTv_SdtTUSUARI_Usurprint() ;
      }
      if ( sdt.IsDirty("UsurSockt") )
      {
         gxTv_SdtTUSUARI_Usursockt_N = sdt.getgxTv_SdtTUSUARI_Usursockt_N() ;
         gxTv_SdtTUSUARI_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Usursockt = sdt.getgxTv_SdtTUSUARI_Usursockt() ;
      }
      if ( gxTv_SdtTUSUARI_Level1 != null )
      {
         GXBCLevelCollection<app.SdtTUSUARI_Level1Item> newCollectionLevel1 = sdt.getgxTv_SdtTUSUARI_Level1();
         app.SdtTUSUARI_Level1Item currItemLevel1;
         app.SdtTUSUARI_Level1Item newItemLevel1;
         short idx = 1;
         while ( idx <= newCollectionLevel1.size() )
         {
            newItemLevel1 = (app.SdtTUSUARI_Level1Item)((app.SdtTUSUARI_Level1Item)newCollectionLevel1.elementAt(-1+idx));
            currItemLevel1 = (app.SdtTUSUARI_Level1Item)gxTv_SdtTUSUARI_Level1.getByKey(newItemLevel1.getgxTv_SdtTUSUARI_Level1Item_Grpid());
            if ( GXutil.strcmp(currItemLevel1.getgxTv_SdtTUSUARI_Level1Item_Mode(), "UPD") == 0 )
            {
               currItemLevel1.updateDirties(newItemLevel1);
               if ( GXutil.strcmp(newItemLevel1.getgxTv_SdtTUSUARI_Level1Item_Mode(), "DLT") == 0 )
               {
                  currItemLevel1.setgxTv_SdtTUSUARI_Level1Item_Mode( "DLT" );
               }
               currItemLevel1.setgxTv_SdtTUSUARI_Level1Item_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtTUSUARI_Level1.add(newItemLevel1, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtTUSUARI_Usurcod( )
   {
      return gxTv_SdtTUSUARI_Usurcod ;
   }

   public void setgxTv_SdtTUSUARI_Usurcod( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTUSUARI_Usurcod, value) != 0 )
      {
         gxTv_SdtTUSUARI_Mode = "INS" ;
         this.setgxTv_SdtTUSUARI_Usurcod_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurnom_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurpwd_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurfec_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usumail_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usumailp_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usumailu_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurcmbpwd_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurtkn_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurtkncrd_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurtknvto_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurguid_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usurprint_Z_SetNull( );
         this.setgxTv_SdtTUSUARI_Usursockt_Z_SetNull( );
         if ( gxTv_SdtTUSUARI_Level1 != null )
         {
            GXBCLevelCollection<app.SdtTUSUARI_Level1Item> collectionLevel1 = gxTv_SdtTUSUARI_Level1;
            app.SdtTUSUARI_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtTUSUARI_Level1Item)((app.SdtTUSUARI_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTUSUARI_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTUSUARI_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Usurcod");
      gxTv_SdtTUSUARI_Usurcod = value ;
   }

   public String getgxTv_SdtTUSUARI_Usurnom( )
   {
      return gxTv_SdtTUSUARI_Usurnom ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom( String value )
   {
      gxTv_SdtTUSUARI_Usurnom_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurnom");
      gxTv_SdtTUSUARI_Usurnom = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurnom_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurnom = "" ;
      SetDirty("Usurnom");
   }

   public boolean getgxTv_SdtTUSUARI_Usurnom_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurnom_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usurpwd( )
   {
      return gxTv_SdtTUSUARI_Usurpwd ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd( String value )
   {
      gxTv_SdtTUSUARI_Usurpwd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurpwd");
      gxTv_SdtTUSUARI_Usurpwd = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurpwd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurpwd = "" ;
      SetDirty("Usurpwd");
   }

   public boolean getgxTv_SdtTUSUARI_Usurpwd_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurpwd_N==1) ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurfec( )
   {
      return gxTv_SdtTUSUARI_Usurfec ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurfec_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurfec");
      gxTv_SdtTUSUARI_Usurfec = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurfec_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurfec = GXutil.nullDate() ;
      SetDirty("Usurfec");
   }

   public boolean getgxTv_SdtTUSUARI_Usurfec_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurfec_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usumail( )
   {
      return gxTv_SdtTUSUARI_Usumail ;
   }

   public void setgxTv_SdtTUSUARI_Usumail( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumail");
      gxTv_SdtTUSUARI_Usumail = value ;
   }

   public String getgxTv_SdtTUSUARI_Usumailp( )
   {
      return gxTv_SdtTUSUARI_Usumailp ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp( String value )
   {
      gxTv_SdtTUSUARI_Usumailp_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailp");
      gxTv_SdtTUSUARI_Usumailp = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailp_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usumailp = "" ;
      SetDirty("Usumailp");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailp_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usumailp_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usumailu( )
   {
      return gxTv_SdtTUSUARI_Usumailu ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu( String value )
   {
      gxTv_SdtTUSUARI_Usumailu_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailu");
      gxTv_SdtTUSUARI_Usumailu = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailu_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usumailu = "" ;
      SetDirty("Usumailu");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailu_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usumailu_N==1) ;
   }

   public boolean getgxTv_SdtTUSUARI_Usurcmbpwd( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd( boolean value )
   {
      gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurcmbpwd");
      gxTv_SdtTUSUARI_Usurcmbpwd = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurcmbpwd = false ;
      SetDirty("Usurcmbpwd");
   }

   public boolean getgxTv_SdtTUSUARI_Usurcmbpwd_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurcmbpwd_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usurtkn( )
   {
      return gxTv_SdtTUSUARI_Usurtkn ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn( String value )
   {
      gxTv_SdtTUSUARI_Usurtkn_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkn");
      gxTv_SdtTUSUARI_Usurtkn = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkn_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtkn = "" ;
      SetDirty("Usurtkn");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkn_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurtkn_N==1) ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurtkncrd( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkncrd");
      gxTv_SdtTUSUARI_Usurtkncrd = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtkncrd = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Usurtkncrd");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkncrd_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurtkncrd_N==1) ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurtknvto( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtknvto");
      gxTv_SdtTUSUARI_Usurtknvto = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtknvto = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Usurtknvto");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtknvto_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurtknvto_N==1) ;
   }

   public java.util.UUID getgxTv_SdtTUSUARI_Usurguid( )
   {
      return gxTv_SdtTUSUARI_Usurguid ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid( java.util.UUID value )
   {
      gxTv_SdtTUSUARI_Usurguid_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurguid");
      gxTv_SdtTUSUARI_Usurguid = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurguid_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurguid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      SetDirty("Usurguid");
   }

   public boolean getgxTv_SdtTUSUARI_Usurguid_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurguid_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usurprint( )
   {
      return gxTv_SdtTUSUARI_Usurprint ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint( String value )
   {
      gxTv_SdtTUSUARI_Usurprint_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurprint");
      gxTv_SdtTUSUARI_Usurprint = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurprint_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurprint = "" ;
      SetDirty("Usurprint");
   }

   public boolean getgxTv_SdtTUSUARI_Usurprint_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usurprint_N==1) ;
   }

   public String getgxTv_SdtTUSUARI_Usursockt( )
   {
      return gxTv_SdtTUSUARI_Usursockt ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt( String value )
   {
      gxTv_SdtTUSUARI_Usursockt_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usursockt");
      gxTv_SdtTUSUARI_Usursockt = value ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt_SetNull( )
   {
      gxTv_SdtTUSUARI_Usursockt_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usursockt = "" ;
      SetDirty("Usursockt");
   }

   public boolean getgxTv_SdtTUSUARI_Usursockt_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Usursockt_N==1) ;
   }

   public GXBCLevelCollection<app.SdtTUSUARI_Level1Item> getgxTv_SdtTUSUARI_Level1( )
   {
      if ( gxTv_SdtTUSUARI_Level1 == null )
      {
         gxTv_SdtTUSUARI_Level1 = new GXBCLevelCollection<app.SdtTUSUARI_Level1Item>(app.SdtTUSUARI_Level1Item.class, "TUSUARI.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      return gxTv_SdtTUSUARI_Level1 ;
   }

   public void setgxTv_SdtTUSUARI_Level1( GXBCLevelCollection<app.SdtTUSUARI_Level1Item> value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Level1");
      gxTv_SdtTUSUARI_Level1 = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1 = null ;
      SetDirty("Level1");
   }

   public boolean getgxTv_SdtTUSUARI_Level1_IsNull( )
   {
      if ( gxTv_SdtTUSUARI_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Mode( )
   {
      return gxTv_SdtTUSUARI_Mode ;
   }

   public void setgxTv_SdtTUSUARI_Mode( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTUSUARI_Mode = value ;
   }

   public void setgxTv_SdtTUSUARI_Mode_SetNull( )
   {
      gxTv_SdtTUSUARI_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTUSUARI_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTUSUARI_Initialized( )
   {
      return gxTv_SdtTUSUARI_Initialized ;
   }

   public void setgxTv_SdtTUSUARI_Initialized( short value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTUSUARI_Initialized = value ;
   }

   public void setgxTv_SdtTUSUARI_Initialized_SetNull( )
   {
      gxTv_SdtTUSUARI_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTUSUARI_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usurcod_Z( )
   {
      return gxTv_SdtTUSUARI_Usurcod_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurcod_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurcod_Z");
      gxTv_SdtTUSUARI_Usurcod_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurcod_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurcod_Z = "" ;
      SetDirty("Usurcod_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usurnom_Z( )
   {
      return gxTv_SdtTUSUARI_Usurnom_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurnom_Z");
      gxTv_SdtTUSUARI_Usurnom_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurnom_Z = "" ;
      SetDirty("Usurnom_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usurpwd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurpwd_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurpwd_Z");
      gxTv_SdtTUSUARI_Usurpwd_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurpwd_Z = "" ;
      SetDirty("Usurpwd_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurpwd_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurfec_Z( )
   {
      return gxTv_SdtTUSUARI_Usurfec_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurfec_Z");
      gxTv_SdtTUSUARI_Usurfec_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurfec_Z = GXutil.nullDate() ;
      SetDirty("Usurfec_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurfec_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usumail_Z( )
   {
      return gxTv_SdtTUSUARI_Usumail_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usumail_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumail_Z");
      gxTv_SdtTUSUARI_Usumail_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumail_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumail_Z = "" ;
      SetDirty("Usumail_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usumail_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usumailp_Z( )
   {
      return gxTv_SdtTUSUARI_Usumailp_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailp_Z");
      gxTv_SdtTUSUARI_Usumailp_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailp_Z = "" ;
      SetDirty("Usumailp_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usumailu_Z( )
   {
      return gxTv_SdtTUSUARI_Usumailu_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailu_Z");
      gxTv_SdtTUSUARI_Usumailu_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailu_Z = "" ;
      SetDirty("Usumailu_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailu_Z_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtTUSUARI_Usurcmbpwd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd_Z( boolean value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurcmbpwd_Z");
      gxTv_SdtTUSUARI_Usurcmbpwd_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurcmbpwd_Z = false ;
      SetDirty("Usurcmbpwd_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurcmbpwd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usurtkn_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtkn_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkn_Z");
      gxTv_SdtTUSUARI_Usurtkn_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkn_Z = "" ;
      SetDirty("Usurtkn_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkn_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurtkncrd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkncrd_Z");
      gxTv_SdtTUSUARI_Usurtkncrd_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkncrd_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Usurtkncrd_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkncrd_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTUSUARI_Usurtknvto_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtknvto_Z");
      gxTv_SdtTUSUARI_Usurtknvto_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtknvto_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Usurtknvto_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtknvto_Z_IsNull( )
   {
      return false ;
   }

   public java.util.UUID getgxTv_SdtTUSUARI_Usurguid_Z( )
   {
      return gxTv_SdtTUSUARI_Usurguid_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid_Z( java.util.UUID value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurguid_Z");
      gxTv_SdtTUSUARI_Usurguid_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurguid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      SetDirty("Usurguid_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurguid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usurprint_Z( )
   {
      return gxTv_SdtTUSUARI_Usurprint_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurprint_Z");
      gxTv_SdtTUSUARI_Usurprint_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurprint_Z = "" ;
      SetDirty("Usurprint_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usurprint_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Usursockt_Z( )
   {
      return gxTv_SdtTUSUARI_Usursockt_Z ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usursockt_Z");
      gxTv_SdtTUSUARI_Usursockt_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Usursockt_Z = "" ;
      SetDirty("Usursockt_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Usursockt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurnom_N( )
   {
      return gxTv_SdtTUSUARI_Usurnom_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurnom_N");
      gxTv_SdtTUSUARI_Usurnom_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurnom_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurnom_N = (byte)(0) ;
      SetDirty("Usurnom_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurpwd_N( )
   {
      return gxTv_SdtTUSUARI_Usurpwd_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurpwd_N");
      gxTv_SdtTUSUARI_Usurpwd_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurpwd_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurpwd_N = (byte)(0) ;
      SetDirty("Usurpwd_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurpwd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurfec_N( )
   {
      return gxTv_SdtTUSUARI_Usurfec_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurfec_N");
      gxTv_SdtTUSUARI_Usurfec_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurfec_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurfec_N = (byte)(0) ;
      SetDirty("Usurfec_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurfec_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usumailp_N( )
   {
      return gxTv_SdtTUSUARI_Usumailp_N ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailp_N");
      gxTv_SdtTUSUARI_Usumailp_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailp_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailp_N = (byte)(0) ;
      SetDirty("Usumailp_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailp_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usumailu_N( )
   {
      return gxTv_SdtTUSUARI_Usumailu_N ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usumailu_N");
      gxTv_SdtTUSUARI_Usumailu_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usumailu_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usumailu_N = (byte)(0) ;
      SetDirty("Usumailu_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usumailu_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurcmbpwd_N( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurcmbpwd_N");
      gxTv_SdtTUSUARI_Usurcmbpwd_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurcmbpwd_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(0) ;
      SetDirty("Usurcmbpwd_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurcmbpwd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurtkn_N( )
   {
      return gxTv_SdtTUSUARI_Usurtkn_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkn_N");
      gxTv_SdtTUSUARI_Usurtkn_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkn_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkn_N = (byte)(0) ;
      SetDirty("Usurtkn_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurtkncrd_N( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtkncrd_N");
      gxTv_SdtTUSUARI_Usurtkncrd_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtkncrd_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(0) ;
      SetDirty("Usurtkncrd_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtkncrd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurtknvto_N( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurtknvto_N");
      gxTv_SdtTUSUARI_Usurtknvto_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurtknvto_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(0) ;
      SetDirty("Usurtknvto_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurtknvto_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurguid_N( )
   {
      return gxTv_SdtTUSUARI_Usurguid_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurguid_N");
      gxTv_SdtTUSUARI_Usurguid_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurguid_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurguid_N = (byte)(0) ;
      SetDirty("Usurguid_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurguid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usurprint_N( )
   {
      return gxTv_SdtTUSUARI_Usurprint_N ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usurprint_N");
      gxTv_SdtTUSUARI_Usurprint_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usurprint_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usurprint_N = (byte)(0) ;
      SetDirty("Usurprint_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usurprint_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Usursockt_N( )
   {
      return gxTv_SdtTUSUARI_Usursockt_N ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      SetDirty("Usursockt_N");
      gxTv_SdtTUSUARI_Usursockt_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Usursockt_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Usursockt_N = (byte)(0) ;
      SetDirty("Usursockt_N");
   }

   public boolean getgxTv_SdtTUSUARI_Usursockt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tusuari_bc obj;
      obj = new app.tusuari_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTUSUARI_Usurcod = "" ;
      gxTv_SdtTUSUARI_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurnom = "" ;
      gxTv_SdtTUSUARI_Usurpwd = "" ;
      gxTv_SdtTUSUARI_Usurfec = GXutil.nullDate() ;
      gxTv_SdtTUSUARI_Usumail = "" ;
      gxTv_SdtTUSUARI_Usumailp = "" ;
      gxTv_SdtTUSUARI_Usumailu = "" ;
      gxTv_SdtTUSUARI_Usurtkn = "" ;
      gxTv_SdtTUSUARI_Usurtkncrd = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTUSUARI_Usurtknvto = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTUSUARI_Usurguid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtTUSUARI_Usurprint = "" ;
      gxTv_SdtTUSUARI_Usursockt = "" ;
      gxTv_SdtTUSUARI_Mode = "" ;
      gxTv_SdtTUSUARI_Usurcod_Z = "" ;
      gxTv_SdtTUSUARI_Usurnom_Z = "" ;
      gxTv_SdtTUSUARI_Usurpwd_Z = "" ;
      gxTv_SdtTUSUARI_Usurfec_Z = GXutil.nullDate() ;
      gxTv_SdtTUSUARI_Usumail_Z = "" ;
      gxTv_SdtTUSUARI_Usumailp_Z = "" ;
      gxTv_SdtTUSUARI_Usumailu_Z = "" ;
      gxTv_SdtTUSUARI_Usurtkn_Z = "" ;
      gxTv_SdtTUSUARI_Usurtkncrd_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTUSUARI_Usurtknvto_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTUSUARI_Usurguid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtTUSUARI_Usurprint_Z = "" ;
      gxTv_SdtTUSUARI_Usursockt_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtTUSUARI_N ;
   }

   public app.SdtTUSUARI Clone( )
   {
      app.SdtTUSUARI sdt;
      app.tusuari_bc obj;
      sdt = (app.SdtTUSUARI)(clone()) ;
      obj = (app.tusuari_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTUSUARI struct )
   {
      setgxTv_SdtTUSUARI_Usurcod(struct.getUsurcod());
      setgxTv_SdtTUSUARI_Usurnom(struct.getUsurnom());
      setgxTv_SdtTUSUARI_Usurpwd(struct.getUsurpwd());
      setgxTv_SdtTUSUARI_Usurfec(struct.getUsurfec());
      setgxTv_SdtTUSUARI_Usumail(struct.getUsumail());
      setgxTv_SdtTUSUARI_Usumailp(struct.getUsumailp());
      setgxTv_SdtTUSUARI_Usumailu(struct.getUsumailu());
      setgxTv_SdtTUSUARI_Usurcmbpwd(struct.getUsurcmbpwd());
      setgxTv_SdtTUSUARI_Usurtkn(struct.getUsurtkn());
      setgxTv_SdtTUSUARI_Usurtkncrd(struct.getUsurtkncrd());
      setgxTv_SdtTUSUARI_Usurtknvto(struct.getUsurtknvto());
      setgxTv_SdtTUSUARI_Usurguid(struct.getUsurguid());
      setgxTv_SdtTUSUARI_Usurprint(struct.getUsurprint());
      setgxTv_SdtTUSUARI_Usursockt(struct.getUsursockt());
      GXBCLevelCollection<app.SdtTUSUARI_Level1Item> gxTv_SdtTUSUARI_Level1_aux = new GXBCLevelCollection<app.SdtTUSUARI_Level1Item>(app.SdtTUSUARI_Level1Item.class, "TUSUARI.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtTUSUARI_Level1Item> gxTv_SdtTUSUARI_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtTUSUARI_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtTUSUARI_Level1_aux1.size(); i++)
         {
            gxTv_SdtTUSUARI_Level1_aux.add(new app.SdtTUSUARI_Level1Item(remoteHandle, gxTv_SdtTUSUARI_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtTUSUARI_Level1(gxTv_SdtTUSUARI_Level1_aux);
      setgxTv_SdtTUSUARI_Mode(struct.getMode());
      setgxTv_SdtTUSUARI_Initialized(struct.getInitialized());
      setgxTv_SdtTUSUARI_Usurcod_Z(struct.getUsurcod_Z());
      setgxTv_SdtTUSUARI_Usurnom_Z(struct.getUsurnom_Z());
      setgxTv_SdtTUSUARI_Usurpwd_Z(struct.getUsurpwd_Z());
      setgxTv_SdtTUSUARI_Usurfec_Z(struct.getUsurfec_Z());
      setgxTv_SdtTUSUARI_Usumail_Z(struct.getUsumail_Z());
      setgxTv_SdtTUSUARI_Usumailp_Z(struct.getUsumailp_Z());
      setgxTv_SdtTUSUARI_Usumailu_Z(struct.getUsumailu_Z());
      setgxTv_SdtTUSUARI_Usurcmbpwd_Z(struct.getUsurcmbpwd_Z());
      setgxTv_SdtTUSUARI_Usurtkn_Z(struct.getUsurtkn_Z());
      setgxTv_SdtTUSUARI_Usurtkncrd_Z(struct.getUsurtkncrd_Z());
      setgxTv_SdtTUSUARI_Usurtknvto_Z(struct.getUsurtknvto_Z());
      setgxTv_SdtTUSUARI_Usurguid_Z(struct.getUsurguid_Z());
      setgxTv_SdtTUSUARI_Usurprint_Z(struct.getUsurprint_Z());
      setgxTv_SdtTUSUARI_Usursockt_Z(struct.getUsursockt_Z());
      setgxTv_SdtTUSUARI_Usurnom_N(struct.getUsurnom_N());
      setgxTv_SdtTUSUARI_Usurpwd_N(struct.getUsurpwd_N());
      setgxTv_SdtTUSUARI_Usurfec_N(struct.getUsurfec_N());
      setgxTv_SdtTUSUARI_Usumailp_N(struct.getUsumailp_N());
      setgxTv_SdtTUSUARI_Usumailu_N(struct.getUsumailu_N());
      setgxTv_SdtTUSUARI_Usurcmbpwd_N(struct.getUsurcmbpwd_N());
      setgxTv_SdtTUSUARI_Usurtkn_N(struct.getUsurtkn_N());
      setgxTv_SdtTUSUARI_Usurtkncrd_N(struct.getUsurtkncrd_N());
      setgxTv_SdtTUSUARI_Usurtknvto_N(struct.getUsurtknvto_N());
      setgxTv_SdtTUSUARI_Usurguid_N(struct.getUsurguid_N());
      setgxTv_SdtTUSUARI_Usurprint_N(struct.getUsurprint_N());
      setgxTv_SdtTUSUARI_Usursockt_N(struct.getUsursockt_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTUSUARI getStruct( )
   {
      app.StructSdtTUSUARI struct = new app.StructSdtTUSUARI ();
      struct.setUsurcod(getgxTv_SdtTUSUARI_Usurcod());
      struct.setUsurnom(getgxTv_SdtTUSUARI_Usurnom());
      struct.setUsurpwd(getgxTv_SdtTUSUARI_Usurpwd());
      struct.setUsurfec(getgxTv_SdtTUSUARI_Usurfec());
      struct.setUsumail(getgxTv_SdtTUSUARI_Usumail());
      struct.setUsumailp(getgxTv_SdtTUSUARI_Usumailp());
      struct.setUsumailu(getgxTv_SdtTUSUARI_Usumailu());
      struct.setUsurcmbpwd(getgxTv_SdtTUSUARI_Usurcmbpwd());
      struct.setUsurtkn(getgxTv_SdtTUSUARI_Usurtkn());
      struct.setUsurtkncrd(getgxTv_SdtTUSUARI_Usurtkncrd());
      struct.setUsurtknvto(getgxTv_SdtTUSUARI_Usurtknvto());
      struct.setUsurguid(getgxTv_SdtTUSUARI_Usurguid());
      struct.setUsurprint(getgxTv_SdtTUSUARI_Usurprint());
      struct.setUsursockt(getgxTv_SdtTUSUARI_Usursockt());
      struct.setLevel1(getgxTv_SdtTUSUARI_Level1().getStruct());
      struct.setMode(getgxTv_SdtTUSUARI_Mode());
      struct.setInitialized(getgxTv_SdtTUSUARI_Initialized());
      struct.setUsurcod_Z(getgxTv_SdtTUSUARI_Usurcod_Z());
      struct.setUsurnom_Z(getgxTv_SdtTUSUARI_Usurnom_Z());
      struct.setUsurpwd_Z(getgxTv_SdtTUSUARI_Usurpwd_Z());
      struct.setUsurfec_Z(getgxTv_SdtTUSUARI_Usurfec_Z());
      struct.setUsumail_Z(getgxTv_SdtTUSUARI_Usumail_Z());
      struct.setUsumailp_Z(getgxTv_SdtTUSUARI_Usumailp_Z());
      struct.setUsumailu_Z(getgxTv_SdtTUSUARI_Usumailu_Z());
      struct.setUsurcmbpwd_Z(getgxTv_SdtTUSUARI_Usurcmbpwd_Z());
      struct.setUsurtkn_Z(getgxTv_SdtTUSUARI_Usurtkn_Z());
      struct.setUsurtkncrd_Z(getgxTv_SdtTUSUARI_Usurtkncrd_Z());
      struct.setUsurtknvto_Z(getgxTv_SdtTUSUARI_Usurtknvto_Z());
      struct.setUsurguid_Z(getgxTv_SdtTUSUARI_Usurguid_Z());
      struct.setUsurprint_Z(getgxTv_SdtTUSUARI_Usurprint_Z());
      struct.setUsursockt_Z(getgxTv_SdtTUSUARI_Usursockt_Z());
      struct.setUsurnom_N(getgxTv_SdtTUSUARI_Usurnom_N());
      struct.setUsurpwd_N(getgxTv_SdtTUSUARI_Usurpwd_N());
      struct.setUsurfec_N(getgxTv_SdtTUSUARI_Usurfec_N());
      struct.setUsumailp_N(getgxTv_SdtTUSUARI_Usumailp_N());
      struct.setUsumailu_N(getgxTv_SdtTUSUARI_Usumailu_N());
      struct.setUsurcmbpwd_N(getgxTv_SdtTUSUARI_Usurcmbpwd_N());
      struct.setUsurtkn_N(getgxTv_SdtTUSUARI_Usurtkn_N());
      struct.setUsurtkncrd_N(getgxTv_SdtTUSUARI_Usurtkncrd_N());
      struct.setUsurtknvto_N(getgxTv_SdtTUSUARI_Usurtknvto_N());
      struct.setUsurguid_N(getgxTv_SdtTUSUARI_Usurguid_N());
      struct.setUsurprint_N(getgxTv_SdtTUSUARI_Usurprint_N());
      struct.setUsursockt_N(getgxTv_SdtTUSUARI_Usursockt_N());
      return struct ;
   }

   private byte gxTv_SdtTUSUARI_N ;
   private byte gxTv_SdtTUSUARI_Usurnom_N ;
   private byte gxTv_SdtTUSUARI_Usurpwd_N ;
   private byte gxTv_SdtTUSUARI_Usurfec_N ;
   private byte gxTv_SdtTUSUARI_Usumailp_N ;
   private byte gxTv_SdtTUSUARI_Usumailu_N ;
   private byte gxTv_SdtTUSUARI_Usurcmbpwd_N ;
   private byte gxTv_SdtTUSUARI_Usurtkn_N ;
   private byte gxTv_SdtTUSUARI_Usurtkncrd_N ;
   private byte gxTv_SdtTUSUARI_Usurtknvto_N ;
   private byte gxTv_SdtTUSUARI_Usurguid_N ;
   private byte gxTv_SdtTUSUARI_Usurprint_N ;
   private byte gxTv_SdtTUSUARI_Usursockt_N ;
   private short gxTv_SdtTUSUARI_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTUSUARI_Usurcod ;
   private String gxTv_SdtTUSUARI_Usurnom ;
   private String gxTv_SdtTUSUARI_Usurpwd ;
   private String gxTv_SdtTUSUARI_Usumail ;
   private String gxTv_SdtTUSUARI_Mode ;
   private String gxTv_SdtTUSUARI_Usurcod_Z ;
   private String gxTv_SdtTUSUARI_Usurnom_Z ;
   private String gxTv_SdtTUSUARI_Usurpwd_Z ;
   private String gxTv_SdtTUSUARI_Usumail_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTUSUARI_Usurtkncrd ;
   private java.util.Date gxTv_SdtTUSUARI_Usurtknvto ;
   private java.util.Date gxTv_SdtTUSUARI_Usurtkncrd_Z ;
   private java.util.Date gxTv_SdtTUSUARI_Usurtknvto_Z ;
   private java.util.Date datetime_STZ ;
   private java.util.Date gxTv_SdtTUSUARI_Usurfec ;
   private java.util.Date gxTv_SdtTUSUARI_Usurfec_Z ;
   private boolean gxTv_SdtTUSUARI_Usurcmbpwd ;
   private boolean gxTv_SdtTUSUARI_Usurcmbpwd_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTUSUARI_Usumailp ;
   private String gxTv_SdtTUSUARI_Usumailu ;
   private String gxTv_SdtTUSUARI_Usurtkn ;
   private String gxTv_SdtTUSUARI_Usurprint ;
   private String gxTv_SdtTUSUARI_Usursockt ;
   private String gxTv_SdtTUSUARI_Usumailp_Z ;
   private String gxTv_SdtTUSUARI_Usumailu_Z ;
   private String gxTv_SdtTUSUARI_Usurtkn_Z ;
   private String gxTv_SdtTUSUARI_Usurprint_Z ;
   private String gxTv_SdtTUSUARI_Usursockt_Z ;
   private java.util.UUID gxTv_SdtTUSUARI_Usurguid ;
   private java.util.UUID gxTv_SdtTUSUARI_Usurguid_Z ;
   private GXBCLevelCollection<app.SdtTUSUARI_Level1Item> gxTv_SdtTUSUARI_Level1_aux ;
   private GXBCLevelCollection<app.SdtTUSUARI_Level1Item> gxTv_SdtTUSUARI_Level1=null ;
}

