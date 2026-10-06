package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apalmacenmuestras extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apalmacenmuestras pgm = new apalmacenmuestras (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apalmacenmuestras( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apalmacenmuestras.class ), "" );
   }

   public apalmacenmuestras( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando.....", "") );
      /* Using cursor P04FQ2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04FQ2_A396EmprCod[0] ;
         A3030BarPlf = P04FQ2_A3030BarPlf[0] ;
         A44AlbRecCod = P04FQ2_A44AlbRecCod[0] ;
         A200BarPieCod = P04FQ2_A200BarPieCod[0] ;
         A130BarCodPar = P04FQ2_A130BarCodPar[0] ;
         A132BarCodReo = P04FQ2_A132BarCodReo[0] ;
         A129BarCod = P04FQ2_A129BarCod[0] ;
         A3030BarPlf = P04FQ2_A3030BarPlf[0] ;
         AV10AlbRnf = A3030BarPlf ;
         AV9ALbreccod = A44AlbRecCod ;
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04FQ3 */
      pr_default.execute(1, new Object[] {AV10AlbRnf, AV8Emprcod, Integer.valueOf(AV9ALbreccod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(palmacenmuestras.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apalmacenmuestras");
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
      P04FQ2_A396EmprCod = new String[] {""} ;
      P04FQ2_A3030BarPlf = new String[] {""} ;
      P04FQ2_A44AlbRecCod = new int[1] ;
      P04FQ2_A200BarPieCod = new String[] {""} ;
      P04FQ2_A130BarCodPar = new String[] {""} ;
      P04FQ2_A132BarCodReo = new byte[1] ;
      P04FQ2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A3030BarPlf = "" ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      AV10AlbRnf = "" ;
      A6182AlbrNF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apalmacenmuestras__default(),
         new Object[] {
             new Object[] {
            P04FQ2_A396EmprCod, P04FQ2_A3030BarPlf, P04FQ2_A44AlbRecCod, P04FQ2_A200BarPieCod, P04FQ2_A130BarCodPar, P04FQ2_A132BarCodReo, P04FQ2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int AV9ALbreccod ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A3030BarPlf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String AV10AlbRnf ;
   private String A6182AlbrNF ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P04FQ2_A396EmprCod ;
   private String[] P04FQ2_A3030BarPlf ;
   private int[] P04FQ2_A44AlbRecCod ;
   private String[] P04FQ2_A200BarPieCod ;
   private String[] P04FQ2_A130BarCodPar ;
   private byte[] P04FQ2_A132BarCodReo ;
   private int[] P04FQ2_A129BarCod ;
}

final  class apalmacenmuestras__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FQ2", "SELECT T1.EmprCod, T2.BarPlf, T1.AlbRecCod, T1.BarPieCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FQ3", "UPDATE TXPALBREC SET AlbrNF=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

