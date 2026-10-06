package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpalrpieloadredundancy extends GXProcedure
{
   public txpalrpieloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpalrpieloadredundancy.class ), "" );
   }

   public txpalrpieloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPAlRPie ...", "") );
      /* Using cursor TXPALRPIEL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = TXPALRPIEL2_A396EmprCod[0] ;
         A4395AlRDefCod = TXPALRPIEL2_A4395AlRDefCod[0] ;
         A4397AlRDefPnt = TXPALRPIEL2_A4397AlRDefPnt[0] ;
         n4397AlRDefPnt = TXPALRPIEL2_n4397AlRDefPnt[0] ;
         A4403AlRDefCnt = TXPALRPIEL2_A4403AlRDefCnt[0] ;
         n4403AlRDefCnt = TXPALRPIEL2_n4403AlRDefCnt[0] ;
         A4404AlRDef = TXPALRPIEL2_A4404AlRDef[0] ;
         A4412AlRFasCod = TXPALRPIEL2_A4412AlRFasCod[0] ;
         A4971AlRDefAca = TXPALRPIEL2_A4971AlRDefAca[0] ;
         A4972AlRDefCru = TXPALRPIEL2_A4972AlRDefCru[0] ;
         A44AlbRecCod = TXPALRPIEL2_A44AlbRecCod[0] ;
         A2159AlbRecPie = TXPALRPIEL2_A2159AlbRecPie[0] ;
         A4397AlRDefPnt = TXPALRPIEL2_A4397AlRDefPnt[0] ;
         n4397AlRDefPnt = TXPALRPIEL2_n4397AlRDefPnt[0] ;
         A4404AlRDef = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
         if ( ! (GXutil.strcmp("", A4412AlRFasCod)==0) )
         {
            A4971AlRDefAca = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
         }
         else
         {
            A4971AlRDefAca = 0 ;
         }
         if ( (GXutil.strcmp("", A4412AlRFasCod)==0) )
         {
            A4972AlRDefCru = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
         }
         else
         {
            A4972AlRDefCru = 0 ;
         }
         /* Using cursor TXPALRPIEL3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A4404AlRDef), Integer.valueOf(A4971AlRDefAca), Integer.valueOf(A4972AlRDefCru), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPie");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpalrpieloadredundancy");
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
      TXPALRPIEL2_A396EmprCod = new String[] {""} ;
      TXPALRPIEL2_A4395AlRDefCod = new short[1] ;
      TXPALRPIEL2_A4397AlRDefPnt = new short[1] ;
      TXPALRPIEL2_n4397AlRDefPnt = new boolean[] {false} ;
      TXPALRPIEL2_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALRPIEL2_n4403AlRDefCnt = new boolean[] {false} ;
      TXPALRPIEL2_A4404AlRDef = new int[1] ;
      TXPALRPIEL2_A4412AlRFasCod = new String[] {""} ;
      TXPALRPIEL2_A4971AlRDefAca = new int[1] ;
      TXPALRPIEL2_A4972AlRDefCru = new int[1] ;
      TXPALRPIEL2_A44AlbRecCod = new int[1] ;
      TXPALRPIEL2_A2159AlbRecPie = new String[] {""} ;
      A396EmprCod = "" ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      A4412AlRFasCod = "" ;
      A2159AlbRecPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpalrpieloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPALRPIEL2_A396EmprCod, TXPALRPIEL2_A4395AlRDefCod, TXPALRPIEL2_A4397AlRDefPnt, TXPALRPIEL2_n4397AlRDefPnt, TXPALRPIEL2_A4403AlRDefCnt, TXPALRPIEL2_n4403AlRDefCnt, TXPALRPIEL2_A4404AlRDef, TXPALRPIEL2_A4412AlRFasCod, TXPALRPIEL2_A4971AlRDefAca, TXPALRPIEL2_A4972AlRDefCru,
            TXPALRPIEL2_A44AlbRecCod, TXPALRPIEL2_A2159AlbRecPie
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
   private int A4404AlRDef ;
   private int A4971AlRDefAca ;
   private int A4972AlRDefCru ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4412AlRFasCod ;
   private String A2159AlbRecPie ;
   private boolean n4397AlRDefPnt ;
   private boolean n4403AlRDefCnt ;
   private IDataStoreProvider pr_default ;
   private String[] TXPALRPIEL2_A396EmprCod ;
   private short[] TXPALRPIEL2_A4395AlRDefCod ;
   private short[] TXPALRPIEL2_A4397AlRDefPnt ;
   private boolean[] TXPALRPIEL2_n4397AlRDefPnt ;
   private java.math.BigDecimal[] TXPALRPIEL2_A4403AlRDefCnt ;
   private boolean[] TXPALRPIEL2_n4403AlRDefCnt ;
   private int[] TXPALRPIEL2_A4404AlRDef ;
   private String[] TXPALRPIEL2_A4412AlRFasCod ;
   private int[] TXPALRPIEL2_A4971AlRDefAca ;
   private int[] TXPALRPIEL2_A4972AlRDefCru ;
   private int[] TXPALRPIEL2_A44AlbRecCod ;
   private String[] TXPALRPIEL2_A2159AlbRecPie ;
}

final  class txpalrpieloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPALRPIEL2", "SELECT T1.EmprCod, T1.AlRDefCod AS AlRDefCod, T2.TipDefPnt AS AlRDefPnt, T1.AlRDefCnt, T1.AlRDef, T1.AlRFasCod, T1.AlRDefAca, T1.AlRDefCru, T1.AlbRecCod, T1.AlbRecPie FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlRDefCod, T1.AlRFasCod  FOR UPDATE OF T1.AlRDef, T1.AlRDefAca, T1.AlRDefCru NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPALRPIEL3", "UPDATE TXPAlRPie SET AlRDef=?, AlRDefAca=?, AlRDefCru=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAlRPie")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 9);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               return;
      }
   }

}

