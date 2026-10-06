package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apalbriscli extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apalbriscli pgm = new apalbriscli (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apalbriscli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apalbriscli.class ), "" );
   }

   public apalbriscli( int remoteHandle ,
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
      /* Using cursor P03OG2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03OG2_A396EmprCod[0] ;
         A1211TipEntCod = P03OG2_A1211TipEntCod[0] ;
         n1211TipEntCod = P03OG2_n1211TipEntCod[0] ;
         A44AlbRecCod = P03OG2_A44AlbRecCod[0] ;
         A6463AlbRLote = P03OG2_A6463AlbRLote[0] ;
         A3359AlbRDisCli = P03OG2_A3359AlbRDisCli[0] ;
         if ( GXutil.strcmp(A6463AlbRLote, httpContext.getMessage( "BM19", "")) != 0 )
         {
            AV10AlbRecCo1 = " " ;
            /* Using cursor P03OG3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7793AlbRecCo1 = P03OG3_A7793AlbRecCo1[0] ;
               n7793AlbRecCo1 = P03OG3_n7793AlbRecCo1[0] ;
               A2159AlbRecPie = P03OG3_A2159AlbRecPie[0] ;
               AV10AlbRecCo1 = A7793AlbRecCo1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            A3359AlbRDisCli = AV10AlbRecCo1 ;
            System.out.println( httpContext.getMessage( "Actualizando....", "") );
            /* Using cursor P03OG4 */
            pr_default.execute(2, new Object[] {A3359AlbRDisCli, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(palbriscli.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apalbriscli");
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
      P03OG2_A396EmprCod = new String[] {""} ;
      P03OG2_A1211TipEntCod = new short[1] ;
      P03OG2_n1211TipEntCod = new boolean[] {false} ;
      P03OG2_A44AlbRecCod = new int[1] ;
      P03OG2_A6463AlbRLote = new String[] {""} ;
      P03OG2_A3359AlbRDisCli = new String[] {""} ;
      A396EmprCod = "" ;
      A6463AlbRLote = "" ;
      A3359AlbRDisCli = "" ;
      AV10AlbRecCo1 = "" ;
      P03OG3_A396EmprCod = new String[] {""} ;
      P03OG3_A44AlbRecCod = new int[1] ;
      P03OG3_A7793AlbRecCo1 = new String[] {""} ;
      P03OG3_n7793AlbRecCo1 = new boolean[] {false} ;
      P03OG3_A2159AlbRecPie = new String[] {""} ;
      A7793AlbRecCo1 = "" ;
      A2159AlbRecPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apalbriscli__default(),
         new Object[] {
             new Object[] {
            P03OG2_A396EmprCod, P03OG2_A1211TipEntCod, P03OG2_n1211TipEntCod, P03OG2_A44AlbRecCod, P03OG2_A6463AlbRLote, P03OG2_A3359AlbRDisCli
            }
            , new Object[] {
            P03OG3_A396EmprCod, P03OG3_A44AlbRecCod, P03OG3_A7793AlbRecCo1, P03OG3_n7793AlbRecCo1, P03OG3_A2159AlbRecPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1211TipEntCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6463AlbRLote ;
   private String A3359AlbRDisCli ;
   private String AV10AlbRecCo1 ;
   private String A7793AlbRecCo1 ;
   private String A2159AlbRecPie ;
   private boolean n1211TipEntCod ;
   private boolean n7793AlbRecCo1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03OG2_A396EmprCod ;
   private short[] P03OG2_A1211TipEntCod ;
   private boolean[] P03OG2_n1211TipEntCod ;
   private int[] P03OG2_A44AlbRecCod ;
   private String[] P03OG2_A6463AlbRLote ;
   private String[] P03OG2_A3359AlbRDisCli ;
   private String[] P03OG3_A396EmprCod ;
   private int[] P03OG3_A44AlbRecCod ;
   private String[] P03OG3_A7793AlbRecCo1 ;
   private boolean[] P03OG3_n7793AlbRecCo1 ;
   private String[] P03OG3_A2159AlbRecPie ;
}

final  class apalbriscli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03OG2", "SELECT EmprCod, TipEntCod, AlbRecCod, AlbRLote, AlbRDisCli FROM TXPALBREC WHERE (EmprCod = '001') AND (AlbRLote <> 'X') AND (TipEntCod = 1) ORDER BY EmprCod, AlbRLote ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03OG3", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecCo1, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03OG4", "UPDATE TXPALBREC SET AlbRDisCli=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 9);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

