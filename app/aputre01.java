package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputre01 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputre01 pgm = new aputre01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputre01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputre01.class ), "" );
   }

   public aputre01( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "INICIO RECALCULO ESTADO EMPESAS", ""));
      /* Using cursor P01263 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P01263_A44AlbRecCod[0] ;
         A396EmprCod = P01263_A396EmprCod[0] ;
         A56AlbRUni = P01263_A56AlbRUni[0] ;
         A47AlbREst = P01263_A47AlbREst[0] ;
         A54AlbRPieUti = P01263_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P01263_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P01263_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P01263_A58AlbRUniEnt[0] ;
         A2151AlbDetMtrU = P01263_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P01263_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P01263_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P01263_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P01263_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P01263_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P01263_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P01263_A2146AlbDetKgm[0] ;
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         AV41AlbDet = (byte)(0) ;
         /* Using cursor P01264 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2159AlbRecPie = P01264_A2159AlbRecPie[0] ;
            AV41AlbDet = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV41AlbDet == 1 )
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A2147AlbDetKgmD.doubleValue() == 0 )
               {
                  A47AlbREst = (byte)(1) ;
               }
               else
               {
                  A47AlbREst = (byte)(0) ;
               }
            }
            else
            {
               if ( A2150AlbDetMtrD.doubleValue() == 0 )
               {
                  A47AlbREst = (byte)(1) ;
               }
               else
               {
                  A47AlbREst = (byte)(0) ;
               }
            }
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) == 0 ) && ( A52AlbRPieEnt == A54AlbRPieUti ) )
            {
               A47AlbREst = (byte)(1) ;
            }
            else
            {
               A47AlbREst = (byte)(0) ;
            }
         }
         System.out.println( httpContext.getMessage( "Realizando Proceso", "") );
         /* Using cursor P01265 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin de Proceso", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putre01.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputre01");
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
      P01263_A44AlbRecCod = new int[1] ;
      P01263_A396EmprCod = new String[] {""} ;
      P01263_A56AlbRUni = new String[] {""} ;
      P01263_A47AlbREst = new byte[1] ;
      P01263_A54AlbRPieUti = new int[1] ;
      P01263_A52AlbRPieEnt = new int[1] ;
      P01263_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01263_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01263_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01263_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01263_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01263_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      P01264_A396EmprCod = new String[] {""} ;
      P01264_A44AlbRecCod = new int[1] ;
      P01264_A2159AlbRecPie = new String[] {""} ;
      A2159AlbRecPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputre01__default(),
         new Object[] {
             new Object[] {
            P01263_A44AlbRecCod, P01263_A396EmprCod, P01263_A56AlbRUni, P01263_A47AlbREst, P01263_A54AlbRPieUti, P01263_A52AlbRPieEnt, P01263_A60AlbRUniUti, P01263_A58AlbRUniEnt, P01263_A2151AlbDetMtrU, P01263_A2149AlbDetMtr,
            P01263_A2148AlbDetKgmU, P01263_A2146AlbDetKgm
            }
            , new Object[] {
            P01264_A396EmprCod, P01264_A44AlbRecCod, P01264_A2159AlbRecPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV41AlbDet ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A56AlbRUni ;
   private String A2159AlbRecPie ;
   private IDataStoreProvider pr_default ;
   private int[] P01263_A44AlbRecCod ;
   private String[] P01263_A396EmprCod ;
   private String[] P01263_A56AlbRUni ;
   private byte[] P01263_A47AlbREst ;
   private int[] P01263_A54AlbRPieUti ;
   private int[] P01263_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P01263_A60AlbRUniUti ;
   private java.math.BigDecimal[] P01263_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P01263_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P01263_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P01263_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P01263_A2146AlbDetKgm ;
   private String[] P01264_A396EmprCod ;
   private int[] P01264_A44AlbRecCod ;
   private String[] P01264_A2159AlbRecPie ;
}

final  class aputre01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01263", "SELECT T1.AlbRecCod, T1.EmprCod, T1.AlbRUni, T1.AlbREst, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01264", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01265", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

