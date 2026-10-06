package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paudi00 extends GXProcedure
{
   public paudi00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paudi00.class ), "" );
   }

   public paudi00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 )
   {
      paudi00.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      paudi00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paudi00.this.AV12Discod = aP1[0];
      this.aP1 = aP1;
      paudi00.this.AV19Barcodreo = aP2[0];
      this.aP2 = aP2;
      paudi00.this.AV20Barcodpar = aP3[0];
      this.aP3 = aP3;
      paudi00.this.AV21Aui_NumAud = aP4[0];
      this.aP4 = aP4;
      paudi00.this.AV13Auc_na = aP5[0];
      this.aP5 = aP5;
      paudi00.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Audped1 = (byte)(0) ;
      /* Using cursor P02WM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar, Short.valueOf(AV21Aui_NumAud)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7417Aui_NumAud = P02WM2_A7417Aui_NumAud[0] ;
         A7188Aui_codpar = P02WM2_A7188Aui_codpar[0] ;
         A7187Aui_codreo = P02WM2_A7187Aui_codreo[0] ;
         A7186Aui_barcod = P02WM2_A7186Aui_barcod[0] ;
         A7182Auc_CodDef = P02WM2_A7182Auc_CodDef[0] ;
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
      /* Using cursor P02WM4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar, Short.valueOf(AV21Aui_NumAud)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7417Aui_NumAud = P02WM4_A7417Aui_NumAud[0] ;
         A7188Aui_codpar = P02WM4_A7188Aui_codpar[0] ;
         A7187Aui_codreo = P02WM4_A7187Aui_codreo[0] ;
         A7186Aui_barcod = P02WM4_A7186Aui_barcod[0] ;
         A7194Aui_stat = P02WM4_A7194Aui_stat[0] ;
         n7194Aui_stat = P02WM4_n7194Aui_stat[0] ;
         A7192Aui_UndMS = P02WM4_A7192Aui_UndMS[0] ;
         n7192Aui_UndMS = P02WM4_n7192Aui_UndMS[0] ;
         A7192Aui_UndMS = P02WM4_A7192Aui_UndMS[0] ;
         n7192Aui_UndMS = P02WM4_n7192Aui_UndMS[0] ;
         AV15Auc_UndMS = A7192Aui_UndMS ;
         if ( AV15Auc_UndMS > AV13Auc_na )
         {
            A7194Aui_stat = (byte)(2) ;
            n7194Aui_stat = false ;
         }
         else
         {
            A7194Aui_stat = (byte)(1) ;
            n7194Aui_stat = false ;
         }
         /* Using cursor P02WM5 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n7194Aui_stat), Byte.valueOf(A7194Aui_stat), A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar, Short.valueOf(A7417Aui_NumAud)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDINT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      Gx_msg = " " ;
      /* Using cursor P02WM6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P02WM6_A130BarCodPar[0] ;
         A132BarCodReo = P02WM6_A132BarCodReo[0] ;
         A129BarCod = P02WM6_A129BarCod[0] ;
         A149BarEstRes = P02WM6_A149BarEstRes[0] ;
         A1499BarNMez = P02WM6_A1499BarNMez[0] ;
         if ( AV15Auc_UndMS <= AV13Auc_na )
         {
            A149BarEstRes = (byte)(1) ;
            A1499BarNMez = httpContext.getMessage( "OK", "") ;
         }
         if ( AV15Auc_UndMS > AV13Auc_na )
         {
            A149BarEstRes = (byte)(1) ;
            A1499BarNMez = httpContext.getMessage( "NOOK", "") ;
            Gx_msg = httpContext.getMessage( "Atencion. El sistema ha AUDITADO", "") + GXutil.newLine( ) + httpContext.getMessage( "y la OP ha sido RECHAZADA.", "") + GXutil.newLine( ) ;
         }
         /* Using cursor P02WM7 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A149BarEstRes), A1499BarNMez, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paudi00.this.A396EmprCod;
      this.aP1[0] = paudi00.this.AV12Discod;
      this.aP2[0] = paudi00.this.AV19Barcodreo;
      this.aP3[0] = paudi00.this.AV20Barcodpar;
      this.aP4[0] = paudi00.this.AV21Aui_NumAud;
      this.aP5[0] = paudi00.this.AV13Auc_na;
      this.aP6[0] = paudi00.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "paudi00");
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
      P02WM2_A396EmprCod = new String[] {""} ;
      P02WM2_A7417Aui_NumAud = new short[1] ;
      P02WM2_A7188Aui_codpar = new String[] {""} ;
      P02WM2_A7187Aui_codreo = new byte[1] ;
      P02WM2_A7186Aui_barcod = new int[1] ;
      P02WM2_A7182Auc_CodDef = new short[1] ;
      A7188Aui_codpar = "" ;
      P02WM4_A396EmprCod = new String[] {""} ;
      P02WM4_A7417Aui_NumAud = new short[1] ;
      P02WM4_A7188Aui_codpar = new String[] {""} ;
      P02WM4_A7187Aui_codreo = new byte[1] ;
      P02WM4_A7186Aui_barcod = new int[1] ;
      P02WM4_A7194Aui_stat = new byte[1] ;
      P02WM4_n7194Aui_stat = new boolean[] {false} ;
      P02WM4_A7192Aui_UndMS = new int[1] ;
      P02WM4_n7192Aui_UndMS = new boolean[] {false} ;
      P02WM6_A396EmprCod = new String[] {""} ;
      P02WM6_A130BarCodPar = new String[] {""} ;
      P02WM6_A132BarCodReo = new byte[1] ;
      P02WM6_A129BarCod = new int[1] ;
      P02WM6_A149BarEstRes = new byte[1] ;
      P02WM6_A1499BarNMez = new String[] {""} ;
      A130BarCodPar = "" ;
      A1499BarNMez = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paudi00__default(),
         new Object[] {
             new Object[] {
            P02WM2_A396EmprCod, P02WM2_A7417Aui_NumAud, P02WM2_A7188Aui_codpar, P02WM2_A7187Aui_codreo, P02WM2_A7186Aui_barcod, P02WM2_A7182Auc_CodDef
            }
            , new Object[] {
            P02WM4_A396EmprCod, P02WM4_A7417Aui_NumAud, P02WM4_A7188Aui_codpar, P02WM4_A7187Aui_codreo, P02WM4_A7186Aui_barcod, P02WM4_A7194Aui_stat, P02WM4_n7194Aui_stat, P02WM4_A7192Aui_UndMS, P02WM4_n7192Aui_UndMS
            }
            , new Object[] {
            }
            , new Object[] {
            P02WM6_A396EmprCod, P02WM6_A130BarCodPar, P02WM6_A132BarCodReo, P02WM6_A129BarCod, P02WM6_A149BarEstRes, P02WM6_A1499BarNMez
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Barcodreo ;
   private byte AV14Audped1 ;
   private byte A7187Aui_codreo ;
   private byte A7194Aui_stat ;
   private byte A132BarCodReo ;
   private byte A149BarEstRes ;
   private short AV21Aui_NumAud ;
   private short A7417Aui_NumAud ;
   private short A7182Auc_CodDef ;
   private short Gx_err ;
   private int AV12Discod ;
   private int AV13Auc_na ;
   private int A7186Aui_barcod ;
   private int A7192Aui_UndMS ;
   private int AV15Auc_UndMS ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV20Barcodpar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A7188Aui_codpar ;
   private String A130BarCodPar ;
   private String A1499BarNMez ;
   private boolean returnInSub ;
   private boolean n7194Aui_stat ;
   private boolean n7192Aui_UndMS ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02WM2_A396EmprCod ;
   private short[] P02WM2_A7417Aui_NumAud ;
   private String[] P02WM2_A7188Aui_codpar ;
   private byte[] P02WM2_A7187Aui_codreo ;
   private int[] P02WM2_A7186Aui_barcod ;
   private short[] P02WM2_A7182Auc_CodDef ;
   private String[] P02WM4_A396EmprCod ;
   private short[] P02WM4_A7417Aui_NumAud ;
   private String[] P02WM4_A7188Aui_codpar ;
   private byte[] P02WM4_A7187Aui_codreo ;
   private int[] P02WM4_A7186Aui_barcod ;
   private byte[] P02WM4_A7194Aui_stat ;
   private boolean[] P02WM4_n7194Aui_stat ;
   private int[] P02WM4_A7192Aui_UndMS ;
   private boolean[] P02WM4_n7192Aui_UndMS ;
   private String[] P02WM6_A396EmprCod ;
   private String[] P02WM6_A130BarCodPar ;
   private byte[] P02WM6_A132BarCodReo ;
   private int[] P02WM6_A129BarCod ;
   private byte[] P02WM6_A149BarEstRes ;
   private String[] P02WM6_A1499BarNMez ;
}

final  class paudi00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WM2", "SELECT EmprCod, Aui_NumAud, Aui_codpar, Aui_codreo, Aui_barcod, Auc_CodDef FROM TXPAUDIN1 WHERE EmprCod = ? and Aui_barcod = ? and Aui_codreo = ? and Aui_codpar = ? and Aui_NumAud = ? ORDER BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud, Auc_CodDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02WM4", "SELECT T1.EmprCod, T1.Aui_NumAud, T1.Aui_codpar, T1.Aui_codreo, T1.Aui_barcod, T1.Aui_stat, COALESCE( T2.Aui_UndMS, 0) AS Aui_UndMS FROM (TXPAUDINT T1 LEFT JOIN (SELECT SUM(Aui_Und) AS Aui_UndMS, EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud FROM TXPAUDIN1 GROUP BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud ) T2 ON T2.EmprCod = T1.EmprCod AND T2.Aui_barcod = T1.Aui_barcod AND T2.Aui_codreo = T1.Aui_codreo AND T2.Aui_codpar = T1.Aui_codpar AND T2.Aui_NumAud = T1.Aui_NumAud) WHERE T1.EmprCod = ? and T1.Aui_barcod = ? and T1.Aui_codreo = ? and T1.Aui_codpar = ? and T1.Aui_NumAud = ? ORDER BY T1.EmprCod, T1.Aui_barcod, T1.Aui_codreo, T1.Aui_codpar, T1.Aui_NumAud ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02WM5", "UPDATE TXPAUDINT SET Aui_stat=?  WHERE EmprCod = ? AND Aui_barcod = ? AND Aui_codreo = ? AND Aui_codpar = ? AND Aui_NumAud = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDINT")
         ,new ForEachCursor("P02WM6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarEstRes, BarNMez FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02WM7", "UPDATE TXPBARCAD SET BarEstRes=?, BarNMez=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

