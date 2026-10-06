package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprecalb extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprecalb pgm = new aprecalb (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprecalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprecalb.class ), "" );
   }

   public aprecalb( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Realizando reconstrucción ordenación líneas albaran....", "") );
      /* Using cursor P00HX2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P00HX2_A30AlbProCod[0] ;
         A396EmprCod = P00HX2_A396EmprCod[0] ;
         AV8Bultos = (short)(0) ;
         /* Using cursor P00HX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1458BarAlbBul = P00HX3_A1458BarAlbBul[0] ;
            A130BarCodPar = P00HX3_A130BarCodPar[0] ;
            A132BarCodReo = P00HX3_A132BarCodReo[0] ;
            A129BarCod = P00HX3_A129BarCod[0] ;
            AV8Bultos = (short)(AV8Bultos+10) ;
            A1458BarAlbBul = AV8Bultos ;
            /* Using cursor P00HX4 */
            pr_default.execute(2, new Object[] {Short.valueOf(A1458BarAlbBul), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Reconstrucción realizada", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(precalb.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprecalb");
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
      P00HX2_A30AlbProCod = new long[1] ;
      P00HX2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P00HX3_A396EmprCod = new String[] {""} ;
      P00HX3_A30AlbProCod = new long[1] ;
      P00HX3_A1458BarAlbBul = new short[1] ;
      P00HX3_A130BarCodPar = new String[] {""} ;
      P00HX3_A132BarCodReo = new byte[1] ;
      P00HX3_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprecalb__default(),
         new Object[] {
             new Object[] {
            P00HX2_A30AlbProCod, P00HX2_A396EmprCod
            }
            , new Object[] {
            P00HX3_A396EmprCod, P00HX3_A30AlbProCod, P00HX3_A1458BarAlbBul, P00HX3_A130BarCodPar, P00HX3_A132BarCodReo, P00HX3_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8Bultos ;
   private short A1458BarAlbBul ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private IDataStoreProvider pr_default ;
   private long[] P00HX2_A30AlbProCod ;
   private String[] P00HX2_A396EmprCod ;
   private String[] P00HX3_A396EmprCod ;
   private long[] P00HX3_A30AlbProCod ;
   private short[] P00HX3_A1458BarAlbBul ;
   private String[] P00HX3_A130BarCodPar ;
   private byte[] P00HX3_A132BarCodReo ;
   private int[] P00HX3_A129BarCod ;
}

final  class aprecalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HX2", "SELECT AlbProCod, EmprCod FROM TXPCALPRD ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00HX3", "SELECT EmprCod, AlbProCod, BarAlbBul, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00HX4", "UPDATE TXPALBBAR SET BarAlbBul=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
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

