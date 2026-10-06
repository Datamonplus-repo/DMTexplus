package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apccobs2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apccobs2 pgm = new apccobs2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apccobs2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apccobs2.class ), "" );
   }

   public apccobs2( int remoteHandle ,
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
      AV19Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV20EmprCod ;
      GXv_char2[0] = AV21EmprNom ;
      GXv_char3[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char1, GXv_char2, GXv_char3) ;
      apccobs2.this.AV20EmprCod = GXv_char1[0] ;
      apccobs2.this.AV21EmprNom = GXv_char2[0] ;
      apccobs2.this.AV22UsurCod = GXv_char3[0] ;
      /* Using cursor P04NE2 */
      pr_default.execute(0, new Object[] {AV20EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04NE2_A396EmprCod[0] ;
         A3281CcObs = P04NE2_A3281CcObs[0] ;
         n3281CcObs = P04NE2_n3281CcObs[0] ;
         A11628CCobs2 = P04NE2_A11628CCobs2[0] ;
         n11628CCobs2 = P04NE2_n11628CCobs2[0] ;
         A4031CCTCod = P04NE2_A4031CCTCod[0] ;
         A194BarOrdLin = P04NE2_A194BarOrdLin[0] ;
         A758ProCod = P04NE2_A758ProCod[0] ;
         A130BarCodPar = P04NE2_A130BarCodPar[0] ;
         A132BarCodReo = P04NE2_A132BarCodReo[0] ;
         A129BarCod = P04NE2_A129BarCod[0] ;
         AV28Ccobs2 = " " ;
         AV26Nlin = (short)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
         AV27i = (short)(1) ;
         while ( AV27i <= AV26Nlin )
         {
            AV28Ccobs2 = GXutil.gxgetmli( A3281CcObs, AV27i, (short)(100)) ;
            AV27i = (short)(AV27i+1) ;
         }
         A11628CCobs2 = AV28Ccobs2 ;
         n11628CCobs2 = false ;
         Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.str( A129BarCod, 8, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P04NE3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11628CCobs2), A11628CCobs2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pccobs2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apccobs2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Station = "" ;
      AV20EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV22UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04NE2_A396EmprCod = new String[] {""} ;
      P04NE2_A3281CcObs = new String[] {""} ;
      P04NE2_n3281CcObs = new boolean[] {false} ;
      P04NE2_A11628CCobs2 = new String[] {""} ;
      P04NE2_n11628CCobs2 = new boolean[] {false} ;
      P04NE2_A4031CCTCod = new int[1] ;
      P04NE2_A194BarOrdLin = new short[1] ;
      P04NE2_A758ProCod = new String[] {""} ;
      P04NE2_A130BarCodPar = new String[] {""} ;
      P04NE2_A132BarCodReo = new byte[1] ;
      P04NE2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A3281CcObs = "" ;
      A11628CCobs2 = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      AV28Ccobs2 = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apccobs2__default(),
         new Object[] {
             new Object[] {
            P04NE2_A396EmprCod, P04NE2_A3281CcObs, P04NE2_n3281CcObs, P04NE2_A11628CCobs2, P04NE2_n11628CCobs2, P04NE2_A4031CCTCod, P04NE2_A194BarOrdLin, P04NE2_A758ProCod, P04NE2_A130BarCodPar, P04NE2_A132BarCodReo,
            P04NE2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short AV26Nlin ;
   private short AV27i ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private String AV19Station ;
   private String AV20EmprCod ;
   private String GXv_char1[] ;
   private String AV21EmprNom ;
   private String GXv_char2[] ;
   private String AV22UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private boolean n3281CcObs ;
   private boolean n11628CCobs2 ;
   private String A3281CcObs ;
   private String A11628CCobs2 ;
   private String AV28Ccobs2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NE2_A396EmprCod ;
   private String[] P04NE2_A3281CcObs ;
   private boolean[] P04NE2_n3281CcObs ;
   private String[] P04NE2_A11628CCobs2 ;
   private boolean[] P04NE2_n11628CCobs2 ;
   private int[] P04NE2_A4031CCTCod ;
   private short[] P04NE2_A194BarOrdLin ;
   private String[] P04NE2_A758ProCod ;
   private String[] P04NE2_A130BarCodPar ;
   private byte[] P04NE2_A132BarCodReo ;
   private int[] P04NE2_A129BarCod ;
}

final  class apccobs2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NE2", "SELECT EmprCod, CcObs, CCobs2, CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod FROM TXPCC WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04NE3", "UPDATE TXPCC SET CCobs2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 300);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
      }
   }

}

