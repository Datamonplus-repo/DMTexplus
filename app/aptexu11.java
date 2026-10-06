package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu11 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu11 pgm = new aptexu11 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu11.class ), "" );
   }

   public aptexu11( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando tabla BARCAD...HDRMAT...", "") );
      AV25N_r = 0 ;
      /* Using cursor P035H3 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P035H3_A213BarSit[0] ;
         A396EmprCod = P035H3_A396EmprCod[0] ;
         A129BarCod = P035H3_A129BarCod[0] ;
         A132BarCodReo = P035H3_A132BarCodReo[0] ;
         A130BarCodPar = P035H3_A130BarCodPar[0] ;
         A166BarKgm = P035H3_A166BarKgm[0] ;
         n166BarKgm = P035H3_n166BarKgm[0] ;
         A166BarKgm = P035H3_A166BarKgm[0] ;
         n166BarKgm = P035H3_n166BarKgm[0] ;
         AV21Emprcod = A396EmprCod ;
         AV18Barcod = A129BarCod ;
         AV20barcodreo = A132BarCodReo ;
         AV19Barcodpar = A130BarCodPar ;
         AV23BARKGS = A166BarKgm ;
         /* Execute user subroutine: 'HDRMAT' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV22HdrMat == 1 )
         {
            AV25N_r = (int)(AV25N_r+1) ;
            Gx_msg = httpContext.getMessage( "Registros...", "") + GXutil.str( AV25N_r, 6, 0) ;
            System.out.println( Gx_msg );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin tabla BARCAD.....HDRMAT...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRMAT' Routine */
      returnInSub = false ;
      AV22HdrMat = (byte)(0) ;
      /* Using cursor P035H4 */
      pr_default.execute(1, new Object[] {AV21Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV20barcodreo), AV19Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6967Mat_Hdp = P035H4_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P035H4_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P035H4_A6965Mat_Hd[0] ;
         A396EmprCod = P035H4_A396EmprCod[0] ;
         A6969Mat_HdKgs = P035H4_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = P035H4_n6969Mat_HdKgs[0] ;
         A6968Mat_HdUl = P035H4_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = P035H4_n6968Mat_HdUl[0] ;
         AV22HdrMat = (byte)(1) ;
         AV24MAT_HDLIN = (short)(0) ;
         /* Using cursor P035H5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A6972Mat_HdLin = P035H5_A6972Mat_HdLin[0] ;
            AV24MAT_HDLIN = A6972Mat_HdLin ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A6969Mat_HdKgs = AV23BARKGS ;
         n6969Mat_HdKgs = false ;
         A6968Mat_HdUl = AV24MAT_HDLIN ;
         n6968Mat_HdUl = false ;
         /* Using cursor P035H6 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu11.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu11");
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
      P035H3_A213BarSit = new byte[1] ;
      P035H3_A396EmprCod = new String[] {""} ;
      P035H3_A129BarCod = new int[1] ;
      P035H3_A132BarCodReo = new byte[1] ;
      P035H3_A130BarCodPar = new String[] {""} ;
      P035H3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035H3_n166BarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV21Emprcod = "" ;
      AV19Barcodpar = "" ;
      AV23BARKGS = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P035H4_A6967Mat_Hdp = new String[] {""} ;
      P035H4_A6966Mat_Hdr = new byte[1] ;
      P035H4_A6965Mat_Hd = new int[1] ;
      P035H4_A396EmprCod = new String[] {""} ;
      P035H4_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035H4_n6969Mat_HdKgs = new boolean[] {false} ;
      P035H4_A6968Mat_HdUl = new short[1] ;
      P035H4_n6968Mat_HdUl = new boolean[] {false} ;
      A6967Mat_Hdp = "" ;
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      P035H5_A396EmprCod = new String[] {""} ;
      P035H5_A6965Mat_Hd = new int[1] ;
      P035H5_A6966Mat_Hdr = new byte[1] ;
      P035H5_A6967Mat_Hdp = new String[] {""} ;
      P035H5_A6972Mat_HdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu11__default(),
         new Object[] {
             new Object[] {
            P035H3_A213BarSit, P035H3_A396EmprCod, P035H3_A129BarCod, P035H3_A132BarCodReo, P035H3_A130BarCodPar, P035H3_A166BarKgm, P035H3_n166BarKgm
            }
            , new Object[] {
            P035H4_A6967Mat_Hdp, P035H4_A6966Mat_Hdr, P035H4_A6965Mat_Hd, P035H4_A396EmprCod, P035H4_A6969Mat_HdKgs, P035H4_n6969Mat_HdKgs, P035H4_A6968Mat_HdUl, P035H4_n6968Mat_HdUl
            }
            , new Object[] {
            P035H5_A396EmprCod, P035H5_A6965Mat_Hd, P035H5_A6966Mat_Hdr, P035H5_A6967Mat_Hdp, P035H5_A6972Mat_HdLin
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
   private byte AV20barcodreo ;
   private byte AV22HdrMat ;
   private byte A6966Mat_Hdr ;
   private short A6968Mat_HdUl ;
   private short AV24MAT_HDLIN ;
   private short A6972Mat_HdLin ;
   private short Gx_err ;
   private int AV25N_r ;
   private int A129BarCod ;
   private int AV18Barcod ;
   private int A6965Mat_Hd ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV23BARKGS ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV21Emprcod ;
   private String AV19Barcodpar ;
   private String Gx_msg ;
   private String A6967Mat_Hdp ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6968Mat_HdUl ;
   private IDataStoreProvider pr_default ;
   private byte[] P035H3_A213BarSit ;
   private String[] P035H3_A396EmprCod ;
   private int[] P035H3_A129BarCod ;
   private byte[] P035H3_A132BarCodReo ;
   private String[] P035H3_A130BarCodPar ;
   private java.math.BigDecimal[] P035H3_A166BarKgm ;
   private boolean[] P035H3_n166BarKgm ;
   private String[] P035H4_A6967Mat_Hdp ;
   private byte[] P035H4_A6966Mat_Hdr ;
   private int[] P035H4_A6965Mat_Hd ;
   private String[] P035H4_A396EmprCod ;
   private java.math.BigDecimal[] P035H4_A6969Mat_HdKgs ;
   private boolean[] P035H4_n6969Mat_HdKgs ;
   private short[] P035H4_A6968Mat_HdUl ;
   private boolean[] P035H4_n6968Mat_HdUl ;
   private String[] P035H5_A396EmprCod ;
   private int[] P035H5_A6965Mat_Hd ;
   private byte[] P035H5_A6966Mat_Hdr ;
   private String[] P035H5_A6967Mat_Hdp ;
   private short[] P035H5_A6972Mat_HdLin ;
}

final  class aptexu11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035H3", "SELECT T1.BarSit, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = '001' and T1.BarSit > 0 ORDER BY T1.EmprCod, T1.BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P035H4", "SELECT Mat_Hdp, Mat_Hdr, Mat_Hd, EmprCod, Mat_HdKgs, Mat_HdUl FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P035H5", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P035H6", "UPDATE TXPHDRMAT SET Mat_HdKgs=?, Mat_HdUl=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMAT")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               return;
      }
   }

}

