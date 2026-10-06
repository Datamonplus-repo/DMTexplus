package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptin004 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptin004 pgm = new aptin004 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptin004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptin004.class ), "" );
   }

   public aptin004( int remoteHandle ,
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
      AV15Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16Emprcod ;
      GXv_char2[0] = AV17EmprNom ;
      GXv_char3[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptin004.this.AV16Emprcod = GXv_char1[0] ;
      aptin004.this.AV17EmprNom = GXv_char2[0] ;
      aptin004.this.AV18Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Empieza Processo....", "") );
      /* Using cursor P02G72 */
      pr_default.execute(0, new Object[] {AV16Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02G72_A130BarCodPar[0] ;
         A132BarCodReo = P02G72_A132BarCodReo[0] ;
         A129BarCod = P02G72_A129BarCod[0] ;
         A396EmprCod = P02G72_A396EmprCod[0] ;
         A213BarSit = P02G72_A213BarSit[0] ;
         /* Using cursor P02G73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A179BarLoc = P02G73_A179BarLoc[0] ;
            A6390BarfasMn = P02G73_A6390BarfasMn[0] ;
            n6390BarfasMn = P02G73_n6390BarfasMn[0] ;
            A194BarOrdLin = P02G73_A194BarOrdLin[0] ;
            A758ProCod = P02G73_A758ProCod[0] ;
            Gx_msg = httpContext.getMessage( "BarFasmn=", "") + A179BarLoc ;
            System.out.println( Gx_msg );
            A6390BarfasMn = A179BarLoc ;
            n6390BarfasMn = false ;
            /* Using cursor P02G74 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Processo....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptin004.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptin004");
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
      AV16Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02G72_A130BarCodPar = new String[] {""} ;
      P02G72_A132BarCodReo = new byte[1] ;
      P02G72_A129BarCod = new int[1] ;
      P02G72_A396EmprCod = new String[] {""} ;
      P02G72_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P02G73_A396EmprCod = new String[] {""} ;
      P02G73_A129BarCod = new int[1] ;
      P02G73_A132BarCodReo = new byte[1] ;
      P02G73_A130BarCodPar = new String[] {""} ;
      P02G73_A179BarLoc = new String[] {""} ;
      P02G73_A6390BarfasMn = new String[] {""} ;
      P02G73_n6390BarfasMn = new boolean[] {false} ;
      P02G73_A194BarOrdLin = new short[1] ;
      P02G73_A758ProCod = new String[] {""} ;
      A179BarLoc = "" ;
      A6390BarfasMn = "" ;
      A758ProCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptin004__default(),
         new Object[] {
             new Object[] {
            P02G72_A130BarCodPar, P02G72_A132BarCodReo, P02G72_A129BarCod, P02G72_A396EmprCod, P02G72_A213BarSit
            }
            , new Object[] {
            P02G73_A396EmprCod, P02G73_A129BarCod, P02G73_A132BarCodReo, P02G73_A130BarCodPar, P02G73_A179BarLoc, P02G73_A6390BarfasMn, P02G73_n6390BarfasMn, P02G73_A194BarOrdLin, P02G73_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String AV15Station ;
   private String AV16Emprcod ;
   private String GXv_char1[] ;
   private String AV17EmprNom ;
   private String GXv_char2[] ;
   private String AV18Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A179BarLoc ;
   private String A6390BarfasMn ;
   private String A758ProCod ;
   private String Gx_msg ;
   private boolean n6390BarfasMn ;
   private IDataStoreProvider pr_default ;
   private String[] P02G72_A130BarCodPar ;
   private byte[] P02G72_A132BarCodReo ;
   private int[] P02G72_A129BarCod ;
   private String[] P02G72_A396EmprCod ;
   private byte[] P02G72_A213BarSit ;
   private String[] P02G73_A396EmprCod ;
   private int[] P02G73_A129BarCod ;
   private byte[] P02G73_A132BarCodReo ;
   private String[] P02G73_A130BarCodPar ;
   private String[] P02G73_A179BarLoc ;
   private String[] P02G73_A6390BarfasMn ;
   private boolean[] P02G73_n6390BarfasMn ;
   private short[] P02G73_A194BarOrdLin ;
   private String[] P02G73_A758ProCod ;
}

final  class aptin004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02G72", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarSit < 11) ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02G73", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarLoc, BarfasMn, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02G74", "UPDATE TXPBARFAS SET BarfasMn=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

