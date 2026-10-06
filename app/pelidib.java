package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelidib extends GXProcedure
{
   public pelidib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelidib.class ), "" );
   }

   public pelidib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           byte[] aP4 )
   {
      pelidib.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      pelidib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelidib.this.AV15DibCli = aP1[0];
      this.aP1 = aP1;
      pelidib.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      pelidib.this.AV17DibInt = aP3[0];
      this.aP3 = aP3;
      pelidib.this.AV26Borrado = aP4[0];
      this.aP4 = aP4;
      pelidib.this.AV22Existe_dis = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P028P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15DibCli, Integer.valueOf(AV16CliCod), Integer.valueOf(AV17DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1014DibInt = P028P2_A1014DibInt[0] ;
         n1014DibInt = P028P2_n1014DibInt[0] ;
         A252CliCod = P028P2_A252CliCod[0] ;
         A1013DibCli = P028P2_A1013DibCli[0] ;
         n1013DibCli = P028P2_n1013DibCli[0] ;
         A1019DibMolCil = P028P2_A1019DibMolCil[0] ;
         n1019DibMolCil = P028P2_n1019DibMolCil[0] ;
         AV28Exi_Mezcla = (byte)(0) ;
         /* Execute user subroutine: 'MEZCLA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV28Exi_Mezcla == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Existen Mezclas con este Dibujo.", ""));
         }
         AV22Existe_dis = (byte)(0) ;
         if ( AV28Exi_Mezcla == 0 )
         {
            /* Execute user subroutine: 'DISPOSICION' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV22Existe_dis == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Existen Disposiciones con este Dibujo.", ""));
            }
         }
         AV25Existe_for = (byte)(0) ;
         if ( ( AV22Existe_dis == 0 ) && ( AV28Exi_Mezcla == 0 ) )
         {
            /* Execute user subroutine: 'RECETAS' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV25Existe_for == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Dibujo en FORMULAS. NO SE REALIZA EL BORRADO", ""));
            }
         }
         if ( ( AV22Existe_dis == 0 ) && ( AV25Existe_for == 0 ) && ( AV28Exi_Mezcla == 0 ) )
         {
            /* Optimized DELETE. */
            /* Using cursor P028P3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P028P4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P028P5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
            /* End optimized DELETE. */
            /* Using cursor P028P6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
            AV26Borrado = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MEZCLA' Routine */
      returnInSub = false ;
      /* Using cursor P028P7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV15DibCli, Integer.valueOf(AV17DibInt)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A7503AMDibInt = P028P7_A7503AMDibInt[0] ;
         A7502AMDibCli = P028P7_A7502AMDibCli[0] ;
         A1013DibCli = P028P7_A1013DibCli[0] ;
         n1013DibCli = P028P7_n1013DibCli[0] ;
         A1014DibInt = P028P7_A1014DibInt[0] ;
         n1014DibInt = P028P7_n1014DibInt[0] ;
         A252CliCod = P028P7_A252CliCod[0] ;
         A7504AMCliCod = P028P7_A7504AMCliCod[0] ;
         AV28Exi_Mezcla = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'DISPOSICION' Routine */
      returnInSub = false ;
      /* Using cursor P028P8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV15DibCli, Integer.valueOf(AV16CliCod), Integer.valueOf(AV17DibInt)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A1014DibInt = P028P8_A1014DibInt[0] ;
         n1014DibInt = P028P8_n1014DibInt[0] ;
         A1013DibCli = P028P8_A1013DibCli[0] ;
         n1013DibCli = P028P8_n1013DibCli[0] ;
         A252CliCod = P028P8_A252CliCod[0] ;
         A367DisEst = P028P8_A367DisEst[0] ;
         A361DisCod = P028P8_A361DisCod[0] ;
         AV22Existe_dis = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S131( )
   {
      /* 'RECETAS' Routine */
      returnInSub = false ;
      /* Using cursor P028P9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV15DibCli, Integer.valueOf(AV17DibInt)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A1014DibInt = P028P9_A1014DibInt[0] ;
         n1014DibInt = P028P9_n1014DibInt[0] ;
         A1013DibCli = P028P9_A1013DibCli[0] ;
         n1013DibCli = P028P9_n1013DibCli[0] ;
         A252CliCod = P028P9_A252CliCod[0] ;
         A2098MolCod = P028P9_A2098MolCod[0] ;
         A2078ColFon = P028P9_A2078ColFon[0] ;
         A2074ColCom = P028P9_A2074ColCom[0] ;
         A2141SerEst = P028P9_A2141SerEst[0] ;
         AV25Existe_for = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelidib.this.A396EmprCod;
      this.aP1[0] = pelidib.this.AV15DibCli;
      this.aP2[0] = pelidib.this.AV16CliCod;
      this.aP3[0] = pelidib.this.AV17DibInt;
      this.aP4[0] = pelidib.this.AV26Borrado;
      this.aP5[0] = pelidib.this.AV22Existe_dis;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelidib");
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
      P028P2_A396EmprCod = new String[] {""} ;
      P028P2_A1014DibInt = new int[1] ;
      P028P2_n1014DibInt = new boolean[] {false} ;
      P028P2_A252CliCod = new int[1] ;
      P028P2_A1013DibCli = new String[] {""} ;
      P028P2_n1013DibCli = new boolean[] {false} ;
      P028P2_A1019DibMolCil = new short[1] ;
      P028P2_n1019DibMolCil = new boolean[] {false} ;
      A1013DibCli = "" ;
      P028P7_A396EmprCod = new String[] {""} ;
      P028P7_A7503AMDibInt = new int[1] ;
      P028P7_A7502AMDibCli = new String[] {""} ;
      P028P7_A1013DibCli = new String[] {""} ;
      P028P7_n1013DibCli = new boolean[] {false} ;
      P028P7_A1014DibInt = new int[1] ;
      P028P7_n1014DibInt = new boolean[] {false} ;
      P028P7_A252CliCod = new int[1] ;
      P028P7_A7504AMCliCod = new int[1] ;
      A7502AMDibCli = "" ;
      P028P8_A396EmprCod = new String[] {""} ;
      P028P8_A1014DibInt = new int[1] ;
      P028P8_n1014DibInt = new boolean[] {false} ;
      P028P8_A1013DibCli = new String[] {""} ;
      P028P8_n1013DibCli = new boolean[] {false} ;
      P028P8_A252CliCod = new int[1] ;
      P028P8_A367DisEst = new byte[1] ;
      P028P8_A361DisCod = new int[1] ;
      P028P9_A396EmprCod = new String[] {""} ;
      P028P9_A1014DibInt = new int[1] ;
      P028P9_n1014DibInt = new boolean[] {false} ;
      P028P9_A1013DibCli = new String[] {""} ;
      P028P9_n1013DibCli = new boolean[] {false} ;
      P028P9_A252CliCod = new int[1] ;
      P028P9_A2098MolCod = new byte[1] ;
      P028P9_A2078ColFon = new String[] {""} ;
      P028P9_A2074ColCom = new String[] {""} ;
      P028P9_A2141SerEst = new String[] {""} ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A2141SerEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelidib__default(),
         new Object[] {
             new Object[] {
            P028P2_A396EmprCod, P028P2_A1014DibInt, P028P2_A252CliCod, P028P2_A1013DibCli, P028P2_A1019DibMolCil, P028P2_n1019DibMolCil
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028P7_A396EmprCod, P028P7_A7503AMDibInt, P028P7_A7502AMDibCli, P028P7_A1013DibCli, P028P7_A1014DibInt, P028P7_A252CliCod, P028P7_A7504AMCliCod
            }
            , new Object[] {
            P028P8_A396EmprCod, P028P8_A1014DibInt, P028P8_n1014DibInt, P028P8_A1013DibCli, P028P8_n1013DibCli, P028P8_A252CliCod, P028P8_A367DisEst, P028P8_A361DisCod
            }
            , new Object[] {
            P028P9_A396EmprCod, P028P9_A1014DibInt, P028P9_A1013DibCli, P028P9_A252CliCod, P028P9_A2098MolCod, P028P9_A2078ColFon, P028P9_A2074ColCom, P028P9_A2141SerEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26Borrado ;
   private byte AV22Existe_dis ;
   private byte AV28Exi_Mezcla ;
   private byte AV25Existe_for ;
   private byte A367DisEst ;
   private byte A2098MolCod ;
   private short A1019DibMolCil ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV17DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A7503AMDibInt ;
   private int A7504AMCliCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV15DibCli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A7502AMDibCli ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A2141SerEst ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n1019DibMolCil ;
   private boolean returnInSub ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P028P2_A396EmprCod ;
   private int[] P028P2_A1014DibInt ;
   private boolean[] P028P2_n1014DibInt ;
   private int[] P028P2_A252CliCod ;
   private String[] P028P2_A1013DibCli ;
   private boolean[] P028P2_n1013DibCli ;
   private short[] P028P2_A1019DibMolCil ;
   private boolean[] P028P2_n1019DibMolCil ;
   private String[] P028P7_A396EmprCod ;
   private int[] P028P7_A7503AMDibInt ;
   private String[] P028P7_A7502AMDibCli ;
   private String[] P028P7_A1013DibCli ;
   private boolean[] P028P7_n1013DibCli ;
   private int[] P028P7_A1014DibInt ;
   private boolean[] P028P7_n1014DibInt ;
   private int[] P028P7_A252CliCod ;
   private int[] P028P7_A7504AMCliCod ;
   private String[] P028P8_A396EmprCod ;
   private int[] P028P8_A1014DibInt ;
   private boolean[] P028P8_n1014DibInt ;
   private String[] P028P8_A1013DibCli ;
   private boolean[] P028P8_n1013DibCli ;
   private int[] P028P8_A252CliCod ;
   private byte[] P028P8_A367DisEst ;
   private int[] P028P8_A361DisCod ;
   private String[] P028P9_A396EmprCod ;
   private int[] P028P9_A1014DibInt ;
   private boolean[] P028P9_n1014DibInt ;
   private String[] P028P9_A1013DibCli ;
   private boolean[] P028P9_n1013DibCli ;
   private int[] P028P9_A252CliCod ;
   private byte[] P028P9_A2098MolCod ;
   private String[] P028P9_A2078ColFon ;
   private String[] P028P9_A2074ColCom ;
   private String[] P028P9_A2141SerEst ;
}

final  class pelidib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028P2", "SELECT EmprCod, DibInt, CliCod, DibCli, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028P3", "DELETE FROM TXPLDIBUC  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new UpdateCursor("P028P4", "DELETE FROM TXPLDIBUJ  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
         ,new UpdateCursor("P028P5", "DELETE FROM TXPDIBOBS  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIBOBS")
         ,new UpdateCursor("P028P6", "DELETE FROM TXPCDIBUJ  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
         ,new ForEachCursor("P028P7", "SELECT * FROM (SELECT EmprCod, AMDibInt, AMDibCli, DibCli, DibInt, CliCod, AMCliCod FROM TXPARTMZA WHERE (EmprCod = ?) AND (AMDibCli = ?) AND (AMDibInt = ?) ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028P8", "SELECT * FROM (SELECT EmprCod, DibInt, DibCli, CliCod, DisEst, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028P9", "SELECT * FROM (SELECT EmprCod, DibInt, DibCli, CliCod, MolCod, ColFon, ColCom, SerEst FROM TXPMFORES WHERE (EmprCod = ? and CliCod = ?) AND (DibCli = ?) AND (DibInt = ?) ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

