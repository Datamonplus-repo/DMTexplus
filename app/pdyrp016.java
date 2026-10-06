package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp016 extends GXProcedure
{
   public pdyrp016( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp016.class ), "" );
   }

   public pdyrp016( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 )
   {
      pdyrp016.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 )
   {
      pdyrp016.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp016.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp016.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp016.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp016.this.AV15BarMaqCod = aP4[0];
      this.aP4 = aP4;
      pdyrp016.this.AV16BarVolMaq = aP5[0];
      this.aP5 = aP5;
      pdyrp016.this.AV17BarSer = aP6[0];
      this.aP6 = aP6;
      pdyrp016.this.AV18DisArtDsc = aP7[0];
      this.aP7 = aP7;
      pdyrp016.this.AV19CliCod = aP8[0];
      this.aP8 = aP8;
      pdyrp016.this.AV20DisCod = aP9[0];
      this.aP9 = aP9;
      pdyrp016.this.AV21BarColNom = aP10[0];
      this.aP10 = aP10;
      pdyrp016.this.AV22BarColNum = aP11[0];
      this.aP11 = aP11;
      pdyrp016.this.AV23BarNomCli = aP12[0];
      this.aP12 = aP12;
      pdyrp016.this.AV24BarNumCli = aP13[0];
      this.aP13 = aP13;
      pdyrp016.this.AV25BarDisNum = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26Endutex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int2) ;
      pdyrp016.this.GXt_int1 = GXv_int2[0] ;
      AV26Endutex = GXt_int1 ;
      AV27UsurCod = " " ;
      GXt_char3 = AV28Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pdyrp016.this.GXt_char3 = GXv_char4[0] ;
      AV28Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV29EmprNom ;
      GXv_char6[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char5, GXv_char6) ;
      pdyrp016.this.A396EmprCod = GXv_char4[0] ;
      pdyrp016.this.AV29EmprNom = GXv_char5[0] ;
      pdyrp016.this.AV27UsurCod = GXv_char6[0] ;
      /* Using cursor P09962 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A180BarMaqCod = P09962_A180BarMaqCod[0] ;
         A2759BarMaqGru = P09962_A2759BarMaqGru[0] ;
         A236BarVolMaq = P09962_A236BarVolMaq[0] ;
         A212BarSer = P09962_A212BarSer[0] ;
         A1652BarSerDsc = P09962_A1652BarSerDsc[0] ;
         A252CliCod = P09962_A252CliCod[0] ;
         n252CliCod = P09962_n252CliCod[0] ;
         A361DisCod = P09962_A361DisCod[0] ;
         A135BarColNom = P09962_A135BarColNom[0] ;
         A136BarColNum = P09962_A136BarColNum[0] ;
         A1234BarNomCli = P09962_A1234BarNomCli[0] ;
         A1235BarNumCli = P09962_A1235BarNumCli[0] ;
         A143BarDisNum = P09962_A143BarDisNum[0] ;
         A180BarMaqCod = AV15BarMaqCod ;
         A2759BarMaqGru = GXutil.substring( AV15BarMaqCod, 1, 4) ;
         A236BarVolMaq = AV16BarVolMaq ;
         AV17BarSer = A212BarSer ;
         AV18DisArtDsc = A1652BarSerDsc ;
         AV19CliCod = A252CliCod ;
         AV20DisCod = A361DisCod ;
         AV21BarColNom = A135BarColNom ;
         AV22BarColNum = A136BarColNum ;
         AV23BarNomCli = A1234BarNomCli ;
         AV24BarNumCli = A1235BarNumCli ;
         AV25BarDisNum = A143BarDisNum ;
         /* Using cursor P09963 */
         pr_default.execute(1, new Object[] {A180BarMaqCod, A2759BarMaqGru, Integer.valueOf(A236BarVolMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV26Endutex == 1 )
      {
         /* Using cursor P09964 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A150BarFacTin = P09964_A150BarFacTin[0] ;
            A153BarFasEst = P09964_A153BarFasEst[0] ;
            A603MaqCodBis = P09964_A603MaqCodBis[0] ;
            A194BarOrdLin = P09964_A194BarOrdLin[0] ;
            A758ProCod = P09964_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( A153BarFasEst == 0 )
               {
                  if ( GXutil.strcmp(A603MaqCodBis, AV15BarMaqCod) != 0 )
                  {
                     A603MaqCodBis = AV15BarMaqCod ;
                  }
               }
               /* Using cursor P09965 */
               pr_default.execute(3, new Object[] {A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp016.this.A396EmprCod;
      this.aP1[0] = pdyrp016.this.A129BarCod;
      this.aP2[0] = pdyrp016.this.A132BarCodReo;
      this.aP3[0] = pdyrp016.this.A130BarCodPar;
      this.aP4[0] = pdyrp016.this.AV15BarMaqCod;
      this.aP5[0] = pdyrp016.this.AV16BarVolMaq;
      this.aP6[0] = pdyrp016.this.AV17BarSer;
      this.aP7[0] = pdyrp016.this.AV18DisArtDsc;
      this.aP8[0] = pdyrp016.this.AV19CliCod;
      this.aP9[0] = pdyrp016.this.AV20DisCod;
      this.aP10[0] = pdyrp016.this.AV21BarColNom;
      this.aP11[0] = pdyrp016.this.AV22BarColNum;
      this.aP12[0] = pdyrp016.this.AV23BarNomCli;
      this.aP13[0] = pdyrp016.this.AV24BarNumCli;
      this.aP14[0] = pdyrp016.this.AV25BarDisNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp016");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV27UsurCod = "" ;
      AV28Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV29EmprNom = "" ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P09962_A396EmprCod = new String[] {""} ;
      P09962_A129BarCod = new int[1] ;
      P09962_A132BarCodReo = new byte[1] ;
      P09962_A130BarCodPar = new String[] {""} ;
      P09962_A180BarMaqCod = new String[] {""} ;
      P09962_A2759BarMaqGru = new String[] {""} ;
      P09962_A236BarVolMaq = new int[1] ;
      P09962_A212BarSer = new String[] {""} ;
      P09962_A1652BarSerDsc = new String[] {""} ;
      P09962_A252CliCod = new int[1] ;
      P09962_n252CliCod = new boolean[] {false} ;
      P09962_A361DisCod = new int[1] ;
      P09962_A135BarColNom = new String[] {""} ;
      P09962_A136BarColNum = new int[1] ;
      P09962_A1234BarNomCli = new String[] {""} ;
      P09962_A1235BarNumCli = new int[1] ;
      P09962_A143BarDisNum = new String[] {""} ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      P09964_A396EmprCod = new String[] {""} ;
      P09964_A129BarCod = new int[1] ;
      P09964_A132BarCodReo = new byte[1] ;
      P09964_A130BarCodPar = new String[] {""} ;
      P09964_A150BarFacTin = new String[] {""} ;
      P09964_A153BarFasEst = new byte[1] ;
      P09964_A603MaqCodBis = new String[] {""} ;
      P09964_A194BarOrdLin = new short[1] ;
      P09964_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp016__default(),
         new Object[] {
             new Object[] {
            P09962_A396EmprCod, P09962_A129BarCod, P09962_A132BarCodReo, P09962_A130BarCodPar, P09962_A180BarMaqCod, P09962_A2759BarMaqGru, P09962_A236BarVolMaq, P09962_A212BarSer, P09962_A1652BarSerDsc, P09962_A252CliCod,
            P09962_n252CliCod, P09962_A361DisCod, P09962_A135BarColNom, P09962_A136BarColNum, P09962_A1234BarNomCli, P09962_A1235BarNumCli, P09962_A143BarDisNum
            }
            , new Object[] {
            }
            , new Object[] {
            P09964_A396EmprCod, P09964_A129BarCod, P09964_A132BarCodReo, P09964_A130BarCodPar, P09964_A150BarFacTin, P09964_A153BarFasEst, P09964_A603MaqCodBis, P09964_A194BarOrdLin, P09964_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV26Endutex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16BarVolMaq ;
   private int AV19CliCod ;
   private int AV20DisCod ;
   private int AV22BarColNum ;
   private int AV24BarNumCli ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarMaqCod ;
   private String AV17BarSer ;
   private String AV18DisArtDsc ;
   private String AV21BarColNom ;
   private String AV23BarNomCli ;
   private String AV25BarDisNum ;
   private String AV27UsurCod ;
   private String AV28Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV29EmprNom ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private boolean n252CliCod ;
   private String[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P09962_A396EmprCod ;
   private int[] P09962_A129BarCod ;
   private byte[] P09962_A132BarCodReo ;
   private String[] P09962_A130BarCodPar ;
   private String[] P09962_A180BarMaqCod ;
   private String[] P09962_A2759BarMaqGru ;
   private int[] P09962_A236BarVolMaq ;
   private String[] P09962_A212BarSer ;
   private String[] P09962_A1652BarSerDsc ;
   private int[] P09962_A252CliCod ;
   private boolean[] P09962_n252CliCod ;
   private int[] P09962_A361DisCod ;
   private String[] P09962_A135BarColNom ;
   private int[] P09962_A136BarColNum ;
   private String[] P09962_A1234BarNomCli ;
   private int[] P09962_A1235BarNumCli ;
   private String[] P09962_A143BarDisNum ;
   private String[] P09964_A396EmprCod ;
   private int[] P09964_A129BarCod ;
   private byte[] P09964_A132BarCodReo ;
   private String[] P09964_A130BarCodPar ;
   private String[] P09964_A150BarFacTin ;
   private byte[] P09964_A153BarFasEst ;
   private String[] P09964_A603MaqCodBis ;
   private short[] P09964_A194BarOrdLin ;
   private String[] P09964_A758ProCod ;
}

final  class pdyrp016__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09962", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarMaqGru, BarVolMaq, BarSer, BarSerDsc, CliCod, DisCod, BarColNom, BarColNum, BarNomCli, BarNumCli, BarDisNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09963", "UPDATE TXPBARCAD SET BarMaqCod=?, BarMaqGru=?, BarVolMaq=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P09964", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasEst, MaqCodBis, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09965", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

