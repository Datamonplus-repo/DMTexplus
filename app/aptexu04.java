package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu04 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu04 pgm = new aptexu04 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu04.class ), "" );
   }

   public aptexu04( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando tabla BARCAD...BarAsi...", "") );
      /* Using cursor P02V32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02V32_A213BarSit[0] ;
         A396EmprCod = P02V32_A396EmprCod[0] ;
         A129BarCod = P02V32_A129BarCod[0] ;
         A132BarCodReo = P02V32_A132BarCodReo[0] ;
         A130BarCodPar = P02V32_A130BarCodPar[0] ;
         A6434BarAsi = P02V32_A6434BarAsi[0] ;
         A365DisDes = P02V32_A365DisDes[0] ;
         AV21Emprcod = A396EmprCod ;
         AV18Barcod = A129BarCod ;
         AV20barcodreo = A132BarCodReo ;
         AV19Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'HDRMAT' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV22HdrMat == 1 )
         {
            A6434BarAsi = (byte)(1) ;
            A365DisDes = httpContext.getMessage( "N", "") ;
            Gx_msg = httpContext.getMessage( "Barcod=", "") + GXutil.str( AV18Barcod, 8, 0) + httpContext.getMessage( "Barasi=", "") + GXutil.str( A6434BarAsi, 1, 0) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P02V33 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A6434BarAsi), A365DisDes, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin tabla BARCAD...BarAsi...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRMAT' Routine */
      returnInSub = false ;
      AV22HdrMat = (byte)(0) ;
      /* Using cursor P02V34 */
      pr_default.execute(2, new Object[] {AV21Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV20barcodreo), AV19Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6967Mat_Hdp = P02V34_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P02V34_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P02V34_A6965Mat_Hd[0] ;
         A396EmprCod = P02V34_A396EmprCod[0] ;
         AV22HdrMat = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu04.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu04");
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
      P02V32_A213BarSit = new byte[1] ;
      P02V32_A396EmprCod = new String[] {""} ;
      P02V32_A129BarCod = new int[1] ;
      P02V32_A132BarCodReo = new byte[1] ;
      P02V32_A130BarCodPar = new String[] {""} ;
      P02V32_A6434BarAsi = new byte[1] ;
      P02V32_A365DisDes = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      AV21Emprcod = "" ;
      AV19Barcodpar = "" ;
      Gx_msg = "" ;
      P02V34_A6967Mat_Hdp = new String[] {""} ;
      P02V34_A6966Mat_Hdr = new byte[1] ;
      P02V34_A6965Mat_Hd = new int[1] ;
      P02V34_A396EmprCod = new String[] {""} ;
      A6967Mat_Hdp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu04__default(),
         new Object[] {
             new Object[] {
            P02V32_A213BarSit, P02V32_A396EmprCod, P02V32_A129BarCod, P02V32_A132BarCodReo, P02V32_A130BarCodPar, P02V32_A6434BarAsi, P02V32_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P02V34_A6967Mat_Hdp, P02V34_A6966Mat_Hdr, P02V34_A6965Mat_Hd, P02V34_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A6434BarAsi ;
   private byte AV20barcodreo ;
   private byte AV22HdrMat ;
   private byte A6966Mat_Hdr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18Barcod ;
   private int A6965Mat_Hd ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String AV21Emprcod ;
   private String AV19Barcodpar ;
   private String Gx_msg ;
   private String A6967Mat_Hdp ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private byte[] P02V32_A213BarSit ;
   private String[] P02V32_A396EmprCod ;
   private int[] P02V32_A129BarCod ;
   private byte[] P02V32_A132BarCodReo ;
   private String[] P02V32_A130BarCodPar ;
   private byte[] P02V32_A6434BarAsi ;
   private String[] P02V32_A365DisDes ;
   private String[] P02V34_A6967Mat_Hdp ;
   private byte[] P02V34_A6966Mat_Hdr ;
   private int[] P02V34_A6965Mat_Hd ;
   private String[] P02V34_A396EmprCod ;
}

final  class aptexu04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02V32", "SELECT BarSit, EmprCod, BarCod, BarCodReo, BarCodPar, BarAsi, DisDes FROM TXPBARCAD WHERE EmprCod = '001' and BarSit > 1 ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V33", "UPDATE TXPBARCAD SET BarAsi=?, DisDes=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02V34", "SELECT Mat_Hdp, Mat_Hdr, Mat_Hd, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

