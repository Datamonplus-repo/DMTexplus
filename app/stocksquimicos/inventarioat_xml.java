package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inventarioat_xml extends GXProcedure
{
   public inventarioat_xml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inventarioat_xml.class ), "" );
   }

   public inventarioat_xml( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        String aP2 ,
                                                                        String aP3 ,
                                                                        String aP4 ,
                                                                        short aP5 ,
                                                                        java.util.Date aP6 ,
                                                                        boolean[] aP7 )
   {
      inventarioat_xml.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        java.util.Date aP6 ,
                        boolean[] aP7 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             java.util.Date aP6 ,
                             boolean[] aP7 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      inventarioat_xml.this.AV31Emprcod = aP0;
      inventarioat_xml.this.AV25Recfec = aP1;
      inventarioat_xml.this.AV23prdnum1 = aP2;
      inventarioat_xml.this.AV24prdnum2 = aP3;
      inventarioat_xml.this.AV26Taxreg = aP4;
      inventarioat_xml.this.AV29Year = aP5;
      inventarioat_xml.this.AV12Enddate = aP6;
      inventarioat_xml.this.aP7 = aP7;
      inventarioat_xml.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19messages.clear();
      GXt_char1 = AV30PATHPDF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV31Emprcod, httpContext.getMessage( "INVAT", ""), GXv_char2) ;
      inventarioat_xml.this.GXt_char1 = GXv_char2[0] ;
      AV30PATHPDF = GXt_char1 ;
      AV22ok = false ;
      AV16len = (short)(GXutil.len( GXutil.trim( AV30PATHPDF))) ;
      AV30PATHPDF = ((GXutil.strcmp(GXutil.substring( AV30PATHPDF, AV16len, 1), "\\")==0) ? AV30PATHPDF : AV30PATHPDF+"\\") ;
      AV20nombrefile = GXutil.format( httpContext.getMessage( "%1%2.xml", ""), GXutil.trim( AV30PATHPDF), httpContext.getMessage( "INVENTARIO", ""), "", "", "", "", "", "", "") ;
      System.out.println( httpContext.getMessage( "----------------------------&nombrefile------------------------", "") );
      System.out.println( httpContext.getMessage( "&nombrefile=", "")+GXutil.trim( AV20nombrefile) );
      System.out.println( httpContext.getMessage( "----------------------------&nombrefile------------------------", "") );
      AV14File.setSource( AV20nombrefile );
      if ( AV14File.exists() )
      {
         AV14File.delete();
      }
      AV15filexml.openURL(AV20nombrefile);
      if ( AV15filexml.getErrCode() > 0 )
      {
         AV18Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV18Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV15filexml.getErrCode(), 10, 2)) );
         AV18Message.setgxTv_SdtMessages_Message_Description( AV15filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV18Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV19messages.add(AV18Message, 0);
      }
      else
      {
         System.out.println( httpContext.getMessage( "----------------------------Open------------------------", "") );
         AV17Linea = httpContext.getMessage( "?xml version=\"1.0\" encoding=\"UTF-8\"?", "") ;
         AV15filexml.writeStartDocument("", (byte)(0));
         AV15filexml.writeNSStartElement(httpContext.getMessage( "ns:StockFile", ""), "", "");
         AV15filexml.writeAttribute(httpContext.getMessage( "xmlns:doc", ""), httpContext.getMessage( "urn:schemas-basda-org:schema-extensions:documentation", ""));
         AV15filexml.writeAttribute(httpContext.getMessage( "xmlns:ns", ""), httpContext.getMessage( "urn:StockFile:PT_1_02", ""));
         AV15filexml.writeAttribute(httpContext.getMessage( "xmlns:xsi", ""), httpContext.getMessage( "http://www.w3.org/2001/XMLSchema-instance", ""));
         AV15filexml.writeStartElement(httpContext.getMessage( "ns:StockHeader", ""));
         AV15filexml.writeElement(httpContext.getMessage( "ns:FileVersion", ""), "1_02");
         AV15filexml.writeElement(httpContext.getMessage( "ns:TaxRegistrationNumber", ""), AV26Taxreg);
         AV15filexml.writeElement(httpContext.getMessage( "ns:FiscalYear", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
         AV13FecA = GXutil.str( GXutil.year( AV12Enddate), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV12Enddate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV12Enddate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
         AV15filexml.writeElement(httpContext.getMessage( "ns:EndDate", ""), AV13FecA);
         AV15filexml.writeElement(httpContext.getMessage( "ns:NoStock", ""), httpContext.getMessage( "false", ""));
         AV15filexml.writeEndElement();
         AV34GXLvl57 = (byte)(0) ;
         /* Using cursor P0APR2 */
         pr_default.execute(0, new Object[] {AV31Emprcod, AV23prdnum1, AV25Recfec, AV24prdnum2});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A742PrdUniCom = P0APR2_A742PrdUniCom[0] ;
            A807RecExiRea = P0APR2_A807RecExiRea[0] ;
            A810RecFec = P0APR2_A810RecFec[0] ;
            A719PrdNum = P0APR2_A719PrdNum[0] ;
            A396EmprCod = P0APR2_A396EmprCod[0] ;
            A718PrdNom = P0APR2_A718PrdNom[0] ;
            A6573RecPreRec = P0APR2_A6573RecPreRec[0] ;
            A737PrdUcpDsc = P0APR2_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = P0APR2_n737PrdUcpDsc[0] ;
            A742PrdUniCom = P0APR2_A742PrdUniCom[0] ;
            A718PrdNom = P0APR2_A718PrdNom[0] ;
            A737PrdUcpDsc = P0APR2_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = P0APR2_n737PrdUcpDsc[0] ;
            AV34GXLvl57 = (byte)(1) ;
            AV15filexml.writeStartElement(httpContext.getMessage( "ns:Stock", ""));
            AV15filexml.writeElement(httpContext.getMessage( "ns:ProductCategory", ""), httpContext.getMessage( "P", ""));
            AV15filexml.writeElement(httpContext.getMessage( "ns:ProductCode", ""), GXutil.trim( A719PrdNum));
            AV15filexml.writeElement(httpContext.getMessage( "ns:ProductDescription", ""), GXutil.trim( A718PrdNom));
            AV28Var12 = A719PrdNum ;
            AV15filexml.writeElement(httpContext.getMessage( "ns:ProductNumberCode", ""), GXutil.trim( A719PrdNum));
            AV8Cant2dec = A807RecExiRea ;
            AV27Valor = A807RecExiRea.multiply(A6573RecPreRec) ;
            AV15filexml.writeElement(httpContext.getMessage( "ns:ClosingStockQuantity", ""), GXutil.trim( GXutil.str( AV8Cant2dec, 12, 2)));
            AV15filexml.writeElement(httpContext.getMessage( "ns:UnitOfMeasure", ""), GXutil.trim( GXutil.trim( A737PrdUcpDsc)));
            AV15filexml.writeElement(httpContext.getMessage( "ns:ClosingStockValue", ""), GXutil.trim( GXutil.str( AV27Valor, 10, 2)));
            AV15filexml.writeEndElement();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV34GXLvl57 == 0 )
         {
            AV18Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV18Message.setgxTv_SdtMessages_Message_Id( "0" );
            AV18Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO existe Registro", "") );
            AV18Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV19messages.add(AV18Message, 0);
         }
         AV22ok = true ;
         AV15filexml.writeEndElement();
         AV15filexml.close();
         AV18Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV18Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "OK", "") );
         AV18Message.setgxTv_SdtMessages_Message_Description( AV20nombrefile );
         AV19messages.add(AV18Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = inventarioat_xml.this.AV22ok;
      this.aP8[0] = inventarioat_xml.this.AV19messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV30PATHPDF = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20nombrefile = "" ;
      AV14File = new com.genexus.util.GXFile();
      AV15filexml = new com.genexus.xml.XMLWriter();
      AV18Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV17Linea = "" ;
      AV13FecA = "" ;
      scmdbuf = "" ;
      P0APR2_A742PrdUniCom = new byte[1] ;
      P0APR2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APR2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0APR2_A719PrdNum = new String[] {""} ;
      P0APR2_A396EmprCod = new String[] {""} ;
      P0APR2_A718PrdNom = new String[] {""} ;
      P0APR2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APR2_A737PrdUcpDsc = new String[] {""} ;
      P0APR2_n737PrdUcpDsc = new boolean[] {false} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A718PrdNom = "" ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      AV28Var12 = "" ;
      AV8Cant2dec = DecimalUtil.ZERO ;
      AV27Valor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.inventarioat_xml__default(),
         new Object[] {
             new Object[] {
            P0APR2_A742PrdUniCom, P0APR2_A807RecExiRea, P0APR2_A810RecFec, P0APR2_A719PrdNum, P0APR2_A396EmprCod, P0APR2_A718PrdNom, P0APR2_A6573RecPreRec, P0APR2_A737PrdUcpDsc, P0APR2_n737PrdUcpDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34GXLvl57 ;
   private byte A742PrdUniCom ;
   private short AV29Year ;
   private short AV16len ;
   private short Gx_err ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV8Cant2dec ;
   private java.math.BigDecimal AV27Valor ;
   private String AV31Emprcod ;
   private String AV23prdnum1 ;
   private String AV24prdnum2 ;
   private String AV26Taxreg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17Linea ;
   private String AV13FecA ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String AV28Var12 ;
   private java.util.Date AV25Recfec ;
   private java.util.Date AV12Enddate ;
   private java.util.Date A810RecFec ;
   private boolean AV22ok ;
   private boolean n737PrdUcpDsc ;
   private String AV30PATHPDF ;
   private String AV20nombrefile ;
   private com.genexus.util.GXFile AV14File ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 ;
   private boolean[] aP7 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0APR2_A742PrdUniCom ;
   private java.math.BigDecimal[] P0APR2_A807RecExiRea ;
   private java.util.Date[] P0APR2_A810RecFec ;
   private String[] P0APR2_A719PrdNum ;
   private String[] P0APR2_A396EmprCod ;
   private String[] P0APR2_A718PrdNom ;
   private java.math.BigDecimal[] P0APR2_A6573RecPreRec ;
   private String[] P0APR2_A737PrdUcpDsc ;
   private boolean[] P0APR2_n737PrdUcpDsc ;
   private com.genexus.xml.XMLWriter AV15filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV19messages ;
   private com.genexus.SdtMessages_Message AV18Message ;
}

final  class inventarioat_xml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APR2", "SELECT T2.PrdUniCom AS PrdUniCom, T1.RecExiRea, T1.RecFec, T1.PrdNum, T1.EmprCod, T2.PrdNom, T1.RecPreRec, T3.UniDsc AS PrdUcpDsc FROM ((TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T2.PrdUniCom) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.RecFec = ?) AND (T1.RecExiRea > 0) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

