package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paud000 extends GXProcedure
{
   public paud000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paud000.class ), "" );
   }

   public paud000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      paud000.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      paud000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paud000.this.AV12Discod = aP1[0];
      this.aP1 = aP1;
      paud000.this.AV13Auc_na = aP2[0];
      this.aP2 = aP2;
      paud000.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Audped1 = (byte)(0) ;
      /* Using cursor P02T02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7198Auc_Discod = P02T02_A7198Auc_Discod[0] ;
         A7182Auc_CodDef = P02T02_A7182Auc_CodDef[0] ;
         AV14Audped1 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = " " ;
      if ( AV14Audped1 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado", "") + GXutil.newLine( ) + httpContext.getMessage( "que no ha sido ingresado NINGUN DEFECTO.", "") + GXutil.newLine( ) + httpContext.getMessage( "No se ha podido AUDITAR ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Ingrese un codigo de DEFECTO.", "") + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02T04 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7198Auc_Discod = P02T04_A7198Auc_Discod[0] ;
         A7204Auc_stat = P02T04_A7204Auc_stat[0] ;
         n7204Auc_stat = P02T04_n7204Auc_stat[0] ;
         A7202Auc_UndMS = P02T04_A7202Auc_UndMS[0] ;
         n7202Auc_UndMS = P02T04_n7202Auc_UndMS[0] ;
         A7202Auc_UndMS = P02T04_A7202Auc_UndMS[0] ;
         n7202Auc_UndMS = P02T04_n7202Auc_UndMS[0] ;
         AV15Auc_UndMS = A7202Auc_UndMS ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      Gx_msg = " " ;
      /* Using cursor P02T05 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P02T05_A361DisCod[0] ;
         A342DisArtPes = P02T05_A342DisArtPes[0] ;
         A1430DisLoc = P02T05_A1430DisLoc[0] ;
         A370DisFecCli = P02T05_A370DisFecCli[0] ;
         A371DisFecEnt = P02T05_A371DisFecEnt[0] ;
         if ( AV15Auc_UndMS <= AV13Auc_na )
         {
            A342DisArtPes = (short)(1) ;
            A1430DisLoc = httpContext.getMessage( "OK", "") ;
            A370DisFecCli = Gx_date ;
         }
         if ( AV15Auc_UndMS > AV13Auc_na )
         {
            A342DisArtPes = (short)(1) ;
            A1430DisLoc = httpContext.getMessage( "NOOK", "") ;
            A370DisFecCli = GXutil.nullDate() ;
            A371DisFecEnt = GXutil.nullDate() ;
            Gx_msg = httpContext.getMessage( "Atencion. El sistema ha AUDITADO", "") + GXutil.newLine( ) + httpContext.getMessage( "y el Pedido ha sido RECHAZADO.", "") + GXutil.newLine( ) ;
         }
         /* Using cursor P02T06 */
         pr_default.execute(3, new Object[] {Short.valueOf(A342DisArtPes), A1430DisLoc, A370DisFecCli, A371DisFecEnt, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paud000.this.A396EmprCod;
      this.aP1[0] = paud000.this.AV12Discod;
      this.aP2[0] = paud000.this.AV13Auc_na;
      this.aP3[0] = paud000.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "paud000");
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
      P02T02_A396EmprCod = new String[] {""} ;
      P02T02_A7198Auc_Discod = new int[1] ;
      P02T02_A7182Auc_CodDef = new short[1] ;
      P02T04_A396EmprCod = new String[] {""} ;
      P02T04_A7198Auc_Discod = new int[1] ;
      P02T04_A7204Auc_stat = new byte[1] ;
      P02T04_n7204Auc_stat = new boolean[] {false} ;
      P02T04_A7202Auc_UndMS = new int[1] ;
      P02T04_n7202Auc_UndMS = new boolean[] {false} ;
      P02T05_A396EmprCod = new String[] {""} ;
      P02T05_A361DisCod = new int[1] ;
      P02T05_A342DisArtPes = new short[1] ;
      P02T05_A1430DisLoc = new String[] {""} ;
      P02T05_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P02T05_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A1430DisLoc = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paud000__default(),
         new Object[] {
             new Object[] {
            P02T02_A396EmprCod, P02T02_A7198Auc_Discod, P02T02_A7182Auc_CodDef
            }
            , new Object[] {
            P02T04_A396EmprCod, P02T04_A7198Auc_Discod, P02T04_A7204Auc_stat, P02T04_n7204Auc_stat, P02T04_A7202Auc_UndMS, P02T04_n7202Auc_UndMS
            }
            , new Object[] {
            P02T05_A396EmprCod, P02T05_A361DisCod, P02T05_A342DisArtPes, P02T05_A1430DisLoc, P02T05_A370DisFecCli, P02T05_A371DisFecEnt
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV14Audped1 ;
   private byte A7204Auc_stat ;
   private short A7182Auc_CodDef ;
   private short A342DisArtPes ;
   private short Gx_err ;
   private int AV12Discod ;
   private int AV13Auc_na ;
   private int A7198Auc_Discod ;
   private int A7202Auc_UndMS ;
   private int AV15Auc_UndMS ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1430DisLoc ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n7204Auc_stat ;
   private boolean n7202Auc_UndMS ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02T02_A396EmprCod ;
   private int[] P02T02_A7198Auc_Discod ;
   private short[] P02T02_A7182Auc_CodDef ;
   private String[] P02T04_A396EmprCod ;
   private int[] P02T04_A7198Auc_Discod ;
   private byte[] P02T04_A7204Auc_stat ;
   private boolean[] P02T04_n7204Auc_stat ;
   private int[] P02T04_A7202Auc_UndMS ;
   private boolean[] P02T04_n7202Auc_UndMS ;
   private String[] P02T05_A396EmprCod ;
   private int[] P02T05_A361DisCod ;
   private short[] P02T05_A342DisArtPes ;
   private String[] P02T05_A1430DisLoc ;
   private java.util.Date[] P02T05_A370DisFecCli ;
   private java.util.Date[] P02T05_A371DisFecEnt ;
}

final  class paud000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02T02", "SELECT EmprCod, Auc_Discod, Auc_CodDef FROM TXPAUDPE1 WHERE EmprCod = ? and Auc_Discod = ? ORDER BY EmprCod, Auc_Discod, Auc_CodDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02T04", "SELECT T1.EmprCod, T1.Auc_Discod, T1.Auc_stat, COALESCE( T2.Auc_UndMS, 0) AS Auc_UndMS FROM (TXPAUDPED T1 LEFT JOIN (SELECT SUM(Auc_Und) AS Auc_UndMS, EmprCod, Auc_Discod FROM TXPAUDPE1 GROUP BY EmprCod, Auc_Discod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.Auc_Discod = T1.Auc_Discod) WHERE T1.EmprCod = ? and T1.Auc_Discod = ? ORDER BY T1.EmprCod, T1.Auc_Discod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02T05", "SELECT EmprCod, DisCod, DisArtPes, DisLoc, DisFecCli, DisFecEnt FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02T06", "UPDATE TXPDISPOS SET DisArtPes=?, DisLoc=?, DisFecCli=?, DisFecEnt=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

