package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmosito extends GXProcedure
{
   public pmosito( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmosito.class ), "" );
   }

   public pmosito( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pmosito.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pmosito.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmosito.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      pmosito.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmosito.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmosito.this.AV15Sit = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pmosito.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      pmosito.this.A396EmprCod = GXv_char2[0] ;
      pmosito.this.AV28EmprNom = GXv_char3[0] ;
      pmosito.this.AV29UsurCod = GXv_char4[0] ;
      /* Using cursor P00O02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00O02_A130BarCodPar[0] ;
         A132BarCodReo = P00O02_A132BarCodReo[0] ;
         A129BarCod = P00O02_A129BarCod[0] ;
         A252CliCod = P00O02_A252CliCod[0] ;
         n252CliCod = P00O02_n252CliCod[0] ;
         A135BarColNom = P00O02_A135BarColNom[0] ;
         A136BarColNum = P00O02_A136BarColNum[0] ;
         A212BarSer = P00O02_A212BarSer[0] ;
         A218BarTipCol = P00O02_A218BarTipCol[0] ;
         A3313BarNumTon = P00O02_A3313BarNumTon[0] ;
         A213BarSit = P00O02_A213BarSit[0] ;
         A147BarEstCol = P00O02_A147BarEstCol[0] ;
         A3870BarFecLRe = P00O02_A3870BarFecLRe[0] ;
         AV16EmprCod = A396EmprCod ;
         AV18CliCod = A252CliCod ;
         AV20ForColNom = A135BarColNom ;
         AV21ForColNum = A136BarColNum ;
         AV19ForSer = A212BarSer ;
         AV22TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'FORMULA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A3313BarNumTon = AV17BarNumTon ;
         if ( A213BarSit <= 4 )
         {
            AV26Inc_obs = httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + GXutil.str( AV15Sit, 2, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV29UsurCod, AV27Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = AV15Sit ;
         }
         if ( AV15Sit == 1 )
         {
            A147BarEstCol = (byte)(1) ;
         }
         A3870BarFecLRe = Gx_date ;
         /* Using cursor P00O03 */
         pr_default.execute(1, new Object[] {A3313BarNumTon, Byte.valueOf(A213BarSit), Byte.valueOf(A147BarEstCol), A3870BarFecLRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FORMULA' Routine */
      returnInSub = false ;
      AV17BarNumTon = "" ;
      /* Using cursor P00O04 */
      pr_default.execute(2, new Object[] {AV16EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P00O04_A831TipColCod[0] ;
         A483ForColNum = P00O04_A483ForColNum[0] ;
         A482ForColNom = P00O04_A482ForColNom[0] ;
         A494ForSer = P00O04_A494ForSer[0] ;
         A252CliCod = P00O04_A252CliCod[0] ;
         n252CliCod = P00O04_n252CliCod[0] ;
         A995ForTonal = P00O04_A995ForTonal[0] ;
         n995ForTonal = P00O04_n995ForTonal[0] ;
         AV17BarNumTon = GXutil.substring( A995ForTonal, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmosito.this.A396EmprCod;
      this.aP1[0] = pmosito.this.AV23BarCod;
      this.aP2[0] = pmosito.this.AV24BarCodReo;
      this.aP3[0] = pmosito.this.AV25BarCodPar;
      this.aP4[0] = pmosito.this.AV15Sit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmosito");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV29UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00O02_A396EmprCod = new String[] {""} ;
      P00O02_A130BarCodPar = new String[] {""} ;
      P00O02_A132BarCodReo = new byte[1] ;
      P00O02_A129BarCod = new int[1] ;
      P00O02_A252CliCod = new int[1] ;
      P00O02_n252CliCod = new boolean[] {false} ;
      P00O02_A135BarColNom = new String[] {""} ;
      P00O02_A136BarColNum = new int[1] ;
      P00O02_A212BarSer = new String[] {""} ;
      P00O02_A218BarTipCol = new byte[1] ;
      P00O02_A3313BarNumTon = new String[] {""} ;
      P00O02_A213BarSit = new byte[1] ;
      P00O02_A147BarEstCol = new byte[1] ;
      P00O02_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A3313BarNumTon = "" ;
      A3870BarFecLRe = GXutil.nullDate() ;
      AV16EmprCod = "" ;
      AV20ForColNom = "" ;
      AV19ForSer = "" ;
      AV17BarNumTon = "" ;
      AV26Inc_obs = "" ;
      AV33Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      P00O04_A831TipColCod = new byte[1] ;
      P00O04_A483ForColNum = new int[1] ;
      P00O04_A482ForColNom = new String[] {""} ;
      P00O04_A494ForSer = new String[] {""} ;
      P00O04_A252CliCod = new int[1] ;
      P00O04_n252CliCod = new boolean[] {false} ;
      P00O04_A396EmprCod = new String[] {""} ;
      P00O04_A995ForTonal = new String[] {""} ;
      P00O04_n995ForTonal = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A995ForTonal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmosito__default(),
         new Object[] {
             new Object[] {
            P00O02_A396EmprCod, P00O02_A130BarCodPar, P00O02_A132BarCodReo, P00O02_A129BarCod, P00O02_A252CliCod, P00O02_n252CliCod, P00O02_A135BarColNom, P00O02_A136BarColNum, P00O02_A212BarSer, P00O02_A218BarTipCol,
            P00O02_A3313BarNumTon, P00O02_A213BarSit, P00O02_A147BarEstCol, P00O02_A3870BarFecLRe
            }
            , new Object[] {
            }
            , new Object[] {
            P00O04_A831TipColCod, P00O04_A483ForColNum, P00O04_A482ForColNom, P00O04_A494ForSer, P00O04_A252CliCod, P00O04_A396EmprCod, P00O04_A995ForTonal, P00O04_n995ForTonal
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV33Pgmname = "PMOSITO" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV33Pgmname = "PMOSITO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte AV15Sit ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A147BarEstCol ;
   private byte AV22TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV18CliCod ;
   private int AV21ForColNum ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV25BarCodPar ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String GXv_char3[] ;
   private String AV29UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A3313BarNumTon ;
   private String AV16EmprCod ;
   private String AV20ForColNom ;
   private String AV19ForSer ;
   private String AV17BarNumTon ;
   private String AV33Pgmname ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A995ForTonal ;
   private java.util.Date A3870BarFecLRe ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n995ForTonal ;
   private String AV26Inc_obs ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00O02_A396EmprCod ;
   private String[] P00O02_A130BarCodPar ;
   private byte[] P00O02_A132BarCodReo ;
   private int[] P00O02_A129BarCod ;
   private int[] P00O02_A252CliCod ;
   private boolean[] P00O02_n252CliCod ;
   private String[] P00O02_A135BarColNom ;
   private int[] P00O02_A136BarColNum ;
   private String[] P00O02_A212BarSer ;
   private byte[] P00O02_A218BarTipCol ;
   private String[] P00O02_A3313BarNumTon ;
   private byte[] P00O02_A213BarSit ;
   private byte[] P00O02_A147BarEstCol ;
   private java.util.Date[] P00O02_A3870BarFecLRe ;
   private byte[] P00O04_A831TipColCod ;
   private int[] P00O04_A483ForColNum ;
   private String[] P00O04_A482ForColNom ;
   private String[] P00O04_A494ForSer ;
   private int[] P00O04_A252CliCod ;
   private boolean[] P00O04_n252CliCod ;
   private String[] P00O04_A396EmprCod ;
   private String[] P00O04_A995ForTonal ;
   private boolean[] P00O04_n995ForTonal ;
}

final  class pmosito__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00O02", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarColNom, BarColNum, BarSer, BarTipCol, BarNumTon, BarSit, BarEstCol, BarFecLRe FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00O03", "UPDATE TXPBARCAD SET BarNumTon=?, BarSit=?, BarEstCol=?, BarFecLRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00O04", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForTonal FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

