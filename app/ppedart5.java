package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart5 extends GXProcedure
{
   public ppedart5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart5.class ), "" );
   }

   public ppedart5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           byte[] aP8 )
   {
      ppedart5.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      ppedart5.this.AV26EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart5.this.AV20CliCod = aP1[0];
      this.aP1 = aP1;
      ppedart5.this.AV25SerEst = aP2[0];
      this.aP2 = aP2;
      ppedart5.this.AV23DibCli = aP3[0];
      this.aP3 = aP3;
      ppedart5.this.AV24DibInt = aP4[0];
      this.aP4 = aP4;
      ppedart5.this.AV21ColCom = aP5[0];
      this.aP5 = aP5;
      ppedart5.this.AV22ColFon = aP6[0];
      this.aP6 = aP6;
      ppedart5.this.AV29SelDib = aP7[0];
      this.aP7 = aP7;
      ppedart5.this.AV30SelEst = aP8[0];
      this.aP8 = aP8;
      ppedart5.this.AV28Ok = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14CliCod1 = AV20CliCod ;
      AV19SerEst1 = AV25SerEst ;
      AV17DibCli1 = AV23DibCli ;
      AV18DibInt1 = AV24DibInt ;
      AV15ColCom1 = AV21ColCom ;
      AV16ColFon1 = AV22ColFon ;
      if ( AV29SelDib == 1 )
      {
      }
      else
      {
         /* Using cursor P03E92 */
         pr_default.execute(0, new Object[] {AV17DibCli1});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1013DibCli = P03E92_A1013DibCli[0] ;
            A252CliCod = P03E92_A252CliCod[0] ;
            A1014DibInt = P03E92_A1014DibInt[0] ;
            A396EmprCod = P03E92_A396EmprCod[0] ;
            AV14CliCod1 = A252CliCod ;
            AV18DibInt1 = A1014DibInt ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( AV30SelEst == 1 )
      {
      }
      else
      {
         /* Using cursor P03E93 */
         pr_default.execute(1, new Object[] {AV17DibCli1, Integer.valueOf(AV18DibInt1), AV15ColCom1});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2074ColCom = P03E93_A2074ColCom[0] ;
            A1014DibInt = P03E93_A1014DibInt[0] ;
            A1013DibCli = P03E93_A1013DibCli[0] ;
            A252CliCod = P03E93_A252CliCod[0] ;
            A2141SerEst = P03E93_A2141SerEst[0] ;
            A2078ColFon = P03E93_A2078ColFon[0] ;
            A396EmprCod = P03E93_A396EmprCod[0] ;
            AV14CliCod1 = A252CliCod ;
            AV19SerEst1 = A2141SerEst ;
            AV16ColFon1 = A2078ColFon ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      AV23DibCli = AV17DibCli1 ;
      AV24DibInt = AV18DibInt1 ;
      AV21ColCom = AV15ColCom1 ;
      AV22ColFon = AV16ColFon1 ;
      AV35GXLvl40 = (byte)(0) ;
      /* Using cursor P03E94 */
      pr_default.execute(2, new Object[] {AV26EmprCod, AV23DibCli, Integer.valueOf(AV20CliCod), Integer.valueOf(AV24DibInt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1014DibInt = P03E94_A1014DibInt[0] ;
         A1013DibCli = P03E94_A1013DibCli[0] ;
         A252CliCod = P03E94_A252CliCod[0] ;
         A396EmprCod = P03E94_A396EmprCod[0] ;
         AV35GXLvl40 = (byte)(1) ;
         AV28Ok = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV35GXLvl40 == 0 )
      {
         AV28Ok = (byte)(-1) ;
         if ( GXutil.strcmp(AV17DibCli1, "") != 0 )
         {
            GXv_char1[0] = AV26EmprCod ;
            GXv_char2[0] = AV17DibCli1 ;
            GXv_int3[0] = AV14CliCod1 ;
            GXv_int4[0] = AV18DibInt1 ;
            GXv_char5[0] = AV23DibCli ;
            GXv_int6[0] = AV20CliCod ;
            GXv_int7[0] = AV24DibInt ;
            new app.pdupdib(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_int7) ;
            ppedart5.this.AV26EmprCod = GXv_char1[0] ;
            ppedart5.this.AV17DibCli1 = GXv_char2[0] ;
            ppedart5.this.AV14CliCod1 = GXv_int3[0] ;
            ppedart5.this.AV18DibInt1 = GXv_int4[0] ;
            ppedart5.this.AV23DibCli = GXv_char5[0] ;
            ppedart5.this.AV20CliCod = GXv_int6[0] ;
            ppedart5.this.AV24DibInt = GXv_int7[0] ;
         }
      }
      AV36GXLvl54 = (byte)(0) ;
      /* Using cursor P03E95 */
      pr_default.execute(3, new Object[] {AV26EmprCod, Integer.valueOf(AV20CliCod), AV25SerEst, AV23DibCli, Integer.valueOf(AV24DibInt), AV21ColCom, AV22ColFon, Byte.valueOf(AV28Ok)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2078ColFon = P03E95_A2078ColFon[0] ;
         A2074ColCom = P03E95_A2074ColCom[0] ;
         A1014DibInt = P03E95_A1014DibInt[0] ;
         A1013DibCli = P03E95_A1013DibCli[0] ;
         A2141SerEst = P03E95_A2141SerEst[0] ;
         A252CliCod = P03E95_A252CliCod[0] ;
         A396EmprCod = P03E95_A396EmprCod[0] ;
         AV36GXLvl54 = (byte)(1) ;
         AV28Ok = (byte)(2) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV36GXLvl54 == 0 )
      {
         AV28Ok = (byte)(-2) ;
         if ( ( GXutil.strcmp(AV17DibCli1, "") != 0 ) && ( GXutil.strcmp(AV15ColCom1, "") != 0 ) )
         {
            AV9CliCod2 = AV20CliCod ;
            AV8SerEst2 = AV25SerEst ;
            AV10DibCli2 = AV17DibCli1 ;
            AV11DibInt2 = AV18DibInt1 ;
            AV12ColCom2 = AV15ColCom1 ;
            AV13ColFon2 = AV16ColFon1 ;
            GXv_char5[0] = AV26EmprCod ;
            GXv_int7[0] = AV14CliCod1 ;
            GXv_char2[0] = AV19SerEst1 ;
            GXv_char1[0] = AV17DibCli1 ;
            GXv_int6[0] = AV18DibInt1 ;
            GXv_char8[0] = AV15ColCom1 ;
            GXv_char9[0] = AV16ColFon1 ;
            GXv_int4[0] = AV20CliCod ;
            GXv_char10[0] = AV25SerEst ;
            GXv_char11[0] = AV23DibCli ;
            GXv_int3[0] = AV24DibInt ;
            GXv_char12[0] = AV21ColCom ;
            GXv_char13[0] = AV22ColFon ;
            new app.pdufoes(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char2, GXv_char1, GXv_int6, GXv_char8, GXv_char9, GXv_int4, GXv_char10, GXv_char11, GXv_int3, GXv_char12, GXv_char13) ;
            ppedart5.this.AV26EmprCod = GXv_char5[0] ;
            ppedart5.this.AV14CliCod1 = GXv_int7[0] ;
            ppedart5.this.AV19SerEst1 = GXv_char2[0] ;
            ppedart5.this.AV17DibCli1 = GXv_char1[0] ;
            ppedart5.this.AV18DibInt1 = GXv_int6[0] ;
            ppedart5.this.AV15ColCom1 = GXv_char8[0] ;
            ppedart5.this.AV16ColFon1 = GXv_char9[0] ;
            ppedart5.this.AV20CliCod = GXv_int4[0] ;
            ppedart5.this.AV25SerEst = GXv_char10[0] ;
            ppedart5.this.AV23DibCli = GXv_char11[0] ;
            ppedart5.this.AV24DibInt = GXv_int3[0] ;
            ppedart5.this.AV21ColCom = GXv_char12[0] ;
            ppedart5.this.AV22ColFon = GXv_char13[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart5.this.AV26EmprCod;
      this.aP1[0] = ppedart5.this.AV20CliCod;
      this.aP2[0] = ppedart5.this.AV25SerEst;
      this.aP3[0] = ppedart5.this.AV23DibCli;
      this.aP4[0] = ppedart5.this.AV24DibInt;
      this.aP5[0] = ppedart5.this.AV21ColCom;
      this.aP6[0] = ppedart5.this.AV22ColFon;
      this.aP7[0] = ppedart5.this.AV29SelDib;
      this.aP8[0] = ppedart5.this.AV30SelEst;
      this.aP9[0] = ppedart5.this.AV28Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19SerEst1 = "" ;
      AV17DibCli1 = "" ;
      AV15ColCom1 = "" ;
      AV16ColFon1 = "" ;
      scmdbuf = "" ;
      P03E92_A1013DibCli = new String[] {""} ;
      P03E92_A252CliCod = new int[1] ;
      P03E92_A1014DibInt = new int[1] ;
      P03E92_A396EmprCod = new String[] {""} ;
      A1013DibCli = "" ;
      A396EmprCod = "" ;
      P03E93_A2074ColCom = new String[] {""} ;
      P03E93_A1014DibInt = new int[1] ;
      P03E93_A1013DibCli = new String[] {""} ;
      P03E93_A252CliCod = new int[1] ;
      P03E93_A2141SerEst = new String[] {""} ;
      P03E93_A2078ColFon = new String[] {""} ;
      P03E93_A396EmprCod = new String[] {""} ;
      A2074ColCom = "" ;
      A2141SerEst = "" ;
      A2078ColFon = "" ;
      P03E94_A1014DibInt = new int[1] ;
      P03E94_A1013DibCli = new String[] {""} ;
      P03E94_A252CliCod = new int[1] ;
      P03E94_A396EmprCod = new String[] {""} ;
      P03E95_A2078ColFon = new String[] {""} ;
      P03E95_A2074ColCom = new String[] {""} ;
      P03E95_A1014DibInt = new int[1] ;
      P03E95_A1013DibCli = new String[] {""} ;
      P03E95_A2141SerEst = new String[] {""} ;
      P03E95_A252CliCod = new int[1] ;
      P03E95_A396EmprCod = new String[] {""} ;
      AV8SerEst2 = "" ;
      AV10DibCli2 = "" ;
      AV12ColCom2 = "" ;
      AV13ColFon2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart5__default(),
         new Object[] {
             new Object[] {
            P03E92_A1013DibCli, P03E92_A252CliCod, P03E92_A1014DibInt, P03E92_A396EmprCod
            }
            , new Object[] {
            P03E93_A2074ColCom, P03E93_A1014DibInt, P03E93_A1013DibCli, P03E93_A252CliCod, P03E93_A2141SerEst, P03E93_A2078ColFon, P03E93_A396EmprCod
            }
            , new Object[] {
            P03E94_A1014DibInt, P03E94_A1013DibCli, P03E94_A252CliCod, P03E94_A396EmprCod
            }
            , new Object[] {
            P03E95_A2078ColFon, P03E95_A2074ColCom, P03E95_A1014DibInt, P03E95_A1013DibCli, P03E95_A2141SerEst, P03E95_A252CliCod, P03E95_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29SelDib ;
   private byte AV30SelEst ;
   private byte AV28Ok ;
   private byte AV35GXLvl40 ;
   private byte AV36GXLvl54 ;
   private short Gx_err ;
   private int AV20CliCod ;
   private int AV24DibInt ;
   private int AV14CliCod1 ;
   private int AV18DibInt1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV9CliCod2 ;
   private int AV11DibInt2 ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int GXv_int4[] ;
   private int GXv_int3[] ;
   private String AV26EmprCod ;
   private String AV25SerEst ;
   private String AV23DibCli ;
   private String AV21ColCom ;
   private String AV22ColFon ;
   private String AV19SerEst1 ;
   private String AV17DibCli1 ;
   private String AV15ColCom1 ;
   private String AV16ColFon1 ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A396EmprCod ;
   private String A2074ColCom ;
   private String A2141SerEst ;
   private String A2078ColFon ;
   private String AV8SerEst2 ;
   private String AV10DibCli2 ;
   private String AV12ColCom2 ;
   private String AV13ColFon2 ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03E92_A1013DibCli ;
   private int[] P03E92_A252CliCod ;
   private int[] P03E92_A1014DibInt ;
   private String[] P03E92_A396EmprCod ;
   private String[] P03E93_A2074ColCom ;
   private int[] P03E93_A1014DibInt ;
   private String[] P03E93_A1013DibCli ;
   private int[] P03E93_A252CliCod ;
   private String[] P03E93_A2141SerEst ;
   private String[] P03E93_A2078ColFon ;
   private String[] P03E93_A396EmprCod ;
   private int[] P03E94_A1014DibInt ;
   private String[] P03E94_A1013DibCli ;
   private int[] P03E94_A252CliCod ;
   private String[] P03E94_A396EmprCod ;
   private String[] P03E95_A2078ColFon ;
   private String[] P03E95_A2074ColCom ;
   private int[] P03E95_A1014DibInt ;
   private String[] P03E95_A1013DibCli ;
   private String[] P03E95_A2141SerEst ;
   private int[] P03E95_A252CliCod ;
   private String[] P03E95_A396EmprCod ;
}

final  class ppedart5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03E92", "SELECT * FROM (SELECT DibCli, CliCod, DibInt, EmprCod FROM TXPCDIBUJ WHERE DibCli = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03E93", "SELECT * FROM (SELECT ColCom, DibInt, DibCli, CliCod, SerEst, ColFon, EmprCod FROM TXPCFORES WHERE (DibCli = ?) AND (DibInt = ?) AND (ColCom = ?) ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03E94", "SELECT * FROM (SELECT DibInt, DibCli, CliCod, EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03E95", "SELECT * FROM (SELECT ColFon, ColCom, DibInt, DibCli, SerEst, CliCod, EmprCod FROM TXPCFORES WHERE (EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ?) AND (? > 0) ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
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
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

