package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpalbdetloadredundancy extends GXProcedure
{
   public txpalbdetloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpalbdetloadredundancy.class ), "" );
   }

   public txpalbdetloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPALBDET ...", "") );
      /* Using cursor TXPALBDETL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2159AlbRecPie = TXPALBDETL2_A2159AlbRecPie[0] ;
         A44AlbRecCod = TXPALBDETL2_A44AlbRecCod[0] ;
         A396EmprCod = TXPALBDETL2_A396EmprCod[0] ;
         A4805AlRPieDefT = TXPALBDETL2_A4805AlRPieDefT[0] ;
         A4806AlRPieDefC = TXPALBDETL2_A4806AlRPieDefC[0] ;
         A4795AlRPieCal = TXPALBDETL2_A4795AlRPieCal[0] ;
         O4806AlRPieDefC = A4806AlRPieDefC ;
         O4805AlRPieDefT = A4805AlRPieDefT ;
         O4806AlRPieDefC = A4806AlRPieDefC ;
         O4805AlRPieDefT = A4805AlRPieDefT ;
         A4805AlRPieDefT = 0 ;
         A4806AlRPieDefC = 0 ;
         /* Using cursor TXPALBDETL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4395AlRDefCod = TXPALBDETL3_A4395AlRDefCod[0] ;
            A4972AlRDefCru = TXPALBDETL3_A4972AlRDefCru[0] ;
            A4971AlRDefAca = TXPALBDETL3_A4971AlRDefAca[0] ;
            A4412AlRFasCod = TXPALBDETL3_A4412AlRFasCod[0] ;
            A4397AlRDefPnt = TXPALBDETL3_A4397AlRDefPnt[0] ;
            n4397AlRDefPnt = TXPALBDETL3_n4397AlRDefPnt[0] ;
            A4403AlRDefCnt = TXPALBDETL3_A4403AlRDefCnt[0] ;
            n4403AlRDefCnt = TXPALBDETL3_n4403AlRDefCnt[0] ;
            A4397AlRDefPnt = TXPALBDETL3_A4397AlRDefPnt[0] ;
            n4397AlRDefPnt = TXPALBDETL3_n4397AlRDefPnt[0] ;
            A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca) ;
            A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru) ;
            O4806AlRPieDefC = A4806AlRPieDefC ;
            O4805AlRPieDefT = A4805AlRPieDefT ;
            if ( (GXutil.strcmp("", A4412AlRFasCod)==0) )
            {
               A4972AlRDefCru = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
            }
            else
            {
               A4972AlRDefCru = 0 ;
            }
            if ( ! (GXutil.strcmp("", A4412AlRFasCod)==0) )
            {
               A4971AlRDefAca = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
            }
            else
            {
               A4971AlRDefAca = 0 ;
            }
            /* Using cursor TXPALBDETL4 */
            pr_default.execute(2, new Object[] {Integer.valueOf(A4972AlRDefCru), Integer.valueOf(A4971AlRDefAca), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPie");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GXt_char1 = A4795AlRPieCal ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char5[0] = GXt_char1 ;
         new app.ppiecalact(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
         txpalbdetloadredundancy.this.A396EmprCod = GXv_char2[0] ;
         txpalbdetloadredundancy.this.A44AlbRecCod = GXv_int3[0] ;
         txpalbdetloadredundancy.this.A2159AlbRecPie = GXv_char4[0] ;
         txpalbdetloadredundancy.this.GXt_char1 = GXv_char5[0] ;
         A4795AlRPieCal = GXt_char1 ;
         /* Using cursor TXPALBDETL5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A4805AlRPieDefT), Integer.valueOf(A4806AlRPieDefC), A4795AlRPieCal, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpalbdetloadredundancy");
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
      TXPALBDETL2_A2159AlbRecPie = new String[] {""} ;
      TXPALBDETL2_A44AlbRecCod = new int[1] ;
      TXPALBDETL2_A396EmprCod = new String[] {""} ;
      TXPALBDETL2_A4805AlRPieDefT = new int[1] ;
      TXPALBDETL2_A4806AlRPieDefC = new int[1] ;
      TXPALBDETL2_A4795AlRPieCal = new String[] {""} ;
      A2159AlbRecPie = "" ;
      A396EmprCod = "" ;
      A4795AlRPieCal = "" ;
      TXPALBDETL3_A4395AlRDefCod = new short[1] ;
      TXPALBDETL3_A396EmprCod = new String[] {""} ;
      TXPALBDETL3_A44AlbRecCod = new int[1] ;
      TXPALBDETL3_A2159AlbRecPie = new String[] {""} ;
      TXPALBDETL3_A4972AlRDefCru = new int[1] ;
      TXPALBDETL3_A4971AlRDefAca = new int[1] ;
      TXPALBDETL3_A4412AlRFasCod = new String[] {""} ;
      TXPALBDETL3_A4397AlRDefPnt = new short[1] ;
      TXPALBDETL3_n4397AlRDefPnt = new boolean[] {false} ;
      TXPALBDETL3_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBDETL3_n4403AlRDefCnt = new boolean[] {false} ;
      A4412AlRFasCod = "" ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpalbdetloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPALBDETL2_A2159AlbRecPie, TXPALBDETL2_A44AlbRecCod, TXPALBDETL2_A396EmprCod, TXPALBDETL2_A4805AlRPieDefT, TXPALBDETL2_A4806AlRPieDefC, TXPALBDETL2_A4795AlRPieCal
            }
            , new Object[] {
            TXPALBDETL3_A4395AlRDefCod, TXPALBDETL3_A396EmprCod, TXPALBDETL3_A44AlbRecCod, TXPALBDETL3_A2159AlbRecPie, TXPALBDETL3_A4972AlRDefCru, TXPALBDETL3_A4971AlRDefAca, TXPALBDETL3_A4412AlRFasCod, TXPALBDETL3_A4397AlRDefPnt, TXPALBDETL3_n4397AlRDefPnt, TXPALBDETL3_A4403AlRDefCnt,
            TXPALBDETL3_n4403AlRDefCnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4395AlRDefCod ;
   private short A4397AlRDefPnt ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A4805AlRPieDefT ;
   private int A4806AlRPieDefC ;
   private int O4806AlRPieDefC ;
   private int O4805AlRPieDefT ;
   private int A4972AlRDefCru ;
   private int A4971AlRDefAca ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A396EmprCod ;
   private String A4795AlRPieCal ;
   private String A4412AlRFasCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean n4397AlRDefPnt ;
   private boolean n4403AlRDefCnt ;
   private IDataStoreProvider pr_default ;
   private String[] TXPALBDETL2_A2159AlbRecPie ;
   private int[] TXPALBDETL2_A44AlbRecCod ;
   private String[] TXPALBDETL2_A396EmprCod ;
   private int[] TXPALBDETL2_A4805AlRPieDefT ;
   private int[] TXPALBDETL2_A4806AlRPieDefC ;
   private String[] TXPALBDETL2_A4795AlRPieCal ;
   private short[] TXPALBDETL3_A4395AlRDefCod ;
   private String[] TXPALBDETL3_A396EmprCod ;
   private int[] TXPALBDETL3_A44AlbRecCod ;
   private String[] TXPALBDETL3_A2159AlbRecPie ;
   private int[] TXPALBDETL3_A4972AlRDefCru ;
   private int[] TXPALBDETL3_A4971AlRDefAca ;
   private String[] TXPALBDETL3_A4412AlRFasCod ;
   private short[] TXPALBDETL3_A4397AlRDefPnt ;
   private boolean[] TXPALBDETL3_n4397AlRDefPnt ;
   private java.math.BigDecimal[] TXPALBDETL3_A4403AlRDefCnt ;
   private boolean[] TXPALBDETL3_n4403AlRDefCnt ;
}

final  class txpalbdetloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPALBDETL2", "SELECT AlbRecPie, AlbRecCod, EmprCod, AlRPieDefT, AlRPieDefC, AlRPieCal FROM TXPALBDET ORDER BY EmprCod, AlbRecCod, AlbRecPie  FOR UPDATE OF AlRPieDefT, AlRPieDefC, AlRPieCal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPALBDETL3", "SELECT T1.AlRDefCod AS AlRDefCod, T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlRDefCru, T1.AlRDefAca, T1.AlRFasCod, T2.TipDefPnt AS AlRDefPnt, T1.AlRDefCnt FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie  FOR UPDATE OF T1.AlRDefCru, T1.AlRDefAca NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPALBDETL4", "UPDATE TXPAlRPie SET AlRDefCru=?, AlRDefAca=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAlRPie")
         ,new UpdateCursor("TXPALBDETL5", "UPDATE TXPALBDET SET AlRPieDefT=?, AlRPieDefC=?, AlRPieCal=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

