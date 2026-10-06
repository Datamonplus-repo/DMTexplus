package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu01 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu01 pgm = new aptexu01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu01.class ), "" );
   }

   public aptexu01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando tabla SERPAR-SERPAU...", "") );
      /* Using cursor P02PQ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02PQ2_A457FasCod[0] ;
         A758ProCod = P02PQ2_A758ProCod[0] ;
         A65ArtCod = P02PQ2_A65ArtCod[0] ;
         A252CliCod = P02PQ2_A252CliCod[0] ;
         A396EmprCod = P02PQ2_A396EmprCod[0] ;
         A460FasDsc = P02PQ2_A460FasDsc[0] ;
         A460FasDsc = P02PQ2_A460FasDsc[0] ;
         AV12Emprcod = A396EmprCod ;
         AV9Clicod = A252CliCod ;
         AV10Artcod = A65ArtCod ;
         AV8Procod = A758ProCod ;
         AV11FasCod = A457FasCod ;
         AV14FasDsc = A460FasDsc ;
         /* Execute user subroutine: 'PROLIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV13ProNumLin > 0 )
         {
            /* Execute user subroutine: 'PARART' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P02PQ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1668ParFasVal = P02PQ3_A1668ParFasVal[0] ;
               A1673ParFasObs = P02PQ3_A1673ParFasObs[0] ;
               A1664ParFasCod = P02PQ3_A1664ParFasCod[0] ;
               AV15PARFASCOD = A1664ParFasCod ;
               AV16PARFASVAL = A1668ParFasVal ;
               AV17PARFASOBS = A1673ParFasObs ;
               /* Execute user subroutine: 'PARAR1' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin tabla SERPAR-SERPAU...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'PROLIN' Routine */
      returnInSub = false ;
      AV13ProNumLin = (short)(0) ;
      /* Using cursor P02PQ4 */
      pr_default.execute(2, new Object[] {AV12Emprcod, AV8Procod, AV11FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P02PQ4_A457FasCod[0] ;
         A758ProCod = P02PQ4_A758ProCod[0] ;
         A396EmprCod = P02PQ4_A396EmprCod[0] ;
         A774ProNumLin = P02PQ4_A774ProNumLin[0] ;
         AV13ProNumLin = A774ProNumLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'PARART' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPPARART

      */
      A396EmprCod = AV12Emprcod ;
      A252CliCod = AV9Clicod ;
      A65ArtCod = AV10Artcod ;
      A758ProCod = AV8Procod ;
      A6986NumLinPro = AV13ProNumLin ;
      A6987FasCodp = AV11FasCod ;
      n6987FasCodp = false ;
      A6988FasDscp = AV14FasDsc ;
      n6988FasDscp = false ;
      /* Using cursor P02PQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro), Boolean.valueOf(n6987FasCodp), A6987FasCodp, Boolean.valueOf(n6988FasDscp), A6988FasDscp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARART");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S131( )
   {
      /* 'PARAR1' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPPARAR1

      */
      A396EmprCod = AV12Emprcod ;
      A252CliCod = AV9Clicod ;
      A65ArtCod = AV10Artcod ;
      A758ProCod = AV8Procod ;
      A6986NumLinPro = AV13ProNumLin ;
      A1664ParFasCod = AV15PARFASCOD ;
      A6990ParFasObsp = AV17PARFASOBS ;
      n6990ParFasObsp = false ;
      A6989ParFasValp = AV16PARFASVAL ;
      n6989ParFasValp = false ;
      /* Using cursor P02PQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro), Short.valueOf(A1664ParFasCod), Boolean.valueOf(n6989ParFasValp), A6989ParFasValp, Boolean.valueOf(n6990ParFasObsp), A6990ParFasObsp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARAR1");
      if ( (pr_default.getStatus(4) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu01.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu01");
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
      P02PQ2_A457FasCod = new String[] {""} ;
      P02PQ2_A758ProCod = new String[] {""} ;
      P02PQ2_A65ArtCod = new String[] {""} ;
      P02PQ2_A252CliCod = new int[1] ;
      P02PQ2_A396EmprCod = new String[] {""} ;
      P02PQ2_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      AV12Emprcod = "" ;
      AV10Artcod = "" ;
      AV8Procod = "" ;
      AV11FasCod = "" ;
      AV14FasDsc = "" ;
      P02PQ3_A396EmprCod = new String[] {""} ;
      P02PQ3_A252CliCod = new int[1] ;
      P02PQ3_A65ArtCod = new String[] {""} ;
      P02PQ3_A758ProCod = new String[] {""} ;
      P02PQ3_A457FasCod = new String[] {""} ;
      P02PQ3_A1668ParFasVal = new String[] {""} ;
      P02PQ3_A1673ParFasObs = new String[] {""} ;
      P02PQ3_A1664ParFasCod = new short[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      AV16PARFASVAL = "" ;
      AV17PARFASOBS = "" ;
      P02PQ4_A457FasCod = new String[] {""} ;
      P02PQ4_A758ProCod = new String[] {""} ;
      P02PQ4_A396EmprCod = new String[] {""} ;
      P02PQ4_A774ProNumLin = new short[1] ;
      A6987FasCodp = "" ;
      A6988FasDscp = "" ;
      Gx_emsg = "" ;
      A6990ParFasObsp = "" ;
      A6989ParFasValp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu01__default(),
         new Object[] {
             new Object[] {
            P02PQ2_A457FasCod, P02PQ2_A758ProCod, P02PQ2_A65ArtCod, P02PQ2_A252CliCod, P02PQ2_A396EmprCod, P02PQ2_A460FasDsc
            }
            , new Object[] {
            P02PQ3_A396EmprCod, P02PQ3_A252CliCod, P02PQ3_A65ArtCod, P02PQ3_A758ProCod, P02PQ3_A457FasCod, P02PQ3_A1668ParFasVal, P02PQ3_A1673ParFasObs, P02PQ3_A1664ParFasCod
            }
            , new Object[] {
            P02PQ4_A457FasCod, P02PQ4_A758ProCod, P02PQ4_A396EmprCod, P02PQ4_A774ProNumLin
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

   private short AV13ProNumLin ;
   private short A1664ParFasCod ;
   private short AV15PARFASCOD ;
   private short A774ProNumLin ;
   private short A6986NumLinPro ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV9Clicod ;
   private int GX_INS988 ;
   private int GX_INS989 ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String AV12Emprcod ;
   private String AV10Artcod ;
   private String AV8Procod ;
   private String AV11FasCod ;
   private String AV14FasDsc ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String AV16PARFASVAL ;
   private String AV17PARFASOBS ;
   private String A6987FasCodp ;
   private String A6988FasDscp ;
   private String Gx_emsg ;
   private String A6990ParFasObsp ;
   private String A6989ParFasValp ;
   private boolean returnInSub ;
   private boolean n6987FasCodp ;
   private boolean n6988FasDscp ;
   private boolean n6990ParFasObsp ;
   private boolean n6989ParFasValp ;
   private IDataStoreProvider pr_default ;
   private String[] P02PQ2_A457FasCod ;
   private String[] P02PQ2_A758ProCod ;
   private String[] P02PQ2_A65ArtCod ;
   private int[] P02PQ2_A252CliCod ;
   private String[] P02PQ2_A396EmprCod ;
   private String[] P02PQ2_A460FasDsc ;
   private String[] P02PQ3_A396EmprCod ;
   private int[] P02PQ3_A252CliCod ;
   private String[] P02PQ3_A65ArtCod ;
   private String[] P02PQ3_A758ProCod ;
   private String[] P02PQ3_A457FasCod ;
   private String[] P02PQ3_A1668ParFasVal ;
   private String[] P02PQ3_A1673ParFasObs ;
   private short[] P02PQ3_A1664ParFasCod ;
   private String[] P02PQ4_A457FasCod ;
   private String[] P02PQ4_A758ProCod ;
   private String[] P02PQ4_A396EmprCod ;
   private short[] P02PQ4_A774ProNumLin ;
}

final  class aptexu01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PQ2", "SELECT T1.FasCod, T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T2.FasDsc FROM (TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02PQ3", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasVal, ParFasObs, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02PQ4", "SELECT * FROM (SELECT FasCod, ProCod, EmprCod, ProNumLin FROM TXPPROLIN WHERE (EmprCod = ? and ProCod = ?) AND (FasCod = ?) ORDER BY EmprCod, ProCod, ProNumLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02PQ5", "INSERT INTO TXPPARART(EmprCod, CliCod, ArtCod, ProCod, NumLinPro, FasCodp, FasDscp, ParFasObsm) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARART")
         ,new UpdateCursor("P02PQ6", "INSERT INTO TXPPARAR1(EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod, ParFasValp, ParFasObsp) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARAR1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 28);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 60);
               }
               return;
      }
   }

}

