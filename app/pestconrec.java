package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestconrec extends GXProcedure
{
   public pestconrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestconrec.class ), "" );
   }

   public pestconrec( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pestconrec.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pestconrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestconrec.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pestconrec.this.A1013DibCli = aP2[0];
      this.aP2 = aP2;
      pestconrec.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02Q42 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4861DibCob = P02Q42_A4861DibCob[0] ;
         n4861DibCob = P02Q42_n4861DibCob[0] ;
         A1823DibTipMaq = P02Q42_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P02Q42_n1823DibTipMaq[0] ;
         /* Using cursor P02Q43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1013DibCli, Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2141SerEst = P02Q43_A2141SerEst[0] ;
            A2074ColCom = P02Q43_A2074ColCom[0] ;
            A2078ColFon = P02Q43_A2078ColFon[0] ;
            A2076ColEstMba = P02Q43_A2076ColEstMba[0] ;
            n2076ColEstMba = P02Q43_n2076ColEstMba[0] ;
            A2100MolCon = P02Q43_A2100MolCon[0] ;
            n2100MolCon = P02Q43_n2100MolCon[0] ;
            A2075ColEstAnh = P02Q43_A2075ColEstAnh[0] ;
            n2075ColEstAnh = P02Q43_n2075ColEstAnh[0] ;
            A2098MolCod = P02Q43_A2098MolCod[0] ;
            A2076ColEstMba = P02Q43_A2076ColEstMba[0] ;
            n2076ColEstMba = P02Q43_n2076ColEstMba[0] ;
            A2075ColEstAnh = P02Q43_A2075ColEstAnh[0] ;
            n2075ColEstAnh = P02Q43_n2075ColEstAnh[0] ;
            if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
            {
               A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
            }
            else
            {
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
               }
               else
               {
                  A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
               }
            }
            A2100MolCon = A4861DibCob.multiply((A4862MolPrcCob.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A2075ColEstAnh/ (double) (100)))).multiply(A2076ColEstMba) ;
            n2100MolCon = false ;
            /* Using cursor P02Q44 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n2100MolCon), A2100MolCon, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestconrec.this.A396EmprCod;
      this.aP1[0] = pestconrec.this.A252CliCod;
      this.aP2[0] = pestconrec.this.A1013DibCli;
      this.aP3[0] = pestconrec.this.A1014DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestconrec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getMolPrcCob1( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P02Q45 */
      pr_default.execute(3, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( ( ( P02Q45_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X5381DibPrcCobM = P02Q45_A5381DibPrcCobM[0] ;
            nX5381DibPrcCobM = false ;
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      return X5381DibPrcCobM ;
   }

   public java.math.BigDecimal getMolPrcCob0( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P02Q46 */
      pr_default.execute(4, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( ( ( P02Q46_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X4860DibPrcCob = P02Q46_A4860DibPrcCob[0] ;
            nX4860DibPrcCob = false ;
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      return X4860DibPrcCob ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P02Q42_A396EmprCod = new String[] {""} ;
      P02Q42_A1013DibCli = new String[] {""} ;
      P02Q42_A252CliCod = new int[1] ;
      P02Q42_A1014DibInt = new int[1] ;
      P02Q42_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Q42_n4861DibCob = new boolean[] {false} ;
      P02Q42_A1823DibTipMaq = new String[] {""} ;
      P02Q42_n1823DibTipMaq = new boolean[] {false} ;
      A4861DibCob = DecimalUtil.ZERO ;
      A1823DibTipMaq = "" ;
      P02Q43_A65ArtCod = new String[] {""} ;
      P02Q43_A2141SerEst = new String[] {""} ;
      P02Q43_A2074ColCom = new String[] {""} ;
      P02Q43_A2078ColFon = new String[] {""} ;
      P02Q43_A396EmprCod = new String[] {""} ;
      P02Q43_A1013DibCli = new String[] {""} ;
      P02Q43_A252CliCod = new int[1] ;
      P02Q43_A1014DibInt = new int[1] ;
      P02Q43_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Q43_n2076ColEstMba = new boolean[] {false} ;
      P02Q43_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Q43_n2100MolCon = new boolean[] {false} ;
      P02Q43_A2075ColEstAnh = new short[1] ;
      P02Q43_n2075ColEstAnh = new boolean[] {false} ;
      P02Q43_A2098MolCod = new byte[1] ;
      A2141SerEst = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      P02Q45_A396EmprCod = new String[] {""} ;
      P02Q45_A1013DibCli = new String[] {""} ;
      P02Q45_A252CliCod = new int[1] ;
      P02Q45_A1014DibInt = new int[1] ;
      P02Q45_A1029DibLin = new short[1] ;
      P02Q45_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Q45_n5381DibPrcCobM = new boolean[] {false} ;
      P02Q45_A2088DibDibMol = new byte[1] ;
      P02Q45_n2088DibDibMol = new boolean[] {false} ;
      X4860DibPrcCob = DecimalUtil.ZERO ;
      P02Q46_A396EmprCod = new String[] {""} ;
      P02Q46_A1013DibCli = new String[] {""} ;
      P02Q46_A252CliCod = new int[1] ;
      P02Q46_A1014DibInt = new int[1] ;
      P02Q46_A1807DibLinCil = new short[1] ;
      P02Q46_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Q46_n4860DibPrcCob = new boolean[] {false} ;
      P02Q46_A2089DibLinMol = new byte[1] ;
      P02Q46_n2089DibLinMol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestconrec__default(),
         new Object[] {
             new Object[] {
            P02Q42_A396EmprCod, P02Q42_A1013DibCli, P02Q42_A252CliCod, P02Q42_A1014DibInt, P02Q42_A4861DibCob, P02Q42_n4861DibCob, P02Q42_A1823DibTipMaq, P02Q42_n1823DibTipMaq
            }
            , new Object[] {
            P02Q43_A65ArtCod, P02Q43_A2141SerEst, P02Q43_A2074ColCom, P02Q43_A2078ColFon, P02Q43_A396EmprCod, P02Q43_A1013DibCli, P02Q43_A252CliCod, P02Q43_A1014DibInt, P02Q43_A2076ColEstMba, P02Q43_n2076ColEstMba,
            P02Q43_A2100MolCon, P02Q43_n2100MolCon, P02Q43_A2075ColEstAnh, P02Q43_n2075ColEstAnh, P02Q43_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02Q45_A396EmprCod, P02Q45_A1013DibCli, P02Q45_A252CliCod, P02Q45_A1014DibInt, P02Q45_A1029DibLin, P02Q45_A5381DibPrcCobM, P02Q45_n5381DibPrcCobM, P02Q45_A2088DibDibMol, P02Q45_n2088DibDibMol
            }
            , new Object[] {
            P02Q46_A396EmprCod, P02Q46_A1013DibCli, P02Q46_A252CliCod, P02Q46_A1014DibInt, P02Q46_A1807DibLinCil, P02Q46_A4860DibPrcCob, P02Q46_n4860DibPrcCob, P02Q46_A2089DibLinMol, P02Q46_n2089DibLinMol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private byte E2098MolCod ;
   private short A2075ColEstAnh ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A4862MolPrcCob ;
   private java.math.BigDecimal X5381DibPrcCobM ;
   private java.math.BigDecimal X4860DibPrcCob ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private String A1823DibTipMaq ;
   private String A2141SerEst ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private boolean n4861DibCob ;
   private boolean n1823DibTipMaq ;
   private boolean n2076ColEstMba ;
   private boolean n2100MolCon ;
   private boolean n2075ColEstAnh ;
   private boolean Gx_first ;
   private boolean nX5381DibPrcCobM ;
   private boolean nX4860DibPrcCob ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Q42_A396EmprCod ;
   private String[] P02Q42_A1013DibCli ;
   private int[] P02Q42_A252CliCod ;
   private int[] P02Q42_A1014DibInt ;
   private java.math.BigDecimal[] P02Q42_A4861DibCob ;
   private boolean[] P02Q42_n4861DibCob ;
   private String[] P02Q42_A1823DibTipMaq ;
   private boolean[] P02Q42_n1823DibTipMaq ;
   private String[] P02Q43_A65ArtCod ;
   private String[] P02Q43_A2141SerEst ;
   private String[] P02Q43_A2074ColCom ;
   private String[] P02Q43_A2078ColFon ;
   private String[] P02Q43_A396EmprCod ;
   private String[] P02Q43_A1013DibCli ;
   private int[] P02Q43_A252CliCod ;
   private int[] P02Q43_A1014DibInt ;
   private java.math.BigDecimal[] P02Q43_A2076ColEstMba ;
   private boolean[] P02Q43_n2076ColEstMba ;
   private java.math.BigDecimal[] P02Q43_A2100MolCon ;
   private boolean[] P02Q43_n2100MolCon ;
   private short[] P02Q43_A2075ColEstAnh ;
   private boolean[] P02Q43_n2075ColEstAnh ;
   private byte[] P02Q43_A2098MolCod ;
   private String[] P02Q45_A396EmprCod ;
   private String[] P02Q45_A1013DibCli ;
   private int[] P02Q45_A252CliCod ;
   private int[] P02Q45_A1014DibInt ;
   private short[] P02Q45_A1029DibLin ;
   private java.math.BigDecimal[] P02Q45_A5381DibPrcCobM ;
   private boolean[] P02Q45_n5381DibPrcCobM ;
   private byte[] P02Q45_A2088DibDibMol ;
   private boolean[] P02Q45_n2088DibDibMol ;
   private String[] P02Q46_A396EmprCod ;
   private String[] P02Q46_A1013DibCli ;
   private int[] P02Q46_A252CliCod ;
   private int[] P02Q46_A1014DibInt ;
   private short[] P02Q46_A1807DibLinCil ;
   private java.math.BigDecimal[] P02Q46_A4860DibPrcCob ;
   private boolean[] P02Q46_n4860DibPrcCob ;
   private byte[] P02Q46_A2089DibLinMol ;
   private boolean[] P02Q46_n2089DibLinMol ;
}

final  class pestconrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Q42", "SELECT EmprCod, DibCli, CliCod, DibInt, DibCob, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02Q43", "SELECT T3.ArtCod, T1.SerEst, T1.ColCom, T1.ColFon, T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt, T2.ColEstMba, T1.MolCon, COALESCE( T3.ArtAcaMin, 0) AS ColEstAnh, T1.MolCod FROM ((TXPMFORES T1 INNER JOIN TXPCFORES T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon) LEFT JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.SerEst) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.DibCli = ?) AND (T1.DibInt = ?) ORDER BY T1.EmprCod, T1.CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02Q44", "UPDATE TXPMFORES SET MolCon=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new ForEachCursor("P02Q45", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02Q46", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibPrcCob, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

