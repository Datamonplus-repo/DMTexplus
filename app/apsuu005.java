package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu005 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu005 pgm = new apsuu005 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu005.class ), "" );
   }

   public apsuu005( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizando DISFAS....", "") );
      /* Using cursor P02TX2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02TX2_A361DisCod[0] ;
         A846UltFasLin = P02TX2_A846UltFasLin[0] ;
         A758ProCod = P02TX2_A758ProCod[0] ;
         A396EmprCod = P02TX2_A396EmprCod[0] ;
         AV8Procod = A758ProCod ;
         AV9emprcod = A396EmprCod ;
         AV10Discod = A361DisCod ;
         /* Execute user subroutine: 'PROLIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A846UltFasLin = AV11PROULTLIN ;
         /* Using cursor P02TX3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A846UltFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROLIN' Routine */
      returnInSub = false ;
      AV11PROULTLIN = (short)(0) ;
      /* Using cursor P02TX4 */
      pr_default.execute(2, new Object[] {AV9emprcod, AV8Procod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A758ProCod = P02TX4_A758ProCod[0] ;
         A396EmprCod = P02TX4_A396EmprCod[0] ;
         A775ProUltLin = P02TX4_A775ProUltLin[0] ;
         AV11PROULTLIN = A775ProUltLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P02TX5 */
      pr_default.execute(3, new Object[] {AV9emprcod, AV8Procod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A774ProNumLin = P02TX5_A774ProNumLin[0] ;
         A7744FasPreObl = P02TX5_A7744FasPreObl[0] ;
         n7744FasPreObl = P02TX5_n7744FasPreObl[0] ;
         A457FasCod = P02TX5_A457FasCod[0] ;
         A396EmprCod = P02TX5_A396EmprCod[0] ;
         A758ProCod = P02TX5_A758ProCod[0] ;
         A7744FasPreObl = P02TX5_A7744FasPreObl[0] ;
         n7744FasPreObl = P02TX5_n7744FasPreObl[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPDISFAS

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         A361DisCod = AV10Discod ;
         A758ProCod = AV8Procod ;
         A368DisFasLin = A774ProNumLin ;
         A3697FasApr = " " ;
         A3793DisMaqPru = " " ;
         n3793DisMaqPru = false ;
         A5304DisPreSal = (short)(0) ;
         n5304DisPreSal = false ;
         A5305DisPrePie = (short)(0) ;
         n5305DisPrePie = false ;
         A5306DisVelPro = DecimalUtil.doubleToDec(0) ;
         n5306DisVelPro = false ;
         A5307DisNumPas = (short)(0) ;
         n5307DisNumPas = false ;
         A5376DisQuiUl = (short)(0) ;
         /* Using cursor P02TX6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Boolean.valueOf(n3793DisMaqPru), A3793DisMaqPru, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu005.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu005");
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
      P02TX2_A361DisCod = new int[1] ;
      P02TX2_A846UltFasLin = new short[1] ;
      P02TX2_A758ProCod = new String[] {""} ;
      P02TX2_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      AV8Procod = "" ;
      AV9emprcod = "" ;
      P02TX4_A758ProCod = new String[] {""} ;
      P02TX4_A396EmprCod = new String[] {""} ;
      P02TX4_A775ProUltLin = new short[1] ;
      P02TX5_A774ProNumLin = new short[1] ;
      P02TX5_A7744FasPreObl = new byte[1] ;
      P02TX5_n7744FasPreObl = new boolean[] {false} ;
      P02TX5_A457FasCod = new String[] {""} ;
      P02TX5_A396EmprCod = new String[] {""} ;
      P02TX5_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      W457FasCod = "" ;
      A3697FasApr = "" ;
      A3793DisMaqPru = "" ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu005__default(),
         new Object[] {
             new Object[] {
            P02TX2_A361DisCod, P02TX2_A846UltFasLin, P02TX2_A758ProCod, P02TX2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02TX4_A758ProCod, P02TX4_A396EmprCod, P02TX4_A775ProUltLin
            }
            , new Object[] {
            P02TX5_A774ProNumLin, P02TX5_A7744FasPreObl, P02TX5_n7744FasPreObl, P02TX5_A457FasCod, P02TX5_A396EmprCod, P02TX5_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private short A846UltFasLin ;
   private short AV11PROULTLIN ;
   private short A775ProUltLin ;
   private short A774ProNumLin ;
   private short A368DisFasLin ;
   private short A5304DisPreSal ;
   private short A5305DisPrePie ;
   private short A5307DisNumPas ;
   private short A5376DisQuiUl ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV10Discod ;
   private int GX_INS39 ;
   private java.math.BigDecimal A5306DisVelPro ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private String AV8Procod ;
   private String AV9emprcod ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String W457FasCod ;
   private String A3697FasApr ;
   private String A3793DisMaqPru ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n7744FasPreObl ;
   private boolean n3793DisMaqPru ;
   private boolean n5304DisPreSal ;
   private boolean n5305DisPrePie ;
   private boolean n5306DisVelPro ;
   private boolean n5307DisNumPas ;
   private IDataStoreProvider pr_default ;
   private int[] P02TX2_A361DisCod ;
   private short[] P02TX2_A846UltFasLin ;
   private String[] P02TX2_A758ProCod ;
   private String[] P02TX2_A396EmprCod ;
   private String[] P02TX4_A758ProCod ;
   private String[] P02TX4_A396EmprCod ;
   private short[] P02TX4_A775ProUltLin ;
   private short[] P02TX5_A774ProNumLin ;
   private byte[] P02TX5_A7744FasPreObl ;
   private boolean[] P02TX5_n7744FasPreObl ;
   private String[] P02TX5_A457FasCod ;
   private String[] P02TX5_A396EmprCod ;
   private String[] P02TX5_A758ProCod ;
}

final  class apsuu005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TX2", "SELECT DisCod, UltFasLin, ProCod, EmprCod FROM TXPDISLIN WHERE DisCod <= 324 ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TX3", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P02TX4", "SELECT ProCod, EmprCod, ProUltLin FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TX5", "SELECT T1.ProNumLin, T2.FasPreObl, T1.FasCod, T1.EmprCod, T1.ProCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TX6", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisMaqPru, DisQuiUl, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               return;
      }
   }

}

