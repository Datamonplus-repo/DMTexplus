package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsb extends GXProcedure
{
   public pnumpzsb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsb.class ), "" );
   }

   public pnumpzsb( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pnumpzsb.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pnumpzsb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsb.this.AV32MetTerCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsb.this.AV29BarCod = aP2[0];
      this.aP2 = aP2;
      pnumpzsb.this.AV30BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnumpzsb.this.AV31barcodpar = aP4[0];
      this.aP4 = aP4;
      pnumpzsb.this.AV26MetPieObs = aP5[0];
      this.aP5 = aP5;
      pnumpzsb.this.AV19UsurCod = aP6[0];
      this.aP6 = aP6;
      pnumpzsb.this.AV16Station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV24NumPzsFs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int2) ;
      pnumpzsb.this.GXt_int1 = GXv_int2[0] ;
      AV24NumPzsFs = GXt_int1 ;
      GXt_int1 = AV25NumPzsFs2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int2) ;
      pnumpzsb.this.GXt_int1 = GXv_int2[0] ;
      AV25NumPzsFs2 = GXt_int1 ;
      AV27Barordlin = (short)(GXutil.lval( GXutil.substring( AV26MetPieObs, 18, 8))) ;
      if ( ( AV24NumPzsFs == 1 ) || ( AV25NumPzsFs2 == 1 ) )
      {
         /* Using cursor P04OM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV29BarCod), Byte.valueOf(AV30BarCodReo), AV31barcodpar, Short.valueOf(AV27Barordlin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A194BarOrdLin = P04OM2_A194BarOrdLin[0] ;
            A130BarCodPar = P04OM2_A130BarCodPar[0] ;
            A132BarCodReo = P04OM2_A132BarCodReo[0] ;
            A129BarCod = P04OM2_A129BarCod[0] ;
            A4022BarNumBot = P04OM2_A4022BarNumBot[0] ;
            A758ProCod = P04OM2_A758ProCod[0] ;
            AV20UltPza = A4022BarNumBot ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV21Nump = 0 ;
         AV22LastPieza = 0 ;
         /* Using cursor P04OM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV29BarCod), Byte.valueOf(AV30BarCodReo), AV31barcodpar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P04OM3_A130BarCodPar[0] ;
            A132BarCodReo = P04OM3_A132BarCodReo[0] ;
            A129BarCod = P04OM3_A129BarCod[0] ;
            A4917MetPieObs = P04OM3_A4917MetPieObs[0] ;
            A2813MetPieCod = P04OM3_A2813MetPieCod[0] ;
            A2809MetTerCod = P04OM3_A2809MetTerCod[0] ;
            AV28ValNum = (short)(GXutil.lval( GXutil.trim( GXutil.substring( A4917MetPieObs, 18, 8)))) ;
            if ( AV28ValNum == AV27Barordlin )
            {
               AV21Nump = (int)(AV21Nump+1) ;
               AV22LastPieza = (int)(GXutil.lval( GXutil.substring( A2813MetPieCod, 3, 8))) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV23Inc_obs = "" ;
         /* Using cursor P04OM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV29BarCod), Byte.valueOf(AV30BarCodReo), AV31barcodpar, Short.valueOf(AV27Barordlin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A194BarOrdLin = P04OM4_A194BarOrdLin[0] ;
            A130BarCodPar = P04OM4_A130BarCodPar[0] ;
            A132BarCodReo = P04OM4_A132BarCodReo[0] ;
            A129BarCod = P04OM4_A129BarCod[0] ;
            A4022BarNumBot = P04OM4_A4022BarNumBot[0] ;
            A758ProCod = P04OM4_A758ProCod[0] ;
            if ( AV20UltPza != AV22LastPieza )
            {
               AV23Inc_obs = httpContext.getMessage( "Ajusto Ultima Pieza", "") + GXutil.newLine( ) ;
               AV23Inc_obs += httpContext.getMessage( "Valor Ultima Pieza ", "") + GXutil.str( A4022BarNumBot, 6, 0) + " -> " + GXutil.str( AV22LastPieza, 8, 0) ;
               A4022BarNumBot = AV22LastPieza ;
            }
            /* Using cursor P04OM5 */
            pr_default.execute(3, new Object[] {Integer.valueOf(A4022BarNumBot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ! (GXutil.strcmp("", AV23Inc_obs)==0) )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV19UsurCod, AV16Station, AV23Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
      }
      else
      {
         AV23Inc_obs = "" ;
         /* Using cursor P04OM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(AV29BarCod), Byte.valueOf(AV30BarCodReo), AV31barcodpar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P04OM6_A130BarCodPar[0] ;
            A132BarCodReo = P04OM6_A132BarCodReo[0] ;
            A129BarCod = P04OM6_A129BarCod[0] ;
            A2809MetTerCod = P04OM6_A2809MetTerCod[0] ;
            if ( A129BarCod == AV29BarCod )
            {
               if ( A132BarCodReo == AV30BarCodReo )
               {
                  if ( GXutil.strcmp(A130BarCodPar, AV31barcodpar) == 0 )
                  {
                     /* Using cursor P04OM7 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     A2826BarNumLot = P04OM7_A2826BarNumLot[0] ;
                     AV20UltPza = A2826BarNumLot ;
                     AV21Nump = 0 ;
                     AV22LastPieza = 0 ;
                     /* Using cursor P04OM8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(6) != 101) )
                     {
                        A2813MetPieCod = P04OM8_A2813MetPieCod[0] ;
                        AV21Nump = (int)(AV21Nump+1) ;
                        AV22LastPieza = (int)(GXutil.lval( A2813MetPieCod)) ;
                        pr_default.readNext(6);
                     }
                     pr_default.close(6);
                     if ( AV20UltPza != AV22LastPieza )
                     {
                        AV23Inc_obs = httpContext.getMessage( "Ajusto Ultima Pieza", "") + GXutil.newLine( ) ;
                        AV23Inc_obs += httpContext.getMessage( "Valor Ultima Pieza ", "") + GXutil.str( A2826BarNumLot, 8, 0) + " -> " + GXutil.str( AV22LastPieza, 8, 0) ;
                        A2826BarNumLot = AV22LastPieza ;
                     }
                     /* Using cursor P04OM9 */
                     pr_default.execute(7, new Object[] {Integer.valueOf(A2826BarNumLot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  }
               }
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.close(5);
         if ( ! (GXutil.strcmp("", AV23Inc_obs)==0) )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV19UsurCod, AV16Station, AV23Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsb.this.A396EmprCod;
      this.aP1[0] = pnumpzsb.this.AV32MetTerCod;
      this.aP2[0] = pnumpzsb.this.AV29BarCod;
      this.aP3[0] = pnumpzsb.this.AV30BarCodReo;
      this.aP4[0] = pnumpzsb.this.AV31barcodpar;
      this.aP5[0] = pnumpzsb.this.AV26MetPieObs;
      this.aP6[0] = pnumpzsb.this.AV19UsurCod;
      this.aP7[0] = pnumpzsb.this.AV16Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumpzsb");
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
      scmdbuf = "" ;
      P04OM2_A396EmprCod = new String[] {""} ;
      P04OM2_A194BarOrdLin = new short[1] ;
      P04OM2_A130BarCodPar = new String[] {""} ;
      P04OM2_A132BarCodReo = new byte[1] ;
      P04OM2_A129BarCod = new int[1] ;
      P04OM2_A4022BarNumBot = new int[1] ;
      P04OM2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      P04OM3_A396EmprCod = new String[] {""} ;
      P04OM3_A130BarCodPar = new String[] {""} ;
      P04OM3_A132BarCodReo = new byte[1] ;
      P04OM3_A129BarCod = new int[1] ;
      P04OM3_A4917MetPieObs = new String[] {""} ;
      P04OM3_A2813MetPieCod = new String[] {""} ;
      P04OM3_A2809MetTerCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV23Inc_obs = "" ;
      P04OM4_A396EmprCod = new String[] {""} ;
      P04OM4_A194BarOrdLin = new short[1] ;
      P04OM4_A130BarCodPar = new String[] {""} ;
      P04OM4_A132BarCodReo = new byte[1] ;
      P04OM4_A129BarCod = new int[1] ;
      P04OM4_A4022BarNumBot = new int[1] ;
      P04OM4_A758ProCod = new String[] {""} ;
      AV38Pgmname = "" ;
      P04OM6_A396EmprCod = new String[] {""} ;
      P04OM6_A130BarCodPar = new String[] {""} ;
      P04OM6_A132BarCodReo = new byte[1] ;
      P04OM6_A129BarCod = new int[1] ;
      P04OM6_A2809MetTerCod = new String[] {""} ;
      P04OM7_A2826BarNumLot = new int[1] ;
      P04OM8_A396EmprCod = new String[] {""} ;
      P04OM8_A2809MetTerCod = new String[] {""} ;
      P04OM8_A129BarCod = new int[1] ;
      P04OM8_A132BarCodReo = new byte[1] ;
      P04OM8_A130BarCodPar = new String[] {""} ;
      P04OM8_A2813MetPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsb__default(),
         new Object[] {
             new Object[] {
            P04OM2_A396EmprCod, P04OM2_A194BarOrdLin, P04OM2_A130BarCodPar, P04OM2_A132BarCodReo, P04OM2_A129BarCod, P04OM2_A4022BarNumBot, P04OM2_A758ProCod
            }
            , new Object[] {
            P04OM3_A396EmprCod, P04OM3_A130BarCodPar, P04OM3_A132BarCodReo, P04OM3_A129BarCod, P04OM3_A4917MetPieObs, P04OM3_A2813MetPieCod, P04OM3_A2809MetTerCod
            }
            , new Object[] {
            P04OM4_A396EmprCod, P04OM4_A194BarOrdLin, P04OM4_A130BarCodPar, P04OM4_A132BarCodReo, P04OM4_A129BarCod, P04OM4_A4022BarNumBot, P04OM4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04OM6_A396EmprCod, P04OM6_A130BarCodPar, P04OM6_A132BarCodReo, P04OM6_A129BarCod, P04OM6_A2809MetTerCod
            }
            , new Object[] {
            P04OM7_A2826BarNumLot
            }
            , new Object[] {
            P04OM8_A396EmprCod, P04OM8_A2809MetTerCod, P04OM8_A129BarCod, P04OM8_A132BarCodReo, P04OM8_A130BarCodPar, P04OM8_A2813MetPieCod
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "PNumPzsB" ;
      /* GeneXus formulas. */
      AV38Pgmname = "PNumPzsB" ;
      Gx_err = (short)(0) ;
   }

   private byte AV30BarCodReo ;
   private byte AV24NumPzsFs ;
   private byte AV25NumPzsFs2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private short AV27Barordlin ;
   private short A194BarOrdLin ;
   private short AV28ValNum ;
   private short Gx_err ;
   private int AV29BarCod ;
   private int A129BarCod ;
   private int A4022BarNumBot ;
   private int AV20UltPza ;
   private int AV21Nump ;
   private int AV22LastPieza ;
   private int A2826BarNumLot ;
   private String A396EmprCod ;
   private String AV32MetTerCod ;
   private String AV31barcodpar ;
   private String AV19UsurCod ;
   private String AV16Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV38Pgmname ;
   private String AV26MetPieObs ;
   private String A4917MetPieObs ;
   private String AV23Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04OM2_A396EmprCod ;
   private short[] P04OM2_A194BarOrdLin ;
   private String[] P04OM2_A130BarCodPar ;
   private byte[] P04OM2_A132BarCodReo ;
   private int[] P04OM2_A129BarCod ;
   private int[] P04OM2_A4022BarNumBot ;
   private String[] P04OM2_A758ProCod ;
   private String[] P04OM3_A396EmprCod ;
   private String[] P04OM3_A130BarCodPar ;
   private byte[] P04OM3_A132BarCodReo ;
   private int[] P04OM3_A129BarCod ;
   private String[] P04OM3_A4917MetPieObs ;
   private String[] P04OM3_A2813MetPieCod ;
   private String[] P04OM3_A2809MetTerCod ;
   private String[] P04OM4_A396EmprCod ;
   private short[] P04OM4_A194BarOrdLin ;
   private String[] P04OM4_A130BarCodPar ;
   private byte[] P04OM4_A132BarCodReo ;
   private int[] P04OM4_A129BarCod ;
   private int[] P04OM4_A4022BarNumBot ;
   private String[] P04OM4_A758ProCod ;
   private String[] P04OM6_A396EmprCod ;
   private String[] P04OM6_A130BarCodPar ;
   private byte[] P04OM6_A132BarCodReo ;
   private int[] P04OM6_A129BarCod ;
   private String[] P04OM6_A2809MetTerCod ;
   private int[] P04OM7_A2826BarNumLot ;
   private String[] P04OM8_A396EmprCod ;
   private String[] P04OM8_A2809MetTerCod ;
   private int[] P04OM8_A129BarCod ;
   private byte[] P04OM8_A132BarCodReo ;
   private String[] P04OM8_A130BarCodPar ;
   private String[] P04OM8_A2813MetPieCod ;
}

final  class pnumpzsb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OM2", "SELECT EmprCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, BarNumBot, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OM3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MetPieObs, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OM4", "SELECT EmprCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, BarNumBot, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04OM5", "UPDATE TXPBARFAS SET BarNumBot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P04OM6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MetTerCod FROM TXPCMETPI WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?)) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OM7", "SELECT BarNumLot FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OM8", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04OM9", "UPDATE TXPBARCAD SET BarNumLot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

