package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paddlfor extends GXProcedure
{
   public paddlfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paddlfor.class ), "" );
   }

   public paddlfor( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      paddlfor.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      paddlfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paddlfor.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      paddlfor.this.AV9ForSer = aP2[0];
      this.aP2 = aP2;
      paddlfor.this.AV10ForColNom = aP3[0];
      this.aP3 = aP3;
      paddlfor.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      paddlfor.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02YH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02YH2_A831TipColCod[0] ;
         A483ForColNum = P02YH2_A483ForColNum[0] ;
         A482ForColNom = P02YH2_A482ForColNom[0] ;
         A494ForSer = P02YH2_A494ForSer[0] ;
         A252CliCod = P02YH2_A252CliCod[0] ;
         A1160ProForL = P02YH2_A1160ProForL[0] ;
         A764ProForCod = P02YH2_A764ProForCod[0] ;
         A6549ProForFR = P02YH2_A6549ProForFR[0] ;
         A486ForNumCol = P02YH2_A486ForNumCol[0] ;
         A486ForNumCol = P02YH2_A486ForNumCol[0] ;
         AV13ProForL = A1160ProForL ;
         AV14ProForCod = A764ProForCod ;
         AV15ProForFR = A6549ProForFR ;
         AV16ForNumCol = A486ForNumCol ;
         /* Execute user subroutine: 'CREALINEAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CREALINEAS' Routine */
      returnInSub = false ;
      /* Using cursor P02YH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16ForNumCol), Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P02YH3_A831TipColCod[0] ;
         A483ForColNum = P02YH3_A483ForColNum[0] ;
         A482ForColNom = P02YH3_A482ForColNom[0] ;
         A494ForSer = P02YH3_A494ForSer[0] ;
         A252CliCod = P02YH3_A252CliCod[0] ;
         A486ForNumCol = P02YH3_A486ForNumCol[0] ;
         /*
            INSERT RECORD ON TABLE TXPLFORMU

         */
         A1160ProForL = AV13ProForL ;
         A764ProForCod = AV14ProForCod ;
         A6549ProForFR = AV15ProForFR ;
         /* Using cursor P02YH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = paddlfor.this.A396EmprCod;
      this.aP1[0] = paddlfor.this.AV8CliCod;
      this.aP2[0] = paddlfor.this.AV9ForSer;
      this.aP3[0] = paddlfor.this.AV10ForColNom;
      this.aP4[0] = paddlfor.this.AV11ForColNum;
      this.aP5[0] = paddlfor.this.AV12TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "paddlfor");
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
      P02YH2_A396EmprCod = new String[] {""} ;
      P02YH2_A831TipColCod = new byte[1] ;
      P02YH2_A483ForColNum = new int[1] ;
      P02YH2_A482ForColNom = new String[] {""} ;
      P02YH2_A494ForSer = new String[] {""} ;
      P02YH2_A252CliCod = new int[1] ;
      P02YH2_A1160ProForL = new short[1] ;
      P02YH2_A764ProForCod = new String[] {""} ;
      P02YH2_A6549ProForFR = new String[] {""} ;
      P02YH2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A6549ProForFR = "" ;
      AV14ProForCod = "" ;
      AV15ProForFR = "" ;
      P02YH3_A396EmprCod = new String[] {""} ;
      P02YH3_A831TipColCod = new byte[1] ;
      P02YH3_A483ForColNum = new int[1] ;
      P02YH3_A482ForColNom = new String[] {""} ;
      P02YH3_A494ForSer = new String[] {""} ;
      P02YH3_A252CliCod = new int[1] ;
      P02YH3_A486ForNumCol = new int[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paddlfor__default(),
         new Object[] {
             new Object[] {
            P02YH2_A396EmprCod, P02YH2_A831TipColCod, P02YH2_A483ForColNum, P02YH2_A482ForColNom, P02YH2_A494ForSer, P02YH2_A252CliCod, P02YH2_A1160ProForL, P02YH2_A764ProForCod, P02YH2_A6549ProForFR, P02YH2_A486ForNumCol
            }
            , new Object[] {
            P02YH3_A396EmprCod, P02YH3_A831TipColCod, P02YH3_A483ForColNum, P02YH3_A482ForColNom, P02YH3_A494ForSer, P02YH3_A252CliCod, P02YH3_A486ForNumCol
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte A831TipColCod ;
   private short A1160ProForL ;
   private short AV13ProForL ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV16ForNumCol ;
   private int GX_INS154 ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A6549ProForFR ;
   private String AV14ProForCod ;
   private String AV15ProForFR ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YH2_A396EmprCod ;
   private byte[] P02YH2_A831TipColCod ;
   private int[] P02YH2_A483ForColNum ;
   private String[] P02YH2_A482ForColNom ;
   private String[] P02YH2_A494ForSer ;
   private int[] P02YH2_A252CliCod ;
   private short[] P02YH2_A1160ProForL ;
   private String[] P02YH2_A764ProForCod ;
   private String[] P02YH2_A6549ProForFR ;
   private int[] P02YH2_A486ForNumCol ;
   private String[] P02YH3_A396EmprCod ;
   private byte[] P02YH3_A831TipColCod ;
   private int[] P02YH3_A483ForColNum ;
   private String[] P02YH3_A482ForColNom ;
   private String[] P02YH3_A494ForSer ;
   private int[] P02YH3_A252CliCod ;
   private int[] P02YH3_A486ForNumCol ;
}

final  class paddlfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YH2", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ProForL, T1.ProForCod, T1.ProForFR, T2.ForNumCol FROM (TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YH3", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE (EmprCod = ? and ForNumCol = ?) AND (CliCod <> ? or ForSer <> ? or ForColNom <> ? or ForColNum <> ? or TipColCod <> ?) ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02YH4", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

