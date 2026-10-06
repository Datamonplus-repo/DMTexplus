package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewpdo extends GXProcedure
{
   public pnewpdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewpdo.class ), "" );
   }

   public pnewpdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pnewpdo.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pnewpdo.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewpdo.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pnewpdo.this.AV17PartCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FlagPdo = (byte)(0) ;
      /* Using cursor P00G12 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV17PartCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A966PartCod = P00G12_A966PartCod[0] ;
         A252CliCod = P00G12_A252CliCod[0] ;
         A396EmprCod = P00G12_A396EmprCod[0] ;
         AV18FlagPdo = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( (0==AV18FlagPdo) )
      {
         /*
            INSERT RECORD ON TABLE TXPCPARTI

         */
         A396EmprCod = AV15EmprCod ;
         A966PartCod = AV17PartCod ;
         A252CliCod = AV16CliCod ;
         A1456ParArtCod = AV17PartCod ;
         n1456ParArtCod = false ;
         A968PartFec = Gx_date ;
         n968PartFec = false ;
         A2245PartEstM = httpContext.getMessage( "N", "") ;
         n2245PartEstM = false ;
         A2376PartExt = (byte)(0) ;
         n2376PartExt = false ;
         A2244PartReo = httpContext.getMessage( "NO", "") ;
         n2244PartReo = false ;
         A2241PartSec = httpContext.getMessage( "P", "") ;
         n2241PartSec = false ;
         A972PartULin = 1 ;
         n972PartULin = false ;
         /* Using cursor P00G13 */
         pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1456ParArtCod), A1456ParArtCod, Boolean.valueOf(n968PartFec), A968PartFec, Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n2241PartSec), A2241PartSec, Boolean.valueOf(n2244PartReo), A2244PartReo, Boolean.valueOf(n2245PartEstM), A2245PartEstM, Boolean.valueOf(n2376PartExt), Byte.valueOf(A2376PartExt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
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
         /*
            INSERT RECORD ON TABLE TXPLPARTI

         */
         A396EmprCod = AV15EmprCod ;
         A966PartCod = AV17PartCod ;
         A252CliCod = AV16CliCod ;
         A979PartLin = 1 ;
         A980PartLinTip = httpContext.getMessage( "E", "") ;
         n980PartLinTip = false ;
         A981PartAlbDis = 0 ;
         n981PartAlbDis = false ;
         A982PartSitDis = httpContext.getMessage( "ENTRADA PIEZAS,TDISPOH", "") ;
         n982PartSitDis = false ;
         A983PartFecMov = Gx_date ;
         n983PartFecMov = false ;
         A984KilEnt = DecimalUtil.stringToDec("999999.99") ;
         n984KilEnt = false ;
         A985ConEnt = (short)(9999) ;
         n985ConEnt = false ;
         /* Using cursor P00G14 */
         pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n984KilEnt), A984KilEnt, Boolean.valueOf(n985ConEnt), Short.valueOf(A985ConEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewpdo.this.AV15EmprCod;
      this.aP1[0] = pnewpdo.this.AV16CliCod;
      this.aP2[0] = pnewpdo.this.AV17PartCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewpdo");
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
      P00G12_A966PartCod = new String[] {""} ;
      P00G12_A252CliCod = new int[1] ;
      P00G12_A396EmprCod = new String[] {""} ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A1456ParArtCod = "" ;
      A968PartFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A2245PartEstM = "" ;
      A2244PartReo = "" ;
      A2241PartSec = "" ;
      Gx_emsg = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A983PartFecMov = GXutil.nullDate() ;
      A984KilEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewpdo__default(),
         new Object[] {
             new Object[] {
            P00G12_A966PartCod, P00G12_A252CliCod, P00G12_A396EmprCod
            }
            , new Object[] {
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

   private byte AV18FlagPdo ;
   private byte A2376PartExt ;
   private short Gx_err ;
   private short A985ConEnt ;
   private int AV16CliCod ;
   private int A252CliCod ;
   private int GX_INS207 ;
   private int A972PartULin ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private java.math.BigDecimal A984KilEnt ;
   private String AV15EmprCod ;
   private String AV17PartCod ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A1456ParArtCod ;
   private String A2245PartEstM ;
   private String A2244PartReo ;
   private String A2241PartSec ;
   private String Gx_emsg ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private java.util.Date A968PartFec ;
   private java.util.Date Gx_date ;
   private java.util.Date A983PartFecMov ;
   private boolean n1456ParArtCod ;
   private boolean n968PartFec ;
   private boolean n2245PartEstM ;
   private boolean n2376PartExt ;
   private boolean n2244PartReo ;
   private boolean n2241PartSec ;
   private boolean n972PartULin ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n983PartFecMov ;
   private boolean n984KilEnt ;
   private boolean n985ConEnt ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00G12_A966PartCod ;
   private int[] P00G12_A252CliCod ;
   private String[] P00G12_A396EmprCod ;
}

final  class pnewpdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G12", "SELECT PartCod, CliCod, EmprCod FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00G13", "INSERT INTO TXPCPARTI(EmprCod, PartCod, CliCod, ParArtCod, PartFec, PartULin, PartSec, PartReo, PartEstM, PartExt, ParNMtr, ProceCod, PartDsc, TipArtCod, PartOpe, PartTipP, PartPre, ParObsLon, ParUEstM, ParUbiLin, ParUObsLon, CruCod, PartUni, PartCnf, PartUltPal, PartCoef, Pdo_UltL, Ub_Cod, PartRemTpo, PartRemSuc, PartRemFch, PartRemNro, PartOCOCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new UpdateCursor("P00G14", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilEnt, ConEnt, TrnCod, KilUti, ConUti, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[16]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

