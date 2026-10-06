package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxlfor1 extends GXProcedure
{
   public pxlfor1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxlfor1.class ), "" );
   }

   public pxlfor1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pxlfor1.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pxlfor1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxlfor1.this.AV8Xclicodf = aP1[0];
      this.aP1 = aP1;
      pxlfor1.this.AV9XForser = aP2[0];
      this.aP2 = aP2;
      pxlfor1.this.AV10XForColNom = aP3[0];
      this.aP3 = aP3;
      pxlfor1.this.AV11XForColNum = aP4[0];
      this.aP4 = aP4;
      pxlfor1.this.AV12XTipColCod = aP5[0];
      this.aP5 = aP5;
      pxlfor1.this.AV13XBarCodf = aP6[0];
      this.aP6 = aP6;
      pxlfor1.this.AV14XCodReof = aP7[0];
      this.aP7 = aP7;
      pxlfor1.this.AV15XCodParf = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P020T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Xclicodf), AV9XForser, AV10XForColNom, Integer.valueOf(AV11XForColNum), Byte.valueOf(AV12XTipColCod), Integer.valueOf(AV13XBarCodf), Byte.valueOf(AV14XCodReof), AV15XCodParf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5581XCodParf = P020T2_A5581XCodParf[0] ;
         A5580XCodReof = P020T2_A5580XCodReof[0] ;
         A5579XBarCodf = P020T2_A5579XBarCodf[0] ;
         A5575XTipColCod = P020T2_A5575XTipColCod[0] ;
         A5574XForColNum = P020T2_A5574XForColNum[0] ;
         A5573XForColNom = P020T2_A5573XForColNom[0] ;
         A5572XForSer = P020T2_A5572XForSer[0] ;
         A5571XCliCodf = P020T2_A5571XCliCodf[0] ;
         /* Optimized DELETE. */
         /* Using cursor P020T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFOR1");
         /* End optimized DELETE. */
         /* Using cursor P020T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFORM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV16PROFORL = (short)(5) ;
      /* Using cursor P020T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8Xclicodf), AV9XForser, AV10XForColNom, Integer.valueOf(AV11XForColNum), Byte.valueOf(AV12XTipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P020T5_A764ProForCod[0] ;
         A831TipColCod = P020T5_A831TipColCod[0] ;
         A483ForColNum = P020T5_A483ForColNum[0] ;
         A482ForColNom = P020T5_A482ForColNom[0] ;
         A494ForSer = P020T5_A494ForSer[0] ;
         A252CliCod = P020T5_A252CliCod[0] ;
         A1160ProForL = P020T5_A1160ProForL[0] ;
         W396EmprCod = A396EmprCod ;
         AV17EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPXLFOR1

         */
         W396EmprCod = A396EmprCod ;
         A5571XCliCodf = AV8Xclicodf ;
         A5572XForSer = AV9XForser ;
         A5573XForColNom = AV10XForColNom ;
         A5574XForColNum = AV11XForColNum ;
         A5575XTipColCod = AV12XTipColCod ;
         A5579XBarCodf = AV13XBarCodf ;
         A5580XCodReof = AV14XCodReof ;
         A5581XCodParf = AV15XCodParf ;
         A5578XProForLn = AV16PROFORL ;
         A5576XProForCod = A764ProForCod ;
         n5576XProForCod = false ;
         /* Using cursor P020T6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf, Short.valueOf(A5578XProForLn), Boolean.valueOf(n5576XProForCod), A5576XProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFOR1");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         AV16PROFORL = (short)(AV16PROFORL+5) ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /*
         INSERT RECORD ON TABLE TXPXLFORM

      */
      A396EmprCod = AV17EmprCod ;
      A5571XCliCodf = AV8Xclicodf ;
      A5572XForSer = AV9XForser ;
      A5573XForColNom = AV10XForColNom ;
      A5574XForColNum = AV11XForColNum ;
      A5575XTipColCod = AV12XTipColCod ;
      A5579XBarCodf = AV13XBarCodf ;
      A5580XCodReof = AV14XCodReof ;
      A5581XCodParf = AV15XCodParf ;
      A5577XUltLinF = AV16PROFORL ;
      n5577XUltLinF = false ;
      /* Using cursor P020T7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Boolean.valueOf(n5577XUltLinF), Short.valueOf(A5577XUltLinF), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFORM");
      if ( (pr_default.getStatus(5) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxlfor1.this.A396EmprCod;
      this.aP1[0] = pxlfor1.this.AV8Xclicodf;
      this.aP2[0] = pxlfor1.this.AV9XForser;
      this.aP3[0] = pxlfor1.this.AV10XForColNom;
      this.aP4[0] = pxlfor1.this.AV11XForColNum;
      this.aP5[0] = pxlfor1.this.AV12XTipColCod;
      this.aP6[0] = pxlfor1.this.AV13XBarCodf;
      this.aP7[0] = pxlfor1.this.AV14XCodReof;
      this.aP8[0] = pxlfor1.this.AV15XCodParf;
      Application.commitDataStores(context, remoteHandle, pr_default, "pxlfor1");
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
      P020T2_A396EmprCod = new String[] {""} ;
      P020T2_A5581XCodParf = new String[] {""} ;
      P020T2_A5580XCodReof = new byte[1] ;
      P020T2_A5579XBarCodf = new int[1] ;
      P020T2_A5575XTipColCod = new byte[1] ;
      P020T2_A5574XForColNum = new int[1] ;
      P020T2_A5573XForColNom = new String[] {""} ;
      P020T2_A5572XForSer = new String[] {""} ;
      P020T2_A5571XCliCodf = new int[1] ;
      A5581XCodParf = "" ;
      A5573XForColNom = "" ;
      A5572XForSer = "" ;
      P020T5_A396EmprCod = new String[] {""} ;
      P020T5_A764ProForCod = new String[] {""} ;
      P020T5_A831TipColCod = new byte[1] ;
      P020T5_A483ForColNum = new int[1] ;
      P020T5_A482ForColNom = new String[] {""} ;
      P020T5_A494ForSer = new String[] {""} ;
      P020T5_A252CliCod = new int[1] ;
      P020T5_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      W396EmprCod = "" ;
      AV17EmprCod = "" ;
      A5576XProForCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxlfor1__default(),
         new Object[] {
             new Object[] {
            P020T2_A396EmprCod, P020T2_A5581XCodParf, P020T2_A5580XCodReof, P020T2_A5579XBarCodf, P020T2_A5575XTipColCod, P020T2_A5574XForColNum, P020T2_A5573XForColNom, P020T2_A5572XForSer, P020T2_A5571XCliCodf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P020T5_A396EmprCod, P020T5_A764ProForCod, P020T5_A831TipColCod, P020T5_A483ForColNum, P020T5_A482ForColNom, P020T5_A494ForSer, P020T5_A252CliCod, P020T5_A1160ProForL
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

   private byte AV12XTipColCod ;
   private byte AV14XCodReof ;
   private byte A5580XCodReof ;
   private byte A5575XTipColCod ;
   private byte A831TipColCod ;
   private short AV16PROFORL ;
   private short A1160ProForL ;
   private short A5578XProForLn ;
   private short Gx_err ;
   private short A5577XUltLinF ;
   private int AV8Xclicodf ;
   private int AV11XForColNum ;
   private int AV13XBarCodf ;
   private int A5579XBarCodf ;
   private int A5574XForColNum ;
   private int A5571XCliCodf ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GX_INS825 ;
   private int GX_INS824 ;
   private String A396EmprCod ;
   private String AV9XForser ;
   private String AV10XForColNom ;
   private String AV15XCodParf ;
   private String scmdbuf ;
   private String A5581XCodParf ;
   private String A5573XForColNom ;
   private String A5572XForSer ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String W396EmprCod ;
   private String AV17EmprCod ;
   private String A5576XProForCod ;
   private String Gx_emsg ;
   private boolean n5576XProForCod ;
   private boolean n5577XUltLinF ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P020T2_A396EmprCod ;
   private String[] P020T2_A5581XCodParf ;
   private byte[] P020T2_A5580XCodReof ;
   private int[] P020T2_A5579XBarCodf ;
   private byte[] P020T2_A5575XTipColCod ;
   private int[] P020T2_A5574XForColNum ;
   private String[] P020T2_A5573XForColNom ;
   private String[] P020T2_A5572XForSer ;
   private int[] P020T2_A5571XCliCodf ;
   private String[] P020T5_A396EmprCod ;
   private String[] P020T5_A764ProForCod ;
   private byte[] P020T5_A831TipColCod ;
   private int[] P020T5_A483ForColNum ;
   private String[] P020T5_A482ForColNom ;
   private String[] P020T5_A494ForSer ;
   private int[] P020T5_A252CliCod ;
   private short[] P020T5_A1160ProForL ;
}

final  class pxlfor1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020T2", "SELECT Emprcod, XCodParf, XCodReof, XBarCodf, XTipColCod, XForColNum, XForColNom, XForSer, XCliCodf FROM TXPXLFORM WHERE Emprcod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ? ORDER BY Emprcod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XBarCodf, XCodReof, XCodParf ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P020T3", "DELETE FROM TXPXLFOR1  WHERE EmprCod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFOR1")
         ,new UpdateCursor("P020T4", "DELETE FROM TXPXLFORM  WHERE Emprcod = ? AND XCliCodf = ? AND XForSer = ? AND XForColNom = ? AND XForColNum = ? AND XTipColCod = ? AND XBarCodf = ? AND XCodReof = ? AND XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFORM")
         ,new ForEachCursor("P020T5", "SELECT EmprCod, ProForCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020T6", "INSERT INTO TXPXLFOR1(EmprCod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XBarCodf, XCodReof, XCodParf, XProForLn, XProForCod, XMqProg, XMqProgD1, XMqProg2, XMqProgD2, XMqProg3, XMqProgD3, XFt_procod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFOR1")
         ,new UpdateCursor("P020T7", "INSERT INTO TXPXLFORM(Emprcod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XUltLinF, XBarCodf, XCodReof, XCodParf, XMqProg, XMqProgD1, XMqProg2, XMqProgD2, XMqProg3, XMqProgD3, XFt_procod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFORM")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               return;
      }
   }

}

