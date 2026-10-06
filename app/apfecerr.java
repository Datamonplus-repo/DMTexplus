package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfecerr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfecerr pgm = new apfecerr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfecerr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfecerr.class ), "" );
   }

   public apfecerr( int remoteHandle ,
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
      /* Using cursor P04102 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P04102_A213BarSit[0] ;
         A396EmprCod = P04102_A396EmprCod[0] ;
         A2497BarFecIni = P04102_A2497BarFecIni[0] ;
         A129BarCod = P04102_A129BarCod[0] ;
         A132BarCodReo = P04102_A132BarCodReo[0] ;
         A130BarCodPar = P04102_A130BarCodPar[0] ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A2497BarFecIni)) )
         {
         }
         else
         {
            A2497BarFecIni = GXutil.nullDate() ;
         }
         /* Using cursor P04103 */
         pr_default.execute(1, new Object[] {A2497BarFecIni, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfecerr.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apfecerr");
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
      P04102_A213BarSit = new byte[1] ;
      P04102_A396EmprCod = new String[] {""} ;
      P04102_A2497BarFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      P04102_A129BarCod = new int[1] ;
      P04102_A132BarCodReo = new byte[1] ;
      P04102_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A2497BarFecIni = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfecerr__default(),
         new Object[] {
             new Object[] {
            P04102_A213BarSit, P04102_A396EmprCod, P04102_A2497BarFecIni, P04102_A129BarCod, P04102_A132BarCodReo, P04102_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date A2497BarFecIni ;
   private IDataStoreProvider pr_default ;
   private byte[] P04102_A213BarSit ;
   private String[] P04102_A396EmprCod ;
   private java.util.Date[] P04102_A2497BarFecIni ;
   private int[] P04102_A129BarCod ;
   private byte[] P04102_A132BarCodReo ;
   private String[] P04102_A130BarCodPar ;
}

final  class apfecerr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04102", "SELECT BarSit, EmprCod, BarFecIni, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarSit <= 6) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04103", "UPDATE TXPBARCAD SET BarFecIni=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

