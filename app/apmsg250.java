package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmsg250 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmsg250 pgm = new apmsg250 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmsg250( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmsg250.class ), "" );
   }

   public apmsg250( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Iniciamos Proceso...........¡¡¡", "") );
      AV14Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16Emprcod ;
      GXv_char2[0] = AV15EmprNom ;
      GXv_char3[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char1, GXv_char2, GXv_char3) ;
      apmsg250.this.AV16Emprcod = GXv_char1[0] ;
      apmsg250.this.AV15EmprNom = GXv_char2[0] ;
      apmsg250.this.AV13UsurCod = GXv_char3[0] ;
      AV17Num_r = 0 ;
      /* Using cursor P036R2 */
      pr_default.execute(0, new Object[] {AV16Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P036R2_A396EmprCod[0] ;
         A171BarLanCod = P036R2_A171BarLanCod[0] ;
         n171BarLanCod = P036R2_n171BarLanCod[0] ;
         A175BarLanReo = P036R2_A175BarLanReo[0] ;
         n175BarLanReo = P036R2_n175BarLanReo[0] ;
         A174BarLanPar = P036R2_A174BarLanPar[0] ;
         n174BarLanPar = P036R2_n174BarLanPar[0] ;
         A172BarLanLin = P036R2_A172BarLanLin[0] ;
         A1438BarTerCod = P036R2_A1438BarTerCod[0] ;
         AV11BarTerCod = A1438BarTerCod ;
         AV8BarLanCod = A171BarLanCod ;
         AV9BarLanReo = A175BarLanReo ;
         AV10BarLanPar = A174BarLanPar ;
         /* Execute user subroutine: 'MASTABLAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17Num_r = (int)(AV17Num_r+1) ;
         Gx_msg = httpContext.getMessage( "Eliminando... ", "") + GXutil.str( AV17Num_r, 6, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P036R3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1438BarTerCod, Short.valueOf(A172BarLanLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARLAN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado ¡¡¡", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'MASTABLAS' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P036R4 */
      pr_default.execute(2, new Object[] {AV16Emprcod, AV11BarTerCod, Integer.valueOf(AV8BarLanCod), Byte.valueOf(AV9BarLanReo), AV10BarLanPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P036R5 */
      pr_default.execute(3, new Object[] {AV16Emprcod, AV11BarTerCod, Integer.valueOf(AV8BarLanCod), Byte.valueOf(AV9BarLanReo), AV10BarLanPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
      /* End optimized DELETE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmsg250.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apmsg250");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Station = "" ;
      AV16Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P036R2_A396EmprCod = new String[] {""} ;
      P036R2_A171BarLanCod = new int[1] ;
      P036R2_n171BarLanCod = new boolean[] {false} ;
      P036R2_A175BarLanReo = new byte[1] ;
      P036R2_n175BarLanReo = new boolean[] {false} ;
      P036R2_A174BarLanPar = new String[] {""} ;
      P036R2_n174BarLanPar = new boolean[] {false} ;
      P036R2_A172BarLanLin = new short[1] ;
      P036R2_A1438BarTerCod = new String[] {""} ;
      A396EmprCod = "" ;
      A174BarLanPar = "" ;
      A1438BarTerCod = "" ;
      AV11BarTerCod = "" ;
      AV10BarLanPar = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmsg250__default(),
         new Object[] {
             new Object[] {
            P036R2_A396EmprCod, P036R2_A171BarLanCod, P036R2_n171BarLanCod, P036R2_A175BarLanReo, P036R2_n175BarLanReo, P036R2_A174BarLanPar, P036R2_n174BarLanPar, P036R2_A172BarLanLin, P036R2_A1438BarTerCod
            }
            , new Object[] {
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

   private byte A175BarLanReo ;
   private byte AV9BarLanReo ;
   private short A172BarLanLin ;
   private short Gx_err ;
   private int AV17Num_r ;
   private int A171BarLanCod ;
   private int AV8BarLanCod ;
   private String AV14Station ;
   private String AV16Emprcod ;
   private String GXv_char1[] ;
   private String AV15EmprNom ;
   private String GXv_char2[] ;
   private String AV13UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A174BarLanPar ;
   private String A1438BarTerCod ;
   private String AV11BarTerCod ;
   private String AV10BarLanPar ;
   private String Gx_msg ;
   private boolean n171BarLanCod ;
   private boolean n175BarLanReo ;
   private boolean n174BarLanPar ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P036R2_A396EmprCod ;
   private int[] P036R2_A171BarLanCod ;
   private boolean[] P036R2_n171BarLanCod ;
   private byte[] P036R2_A175BarLanReo ;
   private boolean[] P036R2_n175BarLanReo ;
   private String[] P036R2_A174BarLanPar ;
   private boolean[] P036R2_n174BarLanPar ;
   private short[] P036R2_A172BarLanLin ;
   private String[] P036R2_A1438BarTerCod ;
}

final  class apmsg250__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036R2", "SELECT EmprCod, BarLanCod, BarLanReo, BarLanPar, BarLanLin, BarTerCod FROM TXPBARLAN WHERE EmprCod = ? ORDER BY EmprCod, BarTerCod, BarLanLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P036R3", "DELETE FROM TXPBARLAN  WHERE EmprCod = ? AND BarTerCod = ? AND BarLanLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARLAN")
         ,new UpdateCursor("P036R4", "DELETE FROM TXPBARTER  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P036R5", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

