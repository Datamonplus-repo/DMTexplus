package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens028 extends GXProcedure
{
   public pens028( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens028.class ), "" );
   }

   public pens028( int remoteHandle ,
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
                           String[] aP5 ,
                           int[] aP6 )
   {
      pens028.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pens028.this.AV26EmprCod = aP0[0];
      this.aP0 = aP0;
      pens028.this.AV27BarCod = aP1[0];
      this.aP1 = aP1;
      pens028.this.AV28BarCodReo = aP2[0];
      this.aP2 = aP2;
      pens028.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      pens028.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pens028.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pens028.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pens028.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens028.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens028.this.AV26EmprCod = GXv_char2[0] ;
      pens028.this.AV23EmprNom = GXv_char3[0] ;
      pens028.this.AV24Usurcod = GXv_char4[0] ;
      AV21Texto_i = "" ;
      /* Using cursor P01XI2 */
      pr_default.execute(0, new Object[] {AV26EmprCod, Integer.valueOf(AV27BarCod), Byte.valueOf(AV28BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01XI2_A130BarCodPar[0] ;
         A132BarCodReo = P01XI2_A132BarCodReo[0] ;
         A129BarCod = P01XI2_A129BarCod[0] ;
         A396EmprCod = P01XI2_A396EmprCod[0] ;
         A252CliCod = P01XI2_A252CliCod[0] ;
         n252CliCod = P01XI2_n252CliCod[0] ;
         A135BarColNom = P01XI2_A135BarColNom[0] ;
         A136BarColNum = P01XI2_A136BarColNum[0] ;
         A218BarTipCol = P01XI2_A218BarTipCol[0] ;
         A921BarMatiz = P01XI2_A921BarMatiz[0] ;
         A213BarSit = P01XI2_A213BarSit[0] ;
         A1923BarCodTN = P01XI2_A1923BarCodTN[0] ;
         A2448BarFecEnR = P01XI2_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P01XI2_n2448BarFecEnR[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = AV15BarSer ;
         GXv_char2[0] = AV16ColNom ;
         GXv_int6[0] = AV17ColNum ;
         GXv_int7[0] = AV18TipCol ;
         GXv_int8[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7, GXv_int8) ;
         pens028.this.A396EmprCod = GXv_char4[0] ;
         pens028.this.A252CliCod = GXv_int5[0] ;
         pens028.this.AV15BarSer = GXv_char3[0] ;
         pens028.this.AV16ColNom = GXv_char2[0] ;
         pens028.this.AV17ColNum = GXv_int6[0] ;
         pens028.this.AV18TipCol = GXv_int7[0] ;
         pens028.this.AV19Matiz = GXv_int8[0] ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A921BarMatiz = AV19Matiz ;
         if ( A213BarSit == 2 )
         {
            A213BarSit = (byte)(1) ;
         }
         A1923BarCodTN = 1 ;
         A2448BarFecEnR = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n2448BarFecEnR = false ;
         AV21Texto_i = httpContext.getMessage( "Cambio Color en Agrupadas ", "") + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV22Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV24Usurcod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
         /* Using cursor P01XI3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A921BarMatiz), Byte.valueOf(A213BarSit), Integer.valueOf(A1923BarCodTN), Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV21Texto_i)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV24Usurcod, AV22Station, AV21Texto_i, AV27BarCod, AV28BarCodReo, AV25BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens028.this.AV26EmprCod;
      this.aP1[0] = pens028.this.AV27BarCod;
      this.aP2[0] = pens028.this.AV28BarCodReo;
      this.aP3[0] = pens028.this.AV25BarCodPar;
      this.aP4[0] = pens028.this.AV15BarSer;
      this.aP5[0] = pens028.this.AV16ColNom;
      this.aP6[0] = pens028.this.AV17ColNum;
      this.aP7[0] = pens028.this.AV18TipCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens028");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV23EmprNom = "" ;
      AV24Usurcod = "" ;
      AV21Texto_i = "" ;
      scmdbuf = "" ;
      P01XI2_A130BarCodPar = new String[] {""} ;
      P01XI2_A132BarCodReo = new byte[1] ;
      P01XI2_A129BarCod = new int[1] ;
      P01XI2_A396EmprCod = new String[] {""} ;
      P01XI2_A252CliCod = new int[1] ;
      P01XI2_n252CliCod = new boolean[] {false} ;
      P01XI2_A135BarColNom = new String[] {""} ;
      P01XI2_A136BarColNum = new int[1] ;
      P01XI2_A218BarTipCol = new byte[1] ;
      P01XI2_A921BarMatiz = new short[1] ;
      P01XI2_A213BarSit = new byte[1] ;
      P01XI2_A1923BarCodTN = new int[1] ;
      P01XI2_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P01XI2_n2448BarFecEnR = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A135BarColNom = "" ;
      A2448BarFecEnR = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV34Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens028__default(),
         new Object[] {
             new Object[] {
            P01XI2_A130BarCodPar, P01XI2_A132BarCodReo, P01XI2_A129BarCod, P01XI2_A396EmprCod, P01XI2_A252CliCod, P01XI2_n252CliCod, P01XI2_A135BarColNom, P01XI2_A136BarColNum, P01XI2_A218BarTipCol, P01XI2_A921BarMatiz,
            P01XI2_A213BarSit, P01XI2_A1923BarCodTN, P01XI2_A2448BarFecEnR, P01XI2_n2448BarFecEnR
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "GestionLaboratorio.PENS028" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV34Pgmname = "GestionLaboratorio.PENS028" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV28BarCodReo ;
   private byte AV18TipCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte GXv_int7[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV27BarCod ;
   private int AV17ColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1923BarCodTN ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private String AV26EmprCod ;
   private String AV25BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV23EmprNom ;
   private String AV24Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A135BarColNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private String AV34Pgmname ;
   private java.util.Date A2448BarFecEnR ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n2448BarFecEnR ;
   private String AV21Texto_i ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XI2_A130BarCodPar ;
   private byte[] P01XI2_A132BarCodReo ;
   private int[] P01XI2_A129BarCod ;
   private String[] P01XI2_A396EmprCod ;
   private int[] P01XI2_A252CliCod ;
   private boolean[] P01XI2_n252CliCod ;
   private String[] P01XI2_A135BarColNom ;
   private int[] P01XI2_A136BarColNum ;
   private byte[] P01XI2_A218BarTipCol ;
   private short[] P01XI2_A921BarMatiz ;
   private byte[] P01XI2_A213BarSit ;
   private int[] P01XI2_A1923BarCodTN ;
   private java.util.Date[] P01XI2_A2448BarFecEnR ;
   private boolean[] P01XI2_n2448BarFecEnR ;
}

final  class pens028__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XI2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarColNom, BarColNum, BarTipCol, BarMatiz, BarSit, BarCodTN, BarFecEnR FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01XI3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarTipCol=?, BarMatiz=?, BarSit=?, BarCodTN=?, BarFecEnR=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[7]);
               }
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               return;
      }
   }

}

