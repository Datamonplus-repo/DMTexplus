package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aperf001 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aperf001 pgm = new aperf001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aperf001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aperf001.class ), "" );
   }

   public aperf001( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizo campo BARPIEIDPZ...", "") );
      /* Using cursor P02RU2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02RU2_A396EmprCod[0] ;
         A130BarCodPar = P02RU2_A130BarCodPar[0] ;
         A132BarCodReo = P02RU2_A132BarCodReo[0] ;
         A129BarCod = P02RU2_A129BarCod[0] ;
         AV9Barcod = A129BarCod ;
         AV11BarCodreo = A132BarCodReo ;
         AV12barcodpar = A130BarCodPar ;
         AV10emprcod = A396EmprCod ;
         /* Execute user subroutine: 'SEMMALHA' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV8Reccod_sm > 0 )
         {
            /* Execute user subroutine: 'BARPIEIDPZ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizo campo BARPIEIDPZ...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARPIEIDPZ' Routine */
      returnInSub = false ;
      n6489BarPieIdPz = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02RU3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV8Reccod_sm), AV10emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11BarCodreo), AV12barcodpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'SEMMALHA' Routine */
      returnInSub = false ;
      AV8Reccod_sm = 0 ;
      /* Using cursor P02RU4 */
      pr_default.execute(2, new Object[] {AV10emprcod, Integer.valueOf(AV9Barcod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = P02RU4_A129BarCod[0] ;
         A396EmprCod = P02RU4_A396EmprCod[0] ;
         A2186BarPieLoc = P02RU4_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P02RU4_n2186BarPieLoc[0] ;
         A44AlbRecCod = P02RU4_A44AlbRecCod[0] ;
         A200BarPieCod = P02RU4_A200BarPieCod[0] ;
         A130BarCodPar = P02RU4_A130BarCodPar[0] ;
         A132BarCodReo = P02RU4_A132BarCodReo[0] ;
         if ( GXutil.strcmp(A2186BarPieLoc, httpContext.getMessage( "Sem Malha ", "")) == 0 )
         {
            AV8Reccod_sm = A44AlbRecCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(perf001.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aperf001");
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
      P02RU2_A396EmprCod = new String[] {""} ;
      P02RU2_A130BarCodPar = new String[] {""} ;
      P02RU2_A132BarCodReo = new byte[1] ;
      P02RU2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV12barcodpar = "" ;
      AV10emprcod = "" ;
      P02RU4_A129BarCod = new int[1] ;
      P02RU4_A396EmprCod = new String[] {""} ;
      P02RU4_A2186BarPieLoc = new String[] {""} ;
      P02RU4_n2186BarPieLoc = new boolean[] {false} ;
      P02RU4_A44AlbRecCod = new int[1] ;
      P02RU4_A200BarPieCod = new String[] {""} ;
      P02RU4_A130BarCodPar = new String[] {""} ;
      P02RU4_A132BarCodReo = new byte[1] ;
      A2186BarPieLoc = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aperf001__default(),
         new Object[] {
             new Object[] {
            P02RU2_A396EmprCod, P02RU2_A130BarCodPar, P02RU2_A132BarCodReo, P02RU2_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02RU4_A129BarCod, P02RU4_A396EmprCod, P02RU4_A2186BarPieLoc, P02RU4_n2186BarPieLoc, P02RU4_A44AlbRecCod, P02RU4_A200BarPieCod, P02RU4_A130BarCodPar, P02RU4_A132BarCodReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarCodreo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Barcod ;
   private int AV8Reccod_sm ;
   private int A44AlbRecCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12barcodpar ;
   private String AV10emprcod ;
   private String A2186BarPieLoc ;
   private String A200BarPieCod ;
   private boolean returnInSub ;
   private boolean n6489BarPieIdPz ;
   private boolean n2186BarPieLoc ;
   private IDataStoreProvider pr_default ;
   private String[] P02RU2_A396EmprCod ;
   private String[] P02RU2_A130BarCodPar ;
   private byte[] P02RU2_A132BarCodReo ;
   private int[] P02RU2_A129BarCod ;
   private int[] P02RU4_A129BarCod ;
   private String[] P02RU4_A396EmprCod ;
   private String[] P02RU4_A2186BarPieLoc ;
   private boolean[] P02RU4_n2186BarPieLoc ;
   private int[] P02RU4_A44AlbRecCod ;
   private String[] P02RU4_A200BarPieCod ;
   private String[] P02RU4_A130BarCodPar ;
   private byte[] P02RU4_A132BarCodReo ;
}

final  class aperf001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RU2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = '001' ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RU3", "UPDATE TXPBARPIE SET BarPieIdPz=RTRIM(LTRIM(SUBSTR(TO_CHAR(?,'99999990'), 2)))  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P02RU4", "SELECT BarCod, EmprCod, BarPieLoc, AlbRecCod, BarPieCod, BarCodPar, BarCodReo FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 9);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

