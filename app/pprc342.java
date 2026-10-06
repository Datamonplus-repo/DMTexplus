package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc342 extends GXProcedure
{
   public pprc342( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc342.class ), "" );
   }

   public pprc342( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          java.util.Date[] aP1 ,
                          java.util.Date[] aP2 ,
                          int[] aP3 ,
                          byte[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          String[] AV8tabla_hdrs )
   {
      pprc342.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, AV8tabla_hdrs, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] AV8tabla_hdrs ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, AV8tabla_hdrs, aP8);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] AV8tabla_hdrs ,
                             int[] aP8 )
   {
      pprc342.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc342.this.AV10barfecsal = aP1[0];
      this.aP1 = aP1;
      pprc342.this.AV11barfecsal_to = aP2[0];
      this.aP2 = aP2;
      pprc342.this.AV12Hdr = aP3[0];
      this.aP3 = aP3;
      pprc342.this.AV13r = aP4[0];
      this.aP4 = aP4;
      pprc342.this.AV14p = aP5[0];
      this.aP5 = aP5;
      pprc342.this.AV16factur = aP6[0];
      this.aP6 = aP6;
      pprc342.this.AV8tabla_hdrs = AV8tabla_hdrs;
      pprc342.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV8tabla_hdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9i = 1 ;
      /* Using cursor P09R12 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10barfecsal, Integer.valueOf(AV12Hdr), Integer.valueOf(AV12Hdr), Byte.valueOf(AV13r), Byte.valueOf(AV13r), AV14p, AV14p, AV11barfecsal_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P09R12_A213BarSit[0] ;
         A130BarCodPar = P09R12_A130BarCodPar[0] ;
         A132BarCodReo = P09R12_A132BarCodReo[0] ;
         A129BarCod = P09R12_A129BarCod[0] ;
         A161BarFecSal = P09R12_A161BarFecSal[0] ;
         AV15FlagFact = (byte)(0) ;
         if ( GXutil.strcmp(AV16factur, httpContext.getMessage( "NO", "")) == 0 )
         {
            AV15FlagFact = (byte)(1) ;
         }
         else
         {
            AV15FlagFact = (byte)(1) ;
            /* Using cursor P09R13 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A30AlbProCod = P09R13_A30AlbProCod[0] ;
               A32AlbProEsp = P09R13_A32AlbProEsp[0] ;
               A33AlbProEst = P09R13_A33AlbProEst[0] ;
               A33AlbProEst = P09R13_A33AlbProEst[0] ;
               if ( A33AlbProEst != 2 )
               {
                  AV15FlagFact = (byte)(0) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         if ( AV15FlagFact == 1 )
         {
            if ( AV9i > 10000 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 10000 registros", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            else
            {
               AV8tabla_hdrs[AV9i-1] = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            }
            System.out.println( httpContext.getMessage( "actualizando array .. ", "")+GXutil.str( AV9i, 6, 0) );
            AV9i = (int)(AV9i+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9i = (int)(AV9i-1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc342.this.A396EmprCod;
      this.aP1[0] = pprc342.this.AV10barfecsal;
      this.aP2[0] = pprc342.this.AV11barfecsal_to;
      this.aP3[0] = pprc342.this.AV12Hdr;
      this.aP4[0] = pprc342.this.AV13r;
      this.aP5[0] = pprc342.this.AV14p;
      this.aP6[0] = pprc342.this.AV16factur;
      this.AV8tabla_hdrs = pprc342.this.AV8tabla_hdrs;
      this.aP8[0] = pprc342.this.AV9i;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09R12_A396EmprCod = new String[] {""} ;
      P09R12_A213BarSit = new byte[1] ;
      P09R12_A130BarCodPar = new String[] {""} ;
      P09R12_A132BarCodReo = new byte[1] ;
      P09R12_A129BarCod = new int[1] ;
      P09R12_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      P09R13_A30AlbProCod = new long[1] ;
      P09R13_A396EmprCod = new String[] {""} ;
      P09R13_A129BarCod = new int[1] ;
      P09R13_A132BarCodReo = new byte[1] ;
      P09R13_A130BarCodPar = new String[] {""} ;
      P09R13_A32AlbProEsp = new byte[1] ;
      P09R13_A33AlbProEst = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc342__default(),
         new Object[] {
             new Object[] {
            P09R12_A396EmprCod, P09R12_A213BarSit, P09R12_A130BarCodPar, P09R12_A132BarCodReo, P09R12_A129BarCod, P09R12_A161BarFecSal
            }
            , new Object[] {
            P09R13_A30AlbProCod, P09R13_A396EmprCod, P09R13_A129BarCod, P09R13_A132BarCodReo, P09R13_A130BarCodPar, P09R13_A32AlbProEsp, P09R13_A33AlbProEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13r ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV15FlagFact ;
   private byte A32AlbProEsp ;
   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV12Hdr ;
   private int AV9i ;
   private int GX_I ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV14p ;
   private String AV16factur ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private java.util.Date AV10barfecsal ;
   private java.util.Date AV11barfecsal_to ;
   private java.util.Date A161BarFecSal ;
   private int[] aP8 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] AV8tabla_hdrs ;
   private IDataStoreProvider pr_default ;
   private String[] P09R12_A396EmprCod ;
   private byte[] P09R12_A213BarSit ;
   private String[] P09R12_A130BarCodPar ;
   private byte[] P09R12_A132BarCodReo ;
   private int[] P09R12_A129BarCod ;
   private java.util.Date[] P09R12_A161BarFecSal ;
   private long[] P09R13_A30AlbProCod ;
   private String[] P09R13_A396EmprCod ;
   private int[] P09R13_A129BarCod ;
   private byte[] P09R13_A132BarCodReo ;
   private String[] P09R13_A130BarCodPar ;
   private byte[] P09R13_A32AlbProEsp ;
   private byte[] P09R13_A33AlbProEst ;
}

final  class pprc342__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R12", "SELECT EmprCod, BarSit, BarCodPar, BarCodReo, BarCod, BarFecSal FROM TXPBARCAD WHERE (EmprCod = ? and BarSit = 9 and BarFecSal >= ?) AND (Not (BarFecSal = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (BarCod = ? or (? = 0)) AND (BarCodReo = ? or (? = 0)) AND (BarCodPar = ? or (rtrim(?) IS NULL)) AND (BarFecSal <= ?) ORDER BY EmprCod, BarSit, BarFecSal, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R13", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProEsp, T2.AlbProEst FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setDate(9, (java.util.Date)parms[8]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

