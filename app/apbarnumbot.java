package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbarnumbot extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbarnumbot pgm = new apbarnumbot (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apbarnumbot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbarnumbot.class ), "" );
   }

   public apbarnumbot( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9Emprcod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV11Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      apbarnumbot.this.AV9Emprcod = GXv_char1[0] ;
      apbarnumbot.this.AV10EmprNom = GXv_char2[0] ;
      apbarnumbot.this.AV11Usurcod = GXv_char3[0] ;
      /* Using cursor P04P02 */
      pr_default.execute(0, new Object[] {AV9Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk4P02 = false ;
         A396EmprCod = P04P02_A396EmprCod[0] ;
         A2813MetPieCod = P04P02_A2813MetPieCod[0] ;
         A10780MetPiectr = P04P02_A10780MetPiectr[0] ;
         A130BarCodPar = P04P02_A130BarCodPar[0] ;
         A132BarCodReo = P04P02_A132BarCodReo[0] ;
         A129BarCod = P04P02_A129BarCod[0] ;
         A2809MetTerCod = P04P02_A2809MetTerCod[0] ;
         A4917MetPieObs = P04P02_A4917MetPieObs[0] ;
         AV12Barcod = A129BarCod ;
         AV13Barcodreo = A132BarCodReo ;
         AV14Barcodpar = A130BarCodPar ;
         AV15Barordlin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         AV16VControl = GXutil.substring( A4917MetPieObs, 1, 30) ;
         AV17UltPza = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P04P02_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04P02_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P04P02_A129BarCod[0] == A129BarCod ) && ( P04P02_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P04P02_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P04P02_A10780MetPiectr[0], A10780MetPiectr) == 0 ) ) )
            {
               if (true) break;
            }
            brk4P02 = false ;
            A2813MetPieCod = P04P02_A2813MetPieCod[0] ;
            if ( GXutil.len( GXutil.trim( A2813MetPieCod)) == 9 )
            {
               AV17UltPza = (int)(GXutil.lval( GXutil.substring( A2813MetPieCod, 5, 5))) ;
            }
            else
            {
               AV17UltPza = (int)(GXutil.lval( A2813MetPieCod)) ;
            }
            brk4P02 = true ;
            pr_default.readNext(0);
         }
         if ( GXutil.strcmp(AV16VControl, " ") != 0 )
         {
            /* Execute user subroutine: 'BARFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            Gx_msg = httpContext.getMessage( "Actualizando... ", "") + GXutil.str( AV15Barordlin, 4, 0) + " " + GXutil.str( AV17UltPza, 6, 0) ;
            System.out.println( Gx_msg );
         }
         if ( ! brk4P02 )
         {
            brk4P02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04P03 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV17UltPza), AV9Emprcod, Integer.valueOf(AV12Barcod), Byte.valueOf(AV13Barcodreo), AV14Barcodpar, Short.valueOf(AV15Barordlin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbarnumbot.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apbarnumbot");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      AV9Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV11Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04P02_A396EmprCod = new String[] {""} ;
      P04P02_A2813MetPieCod = new String[] {""} ;
      P04P02_A10780MetPiectr = new String[] {""} ;
      P04P02_A130BarCodPar = new String[] {""} ;
      P04P02_A132BarCodReo = new byte[1] ;
      P04P02_A129BarCod = new int[1] ;
      P04P02_A2809MetTerCod = new String[] {""} ;
      P04P02_A4917MetPieObs = new String[] {""} ;
      A396EmprCod = "" ;
      A2813MetPieCod = "" ;
      A10780MetPiectr = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      A4917MetPieObs = "" ;
      AV14Barcodpar = "" ;
      AV16VControl = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apbarnumbot__default(),
         new Object[] {
             new Object[] {
            P04P02_A396EmprCod, P04P02_A2813MetPieCod, P04P02_A10780MetPiectr, P04P02_A130BarCodPar, P04P02_A132BarCodReo, P04P02_A129BarCod, P04P02_A2809MetTerCod, P04P02_A4917MetPieObs
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13Barcodreo ;
   private short AV15Barordlin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12Barcod ;
   private int AV17UltPza ;
   private int A4022BarNumBot ;
   private String AV8Station ;
   private String AV9Emprcod ;
   private String GXv_char1[] ;
   private String AV10EmprNom ;
   private String GXv_char2[] ;
   private String AV11Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String AV14Barcodpar ;
   private String AV16VControl ;
   private String Gx_msg ;
   private boolean brk4P02 ;
   private boolean returnInSub ;
   private String A4917MetPieObs ;
   private IDataStoreProvider pr_default ;
   private String[] P04P02_A396EmprCod ;
   private String[] P04P02_A2813MetPieCod ;
   private String[] P04P02_A10780MetPiectr ;
   private String[] P04P02_A130BarCodPar ;
   private byte[] P04P02_A132BarCodReo ;
   private int[] P04P02_A129BarCod ;
   private String[] P04P02_A2809MetTerCod ;
   private String[] P04P02_A4917MetPieObs ;
}

final  class apbarnumbot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04P02", "SELECT EmprCod, MetPieCod, MetPiectr, BarCodPar, BarCodReo, BarCod, MetTerCod, MetPieObs FROM TXPLMETPI WHERE EmprCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04P03", "UPDATE TXPBARFAS SET BarNumBot=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

