package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbarsit6 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbarsit6 pgm = new apbarsit6 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apbarsit6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbarsit6.class ), "" );
   }

   public apbarsit6( int remoteHandle ,
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
      AV16Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV17EmprCod ;
      GXv_char2[0] = AV18EmprNom ;
      GXv_char3[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char2, GXv_char3) ;
      apbarsit6.this.AV17EmprCod = GXv_char1[0] ;
      apbarsit6.this.AV18EmprNom = GXv_char2[0] ;
      apbarsit6.this.AV19UsurCod = GXv_char3[0] ;
      /* Using cursor P04BL2 */
      pr_default.execute(0, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04BL2_A130BarCodPar[0] ;
         A132BarCodReo = P04BL2_A132BarCodReo[0] ;
         A129BarCod = P04BL2_A129BarCod[0] ;
         A396EmprCod = P04BL2_A396EmprCod[0] ;
         A213BarSit = P04BL2_A213BarSit[0] ;
         AV20Pzasest = (short)(0) ;
         AV21Pzasclose = (short)(0) ;
         /* Using cursor P04BL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A201BarPieEst = P04BL3_A201BarPieEst[0] ;
            A200BarPieCod = P04BL3_A200BarPieCod[0] ;
            AV20Pzasest = (short)(AV20Pzasest+1) ;
            if ( A201BarPieEst == 1 )
            {
               AV21Pzasclose = (short)(AV21Pzasclose+1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV21Pzasclose == AV20Pzasest ) && ( AV21Pzasclose > 0 ) && ( AV20Pzasest > 0 ) )
         {
            AV22Inc_obs = httpContext.getMessage( "Cambio Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> 9" ;
            new app.pctrinc(remoteHandle, context).execute( AV17EmprCod, AV27Pgmname, AV19UsurCod, AV16Station, AV22Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(9) ;
            Gx_msg = httpContext.getMessage( "Cambio Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> 9 " + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P04BL4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbarsit6.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apbarsit6");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Station = "" ;
      AV17EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV18EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04BL2_A130BarCodPar = new String[] {""} ;
      P04BL2_A132BarCodReo = new byte[1] ;
      P04BL2_A129BarCod = new int[1] ;
      P04BL2_A396EmprCod = new String[] {""} ;
      P04BL2_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P04BL3_A396EmprCod = new String[] {""} ;
      P04BL3_A129BarCod = new int[1] ;
      P04BL3_A132BarCodReo = new byte[1] ;
      P04BL3_A130BarCodPar = new String[] {""} ;
      P04BL3_A201BarPieEst = new byte[1] ;
      P04BL3_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV22Inc_obs = "" ;
      AV27Pgmname = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apbarsit6__default(),
         new Object[] {
             new Object[] {
            P04BL2_A130BarCodPar, P04BL2_A132BarCodReo, P04BL2_A129BarCod, P04BL2_A396EmprCod, P04BL2_A213BarSit
            }
            , new Object[] {
            P04BL3_A396EmprCod, P04BL3_A129BarCod, P04BL3_A132BarCodReo, P04BL3_A130BarCodPar, P04BL3_A201BarPieEst, P04BL3_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "APBARSIT6" ;
      /* GeneXus formulas. */
      AV27Pgmname = "APBARSIT6" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private short AV20Pzasest ;
   private short AV21Pzasclose ;
   private short Gx_err ;
   private int A129BarCod ;
   private String AV16Station ;
   private String AV17EmprCod ;
   private String GXv_char1[] ;
   private String AV18EmprNom ;
   private String GXv_char2[] ;
   private String AV19UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String AV27Pgmname ;
   private String Gx_msg ;
   private String AV22Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P04BL2_A130BarCodPar ;
   private byte[] P04BL2_A132BarCodReo ;
   private int[] P04BL2_A129BarCod ;
   private String[] P04BL2_A396EmprCod ;
   private byte[] P04BL2_A213BarSit ;
   private String[] P04BL3_A396EmprCod ;
   private int[] P04BL3_A129BarCod ;
   private byte[] P04BL3_A132BarCodReo ;
   private String[] P04BL3_A130BarCodPar ;
   private byte[] P04BL3_A201BarPieEst ;
   private String[] P04BL3_A200BarPieCod ;
}

final  class apbarsit6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04BL2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarSit <= 6) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04BL3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04BL4", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

