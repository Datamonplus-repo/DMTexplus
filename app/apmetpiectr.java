package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmetpiectr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmetpiectr pgm = new apmetpiectr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmetpiectr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmetpiectr.class ), "" );
   }

   public apmetpiectr( int remoteHandle ,
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
      AV15Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV18Emprcod ;
      GXv_char2[0] = AV17EmprNom ;
      GXv_char3[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
      apmetpiectr.this.AV18Emprcod = GXv_char1[0] ;
      apmetpiectr.this.AV17EmprNom = GXv_char2[0] ;
      apmetpiectr.this.AV16Usurcod = GXv_char3[0] ;
      /* Using cursor P04OZ2 */
      pr_default.execute(0, new Object[] {AV18Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04OZ2_A130BarCodPar[0] ;
         A132BarCodReo = P04OZ2_A132BarCodReo[0] ;
         A129BarCod = P04OZ2_A129BarCod[0] ;
         A396EmprCod = P04OZ2_A396EmprCod[0] ;
         A10780MetPiectr = P04OZ2_A10780MetPiectr[0] ;
         A4917MetPieObs = P04OZ2_A4917MetPieObs[0] ;
         A2813MetPieCod = P04OZ2_A2813MetPieCod[0] ;
         A2809MetTerCod = P04OZ2_A2809MetTerCod[0] ;
         AV21Barcod = A129BarCod ;
         AV22Barcodreo = A132BarCodReo ;
         AV23Barcodpar = A130BarCodPar ;
         AV19Barordlin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         AV20Fascod = " " ;
         AV24FasDsc = " " ;
         /* Using cursor P04OZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV19Barordlin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P04OZ3_A194BarOrdLin[0] ;
            A457FasCod = P04OZ3_A457FasCod[0] ;
            A460FasDsc = P04OZ3_A460FasDsc[0] ;
            A758ProCod = P04OZ3_A758ProCod[0] ;
            A460FasDsc = P04OZ3_A460FasDsc[0] ;
            AV20Fascod = A457FasCod ;
            AV24FasDsc = A460FasDsc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A10780MetPiectr = AV20Fascod + "-" + GXutil.trim( AV24FasDsc) ;
         Gx_msg = httpContext.getMessage( "Actualizando...", "") + AV20Fascod + "-" + AV24FasDsc ;
         System.out.println( Gx_msg );
         /* Using cursor P04OZ4 */
         pr_default.execute(2, new Object[] {A10780MetPiectr, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmetpiectr.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apmetpiectr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Station = "" ;
      AV18Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04OZ2_A130BarCodPar = new String[] {""} ;
      P04OZ2_A132BarCodReo = new byte[1] ;
      P04OZ2_A129BarCod = new int[1] ;
      P04OZ2_A396EmprCod = new String[] {""} ;
      P04OZ2_A10780MetPiectr = new String[] {""} ;
      P04OZ2_A4917MetPieObs = new String[] {""} ;
      P04OZ2_A2813MetPieCod = new String[] {""} ;
      P04OZ2_A2809MetTerCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A10780MetPiectr = "" ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV23Barcodpar = "" ;
      AV20Fascod = "" ;
      AV24FasDsc = "" ;
      P04OZ3_A396EmprCod = new String[] {""} ;
      P04OZ3_A129BarCod = new int[1] ;
      P04OZ3_A132BarCodReo = new byte[1] ;
      P04OZ3_A130BarCodPar = new String[] {""} ;
      P04OZ3_A194BarOrdLin = new short[1] ;
      P04OZ3_A457FasCod = new String[] {""} ;
      P04OZ3_A460FasDsc = new String[] {""} ;
      P04OZ3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmetpiectr__default(),
         new Object[] {
             new Object[] {
            P04OZ2_A130BarCodPar, P04OZ2_A132BarCodReo, P04OZ2_A129BarCod, P04OZ2_A396EmprCod, P04OZ2_A10780MetPiectr, P04OZ2_A4917MetPieObs, P04OZ2_A2813MetPieCod, P04OZ2_A2809MetTerCod
            }
            , new Object[] {
            P04OZ3_A396EmprCod, P04OZ3_A129BarCod, P04OZ3_A132BarCodReo, P04OZ3_A130BarCodPar, P04OZ3_A194BarOrdLin, P04OZ3_A457FasCod, P04OZ3_A460FasDsc, P04OZ3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV22Barcodreo ;
   private short AV19Barordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21Barcod ;
   private String AV15Station ;
   private String AV18Emprcod ;
   private String GXv_char1[] ;
   private String AV17EmprNom ;
   private String GXv_char2[] ;
   private String AV16Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A10780MetPiectr ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV23Barcodpar ;
   private String AV20Fascod ;
   private String AV24FasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String Gx_msg ;
   private String A4917MetPieObs ;
   private IDataStoreProvider pr_default ;
   private String[] P04OZ2_A130BarCodPar ;
   private byte[] P04OZ2_A132BarCodReo ;
   private int[] P04OZ2_A129BarCod ;
   private String[] P04OZ2_A396EmprCod ;
   private String[] P04OZ2_A10780MetPiectr ;
   private String[] P04OZ2_A4917MetPieObs ;
   private String[] P04OZ2_A2813MetPieCod ;
   private String[] P04OZ2_A2809MetTerCod ;
   private String[] P04OZ3_A396EmprCod ;
   private int[] P04OZ3_A129BarCod ;
   private byte[] P04OZ3_A132BarCodReo ;
   private String[] P04OZ3_A130BarCodPar ;
   private short[] P04OZ3_A194BarOrdLin ;
   private String[] P04OZ3_A457FasCod ;
   private String[] P04OZ3_A460FasDsc ;
   private String[] P04OZ3_A758ProCod ;
}

final  class apmetpiectr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OZ2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, MetPiectr, MetPieObs, MetPieCod, MetTerCod FROM TXPLMETPI WHERE (EmprCod = ?) AND (MetPiectr = ' ') ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OZ3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasCod, T2.FasDsc, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04OZ4", "UPDATE TXPLMETPI SET MetPiectr=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

