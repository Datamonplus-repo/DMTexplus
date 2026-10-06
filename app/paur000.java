package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paur000 extends GXProcedure
{
   public paur000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paur000.class ), "" );
   }

   public paur000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      paur000.this.aP3 = new String[] {""};
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
      paur000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paur000.this.AV16ALbreccod = aP1[0];
      this.aP1 = aP1;
      paur000.this.AV9Auc_na = aP2[0];
      this.aP2 = aP2;
      paur000.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Audped1 = (byte)(0) ;
      /* Using cursor P04IT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11349Aur_Reccod = P04IT2_A11349Aur_Reccod[0] ;
         A11358Aur_CodDef = P04IT2_A11358Aur_CodDef[0] ;
         AV10Audped1 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = " " ;
      if ( AV10Audped1 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado", "") + GXutil.newLine( ) + httpContext.getMessage( "que no ha sido ingresado NINGUN DEFECTO.", "") + GXutil.newLine( ) + httpContext.getMessage( "No se ha podido AUDITAR ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Ingrese un codigo de DEFECTO.", "") + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P04IT4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16ALbreccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11349Aur_Reccod = P04IT4_A11349Aur_Reccod[0] ;
         A11355Aur_stat = P04IT4_A11355Aur_stat[0] ;
         n11355Aur_stat = P04IT4_n11355Aur_stat[0] ;
         A11353Aur_UndMS = P04IT4_A11353Aur_UndMS[0] ;
         n11353Aur_UndMS = P04IT4_n11353Aur_UndMS[0] ;
         A11353Aur_UndMS = P04IT4_A11353Aur_UndMS[0] ;
         n11353Aur_UndMS = P04IT4_n11353Aur_UndMS[0] ;
         AV12Auc_UndMS = A11353Aur_UndMS ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      Gx_msg = " " ;
      /* Using cursor P04IT5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16ALbreccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P04IT5_A44AlbRecCod[0] ;
         A317AlbStLot = P04IT5_A317AlbStLot[0] ;
         A8029AlbNumM = P04IT5_A8029AlbNumM[0] ;
         A6183AlbrFeNf = P04IT5_A6183AlbrFeNf[0] ;
         if ( AV12Auc_UndMS <= AV9Auc_na )
         {
            A317AlbStLot = (byte)(1) ;
            A8029AlbNumM = httpContext.getMessage( "OK", "") ;
            A6183AlbrFeNf = GXutil.today( ) ;
         }
         if ( AV12Auc_UndMS > AV9Auc_na )
         {
            A317AlbStLot = (byte)(1) ;
            A8029AlbNumM = httpContext.getMessage( "NOOK", "") ;
            A6183AlbrFeNf = GXutil.nullDate() ;
            Gx_msg = httpContext.getMessage( "Atencion. El sistema ha AUDITADO", "") + GXutil.newLine( ) + httpContext.getMessage( "y el N Recepcion, ha sido RECHAZADO.", "") + GXutil.newLine( ) ;
         }
         /* Using cursor P04IT6 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A317AlbStLot), A8029AlbNumM, A6183AlbrFeNf, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paur000.this.A396EmprCod;
      this.aP1[0] = paur000.this.AV16ALbreccod;
      this.aP2[0] = paur000.this.AV9Auc_na;
      this.aP3[0] = paur000.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "paur000");
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
      P04IT2_A396EmprCod = new String[] {""} ;
      P04IT2_A11349Aur_Reccod = new int[1] ;
      P04IT2_A11358Aur_CodDef = new short[1] ;
      P04IT4_A396EmprCod = new String[] {""} ;
      P04IT4_A11349Aur_Reccod = new int[1] ;
      P04IT4_A11355Aur_stat = new byte[1] ;
      P04IT4_n11355Aur_stat = new boolean[] {false} ;
      P04IT4_A11353Aur_UndMS = new int[1] ;
      P04IT4_n11353Aur_UndMS = new boolean[] {false} ;
      P04IT5_A396EmprCod = new String[] {""} ;
      P04IT5_A44AlbRecCod = new int[1] ;
      P04IT5_A317AlbStLot = new byte[1] ;
      P04IT5_A8029AlbNumM = new String[] {""} ;
      P04IT5_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      A8029AlbNumM = "" ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paur000__default(),
         new Object[] {
             new Object[] {
            P04IT2_A396EmprCod, P04IT2_A11349Aur_Reccod, P04IT2_A11358Aur_CodDef
            }
            , new Object[] {
            P04IT4_A396EmprCod, P04IT4_A11349Aur_Reccod, P04IT4_A11355Aur_stat, P04IT4_n11355Aur_stat, P04IT4_A11353Aur_UndMS, P04IT4_n11353Aur_UndMS
            }
            , new Object[] {
            P04IT5_A396EmprCod, P04IT5_A44AlbRecCod, P04IT5_A317AlbStLot, P04IT5_A8029AlbNumM, P04IT5_A6183AlbrFeNf
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Audped1 ;
   private byte A11355Aur_stat ;
   private byte A317AlbStLot ;
   private short A11358Aur_CodDef ;
   private short Gx_err ;
   private int AV16ALbreccod ;
   private int AV9Auc_na ;
   private int A11349Aur_Reccod ;
   private int A11353Aur_UndMS ;
   private int AV12Auc_UndMS ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A8029AlbNumM ;
   private java.util.Date A6183AlbrFeNf ;
   private boolean returnInSub ;
   private boolean n11355Aur_stat ;
   private boolean n11353Aur_UndMS ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04IT2_A396EmprCod ;
   private int[] P04IT2_A11349Aur_Reccod ;
   private short[] P04IT2_A11358Aur_CodDef ;
   private String[] P04IT4_A396EmprCod ;
   private int[] P04IT4_A11349Aur_Reccod ;
   private byte[] P04IT4_A11355Aur_stat ;
   private boolean[] P04IT4_n11355Aur_stat ;
   private int[] P04IT4_A11353Aur_UndMS ;
   private boolean[] P04IT4_n11353Aur_UndMS ;
   private String[] P04IT5_A396EmprCod ;
   private int[] P04IT5_A44AlbRecCod ;
   private byte[] P04IT5_A317AlbStLot ;
   private String[] P04IT5_A8029AlbNumM ;
   private java.util.Date[] P04IT5_A6183AlbrFeNf ;
}

final  class paur000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04IT2", "SELECT EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod, Aur_CodDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04IT4", "SELECT T1.EmprCod, T1.Aur_Reccod, T1.Aur_stat, COALESCE( T2.Aur_UndMS, 0) AS Aur_UndMS FROM (TXPAUDREP T1 LEFT JOIN (SELECT SUM(Aur_Und) AS Aur_UndMS, EmprCod, Aur_Reccod FROM TXPAUDRE1 GROUP BY EmprCod, Aur_Reccod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.Aur_Reccod = T1.Aur_Reccod) WHERE T1.EmprCod = ? and T1.Aur_Reccod = ? ORDER BY T1.EmprCod, T1.Aur_Reccod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04IT5", "SELECT EmprCod, AlbRecCod, AlbStLot, AlbNumM, AlbrFeNf FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04IT6", "UPDATE TXPALBREC SET AlbStLot=?, AlbNumM=?, AlbrFeNf=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

