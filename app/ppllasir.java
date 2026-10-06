package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppllasir extends GXProcedure
{
   public ppllasir( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppllasir.class ), "" );
   }

   public ppllasir( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           int[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 )
   {
      ppllasir.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      ppllasir.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ppllasir.this.AV8PLRArtCod = aP1[0];
      this.aP1 = aP1;
      ppllasir.this.AV9PLRColNom = aP2[0];
      this.aP2 = aP2;
      ppllasir.this.AV10PLRColNum = aP3[0];
      this.aP3 = aP3;
      ppllasir.this.AV11PLRDibCli = aP4[0];
      this.aP4 = aP4;
      ppllasir.this.AV12PLRDibInt = aP5[0];
      this.aP5 = aP5;
      ppllasir.this.AV13PLRComCod = aP6[0];
      this.aP6 = aP6;
      ppllasir.this.AV14Pgm = aP7[0];
      this.aP7 = aP7;
      ppllasir.this.AV16Esperar = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Solicitando Reasignación.", "") );
      AV24GXLvl4 = (byte)(0) ;
      /* Using cursor P031R2 */
      pr_default.execute(0, new Object[] {AV8PLRArtCod, AV9PLRColNom, Integer.valueOf(AV10PLRColNum), AV13PLRComCod, AV11PLRDibCli, Integer.valueOf(AV12PLRDibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7980PLREje = P031R2_A7980PLREje[0] ;
         n7980PLREje = P031R2_n7980PLREje[0] ;
         A7975PLRDibInt = P031R2_A7975PLRDibInt[0] ;
         n7975PLRDibInt = P031R2_n7975PLRDibInt[0] ;
         A7974PLRDibCli = P031R2_A7974PLRDibCli[0] ;
         n7974PLRDibCli = P031R2_n7974PLRDibCli[0] ;
         A7976PLRComCod = P031R2_A7976PLRComCod[0] ;
         n7976PLRComCod = P031R2_n7976PLRComCod[0] ;
         A7973PLRColNum = P031R2_A7973PLRColNum[0] ;
         n7973PLRColNum = P031R2_n7973PLRColNum[0] ;
         A7972PLRColNom = P031R2_A7972PLRColNom[0] ;
         n7972PLRColNom = P031R2_n7972PLRColNom[0] ;
         A7971PLRArtCod = P031R2_A7971PLRArtCod[0] ;
         n7971PLRArtCod = P031R2_n7971PLRArtCod[0] ;
         A7969PLRNro = P031R2_A7969PLRNro[0] ;
         A8102PLRPri = P031R2_A8102PLRPri[0] ;
         n8102PLRPri = P031R2_n8102PLRPri[0] ;
         A396EmprCod = P031R2_A396EmprCod[0] ;
         AV24GXLvl4 = (byte)(1) ;
         AV17PLRNro = A7969PLRNro ;
         if ( A8102PLRPri < 9 )
         {
            A8102PLRPri = (byte)(A8102PLRPri+AV16Esperar) ;
            n8102PLRPri = false ;
         }
         /* Using cursor P031R3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8102PLRPri), Byte.valueOf(A8102PLRPri), A396EmprCod, Long.valueOf(A7969PLRNro)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLLRea");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV24GXLvl4 == 0 )
      {
         GXt_int1 = (int)(AV17PLRNro) ;
         GXv_int2[0] = GXt_int1 ;
         new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PLRNRO", ""), GXv_int2) ;
         ppllasir.this.GXt_int1 = GXv_int2[0] ;
         AV17PLRNro = GXt_int1 ;
         /*
            INSERT RECORD ON TABLE TXPPLLRea

         */
         A396EmprCod = AV15EmprCod ;
         A7969PLRNro = AV17PLRNro ;
         A7971PLRArtCod = AV8PLRArtCod ;
         n7971PLRArtCod = false ;
         A7972PLRColNom = AV9PLRColNom ;
         n7972PLRColNom = false ;
         A7973PLRColNum = AV10PLRColNum ;
         n7973PLRColNum = false ;
         A7976PLRComCod = AV13PLRComCod ;
         n7976PLRComCod = false ;
         A7974PLRDibCli = AV11PLRDibCli ;
         n7974PLRDibCli = false ;
         A7975PLRDibInt = AV12PLRDibInt ;
         n7975PLRDibInt = false ;
         A7977PLRFchCre = GXutil.now( ) ;
         n7977PLRFchCre = false ;
         A7970PLRIndLln = 0 ;
         n7970PLRIndLln = false ;
         A7979PLRPrg = AV14Pgm ;
         n7979PLRPrg = false ;
         A7980PLREje = (byte)(0) ;
         n7980PLREje = false ;
         A8102PLRPri = AV16Esperar ;
         n8102PLRPri = false ;
         /* Using cursor P031R4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A7969PLRNro), Boolean.valueOf(n7970PLRIndLln), Integer.valueOf(A7970PLRIndLln), Boolean.valueOf(n7971PLRArtCod), A7971PLRArtCod, Boolean.valueOf(n7972PLRColNom), A7972PLRColNom, Boolean.valueOf(n7973PLRColNum), Integer.valueOf(A7973PLRColNum), Boolean.valueOf(n7974PLRDibCli), A7974PLRDibCli, Boolean.valueOf(n7975PLRDibInt), Integer.valueOf(A7975PLRDibInt), Boolean.valueOf(n7976PLRComCod), A7976PLRComCod, Boolean.valueOf(n7977PLRFchCre), A7977PLRFchCre, Boolean.valueOf(n7979PLRPrg), A7979PLRPrg, Boolean.valueOf(n7980PLREje), Byte.valueOf(A7980PLREje), Boolean.valueOf(n8102PLRPri), Byte.valueOf(A8102PLRPri)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLLRea");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      System.out.println( httpContext.getMessage( "Esperando que el servidor reasigne.", "") );
      Application.commitDataStores(context, remoteHandle, pr_default, "ppllasir");
      AV18Cont = 0 ;
      if ( AV16Esperar >= 1 )
      {
         AV21OK = (byte)(0) ;
      }
      else
      {
         AV21OK = (byte)(1) ;
      }
      while ( AV21OK == 0 )
      {
         /* Using cursor P031R5 */
         pr_default.execute(3, new Object[] {AV15EmprCod, Long.valueOf(AV17PLRNro)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A7969PLRNro = P031R5_A7969PLRNro[0] ;
            A396EmprCod = P031R5_A396EmprCod[0] ;
            A7980PLREje = P031R5_A7980PLREje[0] ;
            n7980PLREje = P031R5_n7980PLREje[0] ;
            AV21OK = A7980PLREje ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV21OK == 0 )
         {
            GXt_decimal3 = AV19Aux ;
            GXv_decimal4[0] = GXt_decimal3 ;
            new app.core.inkey(remoteHandle, context).execute( (short)(1), GXv_decimal4) ;
            ppllasir.this.GXt_decimal3 = GXv_decimal4[0] ;
            AV19Aux = GXt_decimal3 ;
            AV18Cont = (long)(AV18Cont+1) ;
            if ( AV18Cont == 60 )
            {
               GXt_char5 = AV20OkC ;
               GXv_char6[0] = GXt_char5 ;
               new app.sask(remoteHandle, context).execute( httpContext.getMessage( "Lleva esperando más de un minuto, continuamos esperando?", ""), httpContext.getMessage( "Sn", ""), "?", GXv_char6) ;
               ppllasir.this.GXt_char5 = GXv_char6[0] ;
               AV20OkC = GXt_char5 ;
               if ( GXutil.strcmp(AV20OkC, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV18Cont = 0 ;
               }
               else
               {
                  AV21OK = (byte)(1) ;
               }
            }
         }
      }
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppllasir.this.AV15EmprCod;
      this.aP1[0] = ppllasir.this.AV8PLRArtCod;
      this.aP2[0] = ppllasir.this.AV9PLRColNom;
      this.aP3[0] = ppllasir.this.AV10PLRColNum;
      this.aP4[0] = ppllasir.this.AV11PLRDibCli;
      this.aP5[0] = ppllasir.this.AV12PLRDibInt;
      this.aP6[0] = ppllasir.this.AV13PLRComCod;
      this.aP7[0] = ppllasir.this.AV14Pgm;
      this.aP8[0] = ppllasir.this.AV16Esperar;
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
      P031R2_A7980PLREje = new byte[1] ;
      P031R2_n7980PLREje = new boolean[] {false} ;
      P031R2_A7975PLRDibInt = new int[1] ;
      P031R2_n7975PLRDibInt = new boolean[] {false} ;
      P031R2_A7974PLRDibCli = new String[] {""} ;
      P031R2_n7974PLRDibCli = new boolean[] {false} ;
      P031R2_A7976PLRComCod = new String[] {""} ;
      P031R2_n7976PLRComCod = new boolean[] {false} ;
      P031R2_A7973PLRColNum = new int[1] ;
      P031R2_n7973PLRColNum = new boolean[] {false} ;
      P031R2_A7972PLRColNom = new String[] {""} ;
      P031R2_n7972PLRColNom = new boolean[] {false} ;
      P031R2_A7971PLRArtCod = new String[] {""} ;
      P031R2_n7971PLRArtCod = new boolean[] {false} ;
      P031R2_A7969PLRNro = new long[1] ;
      P031R2_A8102PLRPri = new byte[1] ;
      P031R2_n8102PLRPri = new boolean[] {false} ;
      P031R2_A396EmprCod = new String[] {""} ;
      A7974PLRDibCli = "" ;
      A7976PLRComCod = "" ;
      A7972PLRColNom = "" ;
      A7971PLRArtCod = "" ;
      A396EmprCod = "" ;
      GXv_int2 = new int[1] ;
      A7977PLRFchCre = GXutil.resetTime( GXutil.nullDate() );
      A7979PLRPrg = "" ;
      Gx_emsg = "" ;
      P031R5_A7969PLRNro = new long[1] ;
      P031R5_A396EmprCod = new String[] {""} ;
      P031R5_A7980PLREje = new byte[1] ;
      P031R5_n7980PLREje = new boolean[] {false} ;
      AV19Aux = DecimalUtil.ZERO ;
      GXt_decimal3 = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV20OkC = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ppllasir__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ppllasir__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ppllasir__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppllasir__default(),
         new Object[] {
             new Object[] {
            P031R2_A7980PLREje, P031R2_n7980PLREje, P031R2_A7975PLRDibInt, P031R2_n7975PLRDibInt, P031R2_A7974PLRDibCli, P031R2_n7974PLRDibCli, P031R2_A7976PLRComCod, P031R2_n7976PLRComCod, P031R2_A7973PLRColNum, P031R2_n7973PLRColNum,
            P031R2_A7972PLRColNom, P031R2_n7972PLRColNom, P031R2_A7971PLRArtCod, P031R2_n7971PLRArtCod, P031R2_A7969PLRNro, P031R2_A8102PLRPri, P031R2_n8102PLRPri, P031R2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P031R5_A7969PLRNro, P031R5_A396EmprCod, P031R5_A7980PLREje, P031R5_n7980PLREje
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Esperar ;
   private byte AV24GXLvl4 ;
   private byte A7980PLREje ;
   private byte A8102PLRPri ;
   private byte AV21OK ;
   private short Gx_err ;
   private int AV10PLRColNum ;
   private int AV12PLRDibInt ;
   private int A7975PLRDibInt ;
   private int A7973PLRColNum ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int GX_INS1122 ;
   private int A7970PLRIndLln ;
   private long A7969PLRNro ;
   private long AV17PLRNro ;
   private long AV18Cont ;
   private java.math.BigDecimal AV19Aux ;
   private java.math.BigDecimal GXt_decimal3 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String AV15EmprCod ;
   private String AV8PLRArtCod ;
   private String AV9PLRColNom ;
   private String AV11PLRDibCli ;
   private String AV13PLRComCod ;
   private String AV14Pgm ;
   private String scmdbuf ;
   private String A7974PLRDibCli ;
   private String A7976PLRComCod ;
   private String A7972PLRColNom ;
   private String A7971PLRArtCod ;
   private String A396EmprCod ;
   private String A7979PLRPrg ;
   private String Gx_emsg ;
   private String AV20OkC ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date A7977PLRFchCre ;
   private boolean n7980PLREje ;
   private boolean n7975PLRDibInt ;
   private boolean n7974PLRDibCli ;
   private boolean n7976PLRComCod ;
   private boolean n7973PLRColNum ;
   private boolean n7972PLRColNom ;
   private boolean n7971PLRArtCod ;
   private boolean n8102PLRPri ;
   private boolean n7977PLRFchCre ;
   private boolean n7970PLRIndLln ;
   private boolean n7979PLRPrg ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private byte[] P031R2_A7980PLREje ;
   private boolean[] P031R2_n7980PLREje ;
   private int[] P031R2_A7975PLRDibInt ;
   private boolean[] P031R2_n7975PLRDibInt ;
   private String[] P031R2_A7974PLRDibCli ;
   private boolean[] P031R2_n7974PLRDibCli ;
   private String[] P031R2_A7976PLRComCod ;
   private boolean[] P031R2_n7976PLRComCod ;
   private int[] P031R2_A7973PLRColNum ;
   private boolean[] P031R2_n7973PLRColNum ;
   private String[] P031R2_A7972PLRColNom ;
   private boolean[] P031R2_n7972PLRColNom ;
   private String[] P031R2_A7971PLRArtCod ;
   private boolean[] P031R2_n7971PLRArtCod ;
   private long[] P031R2_A7969PLRNro ;
   private byte[] P031R2_A8102PLRPri ;
   private boolean[] P031R2_n8102PLRPri ;
   private String[] P031R2_A396EmprCod ;
   private long[] P031R5_A7969PLRNro ;
   private String[] P031R5_A396EmprCod ;
   private byte[] P031R5_A7980PLREje ;
   private boolean[] P031R5_n7980PLREje ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class ppllasir__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class ppllasir__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class ppllasir__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class ppllasir__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P031R2", "SELECT PLREje, PLRDibInt, PLRDibCli, PLRComCod, PLRColNum, PLRColNom, PLRArtCod, PLRNro, PLRPri, EmprCod FROM TXPPLLRea WHERE (PLREje = 0) AND (PLRArtCod = ?) AND (PLRColNom = ?) AND (PLRColNum = ?) AND (PLRComCod = ?) AND (PLRDibCli = ?) AND (PLRDibInt = ?) ORDER BY PLREje ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P031R3", "UPDATE TXPPLLRea SET PLRPri=?  WHERE EmprCod = ? AND PLRNro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLLRea")
         ,new UpdateCursor("P031R4", "INSERT INTO TXPPLLRea(EmprCod, PLRNro, PLRIndLln, PLRArtCod, PLRColNom, PLRColNum, PLRDibCli, PLRDibInt, PLRComCod, PLRFchCre, PLRPrg, PLREje, PLRPri, PLRFchEje) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLLRea")
         ,new ForEachCursor("P031R5", "SELECT PLRNro, EmprCod, PLREje FROM TXPPLLRea WHERE EmprCod = ? and PLRNro = ? ORDER BY EmprCod, PLRNro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8);
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 12);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[23]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

