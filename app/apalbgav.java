package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apalbgav extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apalbgav pgm = new apalbgav (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apalbgav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apalbgav.class ), "" );
   }

   public apalbgav( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Realizando Regularización...", "") );
      /* Using cursor P00O62 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1503BarPart = P00O62_A1503BarPart[0] ;
         A1458BarAlbBul = P00O62_A1458BarAlbBul[0] ;
         A130BarCodPar = P00O62_A130BarCodPar[0] ;
         A132BarCodReo = P00O62_A132BarCodReo[0] ;
         A129BarCod = P00O62_A129BarCod[0] ;
         A30AlbProCod = P00O62_A30AlbProCod[0] ;
         A396EmprCod = P00O62_A396EmprCod[0] ;
         A1503BarPart = P00O62_A1503BarPart[0] ;
         A1458BarAlbBul = A1503BarPart ;
         /* Using cursor P00O63 */
         pr_default.execute(1, new Object[] {Short.valueOf(A1458BarAlbBul), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Regularización realizada", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(palbgav.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apalbgav");
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
      P00O62_A1503BarPart = new short[1] ;
      P00O62_A1458BarAlbBul = new short[1] ;
      P00O62_A130BarCodPar = new String[] {""} ;
      P00O62_A132BarCodReo = new byte[1] ;
      P00O62_A129BarCod = new int[1] ;
      P00O62_A30AlbProCod = new long[1] ;
      P00O62_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apalbgav__default(),
         new Object[] {
             new Object[] {
            P00O62_A1503BarPart, P00O62_A1458BarAlbBul, P00O62_A130BarCodPar, P00O62_A132BarCodReo, P00O62_A129BarCod, P00O62_A30AlbProCod, P00O62_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1503BarPart ;
   private short A1458BarAlbBul ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private short[] P00O62_A1503BarPart ;
   private short[] P00O62_A1458BarAlbBul ;
   private String[] P00O62_A130BarCodPar ;
   private byte[] P00O62_A132BarCodReo ;
   private int[] P00O62_A129BarCod ;
   private long[] P00O62_A30AlbProCod ;
   private String[] P00O62_A396EmprCod ;
}

final  class apalbgav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00O62", "SELECT T2.BarPart, T1.BarAlbBul, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00O63", "UPDATE TXPALBBAR SET BarAlbBul=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

