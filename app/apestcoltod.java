package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apestcoltod extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apestcoltod pgm = new apestcoltod (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apestcoltod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apestcoltod.class ), "" );
   }

   public apestcoltod( int remoteHandle ,
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
      /* Using cursor P02VQ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4415EstCol = P02VQ2_A4415EstCol[0] ;
         A252CliCod = P02VQ2_A252CliCod[0] ;
         A396EmprCod = P02VQ2_A396EmprCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P02VQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEstCo");
         /* End optimized DELETE. */
         /* Using cursor P02VQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEstCo");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02VQ5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P02VQ5_A396EmprCod[0] ;
         A252CliCod = P02VQ5_A252CliCod[0] ;
         A2141SerEst = P02VQ5_A2141SerEst[0] ;
         A1013DibCli = P02VQ5_A1013DibCli[0] ;
         A1014DibInt = P02VQ5_A1014DibInt[0] ;
         A2074ColCom = P02VQ5_A2074ColCom[0] ;
         A2078ColFon = P02VQ5_A2078ColFon[0] ;
         A2098MolCod = P02VQ5_A2098MolCod[0] ;
         A4420MolCol = P02VQ5_A4420MolCol[0] ;
         n4420MolCol = P02VQ5_n4420MolCol[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A2141SerEst ;
         GXv_char4[0] = A1013DibCli ;
         GXv_int5[0] = A1014DibInt ;
         GXv_char6[0] = A2074ColCom ;
         GXv_char7[0] = A2078ColFon ;
         GXv_int8[0] = A2098MolCod ;
         GXv_char9[0] = A4420MolCol ;
         GXv_int10[0] = (short)(0) ;
         new app.pestcol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8, GXv_char9, GXv_int10) ;
         apestcoltod.this.A396EmprCod = GXv_char1[0] ;
         apestcoltod.this.A252CliCod = GXv_int2[0] ;
         apestcoltod.this.A2141SerEst = GXv_char3[0] ;
         apestcoltod.this.A1013DibCli = GXv_char4[0] ;
         apestcoltod.this.A1014DibInt = GXv_int5[0] ;
         apestcoltod.this.A2074ColCom = GXv_char6[0] ;
         apestcoltod.this.A2078ColFon = GXv_char7[0] ;
         apestcoltod.this.A2098MolCod = GXv_int8[0] ;
         apestcoltod.this.A4420MolCol = GXv_char9[0] ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pestcoltod.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apestcoltod");
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
      P02VQ2_A4415EstCol = new String[] {""} ;
      P02VQ2_A252CliCod = new int[1] ;
      P02VQ2_A396EmprCod = new String[] {""} ;
      A4415EstCol = "" ;
      A396EmprCod = "" ;
      P02VQ5_A396EmprCod = new String[] {""} ;
      P02VQ5_A252CliCod = new int[1] ;
      P02VQ5_A2141SerEst = new String[] {""} ;
      P02VQ5_A1013DibCli = new String[] {""} ;
      P02VQ5_A1014DibInt = new int[1] ;
      P02VQ5_A2074ColCom = new String[] {""} ;
      P02VQ5_A2078ColFon = new String[] {""} ;
      P02VQ5_A2098MolCod = new byte[1] ;
      P02VQ5_A4420MolCol = new String[] {""} ;
      P02VQ5_n4420MolCol = new boolean[] {false} ;
      A2141SerEst = "" ;
      A1013DibCli = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A4420MolCol = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apestcoltod__default(),
         new Object[] {
             new Object[] {
            P02VQ2_A4415EstCol, P02VQ2_A252CliCod, P02VQ2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02VQ5_A396EmprCod, P02VQ5_A252CliCod, P02VQ5_A2141SerEst, P02VQ5_A1013DibCli, P02VQ5_A1014DibInt, P02VQ5_A2074ColCom, P02VQ5_A2078ColFon, P02VQ5_A2098MolCod, P02VQ5_A4420MolCol, P02VQ5_n4420MolCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private byte GXv_int8[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String scmdbuf ;
   private String A4415EstCol ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A4420MolCol ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private boolean n4420MolCol ;
   private IDataStoreProvider pr_default ;
   private String[] P02VQ2_A4415EstCol ;
   private int[] P02VQ2_A252CliCod ;
   private String[] P02VQ2_A396EmprCod ;
   private String[] P02VQ5_A396EmprCod ;
   private int[] P02VQ5_A252CliCod ;
   private String[] P02VQ5_A2141SerEst ;
   private String[] P02VQ5_A1013DibCli ;
   private int[] P02VQ5_A1014DibInt ;
   private String[] P02VQ5_A2074ColCom ;
   private String[] P02VQ5_A2078ColFon ;
   private byte[] P02VQ5_A2098MolCod ;
   private String[] P02VQ5_A4420MolCol ;
   private boolean[] P02VQ5_n4420MolCol ;
}

final  class apestcoltod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VQ2", "SELECT EstCol, CliCod, EmprCod FROM TXPCEstCo WHERE EstCol like '%/%' ORDER BY EmprCod, CliCod, EstCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VQ3", "DELETE FROM TXPLEstCo  WHERE EmprCod = ? and CliCod = ? and EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEstCo")
         ,new UpdateCursor("P02VQ4", "DELETE FROM TXPCEstCo  WHERE EmprCod = ? AND CliCod = ? AND EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEstCo")
         ,new ForEachCursor("P02VQ5", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCol FROM TXPMFORES ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

