package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppieuni extends GXProcedure
{
   public ppieuni( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppieuni.class ), "" );
   }

   public ppieuni( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppieuni.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      ppieuni.this.AV25EmprCod = aP0[0];
      this.aP0 = aP0;
      ppieuni.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV26Velta ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int1) ;
      ppieuni.this.AV26Velta = GXv_int1[0] ;
      /* Using cursor P009O4 */
      pr_default.execute(0, new Object[] {AV25EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P009O4_A396EmprCod[0] ;
         A375DisNumUni = P009O4_A375DisNumUni[0] ;
         A374DisNumPie = P009O4_A374DisNumPie[0] ;
         A392DisUniMed = P009O4_A392DisUniMed[0] ;
         A2009DisTipDis = P009O4_A2009DisTipDis[0] ;
         n2009DisTipDis = P009O4_n2009DisTipDis[0] ;
         A1013DibCli = P009O4_A1013DibCli[0] ;
         n1013DibCli = P009O4_n1013DibCli[0] ;
         A252CliCod = P009O4_A252CliCod[0] ;
         A1014DibInt = P009O4_A1014DibInt[0] ;
         n1014DibInt = P009O4_n1014DibInt[0] ;
         A387DisPiePie = P009O4_A387DisPiePie[0] ;
         n387DisPiePie = P009O4_n387DisPiePie[0] ;
         A379DisPie = P009O4_A379DisPie[0] ;
         n379DisPie = P009O4_n379DisPie[0] ;
         A365DisDes = P009O4_A365DisDes[0] ;
         A387DisPiePie = P009O4_A387DisPiePie[0] ;
         n387DisPiePie = P009O4_n387DisPiePie[0] ;
         A379DisPie = P009O4_A379DisPie[0] ;
         n379DisPie = P009O4_n379DisPie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV17DisNumUni = A375DisNumUni ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A374DisNumPie = ((A387DisPiePie>0) ? A387DisPiePie : A374DisNumPie) ;
         }
         else
         {
            A374DisNumPie = ((A379DisPie>0) ? A379DisPie : A374DisNumPie) ;
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            A375DisNumUni = ((A381DisPieKgm.doubleValue()>0) ? A381DisPieKgm : AV17DisNumUni) ;
         }
         else
         {
            A375DisNumUni = ((A385DisPieMtr.doubleValue()>0) ? A385DisPieMtr : AV17DisNumUni) ;
         }
         if ( ( AV26Velta == 1 ) && ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "F", "")) == 0 ) ) )
         {
            GXv_char2[0] = AV25EmprCod ;
            GXv_char3[0] = A1013DibCli ;
            GXv_int4[0] = A252CliCod ;
            GXv_int5[0] = A1014DibInt ;
            GXv_decimal6[0] = A385DisPieMtr ;
            GXv_decimal7[0] = AV17DisNumUni ;
            new app.psumtes(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_decimal7) ;
            ppieuni.this.AV25EmprCod = GXv_char2[0] ;
            ppieuni.this.A1013DibCli = GXv_char3[0] ;
            ppieuni.this.A252CliCod = GXv_int4[0] ;
            ppieuni.this.A1014DibInt = GXv_int5[0] ;
            ppieuni.this.A385DisPieMtr = GXv_decimal6[0] ;
            ppieuni.this.AV17DisNumUni = GXv_decimal7[0] ;
         }
         AV20DisTipDis = A2009DisTipDis ;
         AV17DisNumUni = A375DisNumUni ;
         AV21DisNumPie = A374DisNumPie ;
         /* Using cursor P009O5 */
         pr_default.execute(1, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppieuni.this.AV25EmprCod;
      this.aP1[0] = ppieuni.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppieuni");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P009O6 */
      pr_default.execute(2, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         X595Kilos = P009O6_A595Kilos[0] ;
      }
      pr_default.close(2);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P009O7 */
      pr_default.execute(3, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         X382DisPieKil = P009O7_A382DisPieKil[0] ;
      }
      pr_default.close(3);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P009O8 */
      pr_default.execute(4, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         X631Metros = P009O8_A631Metros[0] ;
      }
      pr_default.close(4);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P009O9 */
      pr_default.execute(5, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         X384DisPieMet = P009O9_A384DisPieMet[0] ;
      }
      pr_default.close(5);
      return X384DisPieMet ;
   }

   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P009O4_A361DisCod = new int[1] ;
      P009O4_A396EmprCod = new String[] {""} ;
      P009O4_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009O4_A374DisNumPie = new short[1] ;
      P009O4_A392DisUniMed = new String[] {""} ;
      P009O4_A2009DisTipDis = new String[] {""} ;
      P009O4_n2009DisTipDis = new boolean[] {false} ;
      P009O4_A1013DibCli = new String[] {""} ;
      P009O4_n1013DibCli = new boolean[] {false} ;
      P009O4_A252CliCod = new int[1] ;
      P009O4_A1014DibInt = new int[1] ;
      P009O4_n1014DibInt = new boolean[] {false} ;
      P009O4_A387DisPiePie = new short[1] ;
      P009O4_n387DisPiePie = new boolean[] {false} ;
      P009O4_A379DisPie = new short[1] ;
      P009O4_n379DisPie = new boolean[] {false} ;
      P009O4_A365DisDes = new String[] {""} ;
      A396EmprCod = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A2009DisTipDis = "" ;
      A1013DibCli = "" ;
      A365DisDes = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      AV17DisNumUni = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV20DisTipDis = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P009O6_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P009O7_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      P009O8_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P009O9_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppieuni__default(),
         new Object[] {
             new Object[] {
            P009O4_A361DisCod, P009O4_A396EmprCod, P009O4_A375DisNumUni, P009O4_A374DisNumPie, P009O4_A392DisUniMed, P009O4_A2009DisTipDis, P009O4_n2009DisTipDis, P009O4_A1013DibCli, P009O4_n1013DibCli, P009O4_A252CliCod,
            P009O4_A1014DibInt, P009O4_n1014DibInt, P009O4_A387DisPiePie, P009O4_n387DisPiePie, P009O4_A379DisPie, P009O4_n379DisPie, P009O4_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P009O6_A595Kilos
            }
            , new Object[] {
            P009O7_A382DisPieKil
            }
            , new Object[] {
            P009O8_A631Metros
            }
            , new Object[] {
            P009O9_A384DisPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26Velta ;
   private byte GXv_int1[] ;
   private short A374DisNumPie ;
   private short A387DisPiePie ;
   private short A379DisPie ;
   private short AV21DisNumPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int E361DisCod ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal AV17DisNumUni ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String AV25EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A392DisUniMed ;
   private String A2009DisTipDis ;
   private String A1013DibCli ;
   private String A365DisDes ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV20DisTipDis ;
   private String E396EmprCod ;
   private boolean n2009DisTipDis ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n387DisPiePie ;
   private boolean n379DisPie ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P009O4_A361DisCod ;
   private String[] P009O4_A396EmprCod ;
   private java.math.BigDecimal[] P009O4_A375DisNumUni ;
   private short[] P009O4_A374DisNumPie ;
   private String[] P009O4_A392DisUniMed ;
   private String[] P009O4_A2009DisTipDis ;
   private boolean[] P009O4_n2009DisTipDis ;
   private String[] P009O4_A1013DibCli ;
   private boolean[] P009O4_n1013DibCli ;
   private int[] P009O4_A252CliCod ;
   private int[] P009O4_A1014DibInt ;
   private boolean[] P009O4_n1014DibInt ;
   private short[] P009O4_A387DisPiePie ;
   private boolean[] P009O4_n387DisPiePie ;
   private short[] P009O4_A379DisPie ;
   private boolean[] P009O4_n379DisPie ;
   private String[] P009O4_A365DisDes ;
   private java.math.BigDecimal[] P009O6_A595Kilos ;
   private java.math.BigDecimal[] P009O7_A382DisPieKil ;
   private java.math.BigDecimal[] P009O8_A631Metros ;
   private java.math.BigDecimal[] P009O9_A384DisPieMet ;
}

final  class ppieuni__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009O4", "SELECT T1.DisCod, T1.EmprCod, T1.DisNumUni, T1.DisNumPie, T1.DisUniMed, T1.DisTipDis, T1.DibCli, T1.CliCod, T1.DibInt, COALESCE( T2.DisPiePie, 0) AS DisPiePie, COALESCE( T3.DisPie, 0) AS DisPie, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009O5", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P009O6", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009O7", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009O8", "SELECT SUM(Metros) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009O9", "SELECT SUM(DisPieMet) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

