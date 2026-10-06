package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputler00 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputler00 pgm = new aputler00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputler00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputler00.class ), "" );
   }

   public aputler00( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      /* Using cursor P04EL2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5299Inc_Barcod = P04EL2_A5299Inc_Barcod[0] ;
         A396EmprCod = P04EL2_A396EmprCod[0] ;
         A4935Inc_Prog = P04EL2_A4935Inc_Prog[0] ;
         A4929Inc_Dia = P04EL2_A4929Inc_Dia[0] ;
         A4931Inc_Linea = P04EL2_A4931Inc_Linea[0] ;
         if ( GXutil.strcmp(A4935Inc_Prog, httpContext.getMessage( "pfincos", "")) == 0 )
         {
            /* Using cursor P04EL3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5299Inc_Barcod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A44AlbRecCod = P04EL3_A44AlbRecCod[0] ;
               A6182AlbrNF = P04EL3_A6182AlbrNF[0] ;
               A6182AlbrNF = httpContext.getMessage( "S", "") ;
               /* Using cursor P04EL4 */
               pr_default.execute(2, new Object[] {A6182AlbrNF, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putler00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputler00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P04EL2_A5299Inc_Barcod = new int[1] ;
      P04EL2_A396EmprCod = new String[] {""} ;
      P04EL2_A4935Inc_Prog = new String[] {""} ;
      P04EL2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P04EL2_A4931Inc_Linea = new long[1] ;
      A396EmprCod = "" ;
      A4935Inc_Prog = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      P04EL3_A396EmprCod = new String[] {""} ;
      P04EL3_A44AlbRecCod = new int[1] ;
      P04EL3_A6182AlbrNF = new String[] {""} ;
      A6182AlbrNF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputler00__default(),
         new Object[] {
             new Object[] {
            P04EL2_A5299Inc_Barcod, P04EL2_A396EmprCod, P04EL2_A4935Inc_Prog, P04EL2_A4929Inc_Dia, P04EL2_A4931Inc_Linea
            }
            , new Object[] {
            P04EL3_A396EmprCod, P04EL3_A44AlbRecCod, P04EL3_A6182AlbrNF
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5299Inc_Barcod ;
   private int A44AlbRecCod ;
   private long A4931Inc_Linea ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4935Inc_Prog ;
   private String A6182AlbrNF ;
   private java.util.Date A4929Inc_Dia ;
   private IDataStoreProvider pr_default ;
   private int[] P04EL2_A5299Inc_Barcod ;
   private String[] P04EL2_A396EmprCod ;
   private String[] P04EL2_A4935Inc_Prog ;
   private java.util.Date[] P04EL2_A4929Inc_Dia ;
   private long[] P04EL2_A4931Inc_Linea ;
   private String[] P04EL3_A396EmprCod ;
   private int[] P04EL3_A44AlbRecCod ;
   private String[] P04EL3_A6182AlbrNF ;
}

final  class aputler00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EL2", "SELECT Inc_Barcod, EmprCod, Inc_Prog, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04EL3", "SELECT EmprCod, AlbRecCod, AlbrNF FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04EL4", "UPDATE TXPALBREC SET AlbrNF=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

