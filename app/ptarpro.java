package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptarpro extends GXProcedure
{
   public ptarpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptarpro.class ), "" );
   }

   public ptarpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           byte[] aP6 )
   {
      ptarpro.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ptarpro.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptarpro.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptarpro.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptarpro.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ptarpro.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ptarpro.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ptarpro.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ptarpro.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV61FlagGua = (byte)(0) ;
      GXv_int1[0] = AV61FlagGua ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int1) ;
      ptarpro.this.AV61FlagGua = GXv_int1[0] ;
      AV64Calvet = (byte)(0) ;
      GXv_int1[0] = AV64Calvet ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CALVET", ""), GXv_int1) ;
      ptarpro.this.AV64Calvet = GXv_int1[0] ;
      GXt_int2 = AV65Utexta ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "UTEXTA", ""), GXv_int1) ;
      ptarpro.this.GXt_int2 = GXv_int1[0] ;
      AV65Utexta = GXt_int2 ;
      AV52FlagPre = (byte)(0) ;
      /* Using cursor P00MN2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00MN2_A130BarCodPar[0] ;
         A132BarCodReo = P00MN2_A132BarCodReo[0] ;
         A129BarCod = P00MN2_A129BarCod[0] ;
         A396EmprCod = P00MN2_A396EmprCod[0] ;
         A252CliCod = P00MN2_A252CliCod[0] ;
         n252CliCod = P00MN2_n252CliCod[0] ;
         A212BarSer = P00MN2_A212BarSer[0] ;
         A135BarColNom = P00MN2_A135BarColNom[0] ;
         A136BarColNum = P00MN2_A136BarColNum[0] ;
         A218BarTipCol = P00MN2_A218BarTipCol[0] ;
         A193BarOpeEsp = P00MN2_A193BarOpeEsp[0] ;
         A161BarFecSal = P00MN2_A161BarFecSal[0] ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV49ForSer = A212BarSer ;
         AV50ForColNom = A135BarColNom ;
         AV51ForColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'FORMULA' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV62Procesos = (byte)(0) ;
         /* Using cursor P00MN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P00MN3_A758ProCod[0] ;
            AV48ProCod = A758ProCod ;
            AV53FlagPro = (byte)(0) ;
            if ( ( ( AV61FlagGua == 1 ) || ( AV64Calvet == 1 ) ) && ( AV62Procesos != 0 ) )
            {
               AV25IntCod = (byte)(99) ;
            }
            if ( AV65Utexta == 1 )
            {
               AV25IntCod = (byte)(99) ;
            }
            /* Execute user subroutine: 'PRECIOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV53FlagPro == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV62Procesos = (byte)(AV62Procesos+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV53FlagPro == 0 ) || ( AV52FlagPre == 1 ) )
         {
            AV21Operesp = (byte)(2) ;
         }
         else
         {
            if ( ( AV53FlagPro == 1 ) && ( AV52FlagPre == 0 ) )
            {
               if ( ( A193BarOpeEsp == 1 ) || ( A193BarOpeEsp == 5 ) || ( A193BarOpeEsp == 7 ) )
               {
                  AV21Operesp = A193BarOpeEsp ;
               }
               else
               {
                  AV21Operesp = (byte)(A193BarOpeEsp+10) ;
               }
            }
         }
         A161BarFecSal = GXutil.today( ) ;
         /* Using cursor P00MN4 */
         pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      AV19PreKgm = DecimalUtil.doubleToDec(0) ;
      AV20PreMts = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00MN5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV48ProCod, AV31BarSer, Byte.valueOf(AV25IntCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A583IntCod = P00MN5_A583IntCod[0] ;
         A1504CliProCod = P00MN5_A1504CliProCod[0] ;
         A65ArtCod = P00MN5_A65ArtCod[0] ;
         A252CliCod = P00MN5_A252CliCod[0] ;
         n252CliCod = P00MN5_n252CliCod[0] ;
         A396EmprCod = P00MN5_A396EmprCod[0] ;
         A1464ProPreMtr = P00MN5_A1464ProPreMtr[0] ;
         n1464ProPreMtr = P00MN5_n1464ProPreMtr[0] ;
         A1465ProPreKgm = P00MN5_A1465ProPreKgm[0] ;
         n1465ProPreKgm = P00MN5_n1465ProPreKgm[0] ;
         AV53FlagPro = (byte)(1) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1465ProPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1464ProPreMtr)==0) )
         {
            AV52FlagPre = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'FORMULA' Routine */
      returnInSub = false ;
      AV25IntCod = (byte)(99) ;
      /* Using cursor P00MN6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV49ForSer, AV50ForColNom, Integer.valueOf(AV51ForColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P00MN6_A831TipColCod[0] ;
         A483ForColNum = P00MN6_A483ForColNum[0] ;
         A482ForColNom = P00MN6_A482ForColNom[0] ;
         A494ForSer = P00MN6_A494ForSer[0] ;
         A252CliCod = P00MN6_A252CliCod[0] ;
         n252CliCod = P00MN6_n252CliCod[0] ;
         A396EmprCod = P00MN6_A396EmprCod[0] ;
         A583IntCod = P00MN6_A583IntCod[0] ;
         AV25IntCod = A583IntCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptarpro.this.AV15EmprCod;
      this.aP1[0] = ptarpro.this.AV16BarCod;
      this.aP2[0] = ptarpro.this.AV17BarReo;
      this.aP3[0] = ptarpro.this.AV18BarPar;
      this.aP4[0] = ptarpro.this.AV19PreKgm;
      this.aP5[0] = ptarpro.this.AV20PreMts;
      this.aP6[0] = ptarpro.this.AV21Operesp;
      this.aP7[0] = ptarpro.this.AV22TotRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptarpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00MN2_A130BarCodPar = new String[] {""} ;
      P00MN2_A132BarCodReo = new byte[1] ;
      P00MN2_A129BarCod = new int[1] ;
      P00MN2_A396EmprCod = new String[] {""} ;
      P00MN2_A252CliCod = new int[1] ;
      P00MN2_n252CliCod = new boolean[] {false} ;
      P00MN2_A212BarSer = new String[] {""} ;
      P00MN2_A135BarColNom = new String[] {""} ;
      P00MN2_A136BarColNum = new int[1] ;
      P00MN2_A218BarTipCol = new byte[1] ;
      P00MN2_A193BarOpeEsp = new byte[1] ;
      P00MN2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV49ForSer = "" ;
      AV50ForColNom = "" ;
      P00MN3_A396EmprCod = new String[] {""} ;
      P00MN3_A129BarCod = new int[1] ;
      P00MN3_A132BarCodReo = new byte[1] ;
      P00MN3_A130BarCodPar = new String[] {""} ;
      P00MN3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV48ProCod = "" ;
      P00MN5_A583IntCod = new byte[1] ;
      P00MN5_A1504CliProCod = new String[] {""} ;
      P00MN5_A65ArtCod = new String[] {""} ;
      P00MN5_A252CliCod = new int[1] ;
      P00MN5_n252CliCod = new boolean[] {false} ;
      P00MN5_A396EmprCod = new String[] {""} ;
      P00MN5_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MN5_n1464ProPreMtr = new boolean[] {false} ;
      P00MN5_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MN5_n1465ProPreKgm = new boolean[] {false} ;
      A1504CliProCod = "" ;
      A65ArtCod = "" ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      P00MN6_A831TipColCod = new byte[1] ;
      P00MN6_A483ForColNum = new int[1] ;
      P00MN6_A482ForColNom = new String[] {""} ;
      P00MN6_A494ForSer = new String[] {""} ;
      P00MN6_A252CliCod = new int[1] ;
      P00MN6_n252CliCod = new boolean[] {false} ;
      P00MN6_A396EmprCod = new String[] {""} ;
      P00MN6_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptarpro__default(),
         new Object[] {
             new Object[] {
            P00MN2_A130BarCodPar, P00MN2_A132BarCodReo, P00MN2_A129BarCod, P00MN2_A396EmprCod, P00MN2_A252CliCod, P00MN2_n252CliCod, P00MN2_A212BarSer, P00MN2_A135BarColNom, P00MN2_A136BarColNum, P00MN2_A218BarTipCol,
            P00MN2_A193BarOpeEsp, P00MN2_A161BarFecSal
            }
            , new Object[] {
            P00MN3_A396EmprCod, P00MN3_A129BarCod, P00MN3_A132BarCodReo, P00MN3_A130BarCodPar, P00MN3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00MN5_A583IntCod, P00MN5_A1504CliProCod, P00MN5_A65ArtCod, P00MN5_A252CliCod, P00MN5_A396EmprCod, P00MN5_A1464ProPreMtr, P00MN5_n1464ProPreMtr, P00MN5_A1465ProPreKgm, P00MN5_n1465ProPreKgm
            }
            , new Object[] {
            P00MN6_A831TipColCod, P00MN6_A483ForColNum, P00MN6_A482ForColNom, P00MN6_A494ForSer, P00MN6_A252CliCod, P00MN6_A396EmprCod, P00MN6_A583IntCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV21Operesp ;
   private byte AV61FlagGua ;
   private byte AV64Calvet ;
   private byte AV65Utexta ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte AV52FlagPre ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte AV62Procesos ;
   private byte AV53FlagPro ;
   private byte AV25IntCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV35CliCod ;
   private int AV51ForColNum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private java.math.BigDecimal A1465ProPreKgm ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV31BarSer ;
   private String AV49ForSer ;
   private String AV50ForColNom ;
   private String A758ProCod ;
   private String AV48ProCod ;
   private String A1504CliProCod ;
   private String A65ArtCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private java.util.Date A161BarFecSal ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n1464ProPreMtr ;
   private boolean n1465ProPreKgm ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MN2_A130BarCodPar ;
   private byte[] P00MN2_A132BarCodReo ;
   private int[] P00MN2_A129BarCod ;
   private String[] P00MN2_A396EmprCod ;
   private int[] P00MN2_A252CliCod ;
   private boolean[] P00MN2_n252CliCod ;
   private String[] P00MN2_A212BarSer ;
   private String[] P00MN2_A135BarColNom ;
   private int[] P00MN2_A136BarColNum ;
   private byte[] P00MN2_A218BarTipCol ;
   private byte[] P00MN2_A193BarOpeEsp ;
   private java.util.Date[] P00MN2_A161BarFecSal ;
   private String[] P00MN3_A396EmprCod ;
   private int[] P00MN3_A129BarCod ;
   private byte[] P00MN3_A132BarCodReo ;
   private String[] P00MN3_A130BarCodPar ;
   private String[] P00MN3_A758ProCod ;
   private byte[] P00MN5_A583IntCod ;
   private String[] P00MN5_A1504CliProCod ;
   private String[] P00MN5_A65ArtCod ;
   private int[] P00MN5_A252CliCod ;
   private boolean[] P00MN5_n252CliCod ;
   private String[] P00MN5_A396EmprCod ;
   private java.math.BigDecimal[] P00MN5_A1464ProPreMtr ;
   private boolean[] P00MN5_n1464ProPreMtr ;
   private java.math.BigDecimal[] P00MN5_A1465ProPreKgm ;
   private boolean[] P00MN5_n1465ProPreKgm ;
   private byte[] P00MN6_A831TipColCod ;
   private int[] P00MN6_A483ForColNum ;
   private String[] P00MN6_A482ForColNom ;
   private String[] P00MN6_A494ForSer ;
   private int[] P00MN6_A252CliCod ;
   private boolean[] P00MN6_n252CliCod ;
   private String[] P00MN6_A396EmprCod ;
   private byte[] P00MN6_A583IntCod ;
}

final  class ptarpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MN2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarOpeEsp, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00MN3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00MN4", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00MN5", "SELECT IntCod, CliProCod, ArtCod, CliCod, EmprCod, ProPreMtr, ProPreKgm FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00MN6", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
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

