package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuealb extends GXProcedure
{
   public pnuealb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuealb.class ), "" );
   }

   public pnuealb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pnuealb.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pnuealb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuealb.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pnuealb.this.A1213TalCod = aP2[0];
      this.aP2 = aP2;
      pnuealb.this.A1293EntMarRef = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Leave = httpContext.getMessage( "C", "") ;
      while ( GXutil.strcmp(AV17Leave, httpContext.getMessage( "C", "")) == 0 )
      {
      }
      /* Using cursor P007S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1213TalCod, A1293EntMarRef});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1282EntMarPza = P007S2_A1282EntMarPza[0] ;
         n1282EntMarPza = P007S2_n1282EntMarPza[0] ;
         A1227EntMalLoc = P007S2_A1227EntMalLoc[0] ;
         n1227EntMalLoc = P007S2_n1227EntMalLoc[0] ;
         A1283EntMarKgm = P007S2_A1283EntMarKgm[0] ;
         n1283EntMarKgm = P007S2_n1283EntMarKgm[0] ;
         A1289EntMalRep = P007S2_A1289EntMalRep[0] ;
         n1289EntMalRep = P007S2_n1289EntMalRep[0] ;
         A1286EntMarEti = P007S2_A1286EntMarEti[0] ;
         n1286EntMarEti = P007S2_n1286EntMarEti[0] ;
         A1290EntDes = P007S2_A1290EntDes[0] ;
         n1290EntDes = P007S2_n1290EntDes[0] ;
         A1211TipEntCod = P007S2_A1211TipEntCod[0] ;
         n1211TipEntCod = P007S2_n1211TipEntCod[0] ;
         A1227EntMalLoc = P007S2_A1227EntMalLoc[0] ;
         n1227EntMalLoc = P007S2_n1227EntMalLoc[0] ;
         A1289EntMalRep = P007S2_A1289EntMalRep[0] ;
         n1289EntMalRep = P007S2_n1289EntMalRep[0] ;
         A1290EntDes = P007S2_A1290EntDes[0] ;
         n1290EntDes = P007S2_n1290EntDes[0] ;
         A1211TipEntCod = P007S2_A1211TipEntCod[0] ;
         n1211TipEntCod = P007S2_n1211TipEntCod[0] ;
         GXv_int1[0] = AV15AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int1) ;
         pnuealb.this.AV15AlbRecCod = GXv_int1[0] ;
         /*
            INSERT RECORD ON TABLE TXPALBREC

         */
         A44AlbRecCod = AV15AlbRecCod ;
         A45AlbRef = A1293EntMarRef ;
         A46AlbREnt = A1213TalCod ;
         A52AlbRPieEnt = A1282EntMarPza ;
         A56AlbRUni = httpContext.getMessage( "K", "") ;
         A50AlbRLoc = A1227EntMalLoc ;
         A49AlbRFen = Gx_date ;
         A58AlbRUniEnt = A1283EntMarKgm ;
         A55AlbRReo = A1289EntMalRep ;
         A47AlbREst = (byte)(0) ;
         A1222AlbNumEti = A1286EntMarEti ;
         A1291AlbRDes = A1290EntDes ;
         /* Using cursor P007S3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Byte.valueOf(A47AlbREst), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Short.valueOf(A1222AlbNumEti), A1291AlbRDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         if ( (pr_default.getStatus(1) == 1) )
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV16Opcion, httpContext.getMessage( "S", "")) == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuealb.this.A396EmprCod;
      this.aP1[0] = pnuealb.this.A252CliCod;
      this.aP2[0] = pnuealb.this.A1213TalCod;
      this.aP3[0] = pnuealb.this.A1293EntMarRef;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuealb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Leave = "" ;
      scmdbuf = "" ;
      P007S2_A396EmprCod = new String[] {""} ;
      P007S2_A252CliCod = new int[1] ;
      P007S2_A1213TalCod = new String[] {""} ;
      P007S2_A1293EntMarRef = new String[] {""} ;
      P007S2_A1282EntMarPza = new short[1] ;
      P007S2_n1282EntMarPza = new boolean[] {false} ;
      P007S2_A1227EntMalLoc = new String[] {""} ;
      P007S2_n1227EntMalLoc = new boolean[] {false} ;
      P007S2_A1283EntMarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P007S2_n1283EntMarKgm = new boolean[] {false} ;
      P007S2_A1289EntMalRep = new String[] {""} ;
      P007S2_n1289EntMalRep = new boolean[] {false} ;
      P007S2_A1286EntMarEti = new short[1] ;
      P007S2_n1286EntMarEti = new boolean[] {false} ;
      P007S2_A1290EntDes = new String[] {""} ;
      P007S2_n1290EntDes = new boolean[] {false} ;
      P007S2_A1211TipEntCod = new short[1] ;
      P007S2_n1211TipEntCod = new boolean[] {false} ;
      A1227EntMalLoc = "" ;
      A1283EntMarKgm = DecimalUtil.ZERO ;
      A1289EntMalRep = "" ;
      A1290EntDes = "" ;
      GXv_int1 = new int[1] ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      A1291AlbRDes = "" ;
      Gx_emsg = "" ;
      AV16Opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuealb__default(),
         new Object[] {
             new Object[] {
            P007S2_A396EmprCod, P007S2_A252CliCod, P007S2_A1213TalCod, P007S2_A1293EntMarRef, P007S2_A1282EntMarPza, P007S2_n1282EntMarPza, P007S2_A1227EntMalLoc, P007S2_n1227EntMalLoc, P007S2_A1283EntMarKgm, P007S2_n1283EntMarKgm,
            P007S2_A1289EntMalRep, P007S2_n1289EntMalRep, P007S2_A1286EntMarEti, P007S2_n1286EntMarEti, P007S2_A1290EntDes, P007S2_n1290EntDes, P007S2_A1211TipEntCod, P007S2_n1211TipEntCod
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

   private byte A47AlbREst ;
   private short A1282EntMarPza ;
   private short A1286EntMarEti ;
   private short A1211TipEntCod ;
   private short A1222AlbNumEti ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV15AlbRecCod ;
   private int GXv_int1[] ;
   private int GX_INS7 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal A1283EntMarKgm ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String A1213TalCod ;
   private String A1293EntMarRef ;
   private String AV17Leave ;
   private String scmdbuf ;
   private String A1227EntMalLoc ;
   private String A1289EntMalRep ;
   private String A1290EntDes ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A55AlbRReo ;
   private String A1291AlbRDes ;
   private String Gx_emsg ;
   private String AV16Opcion ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean n1282EntMarPza ;
   private boolean n1227EntMalLoc ;
   private boolean n1283EntMarKgm ;
   private boolean n1289EntMalRep ;
   private boolean n1286EntMarEti ;
   private boolean n1290EntDes ;
   private boolean n1211TipEntCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P007S2_A396EmprCod ;
   private int[] P007S2_A252CliCod ;
   private String[] P007S2_A1213TalCod ;
   private String[] P007S2_A1293EntMarRef ;
   private short[] P007S2_A1282EntMarPza ;
   private boolean[] P007S2_n1282EntMarPza ;
   private String[] P007S2_A1227EntMalLoc ;
   private boolean[] P007S2_n1227EntMalLoc ;
   private java.math.BigDecimal[] P007S2_A1283EntMarKgm ;
   private boolean[] P007S2_n1283EntMarKgm ;
   private String[] P007S2_A1289EntMalRep ;
   private boolean[] P007S2_n1289EntMalRep ;
   private short[] P007S2_A1286EntMarEti ;
   private boolean[] P007S2_n1286EntMarEti ;
   private String[] P007S2_A1290EntDes ;
   private boolean[] P007S2_n1290EntDes ;
   private short[] P007S2_A1211TipEntCod ;
   private boolean[] P007S2_n1211TipEntCod ;
}

final  class pnuealb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007S2", "SELECT T1.EmprCod, T1.CliCod, T1.TalCod, T1.EntMarRef, T1.EntMarPza, T2.EntMalLoc, T1.EntMarKgm, T2.EntMalRep, T1.EntMarEti, T2.EntDes, T2.TipEntCod FROM (TXPENTMAR T1 INNER JOIN TXPCENTMA T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.TalCod = T1.TalCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.TalCod = ? and T1.EntMarRef = ? ORDER BY T1.EmprCod, T1.CliCod, T1.TalCod, T1.EntMarRef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P007S3", "INSERT INTO TXPALBREC(EmprCod, AlbRecCod, CliCod, AlbRef, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbREst, TipEntCod, AlbNumEti, AlbRDes, TrnCod, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, ProceCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 2);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[13]).shortValue());
               }
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 20);
               return;
      }
   }

}

