package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apkilcc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apkilcc pgm = new apkilcc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apkilcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apkilcc.class ), "" );
   }

   public apkilcc( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Eliminacion CC en funcion de Barcad...", "") );
      AV13Num_r = 0 ;
      /* Using cursor P02Y72 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4031CCTCod = P02Y72_A4031CCTCod[0] ;
         A194BarOrdLin = P02Y72_A194BarOrdLin[0] ;
         A758ProCod = P02Y72_A758ProCod[0] ;
         A130BarCodPar = P02Y72_A130BarCodPar[0] ;
         A132BarCodReo = P02Y72_A132BarCodReo[0] ;
         A129BarCod = P02Y72_A129BarCod[0] ;
         A396EmprCod = P02Y72_A396EmprCod[0] ;
         AV11Emprcod = A396EmprCod ;
         AV8Barcod = A129BarCod ;
         AV9Barcodreo = A132BarCodReo ;
         AV10Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV12Barcad == 0 )
         {
            /* Optimized DELETE. */
            /* Using cursor P02Y73 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
            /* End optimized DELETE. */
            /* Using cursor P02Y74 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
            AV13Num_r = (int)(AV13Num_r+1) ;
            Gx_msg = httpContext.getMessage( "Eliminando CC = ", "") + GXutil.str( AV13Num_r, 6, 0) ;
            System.out.println( Gx_msg );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Eliminacion CC en funcion de Barcad...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV12Barcad = (byte)(0) ;
      /* Using cursor P02Y75 */
      pr_default.execute(3, new Object[] {AV11Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P02Y75_A130BarCodPar[0] ;
         A132BarCodReo = P02Y75_A132BarCodReo[0] ;
         A129BarCod = P02Y75_A129BarCod[0] ;
         A396EmprCod = P02Y75_A396EmprCod[0] ;
         AV12Barcad = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pkilcc.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apkilcc");
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
      P02Y72_A4031CCTCod = new int[1] ;
      P02Y72_A194BarOrdLin = new short[1] ;
      P02Y72_A758ProCod = new String[] {""} ;
      P02Y72_A130BarCodPar = new String[] {""} ;
      P02Y72_A132BarCodReo = new byte[1] ;
      P02Y72_A129BarCod = new int[1] ;
      P02Y72_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV11Emprcod = "" ;
      AV10Barcodpar = "" ;
      Gx_msg = "" ;
      P02Y75_A130BarCodPar = new String[] {""} ;
      P02Y75_A132BarCodReo = new byte[1] ;
      P02Y75_A129BarCod = new int[1] ;
      P02Y75_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apkilcc__default(),
         new Object[] {
             new Object[] {
            P02Y72_A4031CCTCod, P02Y72_A194BarOrdLin, P02Y72_A758ProCod, P02Y72_A130BarCodPar, P02Y72_A132BarCodReo, P02Y72_A129BarCod, P02Y72_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02Y75_A130BarCodPar, P02Y75_A132BarCodReo, P02Y75_A129BarCod, P02Y75_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Barcodreo ;
   private byte AV12Barcad ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV13Num_r ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV11Emprcod ;
   private String AV10Barcodpar ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P02Y72_A4031CCTCod ;
   private short[] P02Y72_A194BarOrdLin ;
   private String[] P02Y72_A758ProCod ;
   private String[] P02Y72_A130BarCodPar ;
   private byte[] P02Y72_A132BarCodReo ;
   private int[] P02Y72_A129BarCod ;
   private String[] P02Y72_A396EmprCod ;
   private String[] P02Y75_A130BarCodPar ;
   private byte[] P02Y75_A132BarCodReo ;
   private int[] P02Y75_A129BarCod ;
   private String[] P02Y75_A396EmprCod ;
}

final  class apkilcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Y72", "SELECT CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPCC WHERE EmprCod = '001' ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02Y73", "DELETE FROM TXPCC1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
         ,new UpdateCursor("P02Y74", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P02Y75", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

