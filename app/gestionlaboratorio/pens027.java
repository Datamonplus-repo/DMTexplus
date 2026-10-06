package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens027 extends GXProcedure
{
   public pens027( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens027.class ), "" );
   }

   public pens027( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           int[] aP5 )
   {
      pens027.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 )
   {
      pens027.this.AV27EmprCod = aP0[0];
      this.aP0 = aP0;
      pens027.this.AV28BarCod = aP1[0];
      this.aP1 = aP1;
      pens027.this.AV29BarCodReo = aP2[0];
      this.aP2 = aP2;
      pens027.this.AV30BarCodPar = aP3[0];
      this.aP3 = aP3;
      pens027.this.AV16ColNom = aP4[0];
      this.aP4 = aP4;
      pens027.this.AV17ColNum = aP5[0];
      this.aP5 = aP5;
      pens027.this.AV18TipCol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN229", ""), (byte)(99), GXv_char2) ;
      pens027.this.GXt_char1 = GXv_char2[0] ;
      GXt_char3 = AV25Msg1 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN407_", ""), (byte)(99), GXv_char4) ;
      pens027.this.GXt_char3 = GXv_char4[0] ;
      AV25Msg1 = GXutil.trim( GXt_char1) + " " + GXutil.trim( GXt_char3) ;
      GXt_char3 = AV21Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pens027.this.GXt_char3 = GXv_char4[0] ;
      AV21Station = GXt_char3 ;
      GXv_char4[0] = AV27EmprCod ;
      GXv_char2[0] = AV23EmprNom ;
      GXv_char5[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char4, GXv_char2, GXv_char5) ;
      pens027.this.AV27EmprCod = GXv_char4[0] ;
      pens027.this.AV23EmprNom = GXv_char2[0] ;
      pens027.this.AV22UsurCod = GXv_char5[0] ;
      AV24texto_i = "" ;
      /* Using cursor P01X82 */
      pr_default.execute(0, new Object[] {AV27EmprCod, Integer.valueOf(AV28BarCod), Byte.valueOf(AV29BarCodReo), AV30BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01X82_A130BarCodPar[0] ;
         A132BarCodReo = P01X82_A132BarCodReo[0] ;
         A129BarCod = P01X82_A129BarCod[0] ;
         A396EmprCod = P01X82_A396EmprCod[0] ;
         A252CliCod = P01X82_A252CliCod[0] ;
         n252CliCod = P01X82_n252CliCod[0] ;
         A212BarSer = P01X82_A212BarSer[0] ;
         A135BarColNom = P01X82_A135BarColNom[0] ;
         A136BarColNum = P01X82_A136BarColNum[0] ;
         A218BarTipCol = P01X82_A218BarTipCol[0] ;
         A921BarMatiz = P01X82_A921BarMatiz[0] ;
         A1923BarCodTN = P01X82_A1923BarCodTN[0] ;
         A2448BarFecEnR = P01X82_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P01X82_n2448BarFecEnR[0] ;
         A213BarSit = P01X82_A213BarSit[0] ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_char2[0] = AV16ColNom ;
         GXv_int7[0] = AV17ColNum ;
         GXv_int8[0] = AV18TipCol ;
         GXv_int9[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4, GXv_char2, GXv_int7, GXv_int8, GXv_int9) ;
         pens027.this.A396EmprCod = GXv_char5[0] ;
         pens027.this.A252CliCod = GXv_int6[0] ;
         pens027.this.A212BarSer = GXv_char4[0] ;
         pens027.this.AV16ColNom = GXv_char2[0] ;
         pens027.this.AV17ColNum = GXv_int7[0] ;
         pens027.this.AV18TipCol = GXv_int8[0] ;
         pens027.this.AV19Matiz = GXv_int9[0] ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A921BarMatiz = AV19Matiz ;
         A1923BarCodTN = 1 ;
         A2448BarFecEnR = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n2448BarFecEnR = false ;
         AV24texto_i = AV25Msg1 + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV21Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV22UsurCod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
         if ( A213BarSit == 2 )
         {
            A213BarSit = (byte)(1) ;
         }
         /* Using cursor P01X83 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A921BarMatiz), Integer.valueOf(A1923BarCodTN), Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV24texto_i)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV22UsurCod, AV21Station, AV24texto_i, AV28BarCod, AV29BarCodReo, AV30BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens027.this.AV27EmprCod;
      this.aP1[0] = pens027.this.AV28BarCod;
      this.aP2[0] = pens027.this.AV29BarCodReo;
      this.aP3[0] = pens027.this.AV30BarCodPar;
      this.aP4[0] = pens027.this.AV16ColNom;
      this.aP5[0] = pens027.this.AV17ColNum;
      this.aP6[0] = pens027.this.AV18TipCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens027");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Msg1 = "" ;
      GXt_char1 = "" ;
      AV21Station = "" ;
      GXt_char3 = "" ;
      AV23EmprNom = "" ;
      AV22UsurCod = "" ;
      AV24texto_i = "" ;
      scmdbuf = "" ;
      P01X82_A130BarCodPar = new String[] {""} ;
      P01X82_A132BarCodReo = new byte[1] ;
      P01X82_A129BarCod = new int[1] ;
      P01X82_A396EmprCod = new String[] {""} ;
      P01X82_A252CliCod = new int[1] ;
      P01X82_n252CliCod = new boolean[] {false} ;
      P01X82_A212BarSer = new String[] {""} ;
      P01X82_A135BarColNom = new String[] {""} ;
      P01X82_A136BarColNum = new int[1] ;
      P01X82_A218BarTipCol = new byte[1] ;
      P01X82_A921BarMatiz = new short[1] ;
      P01X82_A1923BarCodTN = new int[1] ;
      P01X82_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P01X82_n2448BarFecEnR = new boolean[] {false} ;
      P01X82_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2448BarFecEnR = GXutil.nullDate() ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV36Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens027__default(),
         new Object[] {
             new Object[] {
            P01X82_A130BarCodPar, P01X82_A132BarCodReo, P01X82_A129BarCod, P01X82_A396EmprCod, P01X82_A252CliCod, P01X82_n252CliCod, P01X82_A212BarSer, P01X82_A135BarColNom, P01X82_A136BarColNum, P01X82_A218BarTipCol,
            P01X82_A921BarMatiz, P01X82_A1923BarCodTN, P01X82_A2448BarFecEnR, P01X82_n2448BarFecEnR, P01X82_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      AV36Pgmname = "GestionLaboratorio.PENS027" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV36Pgmname = "GestionLaboratorio.PENS027" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV29BarCodReo ;
   private byte AV18TipCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte GXv_int8[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV28BarCod ;
   private int AV17ColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1923BarCodTN ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private String AV27EmprCod ;
   private String AV30BarCodPar ;
   private String AV16ColNom ;
   private String AV25Msg1 ;
   private String GXt_char1 ;
   private String AV21Station ;
   private String GXt_char3 ;
   private String AV23EmprNom ;
   private String AV22UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private String AV36Pgmname ;
   private java.util.Date A2448BarFecEnR ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n2448BarFecEnR ;
   private String AV24texto_i ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01X82_A130BarCodPar ;
   private byte[] P01X82_A132BarCodReo ;
   private int[] P01X82_A129BarCod ;
   private String[] P01X82_A396EmprCod ;
   private int[] P01X82_A252CliCod ;
   private boolean[] P01X82_n252CliCod ;
   private String[] P01X82_A212BarSer ;
   private String[] P01X82_A135BarColNom ;
   private int[] P01X82_A136BarColNum ;
   private byte[] P01X82_A218BarTipCol ;
   private short[] P01X82_A921BarMatiz ;
   private int[] P01X82_A1923BarCodTN ;
   private java.util.Date[] P01X82_A2448BarFecEnR ;
   private boolean[] P01X82_n2448BarFecEnR ;
   private byte[] P01X82_A213BarSit ;
}

final  class pens027__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01X82", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarMatiz, BarCodTN, BarFecEnR, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01X83", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarTipCol=?, BarMatiz=?, BarCodTN=?, BarFecEnR=?, BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[6]);
               }
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               return;
      }
   }

}

