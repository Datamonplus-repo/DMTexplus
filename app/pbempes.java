package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbempes extends GXProcedure
{
   public pbempes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbempes.class ), "" );
   }

   public pbempes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pbempes.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pbempes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbempes.this.AV15EmpesCod = aP1[0];
      this.aP1 = aP1;
      pbempes.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      pbempes.this.AV17FonCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Flag = (byte)(0) ;
      /* Using cursor P00Y12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV15EmpesCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00Y12_A361DisCod[0] ;
         A1031EmpesCod = P00Y12_A1031EmpesCod[0] ;
         n1031EmpesCod = P00Y12_n1031EmpesCod[0] ;
         A252CliCod = P00Y12_A252CliCod[0] ;
         n252CliCod = P00Y12_n252CliCod[0] ;
         /* Using cursor P00Y13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV17FonCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1032FonCod = P00Y13_A1032FonCod[0] ;
            A1056DisComCod = P00Y13_A1056DisComCod[0] ;
            A2524DisComLin = P00Y13_A2524DisComLin[0] ;
            AV19Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV19Flag == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00Y14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV15EmpesCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P00Y14_A361DisCod[0] ;
         A130BarCodPar = P00Y14_A130BarCodPar[0] ;
         A132BarCodReo = P00Y14_A132BarCodReo[0] ;
         A129BarCod = P00Y14_A129BarCod[0] ;
         A1031EmpesCod = P00Y14_A1031EmpesCod[0] ;
         n1031EmpesCod = P00Y14_n1031EmpesCod[0] ;
         A252CliCod = P00Y14_A252CliCod[0] ;
         n252CliCod = P00Y14_n252CliCod[0] ;
         A1031EmpesCod = P00Y14_A1031EmpesCod[0] ;
         n1031EmpesCod = P00Y14_n1031EmpesCod[0] ;
         /* Using cursor P00Y15 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV17FonCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1032FonCod = P00Y15_A1032FonCod[0] ;
            A1539BarComAnh = P00Y15_A1539BarComAnh[0] ;
            n1539BarComAnh = P00Y15_n1539BarComAnh[0] ;
            A1056DisComCod = P00Y15_A1056DisComCod[0] ;
            A2524DisComLin = P00Y15_A2524DisComLin[0] ;
            AV19Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV19Flag == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV19Flag == 0 )
      {
         /* Using cursor P00Y16 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV15EmpesCod, Integer.valueOf(AV16CliCod), AV17FonCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1032FonCod = P00Y16_A1032FonCod[0] ;
            A252CliCod = P00Y16_A252CliCod[0] ;
            n252CliCod = P00Y16_n252CliCod[0] ;
            A1031EmpesCod = P00Y16_A1031EmpesCod[0] ;
            n1031EmpesCod = P00Y16_n1031EmpesCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P00Y17 */
            pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
            /* End optimized DELETE. */
            /* Using cursor P00Y18 */
            pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEMPES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Empesa no se puede eliminar. Existen Movimientos", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbempes.this.A396EmprCod;
      this.aP1[0] = pbempes.this.AV15EmpesCod;
      this.aP2[0] = pbempes.this.AV16CliCod;
      this.aP3[0] = pbempes.this.AV17FonCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbempes");
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
      P00Y12_A396EmprCod = new String[] {""} ;
      P00Y12_A361DisCod = new int[1] ;
      P00Y12_A1031EmpesCod = new String[] {""} ;
      P00Y12_n1031EmpesCod = new boolean[] {false} ;
      P00Y12_A252CliCod = new int[1] ;
      P00Y12_n252CliCod = new boolean[] {false} ;
      A1031EmpesCod = "" ;
      P00Y13_A396EmprCod = new String[] {""} ;
      P00Y13_A361DisCod = new int[1] ;
      P00Y13_A1032FonCod = new String[] {""} ;
      P00Y13_A1056DisComCod = new String[] {""} ;
      P00Y13_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      P00Y14_A361DisCod = new int[1] ;
      P00Y14_A396EmprCod = new String[] {""} ;
      P00Y14_A130BarCodPar = new String[] {""} ;
      P00Y14_A132BarCodReo = new byte[1] ;
      P00Y14_A129BarCod = new int[1] ;
      P00Y14_A1031EmpesCod = new String[] {""} ;
      P00Y14_n1031EmpesCod = new boolean[] {false} ;
      P00Y14_A252CliCod = new int[1] ;
      P00Y14_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      P00Y15_A396EmprCod = new String[] {""} ;
      P00Y15_A129BarCod = new int[1] ;
      P00Y15_A132BarCodReo = new byte[1] ;
      P00Y15_A130BarCodPar = new String[] {""} ;
      P00Y15_A1032FonCod = new String[] {""} ;
      P00Y15_A1539BarComAnh = new short[1] ;
      P00Y15_n1539BarComAnh = new boolean[] {false} ;
      P00Y15_A1056DisComCod = new String[] {""} ;
      P00Y15_A2524DisComLin = new byte[1] ;
      P00Y16_A396EmprCod = new String[] {""} ;
      P00Y16_A1032FonCod = new String[] {""} ;
      P00Y16_A252CliCod = new int[1] ;
      P00Y16_n252CliCod = new boolean[] {false} ;
      P00Y16_A1031EmpesCod = new String[] {""} ;
      P00Y16_n1031EmpesCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbempes__default(),
         new Object[] {
             new Object[] {
            P00Y12_A396EmprCod, P00Y12_A361DisCod, P00Y12_A1031EmpesCod, P00Y12_n1031EmpesCod, P00Y12_A252CliCod
            }
            , new Object[] {
            P00Y13_A396EmprCod, P00Y13_A361DisCod, P00Y13_A1032FonCod, P00Y13_A1056DisComCod, P00Y13_A2524DisComLin
            }
            , new Object[] {
            P00Y14_A361DisCod, P00Y14_A396EmprCod, P00Y14_A130BarCodPar, P00Y14_A132BarCodReo, P00Y14_A129BarCod, P00Y14_A1031EmpesCod, P00Y14_n1031EmpesCod, P00Y14_A252CliCod, P00Y14_n252CliCod
            }
            , new Object[] {
            P00Y15_A396EmprCod, P00Y15_A129BarCod, P00Y15_A132BarCodReo, P00Y15_A130BarCodPar, P00Y15_A1032FonCod, P00Y15_A1539BarComAnh, P00Y15_n1539BarComAnh, P00Y15_A1056DisComCod, P00Y15_A2524DisComLin
            }
            , new Object[] {
            P00Y16_A396EmprCod, P00Y16_A1032FonCod, P00Y16_A252CliCod, P00Y16_A1031EmpesCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Flag ;
   private byte A2524DisComLin ;
   private byte A132BarCodReo ;
   private short A1539BarComAnh ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV15EmpesCod ;
   private String AV17FonCod ;
   private String scmdbuf ;
   private String A1031EmpesCod ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A130BarCodPar ;
   private boolean n1031EmpesCod ;
   private boolean n252CliCod ;
   private boolean n1539BarComAnh ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Y12_A396EmprCod ;
   private int[] P00Y12_A361DisCod ;
   private String[] P00Y12_A1031EmpesCod ;
   private boolean[] P00Y12_n1031EmpesCod ;
   private int[] P00Y12_A252CliCod ;
   private boolean[] P00Y12_n252CliCod ;
   private String[] P00Y13_A396EmprCod ;
   private int[] P00Y13_A361DisCod ;
   private String[] P00Y13_A1032FonCod ;
   private String[] P00Y13_A1056DisComCod ;
   private byte[] P00Y13_A2524DisComLin ;
   private int[] P00Y14_A361DisCod ;
   private String[] P00Y14_A396EmprCod ;
   private String[] P00Y14_A130BarCodPar ;
   private byte[] P00Y14_A132BarCodReo ;
   private int[] P00Y14_A129BarCod ;
   private String[] P00Y14_A1031EmpesCod ;
   private boolean[] P00Y14_n1031EmpesCod ;
   private int[] P00Y14_A252CliCod ;
   private boolean[] P00Y14_n252CliCod ;
   private String[] P00Y15_A396EmprCod ;
   private int[] P00Y15_A129BarCod ;
   private byte[] P00Y15_A132BarCodReo ;
   private String[] P00Y15_A130BarCodPar ;
   private String[] P00Y15_A1032FonCod ;
   private short[] P00Y15_A1539BarComAnh ;
   private boolean[] P00Y15_n1539BarComAnh ;
   private String[] P00Y15_A1056DisComCod ;
   private byte[] P00Y15_A2524DisComLin ;
   private String[] P00Y16_A396EmprCod ;
   private String[] P00Y16_A1032FonCod ;
   private int[] P00Y16_A252CliCod ;
   private boolean[] P00Y16_n252CliCod ;
   private String[] P00Y16_A1031EmpesCod ;
   private boolean[] P00Y16_n1031EmpesCod ;
}

final  class pbempes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Y12", "SELECT EmprCod, DisCod, EmpesCod, CliCod FROM TXPDISPOS WHERE (EmprCod = ?) AND (CliCod = ?) AND (EmpesCod = ?) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Y13", "SELECT * FROM (SELECT EmprCod, DisCod, FonCod, DisComCod, DisComLin FROM TXPDISCOM WHERE (EmprCod = ? and DisCod = ?) AND (FonCod = ?) ORDER BY EmprCod, DisCod, DisComCod, FonCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00Y14", "SELECT T1.DisCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.EmpesCod, T1.CliCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod = ?) AND (T2.EmpesCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Y15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FonCod, BarComAnh, DisComCod, DisComLin FROM TXPBARCOM WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (FonCod = ?) ORDER BY DisComCod, FonCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00Y16", "SELECT EmprCod, FonCod, CliCod, EmpesCod FROM TXPCEMPES WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ? ORDER BY EmprCod, EmpesCod, CliCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00Y17", "DELETE FROM TXPLEMPES  WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
         ,new UpdateCursor("P00Y18", "DELETE FROM TXPCEMPES  WHERE EmprCod = ? AND EmpesCod = ? AND CliCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEMPES")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 12);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 12);
               return;
      }
   }

}

